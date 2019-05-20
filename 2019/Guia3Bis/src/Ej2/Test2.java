/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Fede
 */
public class Test2 {

    public static void main(String[] args) {
        Employee e1 = new Employee(23456345, "Carlos", "Gutiérrez", 25000);
        Employee e2 = new Employee(34234123, "Ana", "Sánchez", 27500);

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        System.out.println(e1.annualSalary());

        e1.increaseSalary(15f);

        System.out.println(e1.annualSalary());
    }
}
