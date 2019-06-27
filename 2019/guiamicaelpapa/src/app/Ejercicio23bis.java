/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author micae
 */
public class Ejercicio23bis {

    /*Ejercicio nº23: Pide por teclado el nombre, edad y salario
    y muestra el salario

    Si es menor de 16 no tiene edad para trabajar
    Entre 19 y 50 años el salario es un 5 por ciento más
    Entre 51 y 60 años el salario es un 10 por ciento más
    Si es mayor de 60 el salario es un 15 por ciento más*/
    public static void SalarioSegunPersona() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Edad: ");
        byte edad = scan.nextByte();
        System.out.println("Salario: ");
        int salario = scan.nextInt();

        if (edad > 15) {
            if (edad < 19) {
                System.out.println("Salario:" + salario);
            } else if (edad > 19 && edad < 51) {
                System.out.println("Salario:" + (salario / 100 * 105));
            } else if (edad > 50 && edad < 61) {
                System.out.println("Salario:" + (salario / 100 * 110));
            } else {
                System.out.println("Salario:" + (salario / 100 * 115));
            }
        } else {
            System.out.println("No tiene edad para trabajar");
        }
    }
}
