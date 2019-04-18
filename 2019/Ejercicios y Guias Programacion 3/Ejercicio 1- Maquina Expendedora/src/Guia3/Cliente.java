package Guia3;

public class Cliente {
	private float dineroAIngresar;
	private float dineroFinal;
	
	public Cliente ()
	{
		setDineroAIngresar(0);
	}
	
	public Cliente (float dineroAIngresar)
	{
		setDineroAIngresar(dineroAIngresar);
		setDineroFinal(dineroAIngresar);
	}
	
	private void setDineroAIngresar (float dineroAIngresar)
	{
		this.dineroAIngresar=dineroAIngresar;
	}
	
	private float getDineroAIngresar ()
	{
		return dineroAIngresar;
	}
	
	private void setDineroFinal (float dineroFinal)
	{
		this.dineroFinal=dineroFinal;
	}
	
	private float getDineroFinal ()
	{
		return dineroFinal;
	}
	
	public float retornarDineroAIngresar ()
	{
		return getDineroAIngresar();
	}
	
	public float retornarDineroFinal ()
	{
		return getDineroFinal();
	}
	
	public void ingresarDineroFinal (float dineroFinal)
	{
		setDineroFinal(dineroFinal);
	}
	
	public float ingresarDineroEnLaMaquina ()
	{
		float dineroARetornar=getDineroAIngresar();
		setDineroAIngresar(0);
		return dineroARetornar;
	}
	
	public void recibirVueltoDeLaMaquina (float vuelto)
	{
		setDineroFinal(vuelto);
	}
}
