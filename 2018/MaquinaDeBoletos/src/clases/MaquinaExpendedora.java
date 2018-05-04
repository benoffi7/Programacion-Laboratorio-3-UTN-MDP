package clases;

public class MaquinaExpendedora {

	private int precio;
	private int saldo;
	private int total;
		
	public MaquinaExpendedora(int precioDeAfuera)
	{
		precio = precioDeAfuera;
		saldo = 0;
		total = 0;
	}
	
	public MaquinaExpendedora() {

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
	
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof MaquinaExpendedora)
		{
			MaquinaExpendedora otraMaquina = (MaquinaExpendedora)obj;
			if (precio == otraMaquina.obtenerPrecio()) return true;
			else return false;	
		}
		else
		{
			return false;
		}
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mi precio es de "+precio+" y mi saldo es de "+saldo+" y mi recaudacion es de "+total;
	}
	
	public String devolverNombreClase()
	{
		return getClass().getName();
	}
	
	
}
