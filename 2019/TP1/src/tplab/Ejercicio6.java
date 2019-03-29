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
public class Ejercicio6 {
    
    private static Scanner sc= new Scanner(System.in);
    private static String option = "";
    private static int number;


    public static void showEvenOrOdd() {
        do {
            System.out.println("Enter a numer");
            number = sc.nextInt();
            
            if(calculateEvenOrOdd(number)){
                System.out.println("The number is Even");
            }else{
                System.out.println("The number is Odd");
            }
            
            
            System.out.println("Do you want to continue? (y/n)");
            option = sc.nextLine();
            
        } while (option.equals("y"));
    }

    public static boolean calculateEvenOrOdd(int numberToTest) {
        int Divisors = 0;
        boolean prime;

        for (int i = 1; i <= number; i++) {
            
            Divisors+= (number % i) == 0 ? 1 : 0;
            
            
        }
        prime = Divisors == 2 ? true : false;
        return prime;
    }
}
