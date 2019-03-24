package guia.uno;

import java.util.Scanner;

public class Ejercicio22 {

    private static Scanner scan = new Scanner(System.in);
    private static Integer numero = null;

    public static void pedirNumero() {

        do {
            System.out.println("Ingrese un número entero positivo (lo vamos a controlar)");
            numero = scan.nextInt();

            if (numero < 0) {
                System.out.println("Solo números positivos...");
            } else if (numero == 0) {
                System.out.println("Pruebe con otro número que no sea cero");
            }

        } while (numero <= 0);

        System.out.println("El número ingresado es ->> " + numero);
    }

    public static void saberCifras() {
        int cant = 0;
        String digitos = " ";
        
        /* Otro metodo
        digitos = Integer.toString(numero);
        System.out.println("El número " + numero + " tiene " + digitos.length() + " cifras");
        */
        
        while(numero > 0){
            numero = numero/10;
            cant++;
        }

        System.out.println("La cantidad de cifras es ->> " + cant);
    }
}
