package Clases;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        MaquinaExpendedora maquina = new MaquinaExpendedora(0,12.5,25);
        int opcion;
        double cantidad;

        do{
            System.out.println("\t .:MENU:. ");
            System.out.println("1.Introducir Dinero.");
            System.out.println("2.Ver Precio.");
            System.out.println("3.Salir.");

            System.out.println("Ingrese Opcion:");
            opcion = scan.nextInt();

            switch(opcion){

                case 1:

                    System.out.println("Ingrese Dinero:");
                    cantidad = scan.nextDouble();

                    if(maquina.obtenerPrecio() > cantidad){
                        System.out.println("Cantidad Ingresada Insuficiente");
                    }
                    if(maquina.obtenerSaldo() < maquina.darVuelto(cantidad)){
                        System.out.println("Saldo Insuficiente Para dar Vuelto");
                    }
                    else{
                        maquina.ingresarDinero(cantidad);
                        maquina.darVuelto(cantidad);
                        maquina.imprimirBoleto();
                    }
                    break;

                case 2:
                    System.out.println("Precio del Boleto : "+maquina.obtenerPrecio());
                    break;

                case 3:
                    break;

                    default:
                        System.out.println("ERROR.");
                        break;
            }
        }while(opcion != 3);

    }
}
