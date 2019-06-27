/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author micae
 */
public class Ejercicio19 {

    /*Ejercicio nº19: Programa lea 30 temperaturas correspondientes 
    a un mes y calcule el maximo, el minimo y el promedio.*/

    public static void Temperaturas30() {
        int[] arreglo = new int[30];
        int max = 0;
        int min = 31;
        int promedio = 0;

        System.out.print("Temperaturas");
        for (int i = 0; i < 30; i++) {
            arreglo[i] = (int) (Math.random() * 40);
            System.out.print(", " + arreglo[i]);
            if (max < arreglo[i]) {
                max = arreglo[i];
            }
            if (min > arreglo[i]) {
                min = arreglo[i];
            }
            promedio += arreglo[i];
        }
        promedio /= 30;

        System.out.println("");
        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
        System.out.println("Promedio: " + promedio);
    }
}
