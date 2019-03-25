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
public class Ej1 {

    public static Scanner teclado;

    public static void menu() {
        teclado = new Scanner(System.in);
        int suma = 0;
        float promedio=0;
        
        final int[] arregloConstante = new int[]{4, 4, 4, 4};

        System.out.print("Ingrese 1 para ver el promedio de los numero");
        for (int n : arregloConstante) {
            System.out.print(" " + n);
        }
        System.out.println("");

        System.out.println("Ingrese 2 para cargar el arreglo");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                
                for (int n : arregloConstante) {
                    suma += n;
                }
                promedio = (float) suma / (float)arregloConstante.length;

                
                break;
            
            case 2:
                System.out.println("Ingrese el tamaño del arreglo");
                
                char res= 's' ;
                int dimension = teclado.nextInt();
                
                int [] arregloCargadoPorUsuario = new int[dimension];
                
                int i=0;
                while ( i < arregloCargadoPorUsuario.length && res == 's'){
                    
                    System.out.println(i +"   "+ (i < arregloCargadoPorUsuario.length));
                    
                    System.out.println("Ingrese un numero entero");
                    arregloCargadoPorUsuario[i]= teclado.nextInt();
                    
                    i++;
                    System.out.println("Desea seguir cargando? s/n");
                    res=  ((teclado.next()).toLowerCase() ).charAt(0);
                }
                
                for(i=0; i< arregloCargadoPorUsuario.length; i++ ){
                    suma+= arregloCargadoPorUsuario[i];
                }
                
                 promedio = (float) suma / (float)arregloConstante.length;
                
        }
        
        System.out.printf("El promedio es %.2f " , promedio);
    
        teclado.close();
    }
}
