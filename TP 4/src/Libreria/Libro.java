package Libreria;

public class Libro {
	
	private String titulo;
	private double precio;
	private Autor Autor;
	private int stock;
	
	
	
	public Libro(String titulo, double precio, Libreria.Autor autor, int stock) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		Autor = autor;
		this.stock = stock;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Autor getAutor() {
		return Autor;
	}
	public void setAutor(Autor autor) {
		Autor = autor;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	/*e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la 
	cantidad en 50 copias.*/
	public void CambiarPrecio(double precio,int stock) {
		setPrecio(precio);
		setStock(stock);
	}
	
	@Override
	public String toString() {
		return "El Libro " + titulo + " de " + Autor + " Se vende a: " + precio + " El stock es de : " + stock ;
	}
	
	
	
}
