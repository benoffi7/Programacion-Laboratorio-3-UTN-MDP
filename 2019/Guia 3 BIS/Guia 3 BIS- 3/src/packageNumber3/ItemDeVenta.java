package packageNumber3;


public class ItemDeVenta 
{
	private int identificador;
	private String descripcion;
	private int cantidad;
	private float precioUnitario;
	
	public ItemDeVenta () {
		setIdentificador(0);
		setDescripcion(" ");
		setCantidad(0);
		setPrecioUnitario(0);
	}
	
	public ItemDeVenta (int identificadorR, String descripcionR, int cantidadR, float precioUnitarioR) {
		setIdentificador(identificadorR);
		setDescripcion(descripcionR);
		setCantidad(cantidadR);
		setPrecioUnitario(precioUnitarioR);
	}
	
	private int getIdentificador() {
		return identificador;
	}
	private void setIdentificador(int identificadorR) {
		identificador = identificadorR;
	}
	private String getDescripcion() {
		return descripcion;
	}
	private void setDescripcion(String descripcionR) {
		descripcion = descripcionR;
	}
	private int getCantidad() {
		return cantidad;
	}
	private void setCantidad(int cantidadR) {
		cantidad = cantidadR;
	}
	private float getPrecioUnitario() {
		return precioUnitario;
	}
	private void setPrecioUnitario(float precioUnitarioR) {
		precioUnitario = precioUnitarioR;
	}

	public float obtenerPrecioTotal () {
		float rdo = getPrecioUnitario() * getCantidad();
		return rdo;
	}
	
	@Override
	public String toString() {
		return "\nItemVenta [ id= " +getIdentificador()+ ", descripcion= " +getDescripcion()+ ", cantidad= " +getCantidad()+ ", pUnitario" +getPrecioUnitario()+ ", pTotal= " +obtenerPrecioTotal();
	}
}
