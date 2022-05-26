package Main;

import java.util.Scanner;
import Main.Cuenta;


public class Menu {

    private static int opcion =0;
    private static int nCuenta =0;
    private static float saldo =0;
    private static float ingreso =0;
    private static float retiro =0;
    static boolean VoF  = false;

    static Scanner scan;
    static Cuenta cuenta;


    public static void  menuInterfaz() {
        do {

            System.out.println("Ingrese opcion: ------------ \n");
            System.out.println("1.Crear cuenta vacia...........");
            System.out.println("2.Crear cuenta saldo inicial...");
            System.out.println("3.Ingrese dinero...............");
            System.out.println("4.Sacar dinero.................");
            System.out.println("5.Ver saldo....................");
            System.out.println("6.Salir........................");
            scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese numero de cuenta... \n");
                    scan = new Scanner(System.in);
                    nCuenta = scan.nextInt();

                    VoF = cuenta.controlCuenta(nCuenta);

                    if ((VoF == true) && (cuenta == null)){
                        cuenta = new Cuenta();
                        System.out.println("La cuenta ya fue creada...");
                    }
                    else
                        System.out.println("Cuenta existente...");
                    break;

                case 2:
                    VoF = cuenta.controlCuenta(nCuenta);

                    if ((VoF == true)&& (cuenta !=null)) {
                        System.out.println("Ingrese el saldo inicial... \n");

                        saldo = scan.nextFloat();
                        cuenta = new Cuenta(saldo);
                    } else
                        System.out.println("Primero debe crear la cuenta...");
                    break;
                case 3:
                    System.out.println("Ingrese saldo... \n");
                    scan = new Scanner(System.in);
                    ingreso = scan.nextFloat();

                    VoF = Cuenta.controlCuenta(nCuenta);

                    if ((VoF == true) && (cuenta !=null))
                    {
                         cuenta.ingresar(ingreso, cuenta.getSaldo());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese saldo a extraer... \n");
                    scan = new Scanner(System.in);
                    retiro = scan.nextFloat();

                    VoF = Cuenta.controlCuenta(nCuenta);

                    if ((VoF == true)&&(cuenta !=null)) {
                        if (retiro <= cuenta.getSaldo()) {
                            cuenta.extraer(cuenta.getSaldo(), retiro);
                            System.out.println("Saldo restante..." + cuenta.getSaldo());
                        }
                        else {
                            System.out.println("Saldo insuficiente, ingrese un valor menor a..." + cuenta.getSaldo());
                        }
                    }
                    else
                        {
                            System.out.println("Primero debe crear la cuenta...");
                        }
                    break;
                case 5:
                    VoF = Cuenta.controlCuenta(nCuenta);

                    if ((VoF == true)&& (cuenta !=null)) {
                        System.out.println("Saldo final..." + cuenta.getSaldo());
                    }
                    break;

            }
        } while (opcion < 6);

    }
}