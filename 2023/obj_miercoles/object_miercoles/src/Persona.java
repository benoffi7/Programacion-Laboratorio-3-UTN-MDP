import java.util.Objects;

public class Persona
{
    private String nombre;
    private int DNI;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;

        if (obj!=null) {

            if (obj instanceof Persona) {
                Persona aux = (Persona) obj;

                if (getNombre().equals(aux.getNombre()) && (getDNI() == aux.getDNI())) {
                    rta = true;
                }
            }

        }

        return rta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, DNI);
    }
}
