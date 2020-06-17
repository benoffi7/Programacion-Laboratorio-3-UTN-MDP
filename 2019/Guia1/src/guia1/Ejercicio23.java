/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Pide por teclado el nombre, edad y salario y muestra el salario
 *
 * Si es menor de 16 no tiene edad para trabajar Entre 19 y 50 años el salario
 * es un 5 por ciento más Entre 51 y 60 años el salario es un 10 por ciento más
 * Si es mayor de 60 el salario es un 15 por ciento más
 *
 * @author Fede
 */
public class Ejercicio23 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese su edad");
        int edad= teclado.nextInt();
        System.out.println("Ingrese su salario");
        float salario= teclado.nextFloat();
        
        mostrarSalario(edad, calcularSalario(salario, edad) );
        
        teclado.close();
    }
    
    public static float calcularSalario(float salario, int edad) {
        if (edad <= 16) {
            salario = 0;
        } else {
            if (edad > 16 && edad <= 18) {
                salario *= 1f;
            } else {
                if (edad >= 19 && edad <= 50) {
                    salario *= 1.05f;
                } else {
                    if (edad >= 51 && edad <= 60) {
                        salario *= 1.1f;
                    } else {
                        salario = 1.15f;
                    }
                }
            }
        }
        return salario;
    }
    
    public static void mostrarSalario(int edad, float salario){
        if(edad <= 16){
            System.out.println("Usted no puede trabajar");
        }else{
            System.out.println("Su salario es "+ salario);
        }
    }
}
