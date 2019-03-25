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
public class Ejercicio20 {

    /*Ejercicio nº20:Pide por teclado dos números y genera 10 números 
    aleatorios entre esos números. Usa el método Math.random para generar 
    un número entero aleatorio */
    public static void NumerosAleatorios() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primer numero: ");
        int num1 = scan.nextInt();
        System.out.println("Segundo numero: ");
        int num2 = scan.nextInt();

        int random;

        if (num1 > num2) {
            for (int i = 0; i < 5; i++) {
                random = (int) Math.floor(Math.random()*(num1-num2+1)+num2);
                System.out.print(", "+random);
            }
        } else {
            for (int j = 0; j < 5; j++) {
                random = (int)Math.floor(Math.random()*(num2-num1+1)+num1);
                System.out.print(", "+random);
            }
        }
    }
}
