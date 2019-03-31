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
public class Ejercicio21 {

    private static Scanner sc = new Scanner(System.in);
    public static String day;
    public static int option;
    public static boolean answer;

    public static void setDayToTest() {
        System.out.println("Enter the day: ");
        day = sc.nextLine();
        answer = TestWorkingDay();
    }

    public static boolean TestWorkingDay() {
        boolean working_day = false;
        
        switch (day) {
            case "monday":
                working_day=true;
                break;
            case "tuesday":
                working_day=true;

                break;
            case "wednesday":
                working_day=true;

                break;
            case "thursday":
                working_day=true;

                break;
            case "friday":
                working_day=true;

                break;
            case "saturday":

                break;
            case "sunday":

                break;
            default:
                System.out.println("Enter in the correct form the day");
        }
        return working_day;

    }
    
    public static void showDay(){
        if (answer==true) {
            System.out.println("Is a working day");
        }else{
            System.out.println("Is not a working day");
        }
    }
}
