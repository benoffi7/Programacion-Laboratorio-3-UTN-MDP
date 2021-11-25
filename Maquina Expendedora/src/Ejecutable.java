public class Ejecutable {

    public static void main(String[] args) {

        boolean flag = true;
        float dinero = 0;
        MaquinaExpendedora maquina = new MaquinaExpendedora();

        maquina.mostrarPrecio();
        ControladoraUsuario.mostrar_por_pantalla("Ingrese el dinero: ");
        while(flag) {
            dinero = ControladoraUsuario.ingreso_de_float();

            if (maquina.ingresarDinero(dinero)){
                maquina.imprimirBoleto();
                flag = false;
            }else {
                maquina.mostrarDineroFaltante();
            }
        }
        maquina.mostrarBoletosImpresos();
        maquina.mostrarAgradecimiento();
    }

}