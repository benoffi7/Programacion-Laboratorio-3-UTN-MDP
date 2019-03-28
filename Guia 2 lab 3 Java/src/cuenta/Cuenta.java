package cuenta;

public class Cuenta {
	private float saldo;
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return this.saldo;
	}
	
	public Cuenta() {
		setSaldo(0);
	}
	public Cuenta(float saldoInicial) {
		setSaldo(saldoInicial);
	}
	
	public void ingresar(float dinero) {
		setSaldo(getSaldo()+dinero);
	}
	public boolean extraer(float dinero) {
		boolean bandera = true;
		float aux = this.saldo - dinero;
		if (aux < 0) {
			bandera = false;
		} else {
			this.saldo -= dinero;
		}
		return bandera;
	}
	/*
	public void verSaldo() {
		System.out.println("El saldo es de:" + getSaldo());
	}*/
	
	
}
