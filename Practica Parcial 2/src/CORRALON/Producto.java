package CORRALON;

public class Producto {
	
	private String codigoAN;
	private String nombre;
	private String marca;
	private double precioUnitario;
	private int stock;
	
	public Producto(String codigoAN, String nombre, String marca, double precioUnitario, int stock) {
		
		this.codigoAN = codigoAN;
		this.nombre = nombre;
		this.marca = marca;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
	}
	
	public String getCodigoAN() {
		return codigoAN;
	}
	public void setCodigoAN(String codigoAN) {
		this.codigoAN = codigoAN;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "\n Producto [codigoAN=" + codigoAN + ", nombre=" + nombre + ", marca=" + marca + ", precioUnitario="
				+ precioUnitario + ", stock=" + stock + "]";
	}
	
	
	
	
}
