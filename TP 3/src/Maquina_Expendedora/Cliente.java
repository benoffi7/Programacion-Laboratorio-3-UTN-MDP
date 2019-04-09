package Maquina_Expendedora;

public class Cliente {
	
	private double saldo;

	
	public Cliente(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public Cliente() {
		saldo=0;
	}
	
	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void IngresarDinero(double saldo) {
		setSaldo(saldo);
	}
	
	
	
	
}
