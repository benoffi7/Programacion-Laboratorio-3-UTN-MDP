/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio2 {
    public static void ParOinPar(){
        scan = new Scanner(System.in);
        System.out.println("Ingrese el numero...");
        int numero = 0;
        numero = scan.nextInt();
        if (numero%2==0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");

        scan.close();
    }
}
