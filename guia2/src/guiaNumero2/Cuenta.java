package guiaNumero2;

public class Cuenta {
	private String nombre;
	private float saldo;
	private float movimientos;
	
	public Cuenta()
	{
		setNombre("");
		setSaldo(0);
		setMovimientos(0);
	}

	public Cuenta(String nombreR,float saldoR)
	{
		setNombre(nombreR);
		setSaldo(saldoR);
		setMovimientos(0);
	}

	public Cuenta(String nombreR)
	{
		setNombre(nombreR);
		setSaldo(0);
		setMovimientos(0);
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public float getSaldo()
	{
		return saldo;
	}
	
	public float getMovimientos()
	{
		return movimientos;
	}
	
	public void setNombre(String nombreR)
	{
		nombre = nombreR;
	}
	
	public void setSaldo(float saldoR)
	{
		saldo = saldoR;
	}
	
	public void setMovimientos(float movimientosR)
	{
		movimientos = movimientosR;
	}
	
	public void ingresar(float c)
	{
		movimientos = saldo + c; 
	}

    public void extraer(float c)
    {
    	if(c<saldo)
    	{
    	  movimientos = saldo + c;
    	}
    }

}
