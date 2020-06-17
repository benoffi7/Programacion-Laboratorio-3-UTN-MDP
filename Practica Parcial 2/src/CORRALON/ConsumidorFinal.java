package CORRALON;

public class ConsumidorFinal extends Cliente{
	
	private static double descuento=0.15;
	
	public ConsumidorFinal(int id, String nombre, String apellido, String fechaNac, String tel, String dni) {
		super(id, nombre, apellido, fechaNac, tel, dni);
	}

	public static double getDescuento() {
		return descuento;
	}

	public static void setDescuento(double descuento) {
		ConsumidorFinal.descuento = descuento;
	}

	@Override
	public String toString() {
		return "\n "+super.toString()+" ConsumidorFinal []";
	}
	
	
	
}
