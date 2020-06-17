/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Multiplicar dos números
 * @author Fede
 */
public class Ejercicio10 {
    public static Scanner teclado;
    
    public static void iniciar(){
        teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        float a = teclado.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float b = teclado.nextFloat();
        
        float resultado= multiplicar(a, b);
        System.out.println("El producto de los numeros "+ a +" y "+ b + " es " + resultado);
        teclado.close();
    }
    /**
     * Multiplica el numero <STRONG>a</STRONG> por el numero <STRONG>b</STRONG>
     * @param a primer numero
     * @param b segundo numero
     * @return 
     */
    public static float multiplicar(float a, float b){
        return a*b;
    }
}
