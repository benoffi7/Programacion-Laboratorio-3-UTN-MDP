
public class Numero implements Relaciones{
	/**
	 * @param n1
	 */
	public Numero(int n1) 
	{
		super();
		this.n1 = n1;
	}

	int n1;
	
	public Numero() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	/**
	 * @return the n1
	 */
	public int getN1() {
		return n1;
	}

	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}




	@Override
	public boolean esMayor(Object b) 
	{
		Numero otro = (Numero)b;
		if (n1 > otro.getN1())
			return true;
		return false;
	}




	@Override
	public boolean esMenor(Object b) {
		Numero otro = (Numero)b;
		if (n1 < otro.getN1())
			return true;
		return false;
	}




	@Override
	public boolean esIgual(Object b) {
		Numero otro = (Numero)b;
		if (n1 == otro.getN1())
			return true;
		return false;
	}
	
	
}
