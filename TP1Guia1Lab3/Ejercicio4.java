package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio4 {
    public static void MostrarNcantPrimos(){
        int numeros = 2;
        int contador = 1;
        int divisibles = 0;
        int primo = 0;

        System.out.println("Cuantos numeros primos quiere ver?...");
        scan = new Scanner(System.in);
        int vistos = scan.nextInt();

        while (primo < vistos)//se controla si la cantidad de n primos es lo que quiere ver el user
        {
            while (numeros >= contador && divisibles < 3){ // los numeros primos solo tienen 2 divisores
                if (numeros % contador == 0) {
                    divisibles++;
                }
                contador++;// se va sumando para buscar mas "divisores"

            }
            if (divisibles <= 2) {
                primo++; // se cuentan los primos
                System.out.println("Numero " + primo + " primo " + numeros);
            }

            numeros++;
            contador = 1;
            divisibles = 0;
        }
    }
}

