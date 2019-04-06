package paquete1;
import java.util.Date;

public class MaqExpe extends Boleto
{
// ---------------------------------ATRIBUTOS-----------------------------------------	
	private int saldo;
	private float vuelto;
	private double recaudacion;
	private static long limiteRecaudacion = 20;
	private static int cantidadBoletos = 3;
	private int cantidadVendidos;
// ***********************************************************************************

// ---------------------------------CONSTRUCTORES-----------------------------------------
	public MaqExpe()
	{
		setSaldo(0);
		setVuelto(0);
		setRecaudacion(0);
		setCantidadVendidos(0);
	}
// ***********************************************************************************	

// ---------------------------------GETTERS-------------------------------------------
	private int getSaldo()
	{
		return saldo;
	}

	public float getVuelto()
	{
		return vuelto;
	}

	private double getRecaudacion()
	{
		return recaudacion;
	}
	
	private double getLimiteRecaudacion()
	{
		return limiteRecaudacion;
	}

	public int getCantidadBoletos()
	{
		return cantidadBoletos;
	}

	public int getCantidadVendidos()
	{
		return cantidadVendidos;
	}
// ***********************************************************************************

// ---------------------------------SETTERS-------------------------------------------
	public void setSaldo(int saldoRecibido)
	{
		saldo = saldoRecibido;
	}

	public void setVuelto(float vueltoRecibido)
	{
		vuelto = vueltoRecibido;
	}

	public void setRecaudacion(double recaudacionRecibida)
	{
		recaudacion = recaudacionRecibida;
	}

	public void setCantidadVendidos(int cantidadRecibida)
	{
		cantidadVendidos = cantidadRecibida;
	}

// ***********************************************************************************

//---------------------------------METODOS-------------------------------------------
	public void ingresarDinero(int dinero)
	{
		setSaldo(dinero);
	}

	public boolean corroborarDinero()
	{
		if (getSaldo() >= getPrecio())
			return true;
		else
			return false;
	}

	public void darVuelto()
	{
		setVuelto(getSaldo() - getPrecio());
	}

	public boolean corroborarCantidadDeBoletos()
	{
		if (getCantidadBoletos() > getCantidadVendidos())
			return true;
		else
			return false;
	}

	public void efectuarUnaCompra()
	{
		setCantidadVendidos(getCantidadVendidos() + 1);
		setRecaudacion(getRecaudacion()+getPrecio());
	}
	
	public void imprimirBoleto()
	{
		java.util.Date fecha = new Date();
		setId((int) (Math.random() * 9999999) + 1);
		System.out.print("\nID: " +getId());
		System.out.print("\nPrecio: " +getPrecio());
		System.out.println ("\nFecha:"+fecha);
	}
	
	public boolean corroborarRecaudacion()
	{
		if (getRecaudacion() >= getLimiteRecaudacion())
			return true;
		else
			return false;
	}

// ***********************************************************************************
}
