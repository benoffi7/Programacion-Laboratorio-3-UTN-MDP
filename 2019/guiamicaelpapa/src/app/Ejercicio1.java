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
public class Ejercicio1 {
    
    /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. 
    Realizar variantes con arreglos ya inicializados e ingreso por teclado.*/

    public static float PromedioArregloDado(int arreglo[])
    {
        float promedio = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }
        
        promedio /= (float)arreglo.length;
        
        return promedio;
    }
    
     public static float PromedioArregloTeclado(int arreglo[])
    {
        float promedio = 0;
        int validos = 0;
        String opcion;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Numero: ");
            promedio += scan.nextFloat();
            System.out.println("Seguir?(s/n)");
            opcion = scan.next();
            
            validos++;
        } while ( (opcion.equalsIgnoreCase("s")) && validos < arreglo.length);
        
        
        return promedio /= (float)arreglo.length;//->Promedio del arreglo entero
        //return promedio /= validos;//-> Promedio de solo los validos
    }
     
     public static void MostrarPromedio(float promedio)
    {
        System.out.println("Promedio: "+promedio);
    }
}