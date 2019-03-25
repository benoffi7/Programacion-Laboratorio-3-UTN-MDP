/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author micae
 */
public class Ejercicio22 {

    /*Ejercicio nº22: Pide por teclado un número entero positivo 
    (debemos controlarlo) y muestra  el número de cifras que tiene. 
    Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
    Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.*/

    public static void CantidadDeCifras() {
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 1;
        do {
            System.out.println("Ingrese un numero natural: ");
            numero = scan.nextInt();
        } while (numero < 0);

        while (numero > 10) {
            numero /= 10;
            i++;
        }

        System.out.print("El numero tiene " + i);
        System.out.println(" cifras");
    }
}
