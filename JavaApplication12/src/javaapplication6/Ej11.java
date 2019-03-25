/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Germán
 */
public class Ej11 {
    
    public static Scanner teclado;
    
    public static void menu() {
    teclado = new Scanner(System.in);
    int num1=0, num2=0, resultado=0;
    System.out.println("ingrese 2(dos) numeros a multiplicar");
    num1 = teclado.nextInt();
    num2 = teclado.nextInt();
    resultado = Math.multiplyExact(num1, num2);
    System.out.println("el resultado es:");
    System.out.print(resultado);
}
}
