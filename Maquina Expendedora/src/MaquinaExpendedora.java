public class MaquinaExpendedora {

    private float saldo;//saldo del cliente
    private float precio;//precio del producto
    private float total;//total recaudado a lo largo de las innumerables operaciones
    private boolean estado;
    private static int boletosImpresos=0;

    //cliente   (imprimir un boleto)   (cantidad recaudado)
    //dinero
    //contructor
    public MaquinaExpendedora(){
        setSaldo(0);
        setPrecio(15);
        setTotal(0);
        setEstado(true);
    }

    //getters y setters
    public float getTotal(){
        return total;
    }

    public void setTotal(float otroTotal){
        total = otroTotal;
    }
    public static int getBoletosImpresos(){
        return boletosImpresos;
    }
    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean trueofalse){
        estado = trueofalse;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float nuevoSaldo){
        saldo = nuevoSaldo;
    }
    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float nuevoPrecio){
        precio = nuevoPrecio;
    }


    //métodos

    public static void aumentarBoletosImpresos(){
        boletosImpresos++;
    }

    public void mostrarPrecio(){
        ControladoraUsuario.mostrar_por_pantalla("El precio es de: $"+ getPrecio());
    }

    public boolean ingresarDinero(float dinero_cliente){
        agregarSaldo(dinero_cliente);

        if( getPrecio() <= getSaldo()){
            return true;
        }else {
            return false;
        }
    }

    public void mostrarDineroFaltante(){
        ControladoraUsuario.mostrar_por_pantalla("Dinero faltante: $"+(getPrecio()-getSaldo()));
    }
    private void agregarSaldo(float dinero_cliente){
        setSaldo( getSaldo()+dinero_cliente );
    }

    /**
     * imprime un boleto con información del producto comprado.
     */
    public void imprimirBoleto(){
        darVuelto();
        aumentarBoletosImpresos();
    }

    public void mostrarBoletosImpresos(){
        ControladoraUsuario.mostrar_por_pantalla("La cantidad de boletos impresos fue de: "+getBoletosImpresos() );
    }

    private boolean existeVuelto(){
        setSaldo( getSaldo()-getPrecio() );
        if(getSaldo() >= 0.05){
            return true;
        }else
        {
            return false;
        }
    }

    public void darVuelto(){

        if(existeVuelto()){
            ControladoraUsuario.mostrar_por_pantalla("Su vuelto es de: $"+getSaldo());
        }else{
            ControladoraUsuario.mostrar_por_pantalla("Su vuelto es de: $0");
        }
    }

    public void mostrarAgradecimiento(){
        ControladoraUsuario.mostrar_por_pantalla("Gracias por su compra");
    }

}
