package clases;

public class MaquinaExpendedora {

	private int precio;
	private int saldo;
	private int total;
	
	
	/*
	@Override
	public boolean equals(Object obj) 
	{
		MaquinaExpendedora expendedora = (MaquinaExpendedora)obj;
		if (obtenerPrecio() == expendedora.obtenerPrecio())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}*/
	
	/*
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof MaquinaExpendedora)
		{
			
			MaquinaExpendedora expendedora = (MaquinaExpendedora)obj;
			if (obtenerPrecio() == expendedora.obtenerPrecio())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}*/
	
	/*
	@Override
	public boolean equals(Object obj) 
	{
		
			if (obj!=null)
			{
				MaquinaExpendedora expendedora = (MaquinaExpendedora)obj;
				if (obtenerPrecio() == expendedora.obtenerPrecio())
				{
					return true;
				}
				else
				{
					return false;
				}	
			}
			else
			{
				return false;
			}
			
	}
	*/
		
	/*
	@Override
	public boolean equals(Object obj) 
	{
		
		if ((obj!=null) && (obj instanceof MaquinaExpendedora))
			{
				MaquinaExpendedora expendedora = (MaquinaExpendedora)obj;
				if (obtenerPrecio() == expendedora.obtenerPrecio())
				{
					return true;
				}
				else
				{
					return false;
				}	
			}
			else
			{
				return false;
			}
			
	}*/
	
	
	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("estoy aca");
		boolean comprobacionPadre = super.equals(obj);
		boolean miComprobacion = false;
		System.out.println("mi padre me dijo que ... "+comprobacionPadre);
		if ((obj!=null) && (obj instanceof MaquinaExpendedora))
			{
				MaquinaExpendedora expendedora = (MaquinaExpendedora)obj;
				if (obtenerPrecio() == expendedora.obtenerPrecio())
				{
					miComprobacion = true;
				}
			
			}
		
		if (miComprobacion && comprobacionPadre) return true;
		else return false;
			
	}
	
	/*
	@Override
	public String toString() {
		String retornoDelPadre = super.toString();
		String miRetorno = "Mi precio es "+obtenerPrecio() + " mi saldo es "+obtenerSaldo();
		return retornoDelPadre + " "+ miRetorno;
	}*/
	
	@Override
	public String toString() {
	
		String miRetorno = "Mi precio es "+obtenerPrecio() + " mi saldo es "+obtenerSaldo();
		return miRetorno;
	}
	
	// ESTO NO LO QUIERO VER EN LOS PARCIALES, FINALES, TP O SUEÑOS!!
	
	/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	*/
	
	
		
	public MaquinaExpendedora(int precioDeAfuera)
	{
		precio = precioDeAfuera;
		saldo = 0;
		total = 0;
	}
	
	public MaquinaExpendedora()
	{

		precio = 10;
	}
	
		
	
	//metodos de acceso
	
	public int obtenerPrecio() // getPrecio
	{
		return precio;
	}
	
	public int obtenerSaldo() // getSaldo
	{
		return saldo;
	}
	
	// metodo de modificacion
	
	public void imprmirBoleto()
	{
		total = total + saldo;
		saldo = 0 ;
		System.out.println("boleto impreso!");
	}
	
	public void ingresarDinero(int dinero)
	{
		saldo = saldo + dinero;
	}
	
	
	
	
	
}
