package genericos_com2;

public class Comparador<E extends Comparable ,T extends Comparable>
{
	private E uno;
	private T dos;
	
	public Comparador() {
		// TODO Auto-generated constructor stub
	}
	
	public T getDos() {
		return dos;
	}
	
	public E getUno() {
		return uno;
	}
	
	public void setDos(T dos) {
		this.dos = dos;
	}
	
	public void setUno(E uno) {
		this.uno = uno;
	}

	public Comparador(E uno, T dos) {
		super();
		this.uno = uno;
		this.dos = dos;
	}
	
	public int comparar()
	{
		return uno.compareTo(dos);
	}

	
	
	

}
