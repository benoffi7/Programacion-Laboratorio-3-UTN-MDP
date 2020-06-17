/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
 * teclado.
 *
 * @author Fede
 */
public class Ejercicio16 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la velocidad en Km/h");
        float velocidad= teclado.nextFloat();
        float convertido= convertidorKmHAMS(velocidad);
        System.out.println(velocidad +" Km/h en m/s es "+ convertido);
        
        teclado.close();
    }
    
    public static float convertidorKmHAMS(float velocidad){
        return (velocidad*1000f)/3600f;
    }
}
