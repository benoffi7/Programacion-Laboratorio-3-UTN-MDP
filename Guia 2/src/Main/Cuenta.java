package Main;

public class Cuenta {

    //Atributos
    private String usuario;
    private String contrasenia;
    private float saldo;

    //Constructor
    public Cuenta(String usuario_Ingresado, String contrasenia_Ingresada){
        setUsuario(usuario_Ingresado);
        setContrasenia(contrasenia_Ingresada);
        setSaldo(0);
    }

    public Cuenta(String usuario_Ingresado,String contrasenia_Ingresada, float saldo_Ingresado){
        setUsuario(usuario_Ingresado);
        setContrasenia(contrasenia_Ingresada);
        setSaldo(saldo_Ingresado);
    }

    //Get/Set
    public void setUsuario(String usuario_Ingresado){

        usuario=usuario_Ingresado;
    }

    public void setContrasenia(String contrasenia_Ingresada){
        contrasenia=contrasenia_Ingresada;
    }

    public void setSaldo(float saldo_Ingresado){
        saldo=saldo_Ingresado;
    }

    public String getUsuario(){
        return usuario;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    public float getSaldo(){
        return saldo;
    }

    //Metodos
    public void Ingresar(float saldo_Ingresado){
        if(saldo_Ingresado>0){
            setSaldo(getSaldo()+saldo_Ingresado);
        }
    }

    public void Extraer(float saldo_A_Sacar){

        setSaldo(getSaldo()-saldo_A_Sacar);

    }


}
