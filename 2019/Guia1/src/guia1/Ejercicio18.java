/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo,
 * el minimo y el promedio.
 *
 * @author Fede
 */
public class Ejercicio18 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        int DIMENSION = 30;

        float[] temperaturas = new float[DIMENSION];

        for (int i = 0; i < DIMENSION; i++) {
            System.out.println("Ingrese una temperatura");
            temperaturas[i] = teclado.nextFloat();
        }
        float min = minimo(temperaturas);
        float max = maximo(temperaturas);
        float promedio = promediar(temperaturas);
        System.out.println("La temperatura minima es " + min);
        System.out.println("La temperatura maxima es " + max);
        System.out.println("La temperatura promedio es " + promedio);

        teclado.close();
    }

    public static float minimo(float[] array) {
        float min = array[0];
        for (float temp : array) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public static float maximo(float[] array) {
        float max = array[0];
        for (float temp : array) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static float promediar(float[] array) {
        float suma = 0;
        for (float temp : array) {
            suma += temp;
        }
        return (float) suma / (float) array.length;
    }
}
