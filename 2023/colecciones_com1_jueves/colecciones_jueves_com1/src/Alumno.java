import java.util.Objects;

public class Alumno implements Comparable
{
    private int legajo;
    private String nombre;

    public Alumno(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public int compareTo(Object o)
    {
        int comparacion = 0;
        if (o!=null)
        {
            if (o instanceof Alumno)
            {
                Alumno otroAlumno = (Alumno)o;
                Integer otroLegajo = new Integer(otroAlumno.getLegajo());
                Integer miLegajo = new Integer(getLegajo());



                comparacion = getNombre().compareTo(otroAlumno.getNombre());
            }
        }
        return comparacion;
    }
}
