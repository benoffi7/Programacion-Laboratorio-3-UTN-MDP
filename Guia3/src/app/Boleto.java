package app;
public class Boleto {
	
	private String descripcion;
	private int precio;
	
	public Boleto () {
		
		setDescripcion(" ");
		setPrecio(0);
	}
	
	public Boleto (String desc, int precioN) {
		
		setDescripcion(desc);
		setPrecio(precioN);
	}
	
	public void setDescripcion(String boletoN)
	{
		descripcion = boletoN;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
	
	public void setPrecio(int precioN)
	{
		precio = precioN;
	}
	
	public int getPrecio()
	{
		return precio;
	}
	
	public void modificarPrecio(int nuevoPrecio)
	{
		setPrecio(nuevoPrecio);
	}
	
}
