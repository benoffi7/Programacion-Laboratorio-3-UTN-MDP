package Main;

public class Cuenta 
{
	private float saldo;
	
	public Cuenta()
	{
		setSaldo(0);
	}
	
	public Cuenta(float inicial)
	{
		setSaldo(inicial);
	}
	
	public float getSaldo()
	{
		return saldo;
	}
	
	public void ingresar(float dinero)
	{
		float montoFinal = getSaldo() + dinero;
		setSaldo(montoFinal);
	}
	
	public void extraer(float dinero)
	{
		float montoFinal = getSaldo() - dinero;
		setSaldo(montoFinal);
	}
	
	private void setSaldo(float dinero)
	{
		saldo = dinero;
	}
	
	
	
	
	
	
	
}
