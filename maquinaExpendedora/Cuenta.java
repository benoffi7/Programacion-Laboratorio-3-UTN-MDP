package maquinaExpendedora;

public class Cuenta {

	private String nombre;
	private int edad;
	
	private float saldo;

	///metodos constructores
	public Cuenta()
	{
		nombre = "";
		edad = 0;
		saldo = 0;
	}
	
	public Cuenta(float saldo)
	{
		this.saldo=saldo;
	}
	
	///metodos Getters
	
	public float getSaldo()
	{
		return saldo;
	}
	 
	public String getNombre()
	 {
       return nombre;     
	 }

	public int getEdad()
	{
		return edad;
	}
	
	///metodos Setters

	public void setSaldo(float cantidad)
	{
		saldo = cantidad;
	}
	
	public void setNombre(String nombreR)
	 {
         nombre=nombreR;
	 }
	
	public void setEdad(int edadR)
	 {
        edad=edadR;
	 }
	
	public void ingresar(float cantidad)
	{
		saldo += cantidad;
	}
	
	public void extraer(float cantidad)
	{
		saldo -=cantidad;
	}
}

