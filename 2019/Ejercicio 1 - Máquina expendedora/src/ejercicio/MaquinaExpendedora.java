package ejercicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MaquinaExpendedora
{
	private float recaudacion = 0;
	private float limiteRecaudacion = 50;
	private float precioBoleto = 10;
	private int cantidadBoletos = 0;
	private int limiteBoletos = 5;
	private float vuelto = 0;
	
	public MaquinaExpendedora()
	{
	}
	
	public MaquinaExpendedora(float limiteRecaudacion, float precioBoleto, int limiteBoletos)
	{
		setLimiteRecaudacion(limiteRecaudacion);
		setPrecioBoleto(precioBoleto);
		setLimiteBoletos(limiteBoletos);
	}
	
	public void setRecaudacion(float recaudacion)
	{
		this.recaudacion = recaudacion;
	}
	
	public void setLimiteRecaudacion(float limiteRecaudacion)
	{
		this.limiteRecaudacion = limiteRecaudacion;
	}
	
	public void setPrecioBoleto(float precioBoleto)
	{
		this.precioBoleto = precioBoleto;
	}
	
	public void setCantidadBoletos(int cantidadBoletos)
	{
		this.cantidadBoletos = cantidadBoletos;
	}
	
	public void setLimiteBoletos(int limiteBoletos)
	{
		this.limiteBoletos = limiteBoletos;
	}
	
	public void setVuelto(float vuelto)
	{
		this.vuelto = vuelto;
	}

	public float getRecaudacion()
	{
		return recaudacion;
	}
	
	public float getLimiteRecaudacion()
	{
		return limiteRecaudacion;
	}
	
	public float getPrecioBoleto()
	{
		return precioBoleto;
	}
	
	public int getCantidadBoletos()

	{
		return cantidadBoletos;
	}
	
	public int getLimiteBoletos()
	{
		return limiteBoletos;
	}
	
	public float getVuelto()
	{
		return vuelto;
	}
		
	public float generarVuelto(float dineroIngresado)
	{
		float vuelto = (dineroIngresado - getPrecioBoleto());
		return vuelto;
	}
			
	public void comprarBoleto(float dineroIngresado)
	{
		if (comprobarValidezCompra(dineroIngresado))
		{
			aumentarCantidadBoletos();
			setVuelto(generarVuelto(dineroIngresado));
			if (getVuelto() > 0 && getVuelto() < 0.05)
			{
				recaudarConVuelto();
				setVuelto(0);
			}
			else
				recaudar();
		}
		else
			setVuelto(dineroIngresado);
	}
	
	public String imprimirBoleto(float dineroIngresado)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String boleto;
		comprarBoleto(dineroIngresado);
		if (getVuelto() == dineroIngresado)
			boleto = "Compra fallida";
		else
			boleto = "| Boleto | Valor: $" + getPrecioBoleto() + " | Vuelto: $" + getVuelto() + " | " + dtf.format(now) + " |";
		return boleto;
	}
	
	public float retornarVuelto()
	{
		float vuelto = getVuelto();
		setVuelto(0);
		return vuelto;
	}
	
	public void recaudar()
	{
		setRecaudacion(getRecaudacion() + getPrecioBoleto());
	}
	
	public void recaudarConVuelto()
	{
		setRecaudacion((float) (getRecaudacion() + getPrecioBoleto() + getVuelto()));
	}
	
	public void aumentarCantidadBoletos()
	{
		setCantidadBoletos(getCantidadBoletos() + 1);
	}
	
	public String retornarDatosMaquina()
	{
		String datos = "Dinero recaudado = $" + getRecaudacion() + " - Boletos vendidos = " + getCantidadBoletos();
		return datos;
	}
	
	public boolean comprobarValidezCompra(float dineroIngresado)
	{
		boolean bandera = false;
		if(comprobarBoletosSuficientes() && comprobarRecaudacion() && comprobarDineroSuficiente(dineroIngresado))
			bandera = true;
		return bandera;
	}
	
	public boolean comprobarBoletosSuficientes()
	{
		boolean bandera;
		if (getCantidadBoletos() < getLimiteBoletos())
			bandera = true;
		else
			bandera = false;
		return bandera;
	}
	
	public boolean comprobarRecaudacion()
	{
		boolean bandera;
		if ((getRecaudacion() + getPrecioBoleto()) <= getLimiteRecaudacion())
			bandera = true;
		else
			bandera = false;
		return bandera;
	}
	
	public boolean comprobarDineroSuficiente(float dineroIngresado)
	{
		boolean bandera;
		if (dineroIngresado >= getPrecioBoleto())
			bandera = true;
		else
			bandera = false;
		return bandera;
	}
	
	public void vaciar()
	{
		setRecaudacion(0);
	}
}