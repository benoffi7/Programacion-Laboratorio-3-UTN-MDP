
public class NoCoincidenContactoException extends Exception {
	// La clave que no tiene coincidencias.
	private String clave;

	/**
	 * Almacena los datos erróneos.
	 * 
	 * @param clave
	 *            La clave que no coincide.
	 */
	public NoCoincidenContactoException(String clave) 
	{
		super(clave);
		this.clave = clave;
	}

	/**
	 * @return La clave errónea.
	 */
	public String getClave() {
		return clave;
	}

	/**
	* @return Una cadena de diagnóstico que contiene
	la clave errónea.
	*/
	public String toString()
	{
	return "No se encontraron datos que coincidan con : " + clave ;
	}
}