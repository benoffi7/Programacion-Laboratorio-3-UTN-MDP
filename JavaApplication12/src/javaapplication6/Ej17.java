/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Germán
 */
public class Ej17 {
    
    public static Scanner teclado;
    
    public static void menu() {
        teclado = new Scanner(System.in);
        int kmph=0;
        float mps=0;
        System.out.println("ingrese la cantidad de Kilometros por Hora");
        kmph = teclado.nextInt();
        mps = (float) ((float) kmph * 0.277778);
        System.out.println("la cantidad de metros por segundo es de: " + mps);
        teclado.close();
    }
}
