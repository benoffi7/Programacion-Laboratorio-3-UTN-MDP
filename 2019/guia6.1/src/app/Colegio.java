package app;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Colegio
 */
public class Colegio {

    HashMap<String, ArrayList<Persona>> alumnos;

    public Colegio() {
        alumnos = new HashMap<String, ArrayList<Persona>>();
    }

    public void addAlumno(String nacionalidad, Persona alumnoNuevo) {
        ArrayList<Persona> listaAlumnos = new ArrayList<Persona>();
        if (!(alumnos.isEmpty())) {

            listaAlumnos = alumnos.get(nacionalidad);
            listaAlumnos.add(alumnoNuevo);
            alumnos.put(nacionalidad, listaAlumnos);

        } else {
            listaAlumnos.add(alumnoNuevo);
            alumnos.put(nacionalidad, listaAlumnos);
        }
    }

    public String showAll() {
        StringBuffer buffer = new StringBuffer();

        if (!(alumnos.isEmpty())) {
            for (String i : alumnos.keySet()) {
                buffer.append("\nPais: " + i);
                buffer.append(" = " + alumnos.get(i).size() + " alumnos");
            }
        }

        return buffer.toString();

    }

    public String showNacionalidad(String nacionalidad) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nPais: " + nacionalidad);
        buffer.append(" = " + alumnos.get(nacionalidad).size() + " alumnos");
        return buffer.toString();
    }

    public int cuantos(){
        return alumnos.size();
    }

    public void borrar(String nacionalidad){
        alumnos.remove(nacionalidad);
    }

}