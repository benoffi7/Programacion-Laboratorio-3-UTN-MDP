package cajero;

public class Cuenta {
	
	private float saldo;
	
	public Cuenta() {
		saldo=0;
	}
	
	public Cuenta(float cant) {
		saldo=cant;
	}
	
	public void ingresar (float cant) {
		
		saldo += cant;
	}
	
	public void extraer (float cant) {
		
		if (saldo<cant)
			System.out.println("No se puede realizar esta operacion. La cantidad de dinero supera su saldo");
		else {
			saldo -= cant;
		}
	}
	
	public float getSaldo() {
		return saldo;
	}
	
}
