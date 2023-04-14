public class Persona
{
    private String nombre;

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
                "nombre='" + getNombre() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean rta = false;

        if (obj!=null) {

            if (obj instanceof Persona) {
                Persona aux = (Persona) obj;

                if (getNombre().equalsIgnoreCase(aux.getNombre())) {
                    rta = true;
                }
            }
        }
        return rta;
    }
}
