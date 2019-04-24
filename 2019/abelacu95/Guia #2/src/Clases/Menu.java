package Clases;
import java.util.Scanner;

public class Menu{


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Cuenta cuenta1 = null;
        int control;
        float cantidad;

        do {

            System.out.println("\t.:MENU:.");
            System.out.println("1. Crear cuenta vacía.");
            System.out.println("2. Crear cuenta saldo inicial.");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");


            System.out.println("Ingrese Numero:");
            control = scan.nextInt();


            switch (control) {

                case 1:
                    cuenta1 = new Cuenta(0);
                    System.out.println("Cuenta Vacia Creada Correctamente!");
                    break;

                case 2:
                    System.out.println("Ingrese Saldo inicial:");
                    float saldoInicial = scan.nextFloat();
                    cuenta1 = new Cuenta(saldoInicial);
                    System.out.println("Cuenta Creada Correctamente!");
                    break;

                case 3:
                    if(cuenta1 != null){
                        System.out.println("Digite Saldo: ");
                        cantidad = scan.nextFloat();
                        cuenta1.ingresarDinero(cantidad);
                    }
                    else{
                        System.out.println("La Cuenta No Existe!");
                    }
                    break;

                case 4:
                    if(cuenta1 != null){
                        System.out.println("Digite Saldo:");
                        cantidad = scan.nextFloat();
                        if(cantidad < cuenta1.mostrarSaldo()){
                            cuenta1.extraer(cantidad);
                            System.out.println("Extraccion Excitosa!");
                        }
                        else{
                            System.out.println("Cantidad No Disponible");
                        }
                    }
                    else{
                        System.out.println("La Cuenta No Existe!");
                    }
                    break;

                case 5:
                    if(cuenta1 != null){
                        System.out.println("Su Saldo es: "+cuenta1.mostrarSaldo());
                    }
                    else{
                        System.out.println("La Cuenta No Existe!");
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("ERROR.");
                    break;
            }

        }while(control!=6);
    }
}
