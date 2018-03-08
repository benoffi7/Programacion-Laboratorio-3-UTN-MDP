import java.io.Serializable;

public class Casa implements Serializable
{
	/**
	 * @param cantidadHabitaciones
	 * @param direccion
	 */
	public Casa(int cantidadHabitaciones, String direccion) {
		super();
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.direccion = direccion;
	}
	int cantidadHabitaciones;
	String direccion;

	
}
