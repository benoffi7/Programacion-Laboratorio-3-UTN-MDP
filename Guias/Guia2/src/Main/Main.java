package Main;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Cuenta corriente = null;
        menu(corriente);


    }


    public static void menu(Cuenta corriente) {
        int opc = 0;
        float auxsaldo = 0;
        String auxnomb = " ";
        String fallo = "¡¡Cree una cuenta!!\n";
        String control = "s";


        while (opc != 6) {

            System.out.print("\033[H\033[2J");
            System.out.flush();


            System.out.println("1. Crear cuenta vacía\n" + "2. Crear cuenta saldo inicial\n" + "3. Ingresar dinero\n" + "4. Sacar dinero\n" + "5. Ver saldo\n" + "6. Salir\n");

            opc = scan.nextInt();


            switch (opc) {

                case 1:
                    if (corriente != null) {
                        System.out.println("Ya existe una cuenta corriente ["+ corriente.getNombre()+"] Desea sobreescribir la cuenta? s/n");

                        control = scan.next();

                    } else if (control.equals("s")) {
                        System.out.println("Ingresa un nombre");
                        corriente = new Cuenta(scan.next());
                    }


                    break;
                case 2:

                    if (corriente != null) {
                        System.out.println("Ya existe una cuenta corriente ["+ corriente.getNombre()+"] Desea sobreescribir la cuenta? s/n");

                        control = scan.next();

                    } else if (control.equals("s")) {
                        System.out.println("Ingresa un nombre");
                        auxnomb = scan.next();
                        System.out.println("Ingrese saldo");
                        auxsaldo = scan.nextInt();

                        corriente = new Cuenta(auxnomb, auxsaldo);
                    }


                    break;
                case 3:
                    if (corriente == null) {
                        System.out.println(fallo);
                    } else {
                        System.out.println("Ingrese cantidad a ingresar:");
                        corriente.ingresar(scan.nextInt());
                    }

                    break;
                case 4:
                    if (corriente == null) {
                        System.out.println(fallo);
                    } else {
                        System.out.println("Ingrese cantidad a extraer:");
                        corriente.extraer(scan.nextInt());
                    }

                    break;

                case 5:
                    if (corriente == null)
                        System.out.println(fallo);
                    else
                    System.out.println("Cuenta: ["+corriente.getNombre()+"]\nEl saldo disponible es de : " + corriente.getSaldo());

                    break;

                case 6:

                    opc = 6;
                    break;
                    default:
                        System.out.println("Opción invalida\n");
                        break;

            }

        }

        scan.close();
    }

}
