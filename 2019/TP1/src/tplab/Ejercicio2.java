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
public class Ejercicio2 {
  
    private static Scanner sc = new Scanner(System.in); 
      private static Integer number = null;
    
    
    public static void EvenOrOdd(){
        System.out.println("Enter a number");
        number = sc.nextInt();
        
       if(number%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
