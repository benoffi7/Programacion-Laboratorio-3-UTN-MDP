/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *Calcular el promedio de un arreglo de números enteros.
 *Realizar variantes con arreglos ya inicializados e ingreso por teclado.
 * @author Fede
 */
public class Ejercicio1 {
    /*Inicializo el teclado poder utilizar el metodo leerCaracter sin crear 
    otra instancia de Scanner
    */
    private static Scanner teclado= new Scanner(System.in);;

    public static void iniciar() {

        float promedio = 0;

        final int[] arregloConstante = new int[]{4, 4, 4, 4};

        System.out.print("Ingrese 1 para ver el promedio del arreglo compuesto");
        
        //Uso un for each para mostrar todos los elementos del arreglo ya inicializado
        
        for (int n : arregloConstante) {
            System.out.print(" " + n);
        }
        System.out.println("");

        System.out.print("Ingrese 2 para cargar el arreglo");
        System.out.println(" y luego se mostrara su promedio");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                promedio = promediar(arregloConstante);
                break;

            case 2:
                int[] arregloCargado = cargarArreglo();
                promedio = promediar(arregloCargado);
        }

        System.out.printf("El promedio es %.2f \n", promedio);

        //Cierro la variable Scanner para evitar futuros errores de ejecucion
        teclado.close();
    }

    /**
     * Metodo que retorna un arreglo cargado del tamaño que el
     * usuario indique
     * @return int[]
     */
    private static int[] cargarArreglo() {

        System.out.println("Ingrese el tamaño del arreglo");

        char res = ' ';
        int dimension = teclado.nextInt();

        int[] arreglo = new int[dimension];

        int i = 0;
        do {
            System.out.println("Ingrese un numero entero");
            arreglo[i] = teclado.nextInt();

            i++;

            System.out.println("Desea seguir cargando? s/n");

            res = leerCaracter();
        } while (i < arreglo.length && res == 's');

        return arreglo;
    }

    /**
     * Retorna un caracter en minuscula
     * @return 
     */
    public static char leerCaracter(){
        return ((teclado.next()).toLowerCase()).charAt(0);
    }
    /**
     * Metodo que retorna la suma de todos los elementos de un arreglo de enteros
     * @param arreglo de enteros
     * @return suma int
     */
    private static int sumar(int[] arreglo) {
        int suma = 0;
        for (int n : arreglo) {
            suma += n;
        }
        return suma;
    }

    /**
     * Metodo que retorna el promedio de los elementos del <STRONG>arreglo</STRONG>
     * @param arreglo de enteros
     * @return promedio float
     */
    private static float promediar(int[] arreglo) {
        float promedio = 0f;

        promedio = (float) sumar(arreglo) / (float) arreglo.length;

        return promedio;
    }
}
