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
public class Ejercicio17 {
    /*Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s.
    La velocidad se lee por teclado.*/
    // km/h * 1000 / 3600
    public static void VelocidadKilometrosAMetros()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Velocidad en km/h: ");
        int km = scan.nextInt();
        float metros = (float)Math.multiplyFull(km, 1000) / 3600;
        System.out.println("Metros/s: "+metros);
    }
}
