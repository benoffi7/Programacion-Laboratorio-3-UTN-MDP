package cajero;

public class Cuenta {
	
	private float saldocuenta;
	private String nombrecuenta;
	
	public final float saldoinicial = 12000;
	private static final float saldominimo = 0;
	
	public void setSaldoinicial()
	{
		saldocuenta = saldoinicial;
	}
	
	public Cuenta(String Nombre)
	{
		setNombre(Nombre);
		saldocuenta = 0;
	}
	
	public void setNombre(String Nombre)
	{
		nombrecuenta = Nombre;
	}

	public void ingresar (float c)
	{
		saldocuenta += c;
	}
	
	public boolean checkExtraccion (float c)
	{
		if (getSaldo() - c > saldominimo) return true;
		else return false;
	}
	
	public void extraer (float c)
	{
		saldocuenta -=  c;
	}
	
	public String getNombre()
	{
		return nombrecuenta;
	}
	
	public float getSaldo()
	{
		return saldocuenta;
	}
}

