public class Cuenta {

    private float saldo;
    private String usuario;

    public Cuenta(String usuario2, float saldo2) {

        this.usuario = usuario2;
        this.saldo = saldo2;
        
    }

    public void ingresar(float c) {
        saldo = saldo + c;
    }

    public void extraer(float c) {
        if (saldo - c > 0) {
            saldo = saldo - c;
        } else {
            System.out.println("No tiene suficiente saldo para la extraccion");
        }
    }

    public float getSaldo() {
        float restante = saldo;
        return restante;
    }

    public String getUsuario() {
        return usuario;
    }
}