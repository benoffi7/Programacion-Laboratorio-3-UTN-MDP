/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Pide por teclado dos números y genera 10 números aleatorios entre esos
 * números. Usa el método Math.random para generar un número entero aleatorio
 *
 * @author Fede
 */
public class Ejercicio19 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        System.out.println("Se genera 10 numeros entros los dos que ingrese");
        System.out.println("Ingrese el limite inferior");
        int limiteInf = teclado.nextInt();
        System.out.println("Ingrese el limite superior");
        int limiteSup = teclado.nextInt();
        
        for(int i= 0 ; i<10 ; i++){
            System.out.println(numeroAleatoreo(limiteInf, limiteSup));
        }
        teclado.close();
    }

    public static int numeroAleatoreo(int limInf, int limSup) {
        int rango=limSup - limInf;
        return (int) (Math.random() * (rango + 1) + limInf);
    }
}
