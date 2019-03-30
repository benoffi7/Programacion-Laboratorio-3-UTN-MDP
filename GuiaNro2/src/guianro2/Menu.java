/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guianro2;


import java.util.Scanner;

public class Menu {

    private Scanner scan = new Scanner(System.in);
    
    public int mostrarMenu() {
        int opcion=0;
        System.out.println("1-->Crear cuenta vacia");
        System.out.println("2-->Crear cuenta con saldo inicial");
        System.out.println("3-->Ingresar monto");
        System.out.println("4-->Extraer monto");
        System.out.println("5-->Consultar saldo");
        System.out.println("6-->Salir");
        opcion=scan.nextInt();
        return opcion;

    }

   




    public void mostrarOpciones(Cuenta cuenta) {
       int opcion;
        do {
             opcion=mostrarMenu();
            switch (opcion) {

                case 1:
                    if (cuenta == null) {
                        cuenta = new Cuenta();
                    }else{
                        System.out.println("Ya existe la cuenta");
                    }
                        
                    break;
                case 2:
                    if (cuenta == null) {
                        float saldoIngresado;
                        System.out.println("Con cuanto saldo quiere crear la cuenta? ");
                        saldoIngresado = scan.nextFloat();
                        cuenta = new Cuenta(saldoIngresado);
                    }else{
                        System.out.println("Ya existe la cuenta");
                    }
                    break;
                case 3:
                    if (cuenta != null) {
                        float montoIngresado;
                        System.out.println("Monto a ingresar? ");
                        montoIngresado = scan.nextFloat();
                        cuenta.ingresarSaldo(montoIngresado);
                    }

                    break;
                case 4:
                    if (cuenta != null) {

                        float montoExtraido;
                        System.out.println("Monto a retirar? ");
                        montoExtraido = scan.nextFloat();
                        cuenta.extraerSaldo(montoExtraido);
                    }
                    break;
                case 5:

                    System.out.println("Su saldo es de: " + cuenta.getSaldo());
                    break;
                case 6:
                    break;
                    default:
                        System.out.println("Opcion incorrecta");
            }

        } while (opcion != 6);
        
            
    }

}

