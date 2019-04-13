package ejercicio;

public class Cliente
{
	private float dineroAIngresar;
	private float vuelto;
	
	public Cliente(float dineroAIngresar)
	{
		setDineroAIngresar(dineroAIngresar);
		setVuelto(0);
	}
	
	public void setDineroAIngresar(float dineroAIngresar)
	{
		this.dineroAIngresar = dineroAIngresar;
	}
	
	public float getDineroAIngresar()
	{
		return dineroAIngresar;
	}
	
	public void setVuelto(float vuelto)
	{
		this.vuelto = vuelto;
	}
	
	public float getVuelto()
	{
		return vuelto;
	}
	
	public void ingresarVuelto(float vuelto)
	{
		setVuelto(vuelto);
	}
	
	public float ingresarDineroEnLaMaquina()
	{
		float dineroAIngresar = getDineroAIngresar();
		setDineroAIngresar(0);
		return dineroAIngresar;
	}
	
	public void recibirVueltoDeLaMaquina(float vuelto)
	{
		setVuelto(vuelto);
	}
}