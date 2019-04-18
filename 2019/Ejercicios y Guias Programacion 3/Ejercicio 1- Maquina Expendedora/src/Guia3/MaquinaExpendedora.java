package Guia3;

public class MaquinaExpendedora {
	private float recaudacion = 0;
	private float limiteRecaudacion; //Cuando se crea el objeto
	private float precioBoleto; //Cuando se crea el objeto
	private int cantidadBoletos = 0;
	private int limiteBoletos; //Cuando se crea el objeto
	private float saldo = 0;
	private float vuelto = 0;
	
	public MaquinaExpendedora ()
	{
		setRecaudacion(0);
		setLimiteRecaudacion(0);
		setPrecioBoleto(0);
		setCantidadBoletos(0);
		setLimiteBoletos(0);
		setSaldo(0);
		setVuelto();
	}
	
	public MaquinaExpendedora (float limiteRecaudacion, float precioBoleto, int limiteBoletos)
	{
		setLimiteRecaudacion(limiteRecaudacion);
		setPrecioBoleto(precioBoleto);
		setLimiteBoletos(limiteBoletos);
	}
	
	private void setRecaudacion (float recaudacion)
	{
		this.recaudacion = recaudacion;
	}
	
	private void setLimiteRecaudacion (float limiteRecaudacion)
	{
		this.limiteRecaudacion = limiteRecaudacion;
	}
	
	private void setPrecioBoleto (float precioBoleto)
	{
		this.precioBoleto = precioBoleto;
	}
	
	private void setCantidadBoletos (int cantidadBoletos)
	{
		this.cantidadBoletos = cantidadBoletos;
	}
	
	private void setLimiteBoletos (int limiteBoletos)
	{
		this.limiteBoletos= limiteBoletos;
	}
	
	private void setSaldo (float saldo)
	{
		this.saldo = saldo;
	}
	
	private void setVuelto ()
	{
		vuelto = (getSaldo() - getPrecioBoleto());
	}
	
	private float getRecaudacion ()
	{
		return recaudacion;
	}
	
	private float getLimiteRecaudacion ()
	{
		return limiteRecaudacion;
	}
	
	private float getPrecioBoleto ()
	{
		return precioBoleto;
	}
	
	private int getCantidadBoletos ()

	{
		return cantidadBoletos;
	}
	
	private int getLimiteBoletos ()
	{
		return limiteBoletos;
	}
	
	private float getSaldo ()
	{
		return saldo;
	}
	
	private float getVuelto ()
	{
		return vuelto;
	}
	
	public float retornarRecaudacion ()
	{
		return getRecaudacion();
	}
	
	public float retornarLimiteRecaudacion ()
	{
		return getLimiteRecaudacion();
	}
	
	public float retornarPrecioBoleto ()
	{
		return getPrecioBoleto();
	}
	
	public int retornarCantidadBoletos ()
	{
		return getCantidadBoletos();
	}
	
	public int retornarLimiteBoletos ()
	{
		return getLimiteBoletos();
	}
		
	public float comprarBoleto (float dineroIngresado)
	{
		float vuelto;
		setSaldo(dineroIngresado);
		aumentarCantidadBoletos();
		setVuelto();
		vuelto=getVuelto();
		setSaldo(getSaldo() - vuelto);
		recaudar();
		return vuelto;
	}
	
	public void recaudar ()
	{
		setRecaudacion(getRecaudacion() + getSaldo());
	}
	
	public void aumentarCantidadBoletos ()
	{
		setCantidadBoletos(getCantidadBoletos() + 1);
	}
	
	public String retornarDatosMaquina ()
	{
		String datos="Dinero recaudado = $" + getRecaudacion() + " - Boletos vendidos = " + getCantidadBoletos();
		String datos2="Boletos Disponibles = $" + getRecaudacion() + " - Boletos vendidos = " + getCantidadBoletos();
		return datos;
	}
}
