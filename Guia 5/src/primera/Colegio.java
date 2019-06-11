package primera;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Colegio {
	private HashMap<String, Integer> alumnos;
	
	public Colegio (){
		alumnos = new HashMap<String, Integer>();
	}
	
	/**
	 * Ingresa una nacionalidad, si ya existe aumenta la cantidad de alumnos de la misma. De lo contrario la añade y la inicializa en 1
	 * @param nacionalidad
	 */
	public void addAlumno(String nacionalidad){
		if (alumnos.containsKey(nacionalidad)){
			int cantidadAlumnos = alumnos.get(nacionalidad);
			alumnos.put(nacionalidad, cantidadAlumnos++);
			
		}else{
			alumnos.put(nacionalidad, 1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	/**
	 * Muestra todas las nacionalidades almacenadas con sus respectivas cantidades de alumnos
	 * @return String con todo los datos
	 */
	public String showAll(){
		Iterator it= alumnos.entrySet().iterator();
		StringBuilder informacion = new StringBuilder();
		
		while (it.hasNext()){
			Map.Entry linea = (Map.Entry) it.next();
			
			informacion.append("\nNacionalidad: " +linea.getKey()+"\nCantidad de alumnos: "+linea.getValue()+"\n");
		}
		return informacion.toString();
	}
	/**
	 * Muestra la nacionalidad ingresada como parametro y la cantidad de sus alumnos
	 * @param nacionalidad
	 * @return Un mensaje dependiendo de cual sea el caso de la nacionalidad ingresada
	 */
	public String showNacionalidad (String nacionalidad){
		String mensaje;
		if (nacionalidad!=null && !(nacionalidad.equals(""))){// Es importante que la comprovacion de null vaya primero.
			if (alumnos.containsKey(nacionalidad)){
				mensaje="\nNacionalidad: "+nacionalidad+"\nCantidad de alumnos: "+ alumnos.get(nacionalidad);
			}else{
				mensaje="La nacionalidad no existe";
			}
		}else{
			mensaje="Dato invalido";
		}
		return mensaje;
	}
	/**
	 * 
	 * @return Devuelve la cantidad de nacionalidades almacenadas
	 */
	public int Cuantos (){
		return alumnos.size();
	}
	
	public String borrar (String nacionalidad){
		String mensaje;
		if (nacionalidad!=null && alumnos.containsKey(nacionalidad)){
			alumnos.remove(nacionalidad);
			mensaje="Se removio la nacionalidad '"+nacionalidad+"'";		
		}else{
			mensaje="No se encontro la nacionalidad o se ingreso un valor nulo";
		}
		return mensaje;
	}
	//combine usar booleanos, int, excepciones antes que retornar un mensaje en el caso de borrar o mostrar la nacionalidad
}
