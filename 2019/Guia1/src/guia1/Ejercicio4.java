/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Mostrar los primeros n números primos
 *
 * @author Fede
 */
public class Ejercicio4 {

    private static Scanner teclado;

    public static void iniciar() {
        teclado= new Scanner(System.in);
        int numero = 1;
        int contador = 0;
        
        System.out.println("Se mostrara la cantidad ingresada de numeros primos");
        System.out.println("Ingrese un numero");
        
        int n = teclado.nextInt();
        
        Ejercicio3.mostrarPrimos(n);
        //Cierro la variable Scanner para evitar futuros errores de ejecucion
        teclado.close();
    }
}
