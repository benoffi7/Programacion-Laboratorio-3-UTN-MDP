/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Calcular si un número es par o no.
 *
 * @author Fede
 */
public class Ejercicio2 {

    private static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un numero");

        numero = teclado.nextInt();
        if( esPar(numero)){
            System.out.println(numero + " es par");
        }else{
            System.out.println(numero + " es impar");
        }
        
        //Cierro la variable Scanner para evitar futuros errores de ejecucion
        teclado.close();
    }

    /**
     * Metodo que retorna true si el <STRONG>numero</STRONG> es par
     * 
     * @param numero int
     * @return 
     */
    private static boolean esPar(int numero) {

        /*if ((numero % 2) == 0) {
            return true;
        } else {
            return false;
        }*/
        
        return ((numero % 2) == 0);
    }
}
