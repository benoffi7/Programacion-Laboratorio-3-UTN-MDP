package CuentaBancaria;

public class CuentaBancaria {
	
	private int id;
	private double balance;
	private Cliente cliete;
	private double SaldoDeudor;
	
	
	
	public CuentaBancaria(int id, double balance, Cliente cliete,double SaldoDeudor) {
		super();
		this.id = id;
		this.balance = balance;
		this.cliete = cliete;
		this.SaldoDeudor=SaldoDeudor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Cliente getCliete() {
		return cliete;
	}
	public void setCliete(Cliente cliete) {
		this.cliete = cliete;
	}
	public void Depositar(double cant) {
		setBalance(cant);
	}
	public void Extraer(double cant) {
		
		setBalance( balance - cant);
	}
	@Override
	public String toString() {
		return " id: " + id + " balance: " + balance + " " + cliete;
	}
	public double getSaldoDeudor() {
		return SaldoDeudor;
	}
	public void setSaldoDeudor(double saldoDeudor) {
		SaldoDeudor = saldoDeudor;
	}
	
	
}
