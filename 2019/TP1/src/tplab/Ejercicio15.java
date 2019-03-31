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
public class Ejercicio15 {

    private static Scanner sc = new Scanner(System.in);
       private static Float fahrenheit = null;
    private static Float centigrade = null;
 

    public static void getFahrenheitWithCentigrade() {
        System.out.print("Enter the centigrade: ");
        centigrade = sc.nextFloat();
        //Conversion
        fahrenheit = 32 + (9 * centigrade / 5);
        System.out.println("The temperature in 'F: " + fahrenheit);
    }

    
  

    
}
