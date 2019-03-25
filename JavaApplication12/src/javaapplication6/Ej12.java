/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ej12 {

    public static Scanner teclado;

    public static void menu() {
        teclado = new Scanner(System.in);
        System.out.println("¿que area desea calcular?");
        System.out.println("presione 1 para un rectangulo");
        System.out.println("presione 2 para un cuadrado");
        System.out.println("presione 3 para un triangulo");
        System.out.println("presione 4 para un circulo");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("se calcula haciendo base*altura");
                break;
            case 2:
                System.out.println("se calcula haciendo base por base");
                break;
            case 3:
                System.out.println("se calcula haciendo (base*altura)/2");
                break;
            case 4:
                System.out.println("se calcula haciendo PI*(pow(radio,2))");
                System.out.println("Pi lo llamamos con Math.pi, y pow con Math.pow");
        teclado.close();
        }
    }
}
