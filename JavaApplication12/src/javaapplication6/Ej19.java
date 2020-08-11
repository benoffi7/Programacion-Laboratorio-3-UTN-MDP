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
public class Ej19 {
    
     public static Scanner teclado;
            
    
    public static void menu(){
        teclado = new Scanner(System.in);
        int max=0, min=0, i=0, valor=0;
        float prome=0;
        while(i<30){
            valor = (int) (Math.random() * 20) + 1;//   con el random no podia ver si funcionaba el Math.max y el Math.min
            System.out.println(valor);
            i++;
        }
        max = Math.max(0, 20);
        System.out.println("la maxima temperatura fue de:" + max);      //nose como utilizarlo con los valores de la temperatura
        min = Math.min(0, 20);
        System.out.println("la minima temperatura fue de:" + min);
        prome = (float) valor/i;
        System.out.println("el promedio de temperatura fue de:" + prome);
        teclado.close();
    }
    
}
