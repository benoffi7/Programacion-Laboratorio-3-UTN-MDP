/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplab;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio20 {
   
    private static Scanner sc = new Scanner(System.in);
     private static Integer highest = null;
    private static Integer lowest = null;
    
    public static void setLowestAndHighest(){
        System.out.println("Enter the lowest");
        lowest = sc.nextInt();

        System.out.println("Enter the highest");
        highest = sc.nextInt();  
        
    }
    
    public static void showRandomNumbers(){
        System.out.print("The random numbers are:");
         for(int i=0; i<10;i++){
             
            System.out.print(" " +(int) ( (Math.random() * (highest - lowest)) + lowest) );
        }
    }
    
  
}
