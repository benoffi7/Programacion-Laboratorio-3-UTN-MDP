package paquete;

public class Libro 
{
	private String titulo;
	private int precio;
	private int stock;
	private Autor autor;
	
	public Libro (String tituloR, int precioR, int stockR, Autor autorR) {
		setTitulo(tituloR);
		setPrecio(precioR);
		setStock(stockR);
		setAutor(autorR);
	}
	
	
	private String getTitulo() {
		return titulo;
	}
	private void setTitulo(String tituloR) {
		titulo = tituloR;
	}
	private int getPrecio() {
		return precio;
	}
	private void setPrecio(int precioR) {
		precio = precioR;
	}
	private int getStock() {
		return stock;
	}
	private void setStock(int stockR) {
		stock = stockR;
	}
	private Autor getAutor() {
		return autor;
	}
	private void setAutor(Autor autorR) {
		autor = autorR;
	}
	
	@Override
	public String toString() {
		return "\nTitulo: " +getTitulo()+ "\nPrecio: " +getPrecio()+ "\nStock: " +getStock()+ "\nAutor: " + getAutor();
	}

	public void modificarLibro (int precioR, int stockR) {
		setPrecio(precioR);
		setStock(stockR);
	}
	
	public void mostrarAutor () {
		getAutor().toString();
	}
	
	public String imprimirMensaje () {
		return "\nEl libro " +getTitulo()+ " de" +getAutor().getNyA()+ "se vende a " +getPrecio() + "pesos." ;
	}
}