/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Realizar un programa que le pregunte al usuario que área desea calcular. Las
 * opciones son: rectángulo, cuadrado, triangulo y circulo
 *
 * @author Fede
 */
public class Ejercicio11 {

    public static Scanner teclado;
    private static float area;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        System.out.println("Presione: ");
        System.out.println("1 para calcular el area de un RECTANGULO");
        System.out.println("2 para calcular el area de un CUADRADO");
        System.out.println("3 para calcular el area de un TRIANGULO");
        System.out.println("4 para calcular el area de un CIRCULO");
        System.out.println("");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                areaRectangulo();
                break;
            case 2:
                areaCuadrado();
                break;
            case 3:
                areaTriangulo();
                break;
            case 4:
                areaCirculo();
                break;
        }
        teclado.close();
    }

    //pedir datos del cuerpo - calcular area
    /**
     * Pide los datos necesarios para calcular el area de un Rectangulo
     */
    public static void areaRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        float base = teclado.nextFloat();
        base = comprobarPositivo(base);

        System.out.println("Ingrese la altura del rectangulo");
        float altura = teclado.nextFloat();
        altura = comprobarPositivo(altura);

        area = calcularRectangulo(base, altura);
        System.out.println("El area del rectangulo es " + area);
    }

    /**
     * Retorna el area de un Rectangulo
     *
     * @param base
     * @param altura
     * @return
     */
    public static float calcularRectangulo(float base, float altura) {
        return base * altura;
    }

    /**
     * Pide los datos necesarios para calcular el area de un Cuadrado
     */
    public static void areaCuadrado() {
        System.out.println("Ingrese un lado del cuadrado");
        float lado = teclado.nextFloat();
        lado = comprobarPositivo(lado);

        area = calcularCuadrado(lado);
        System.out.println("El area del cuadrado es " + area);
    }

    /**
     * Retorna el area de un Cuadrado
     *
     * @param lado
     * @return
     */
    public static float calcularCuadrado(float lado) {
        return (float) Math.pow(lado, 2f);
    }

    /**
     * Pide los datos necesarios para calcular el area de un Triangulo
     */
    public static void areaTriangulo() {
        System.out.println("Ingrese la base del triangulo");
        float base = teclado.nextFloat();
        base = comprobarPositivo(base);

        System.out.println("Ingrese la altura del triangulo");
        float altura = teclado.nextFloat();
        altura = comprobarPositivo(altura);

        area = calcularTriangulo(base, altura);
        System.out.println("El area del triangulo es " + area);
    }

    /**
     * Retorna el area de un Triangulo
     *
     * @param base
     * @param altura
     * @return
     */
    public static float calcularTriangulo(float base, float altura) {
        return calcularRectangulo(base, altura) / 2f;
    }

    /**
     * Pide los datos necesarios para calcular el area de un Circulo
     */
    public static void areaCirculo() {
        System.out.println("Ingrese el radio del circulo");
        float radio = teclado.nextFloat();

        area = calcularCirculo(radio);
        System.out.println("El area del circulo es " + area);
    }

    /**
     * Retorna el area de un Circulo
     *
     * @param radio
     * @return
     */
    public static float calcularCirculo(float radio) {
        return (float) Math.PI * (float) Math.pow(radio, 2f);
    }
    /**
     * Comprueba si un numero es positivo, en caso contrario se vuelve a cargar
     * @param numero
     * @return 
     */
    public static float comprobarPositivo(float numero) {
        while (!Ejercicio7.esPositivo(numero)) {
            System.out.println("Ingrese un numero positivo");
            numero = teclado.nextFloat();
        }
        return numero;
    }
}
