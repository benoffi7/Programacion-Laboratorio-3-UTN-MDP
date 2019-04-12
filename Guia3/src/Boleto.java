
public class Boleto {
	
	private String descripcion;
	private int precio;
	
	public Boleto () {
		
		setDescripcion(" ");
		setPrecio(0);
	}
	
	public Boleto (String desc, int precioo) {
		
		setDescripcion(desc);
		setPrecio(precioo);
	}
	
	public void setDescripcion(String boletoN)
	{
		descripcion = boletoN;
	}
	
	public String getDescripcion()
	{
		return descripcion;
	}
	
	public void setPrecio(int precioo)
	{
		precio = precioo;
	}
	
	public int getprecio()
	{
		return precio;
	}
	
	public void modificarPrecio(int nuevoPrecio)
	{
		setPrecio(nuevoPrecio);
	}
}
