/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Pide por teclado un número entero positivo (debemos controlarlo) y muestra el
 * número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre
 * que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al
 * mostrar el mensaje.
 *
 * @author Fede
 */
public class Ejercicio21 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        numero = (int) Ejercicio11.comprobarPositivo(numero);
        int cantidadCifras = contarCifras(numero);
        if (cantidadCifras > 1) {
            System.out.println("El numero tiene " + cantidadCifras + " cifras");
        } else {
            System.out.println("El numero tiene 1 cifra");
        }
        teclado.close();
    }

    public static int contarCifras(int numero) {
        int cant=0;
        if (numero >= 10){
            while(numero >= 1){
                numero =(int)numero / (int) 10;
                cant++;
            }
        } else{
            cant=1;
        }
        return cant;
    }
}
