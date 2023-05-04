public class Perro implements Comparable
{
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public int compareTo(Object o) {
        if (o!=null)
        {
            if (o instanceof Perro)
            {
                Perro otroPerro = (Perro)o;
                return getRaza().compareTo(otroPerro.getRaza());
            }
        }
        return 0;
    }
}
