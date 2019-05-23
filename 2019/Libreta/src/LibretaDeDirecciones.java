import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class LibretaDeDirecciones {

	private TreeMap<String, DatosDelContacto> libreta;
	private int numeroDeEntradas;

	/**
	 * Inicializa la libreta de direcciones.
	 */
	public LibretaDeDirecciones() {
		libreta = new TreeMap<String, DatosDelContacto>();
		numeroDeEntradas = 0;
	}

	/**
	 * Busca un nombre o un número de teléfono y devuelve los correspondientes
	 * datos de ese contacto.
	 * 
	 * @param clave
	 *            El nombre o el número a buscar.
	 * @return Los datos del contacto correspondiente a la clave.
	 */
	public DatosDelContacto getContacto(String clave) {
		return libreta.get(clave);
	}

	/**
	 * Busca un nombre o un número de teléfono y devuelve los datos del contacto
	 * correspondiente.
	 * 
	 * @param clave
	 *            El nombre o número a buscar.
	 * @return Los datos correspondientes a la clave o null si no hay
	 *         coincidencias.
	 * @throws NullPointerException
	 *             si la clave es null.
	 */
	public DatosDelContacto getContactoV2(String clave) {
		if (clave == null) {
			throw new NullPointerException("clave null en getContacto");
		}
		return libreta.get(clave);
	}

	public DatosDelContacto getContactoV3(String clave) {
		if (clave == null) {
			throw new NullPointerException("clave null en getContacto");
		}
		if (clave.trim().length() == 0) {
			throw new IllegalArgumentException("Se pasó clave vacía a getContacto");
		}
		if (libreta.get(clave)==null)
		{
			throw new NullPointerException("No se encontro el contacto");
		}
		return libreta.get(clave) ;
	}

	/**
	 * Return si la clave actual está o no en uso.
	 * 
	 * @param clave
	 *            l nombre o el teléfono a buscar.
	 * @return true si la clave está en uso, false en caso contrario.
	 */
	public boolean claveEnUso(String clave) {
		return libreta.containsKey(clave);
	}

	/**
	 * Agrega un nuevo contacto a la libreta de direcciones.
	 * 
	 * @param contacto
	 *            Los datos de contacto asociados con una persona.
	 */
	public void agregarContacto(DatosDelContacto contacto) {
		libreta.put(contacto.getNombre(), contacto);
		libreta.put(contacto.getTelefono(), contacto);
		numeroDeEntradas++;
	}

	/**
	 * Cambia los datos del contacto almacenados previamente bajo la clave dada.
	 * 
	 * @param claveVieja
	 *            Una de las claves que se usó para almacenar los datos del
	 *            contacto. * @param contacto Los datos del contacto que
	 *            reemplazarán a los existentes.
	 */
	public void modificarContacto(String claveVieja, DatosDelContacto contacto) {
		eliminarContacto(claveVieja);
		agregarContacto(contacto);
	}

	/**
	 * Busca todos los datos de los contactos almacenados bajo una clave que
	 * comienza con un prefijo determinado.
	 * 
	 * @param prefijo
	 *            El prefijo a buscar entre las claves.
	 * @return Un arreglo con los contactos que se encontraron.
	 */
	public DatosDelContacto[] buscar(String prefijo) {
		List<DatosDelContacto> coincidencias = new LinkedList<DatosDelContacto>();
		// Busca las claves iguales o mayores que el prefijo dato.
		SortedMap<String, DatosDelContacto> cola = libreta.tailMap(prefijo);
		Iterator<String> it = cola.keySet().iterator();
		boolean finDeBusqueda = false;
		while (!finDeBusqueda && it.hasNext()) {
			String clave = it.next();
			if (clave.startsWith(prefijo)) {
				coincidencias.add(libreta.get(clave));
			} else {
				finDeBusqueda = true;
			}
		}
		DatosDelContacto[] resultados = new DatosDelContacto[coincidencias.size()];
		coincidencias.toArray(resultados);
		return resultados;
	}

	/**
	 * }
	 * 
	 * @return El número de entradas que hay actualmente en la libreta.
	 */
	public int getNumeroDeEntradas() {
		return numeroDeEntradas;
	}

	/**
	 * Elimina de la libreta, la entrada que tiene la clave dada.
	 * 
	 * @param clave
	 *            Una de las claves de entrada a eliminar.
	 */
	public void eliminarContacto(String clave) {
		DatosDelContacto contacto = getContactoV3(clave);
		libreta.remove(contacto.getNombre());
		libreta.remove(contacto.getTelefono());
		numeroDeEntradas--;
	}

	/**
	 * @return Los datos de todos los contactos, en el orden que * los almacena
	 *         la clase DatosDelContacto.
	 */
	public String listarContactos() {
		/*
		 * Dado que cada entrada se almacena mediante dos claves, es necesario
		 * construir un conjunto de DatosDelContacto que elimina los contactos
		 * duplicados.
		 */
		StringBuffer todasLasEntradas = new StringBuffer();
		Set<DatosDelContacto> contactosOrdenados = new TreeSet<DatosDelContacto>(libreta.values());
		for (DatosDelContacto contacto : contactosOrdenados) {
			todasLasEntradas.append(contacto);
			todasLasEntradas.append('\n');
			todasLasEntradas.append('\n');
		}
		return todasLasEntradas.toString();
	}

	public void grabarEnArchivo(String archivoDestino) throws IOException
	{
		throw new IOException("Imposible guardar");
	}
}
