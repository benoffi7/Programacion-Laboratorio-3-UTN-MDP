/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.uno;

import java.util.Scanner;


public class Ejercicio19 {
    private static Double temp = null;
    private static Double [] arreglo = new Double [30];
    private static Double promedio = null;
    private static Scanner scan = new Scanner(System.in);
    
    public static void pedirTemperatura(){
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese la temperatura del día " + (i+1) + " ->>");
            arreglo[i] = scan.nextDouble();
        }
    }
    
    public static void calcularPromedio(){
        double suma = 0;

        for(Double i:arreglo){
             suma += i;
        }
        promedio = (suma/arreglo.length);

        System.out.println("El promedio de temperaturas en el mes ha sido de " + promedio + " grados");
    }
    
    public static void cargarArreglo(){
        for(int i=0;i<arreglo.length;i++){
            arreglo[i] = (Math.random()*30);
        }
        
        for(Double i : arreglo){
            System.out.println("->> " + i);
        }
    }
    
    public static void hallarMenor(){
        Double menor = arreglo[0];
        
        for(int i=1;i<arreglo.length;i++){
            if(arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        
        System.out.println("El menor es ->> " + menor);
    }
    
    public static void hallarMayor(){
        Double mayor = arreglo[0];
        
        for(int i=1;i<arreglo.length;i++){
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }
        
        System.out.println("El mayor es ->> " + mayor);
    }
}
