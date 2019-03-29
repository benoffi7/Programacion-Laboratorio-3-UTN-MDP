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
public class Ejercicio24 {
    
    private static Scanner sc = new Scanner(System.in);
    private static String name = " ";
    private static int age;
    private static float salary;
    private static float definitive_salary;

    public static void setAge() {
        do {
            System.out.println("Enter your years");
            age = sc.nextInt();
        } while (age <= 0);
    }

    public static void setName() {
        System.out.println("Enter your name");
        name = sc.nextLine();
    }

    public static void setSalary() {
        System.out.println("Enter your salary");
        salary = sc.nextFloat();
    }

    public static void calcularSalario() {
        if (age < 16) {
            System.out.println("With your age you can`t have a salary ");
            definitive_salary=0;
        }else if (age >= 19 && age <= 50) {
            definitive_salary = salary + (float) (salary * 0.05);
        } else if (age > 50 && age <= 60) {
            definitive_salary = salary + (float) (salary * 0.1);
        } else if (age > 60) {
            definitive_salary = salary + (float) (salary * 0.15);
        }

        System.out.println("The definitive salary is: "+definitive_salary);
    }
}
