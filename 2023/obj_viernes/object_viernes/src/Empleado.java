public class Empleado extends Persona
{
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, double sueldo)
    {
        super(nombre);
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = super.equals(obj);
        if (rta)
        {
            if (obj instanceof Empleado)
            {
                Empleado empleado_aux = (Empleado) obj;

                if (empleado_aux.getSueldo() != this.getSueldo())
                {
                    rta = false;
                }
            }
        }
        return rta;
    }
}
