package Maquina_Expendedora;

public class Boleto {
	
	private double precio;
	private String tipo;
	
	
	public Boleto(double precio, String tipo) {
		super();
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public double getPrecio() {
		return precio;
	}
	private void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double MostrarPrecio() {
		return getPrecio();
	}
	
	public void PonerPrecio() {
		setPrecio(precio);
	}
	
	
}
