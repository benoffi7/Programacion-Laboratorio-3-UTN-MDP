import java.util.Objects;

public class Alumno implements Comparable
{
    private String nombre;
    private int legajo;

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public int compareTo(Object o)
    {
        int rta = 0;
        if (o!=null)
        {
            if (o instanceof Alumno)
            {
                Alumno aux = (Alumno)o;
                Integer miLegajo = new Integer(getLegajo());
                Integer otroLegajo = new Integer(aux.getLegajo());
                rta = miLegajo.compareTo(otroLegajo);
            }
        }
        return rta;
    }
}
