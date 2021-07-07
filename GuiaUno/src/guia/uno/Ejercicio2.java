/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.uno;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio2 {
    
    private static Integer num = null;
    private static Scanner scan = new Scanner(System.in); 
    
    
    public static void saberPar(){
        System.out.println("Ingrese un número");
        num = scan.nextInt();
        
        if(num== 0){
            System.out.println("El número es cero");   
        }else if(num%2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}
