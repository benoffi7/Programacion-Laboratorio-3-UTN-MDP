package Main;

public class Cuenta {

    private float saldo;
    private String nombre;

    public Cuenta ()
    {
        setNombre(" ");
        setSaldo(0);
    }

    public Cuenta(String nuevoNombre) {

        setSaldo(0);
        setNombre(nuevoNombre);

    }

    public Cuenta(String nuevoNombre, float nuevoSaldo) {
        setNombre(nuevoNombre);
        setSaldo(nuevoSaldo);

    }


    public float getSaldo()
    {
        return saldo;
    }

    public String getNombre() {

        return nombre;
    }

    private void setSaldo(float nuevoSaldo) {

        saldo = nuevoSaldo;
    }

    public void setNombre(String nuevoNombre)
    {
        nombre=nuevoNombre;
    }

    public void ingresar(float dinero) {
        setSaldo(getSaldo() + dinero);

    }

    public void extraer(float dinero) {

        if (getSaldo() - dinero >= 0)
            setSaldo(getSaldo() - dinero);
        else
            System.out.println("Saldo insuficiente ("+getSaldo()+")\n");
    }


}
