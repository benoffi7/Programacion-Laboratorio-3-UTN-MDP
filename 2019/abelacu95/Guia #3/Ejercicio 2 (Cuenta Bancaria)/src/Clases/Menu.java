package Clases;

import java.util.Scanner;

public class Menu {


    public static  int cargarDatos(  String datos[], String nombre, double monto ,int opcion, int i){

            if (opcion == 1) {
                datos[i] = "El Cliente "+nombre+", depositó $ "+monto+" de su Cuenta";
            }
            if (opcion == 2) {
                datos[i] = "El Cliente "+nombre+", retiró $ "+monto+" de su Cuenta";
            }

            i++;

        return i;
    }


    public static void mostrarDatos(String[] datos){

        for(int i=0; (datos[i] != null) && (i< datos.length) ;i++){

            System.out.println("\n"+datos[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cliente cliente;
        Cuenta cuenta;
        String nombre;
        char genero;
        int opcion ,i=0;
        double cantidad;

        String datos [] = new String[10];


        //a. Crear un Cliente e imprimirlo en pantalla.
        System.out.println("Ingrese Nombre: ");
        nombre = scan.nextLine();


        System.out.println("Ingrese Genero:");
        do{
            genero = scan.next().charAt(0);
            if((genero != 'm')&&(genero != 'f') ){
                System.out.println("Caracter Incorrecto!!");
                System.out.println("Ingrese Nuevamente: ");
            }
        }while((genero != 'm')&&(genero != 'f'));

        cliente = new Cliente(nombre, genero);


        //b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de 10000.

        cuenta =new Cuenta (123,10000,cliente );

        //c. Realizar operaciones de depósito y extracción para probar esa funcionalidad.

        do{
            System.out.println("\t .:MENU:.");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3.Consultar Saldo");
            System.out.println("4. Salir");

            System.out.println("Ingresar opcion:");
            opcion = scan.nextInt();

            switch (opcion){


                    case 1:
                        System.out.println("Digite Dinero que desea Ingresar: ");
                        cantidad = scan.nextDouble();
                        cuenta.depositar(cantidad);
                        System.out.println("Depósito hecho Correctamente!!");
                        System.out.println("Su Saldo es :" + cuenta.consultarSaldo());
                        i = cargarDatos(datos, nombre, cantidad, opcion, i);

                        break;

                    case 2:
                    System.out.println("Digite Dinero que desea Retirar: ");
                    cantidad = scan.nextDouble();

                    if(cantidad > cuenta.consultarSaldo() + 2000){
                        System.out.println("Saldo Insuficiente!");
                    }
                    else{
                        cuenta.extraer(cantidad);
                        System.out.println("Extracción hecha Correctamente!!");
                        System.out.println("Su Saldo es :"+cuenta.consultarSaldo());
                        i = cargarDatos(datos,nombre,cantidad,opcion,i);
                    }
                    break;

                case 3:
                    System.out.println("Su Saldo es :"+cuenta.consultarSaldo());
                    break;

                    case 4: break;
                    default:
                        System.out.println("ERROR!!");
                        break;


            }
        }while(opcion != 4);

        mostrarDatos(datos);
    }
}
