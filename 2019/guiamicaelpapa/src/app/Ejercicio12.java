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
public class Ejercicio12 {

    /*Ejercicio nº12: Realizar un programa que le pregunte al usuario 
    que área desea calcular. Las opciones son: rectángulo, cuadrado, 
    triangulo y circulo.*/
    public static void CalcularArea() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calcular el area");
        System.out.println("1. Rectangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("Elija una opcion: ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                Rectangulo();
                break;
            case 2:
                Cuadrado();
                break;
            case 3:
                Triangulo();
                break;
            case 4:
                Circulo();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void Rectangulo() {
        Scanner scan = new Scanner(System.in);
        float alto, ancho;

        System.out.println("Alto: ");
        alto = scan.nextFloat();
        System.out.println("Ancho: ");
        ancho = scan.nextFloat();

        System.out.println("Area: " + ancho * alto);
    }

    public static void Cuadrado() {
        Scanner scan = new Scanner(System.in);
        float lado;

        System.out.println("Ancho o alto: ");
        lado = scan.nextFloat();

        System.out.println("Area: " + lado * lado);
    }

    public static void Triangulo() {
        Scanner scan = new Scanner(System.in);
        float alto, base;

        System.out.println("Altura: ");
        alto = scan.nextFloat();
        System.out.println("Base: ");
        base = scan.nextFloat();

        System.out.println("Area: " + (base * alto / 2));
    }

    public static void Circulo() {
        Scanner scan = new Scanner(System.in);
        float pi = 3.14f;
        
        System.out.println("Radio: ");
        float radio = scan.nextFloat();
        

        System.out.println("Area: " + (radio*radio*pi));
    }
}
