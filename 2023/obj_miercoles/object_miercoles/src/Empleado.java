public class Empleado extends Persona
{
    private double sueldo;

    public Empleado(String nombre, double sueldo)
    {
        super(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public boolean equals(Object obj) {

        boolean rta = false;

        if (rta)
        {
            Empleado e = (Empleado) obj;
            if (getSueldo() != e.getSueldo() && e.getNombre().equals(getNombre()))
            {
                rta = false;
            }
        }
        return rta;
    }
}
