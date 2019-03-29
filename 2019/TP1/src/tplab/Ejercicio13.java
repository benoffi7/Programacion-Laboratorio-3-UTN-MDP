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
public class Ejercicio13 {
      private static Scanner sc = new Scanner(System.in);
    
    public static void GetName(){
        String name;
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Buenos dias "+name);
    }
    
}
