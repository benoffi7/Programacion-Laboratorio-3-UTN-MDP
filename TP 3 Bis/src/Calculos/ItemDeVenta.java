package Calculos;

public class ItemDeVenta {
	
	private int id;
	private String descripcion;
	private int cantidad;
	private double precioUnitario;
	
	
	
	public ItemDeVenta(int id, String descripcion, int cantidad, double precioUnitario) {

		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double calcularPrecioTotal() {
		return precioUnitario*cantidad;
	}
	
	@Override
	public String toString() {
		return "ItemDeVenta [ id=" + id + " descripcion=" + descripcion + " cantidad=" + cantidad + " precioUnitario="
				+ precioUnitario + "]";
	}
	
	
}
