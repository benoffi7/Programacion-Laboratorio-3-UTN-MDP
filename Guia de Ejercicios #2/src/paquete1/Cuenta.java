package paquete1;

public class Cuenta
{
	// ---------------------------------ATRIBUTOS-----------------------------------------
	private int id;
	private String titular;
	private long dni;
	private String direccion;
	private float saldo;
	private String banco;
	// ***********************************************************************************

	// ---------------------------------CONSTRUCTORES-----------------------------------------
	public Cuenta()
	{
		setId(0);
		setTitular("");
		setDni(0);
		setDireccion("");
		setSaldo(0);
		setBanco("");

	}
	public Cuenta(String titular,long dni,String direccion,String banco)
	{
		setId(0);
		setTitular(titular);
		setDni(dni);
		setDireccion(direccion);
		setSaldo(0);
		setBanco(banco);
	}
	// ***********************************************************************************

	// ---------------------------------GETTERS-------------------------------------------
	public int getId()
	{
		return id;
	}

	public String getTitular()
	{
		return titular;
	}

	private long getDni()
	{
		return dni;
	}

	private String getDireccion()
	{
		return direccion;
	}

	public float getSaldo()
	{
		return saldo;
	}

	private String getBanco()
	{
		return banco;
	}
	// ***********************************************************************************

	// ---------------------------------SETTERS-------------------------------------------
	public void setId(int idRecibida)
	{
		id = idRecibida;
	}

	public void setTitular(String titularRecibido)
	{
		titular = titularRecibido;
	}

	public void setDni(long dniRecibido)
	{
		dni = dniRecibido;
	}

	public void setDireccion(String direccionRecibida)
	{
		direccion = direccionRecibida;
	}

	public void setSaldo(float saldoRecibido)
	{
		saldo = saldoRecibido;
	}

	public void setBanco(String bancoRecibido)
	{
		banco = bancoRecibido;
	}
	// ***********************************************************************************

	// ---------------------------------METODOS-------------------------------------------
	public void ingresar(float cantidad)
	{
		setSaldo(getSaldo() + cantidad);
	}

	public void extraer(float cantidad)
	{
		if (cantidad > getSaldo())
		{
			System.out.print("Saldo extraido: $"+getSaldo());
			setSaldo(0);
		} 
		else
		{
			setSaldo(getSaldo() - cantidad);
			System.out.print("Saldo extraido: $"+cantidad);
		}
	}
	// ***********************************************************************************

}
