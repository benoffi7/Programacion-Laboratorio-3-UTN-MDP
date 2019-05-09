package aa;

public class ProductoFresco extends Producto
{
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco()
	{
		super();
		fechaEnvasado = "";
		paisOrigen = "";
	}

	public ProductoFresco(String codigoInterno, 
			String fechaCaducidad, String numeroLote,
			String fechaEnvasado, String paisOrigen) 
	{
		super(codigoInterno,fechaCaducidad,numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public ProductoFresco (ProductoFresco fresco, String otroCodigo)
	{
		super(otroCodigo,fresco.getFechaCaducidad(), fresco.getNumeroLote());
		this.fechaEnvasado = fresco.getFechaEnvasado();
		this.paisOrigen = getPaisOrigen();
	}
	
	public String getPaisOrigen() {
		return paisOrigen;
	}
	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	
	@Override
	public String toString() {
	
		return super.toString() + getPaisOrigen() + getFechaEnvasado();
	}
	
	
	

}
