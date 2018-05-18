
public class DatosDelContacto {
	private String nombre;
	private String telefono;
	private String direccion;

	/**
	 * Prepara los datos del contacto. A todos los datos se les elimina los
	 * espacios en blanco al comienzo y al final. El nombre y el teléfono no
	 * pueden ser simultáneamente cadenas vacías.
	 * 
	 * @param nombre
	 *            El nombre.
	 * @param telefono
	 *            El número de teléfono.
	 * @param direccion
	 *            La dirección.
	 * @throws Illegal
	 *             StateException Si el nombre y el teléfono están vacíos.
	 */
	public DatosDelContacto(String nombre, String telefono, String direccion) {
		// Usa cadenas vacías si alguno de los argumentos es null.
		if (nombre == null) {
			nombre = "";
		}
		if (telefono == null) {
			telefono = "";
		}
		if (direccion == null) {
			direccion = "";
		}
		this.nombre = nombre.trim();
		this.telefono = telefono.trim();
		this.direccion = direccion.trim();
		if (this.nombre.length() == 0 && this.telefono.length() == 0) {
			throw new IllegalStateException("El nombre y el teléfono no pueden estar vacíos.");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

}
