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
public class Ejercicio8 {
    private static Scanner sc= new Scanner(System.in); 
    

    
    public static void PositivesCount(){
        int number;
        int Count=0;
        String option;
        do {
            System.out.println("Enter a number");
            number = sc.nextInt();
            
           Count+=number > 0 ? 1 : 0;
            
            
            System.out.println("Do you want to continue? (y/n)");
            option = sc.nextLine();
            
        } while (option.equals("y"));
        
        System.out.println("The positive account is: "+Count);
    }
}
