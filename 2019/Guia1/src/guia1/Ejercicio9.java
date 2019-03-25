/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Encontrar el valor ASCII de un carácter.
 *
 * @author Fede
 */
public class Ejercicio9 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el caracter que desea saber su valor ASCII");

        //Me quedo con el primer caracter ingresado
        int caracter = (int) (teclado.next()).charAt(0);

        System.out.println(caracter);
        teclado.close();
    }
}
