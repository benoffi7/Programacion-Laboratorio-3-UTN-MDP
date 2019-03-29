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
public class Ejercicio23 {

    private static Scanner sc = new Scanner(System.in);
    private static String operation = "";
    private static Integer first_number = null;
    private static Integer second_number = null;

    public static void setNumbersToCalculator() {

        System.out.println("Enter the first number:");
        first_number = sc.nextInt();

        System.out.println("Enter the second number:");
        second_number = sc.nextInt();

        System.out.println("Enter the operation:");
        operation = sc.nextLine();

    }

    public static void PolacaInverseCalculator() {
        double result = 0;

        switch (operation) {
            case "+":
                result = first_number + second_number;
                break;

            case "-":
                result = first_number - second_number;
                break;

            case "*":
                result = first_number * second_number;
                break;

            case "/":
                if (second_number == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    result = first_number / second_number;
                }
                break;

            case "^":
                result = Math.pow(first_number, second_number);
                break;

            case "%":
                result = first_number % second_number;
                break;

        }

    }
}
