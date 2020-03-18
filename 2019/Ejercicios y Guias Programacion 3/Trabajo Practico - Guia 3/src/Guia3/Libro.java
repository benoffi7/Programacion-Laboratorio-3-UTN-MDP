package Guia3;

public class Libro {
	
	private String titulo;
	private float precio;
	private int stock;
	private Autor miAutor;

	private void setTitulo(String titulo)
	{
		this.titulo=titulo;
	}
	private void setPrecio(float precio)
	{
		this.precio=precio;
	}
	private void setStock(int stock)
	{
		this.stock=stock;
	}
	private void setAutor(Autor miAutor)
	{
		this.miAutor=miAutor;
	}
	
	private String getTitulo()
	{
		return titulo;
	}
	private float getPrecio()
	{
		return precio;
	}
	private int getStock()
	{
		return stock;
	}
	private Autor getAutor()
	{
		return miAutor;
	}
	public void igualarPrecio(float precio)
	{
		setPrecio(precio);
	}
	public void igualarStock(int stock)
	{
		setStock(stock);
	}
	
	public String retornoTitulo()
	{
		return getTitulo();
	}
	public float retornoPrecio()
	{
		return getPrecio();
	}
	public int retornoStock()
	{
		return getStock();
	}
	public Autor retornoAutor()
	{
		return getAutor();
	}
	
	public Libro (String titulo ,float precio,int stock, Autor miAutor)
	{
		setTitulo(titulo);
		setPrecio(precio);
		setStock(stock);
		setAutor(miAutor);
	}
	
	@Override
	public boolean equals (Object Objeto)
	{
		if ((Objeto !=null) && (Objeto instanceof Libro))
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return "El libro "+this.titulo+" de "+this.miAutor.retornoNombre()+" "+this.miAutor.retornoApellido()+" se vende a $"+precio ;
		
	}
}
