package paquete1;

public class Boleto
{
// ---------------------------------ATRIBUTOS-----------------------------------------
	private int id;
	private static int precio = 10;
	private long dni;
	private String comprador;
	private String fecha;
// ***********************************************************************************

// ---------------------------------CONSTRUCTORES-----------------------------------------
	public Boleto()
	{
		setId(0);
		setDni(0);
		setComprador("");
		setFecha("");

	}

	public Boleto(int idRecibido, long dniRecibido, String compradorRecibido, String fechaRecibido)
	{
		setId(idRecibido);
		setDni(dniRecibido);
		setComprador(compradorRecibido);
		setFecha(fechaRecibido);

	}
// ***********************************************************************************

// ---------------------------------GETTERS-------------------------------------------
	public int getId()
	{
		return id;
	}

	public int getPrecio()
	{
		return precio;
	}

	public String getComprador()
	{
		return comprador;
	}

	public String getFecha()
	{
		return fecha;
	}
// ***********************************************************************************

// ---------------------------------SETTERS-------------------------------------------
	public void setId(int idRecibida)
	{
		id = idRecibida;
	}

	public void setDni(long dniRecibida)
	{
		dni = dniRecibida;
	}

	public void setComprador(String compradorRecibido)
	{
		comprador = compradorRecibido;
	}

	public void setFecha(String fechaRecibido)
	{
		fecha = fechaRecibido;
	}
// ***********************************************************************************

// ---------------------------------METODOS-------------------------------------------

}
