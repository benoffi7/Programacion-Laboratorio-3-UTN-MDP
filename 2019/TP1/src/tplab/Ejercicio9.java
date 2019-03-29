/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplab;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio9 {

    private static Scanner sc = new Scanner(System.in);
    private static int year;
    private static GregorianCalendar calendar = new GregorianCalendar();

    public static void TestLeapYear() {
        System.out.println("Enter a number");
        year = sc.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Is a leap-year");
        } else {
            System.out.println("Is not a leap-year");
        }
    }
}
