/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class CajeroAutomatico {

    public static Scanner teclado;
    private static Cuenta miCuenta;

    /**
     * Retorna las operaciones que puede realizar este cajero
     *
     * @return Un mensaje con las opciones
     */
    public static String devolverMenuTexto() {
        return "1. Crear cuenta vacía\n"
                + "2. Crear cuenta saldo inicial\n"
                + "3. Ingresar dinero\n"
                + "4. Sacar dinero\n"
                + "5. Ver saldo\n"
                + "6. Salir";
    }

    public static float devolverMonto(){
        float monto;        
        monto= teclado.nextFloat();
        while (monto < 0){
            System.out.println("Valor incorrecto, ingrese un valor mayor a 0");
            monto= teclado.nextFloat();
        }
        return monto;
    }
    
    /**
     * 
     * @param miCuenta
     * @return Devuelve verdadero si la cuenta existe
     */
    public static boolean existeCuenta(Cuenta miCuenta) {
        boolean rta = false;
        if (miCuenta != null) {
            rta = true;
        }
        return rta;
    }

    public static void crearCuenta(int bandera) {
        System.out.println("Ingrese un nombre");
        String nuevoNombre = teclado.next();
        

        if (bandera == 1) {
            miCuenta = new Cuenta(nuevoNombre);
        } else {
            if (bandera == 2) {
                System.out.println("Ingrese el saldo inicial");
                float saldoInicial = devolverMonto();
                miCuenta = new Cuenta(saldoInicial, nuevoNombre);
            }
        }
    }

    public static void ingresarDinero(){
        System.out.println("Ingrese el monto a cargar");
        float monto = devolverMonto();
        
        miCuenta.ingresar(monto);
        System.out.println("Se ha cargado correctamente el monto");
    }
    
    public static void extraerDinero(){
        System.out.println("Ingrese el monto a retirar");
        float monto = devolverMonto();
        float saldoPosible = miCuenta.getSaldo() - monto;
        
        while ( saldoPosible < 0 ){
            System.out.println("El monto a retirar supera el saldo de la cuenta");
            System.out.println("Ingrese un monto menor");
            monto = devolverMonto();
            saldoPosible = miCuenta.getSaldo() - monto;
        }
        
        miCuenta.extraer(monto);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion = 0;
        
        do {            
            System.out.println(devolverMenuTexto());
            System.out.println("Ingrese una opcion");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    if (!existeCuenta(miCuenta)) {
                        crearCuenta(1);
                        System.out.println("Se creo la cuenta sin saldo");
                    } else {
                        System.out.println("Ya existe una cuenta creada");
                    }
                    break;

                case 2:
                    if (!existeCuenta(miCuenta)) {
                        crearCuenta(2);
                        System.out.println("Se creo la cuenta con $" + miCuenta.getSaldo());
                    } else {
                        System.out.println("Ya existe una cuenta");
                    }
                    break;

                case 3:
                    if (existeCuenta(miCuenta)){
                        ingresarDinero();
                    }
                    else{
                        System.out.println("Se debe crear una cuenta antes de usar esta opcion");
                    }
                    break;

                case 4:
                    if (existeCuenta(miCuenta)){
                        extraerDinero();
                    }
                    else{
                        System.out.println("Se debe crear una cuenta antes de usar esta opcion");
                    }
                    break;

                case 5:
                     if (existeCuenta(miCuenta)){
                        System.out.println("$" + miCuenta.getSaldo());
                    }
                    else{
                        System.out.println("Se debe crear una cuenta antes de usar esta opcion");
                    }                    
                    break;

                case 6:
                    miCuenta = null;
                    teclado.close();
                    System.out.println("\n\n\nSaliendo del programa");
                    break;
            }
        } while (opcion != 6);
        
    }

}
