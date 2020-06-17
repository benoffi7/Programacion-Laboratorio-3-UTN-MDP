package Ej1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Colegio {
	private HashMap<String, Integer> alumnos;

	public Colegio() {
		alumnos = new HashMap<String, Integer>();
	}

	/**
	 * Agrega un alumno a la nacionalidad existente, sino la crea
	 * 
	 * @param nacionalidad
	 */
	public void addAlumno(String nacionalidad) {

		if (alumnos.containsKey(nacionalidad)) {

			Integer cantAlumnos = alumnos.get(nacionalidad);
			cantAlumnos++;
			alumnos.put(nacionalidad, cantAlumnos);

		} else {
			alumnos.put(nacionalidad, 1);
		}

	}

	/**
	 * 
	 * @return un string con el contenido del mapa
	 */
	public String showAll() {
		Iterator it = alumnos.entrySet().iterator();
		StringBuilder informacion = new StringBuilder();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();

			informacion.append(showNacionalidad ((String) me.getKey()) + "\n" );

		}
		return informacion.toString();

	}

	/**
	 * Muestra la cantidad de alumnos segun esa nacionalidad
	 * @param nacionalidad
	 * @return
	 */
	public String showNacionalidad(String nacionalidad) {
		String mensaje="";
		if (nacionalidad!=null || nacionalidad.equals(""))
			if(alumnos.containsKey(nacionalidad)) {
				mensaje = "Nacionalidad: " + nacionalidad + "\nCantidad alumnos: " + (alumnos.get(nacionalidad)).toString()
					+ "\n";
		} 
		else {
			mensaje = "No existe esa nacionalidad";
		}
		
		return mensaje;
	}

	/**
	 * 
	 * @return La cantidad de nacionalidades distintas que hay
	 */
	public int cuantos() {
		return alumnos.size();
	}

        /**
         * Elimina a la nacionalidad registrada
         * @param nacionalidad
         * @return si se pudo borrar correctamente
         */
	public boolean borrar(String nacionalidad) {
		boolean rta = false;
		if (alumnos.containsKey(nacionalidad)) {
			alumnos.remove(nacionalidad);
			rta = true;
		}
		return rta;
	}

}
