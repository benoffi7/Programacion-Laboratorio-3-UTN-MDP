package maquina;

public class Maquina {
	
	//Atributos
	
	private static float precio = (float) (23.50);
	private float saldo;
	private float total;
	
	public static int boletos = 0;
	
	// Constructor
	
	public Maquina()
	{
		
	}
	
	// Getters
	
	public int getBoletos()
	{
		return boletos;
	}

	public float getSaldo()
	{
		return saldo;
	}
	
	public float getPrecio()
	{
		return precio;
	}
	
	public float getTotal()
	{
		return total;
	}
	
	// Setters
	
	public void retirarDinero()
	{
		total = 0;
	}
	
	public void boletoimpreso()
	{
		boletos++;
	}
	
	public boolean setPrecio (float nuevoprecio)
	{
		if (nuevoprecio > 0)
		{
			precio = nuevoprecio;
			return true;
		}
		else return false;
	}
	
	public void restartSaldo ()
	{
		saldo = 0;
	}
	
	public boolean setSaldo (float importe)
	{
		if (importe > 0)
		{
			saldo += importe;
			total += importe;
			return true;
		}
		else return false;
	}
	
	private void setTotal (float importe)
	{
		total = importe;
	} 
	
	/// Otras
	
	public boolean check()
	{
		if (getSaldo() >= getPrecio()) return true;
		else return false;
	}
	
	public float cambio()
	{
		if ((getSaldo() - getPrecio()) > (float) (0.5)) return getSaldo() - getPrecio();
		else return 0;
	}
	
	public void imprimirBoleto()
	{
		setTotal(getTotal() - cambio());
		restartSaldo();
		boletoimpreso();
	}
	
	public void reiniciarTotal()
	{
		setTotal(0);
	}
	
}