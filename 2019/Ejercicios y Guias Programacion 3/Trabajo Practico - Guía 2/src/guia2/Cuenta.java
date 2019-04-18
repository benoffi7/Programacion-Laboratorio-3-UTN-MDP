package guia2;

public class Cuenta {
	
	private float saldo;
	
	public Cuenta ()
	{
		setSaldo(0);
	}
	
	public Cuenta (float saldoInicial)
	{
		setSaldo(saldoInicial);
	}
	
	private void setSaldo (float saldoR)
	{
		saldo=saldoR;
	}
	
	private float getSaldo ()
	{
		return saldo;
	}
	
	public float retornarSaldo ()
	{
		return getSaldo();
	}
	
	public void ingresar (float saldoR)
	{
		setSaldo(saldoR+getSaldo());
	}
	
	public void extraer (float saldoR)
	{
		setSaldo(getSaldo()-saldoR);
	}
}
