package guia2;

public class Cuenta
{
	private float saldo;
	
	public Cuenta()
	{
		setSaldo(0);
	}
	
	public Cuenta(float saldoInicial)
	{
		setSaldo(saldoInicial);
	}
	
	public void setSaldo(float saldoR)
	{
		saldo = saldoR;
	}
	
	public float getSaldo()
	{
		return saldo;
	}
		
	public void ingresar(float saldoR)
	{
		setSaldo(getSaldo() + saldoR);
	}
	
	public void extraer(float saldoR)
	{
		setSaldo(getSaldo() - saldoR);
	}
	
	public boolean comprobarExtraccion(float dineroAExtraer)
	{
		if (dineroAExtraer <= getSaldo())
			return true;
		else
			return false;
	}
}
