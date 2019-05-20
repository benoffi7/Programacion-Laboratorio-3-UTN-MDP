package e1;

public class Libro
{
	private String titulo;
	private float precio;
	private int stock;
	private Autor autor;
	
	public Libro(String titulo, float precio, int stock, Autor autor)
	{
		setTitulo(titulo);
		setPrecio(precio);
		setStock(stock);
		setAutor(autor);
	}
		
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public void setPrecio(float precio)
	{
		this.precio = precio;
	}
	
	public void setStock(int stock)
	{
		this.stock = stock;
	}
	
	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public float getPrecio()
	{
		return precio;
	}
	
	public int getStock()
	{
		return stock;
	}
	
	public Autor getAutor()
	{
		return autor;
	}
		
	public String retornarDatosLibro()
	{
		String datos = "Titulo: " + getTitulo() + " | Precio: $" + getPrecio() + " | Stock: " + getStock() + " unidades | Nombre del autor: " + getAutor().getNombre() + " " + getAutor().getApellido();
		return datos;
	}
	
	public void aumentarStock(int nuevasUnidades)
	{
		this.stock = getStock() + nuevasUnidades;
	}
	
	public String retornarDatosAutor()
	{
		String datos = getAutor().retornarDatosAutor();
		return datos;
	}
	
	public String retornarMensaje()
	{
		String mensaje = "El libro " + getTitulo() + " de " + getAutor().getNombre() + " " + getAutor().getApellido() + " se vende a $" + getPrecio();
		return mensaje;
	}
}