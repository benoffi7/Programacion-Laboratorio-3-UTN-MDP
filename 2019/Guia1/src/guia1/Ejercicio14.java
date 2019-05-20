/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Programa que lea una cantidad de grados centígrados y la pase a grados
 * Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a
 * fahrenheit es: F = 32 + ( 9 * C / 5)
 *
 * @author Fede
 */
public class Ejercicio14 {
    public static Scanner teclado;
    
    public static void iniciar(){
        teclado= new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados Centigrados");
        float centigrados= teclado.nextFloat();
        float fahrenheit= centigradosAFahrenheit(centigrados);
        
        System.out.println("En Fahrenheit es "+ fahrenheit);
        
        teclado.close();
    }
    public static float centigradosAFahrenheit(float centigrados){
        return 32 + ( 9 * centigrados / 5);
    }
}
