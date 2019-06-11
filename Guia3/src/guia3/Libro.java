package guia3;

public class Libro {
	//
	private String titulo;
	private float precio;
	private int stock;
	private Autor autor;
	//
	public Libro (){
		setTitulo("");
		setPrecio(0);
		setStock(0);
		setAutor("","","","");
	}
	public Libro (String tituloRecivido, float precioRecivido, int stockRecivido, String nombreRecivido, String apellidoRecivido, String emailRecivido, String generoRecivido){
		setTitulo(tituloRecivido);
		setPrecio(precioRecivido);
		setStock(stockRecivido);
		setAutor(nombreRecivido, apellidoRecivido, emailRecivido, generoRecivido);
	}
	//
	private String getTitulo() {
		return titulo;
	}
	private void setTitulo(String tituloRecivido) {
		titulo = tituloRecivido;
	}
	private float getPrecio() {
		return precio;
	}
	private void setPrecio(float precioRecivido) {
		precio = precioRecivido;
	}
	private int getStock() {
		return stock;
	}
	private void setStock(int stock) {
		this.stock = stock;
	}
	public Autor getAutor() {
		return autor;
	}
	private void setAutor(String nombreRecivido, String apellidoRecivido, String emailRecivido, String generoRecivido) {
		autor = new Autor(nombreRecivido, apellidoRecivido, emailRecivido, generoRecivido);
	}
	public String toString (){
		return "El titulo del libro es: "+getTitulo()+ "\nPrecio: "+getPrecio()+"\nStock actual: "+ getStock()+ "\n"+ autor.toString();
	}
	public String mostrarAutor(){
		return autor.toString();
	}
	public void cambiarPrecio (float precioNuevo){
		setPrecio(precioNuevo);
	}
}
