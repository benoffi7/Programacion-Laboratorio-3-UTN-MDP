/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Ingresar un número o tantos como quiera el usuario y revisar si es primo
 *
 * @author Fede
 */
public class Ejercicio5 {

    private static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        int numero;
        char res = ' ';

        do {
            System.out.println("Ingrese un numero entero");
            numero = teclado.nextInt();
            if (Ejercicio3.esPrimo(numero)) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo");
            }

            System.out.println("Desea seguir cargando? s/n");
            res = Ejercicio1.leerCaracter();
        } while (res == 's');
        teclado.close();
    }
}
