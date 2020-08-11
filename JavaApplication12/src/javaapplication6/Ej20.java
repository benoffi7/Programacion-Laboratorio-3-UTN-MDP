/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;
import static javaapplication6.Ej20.teclado;

/**
 *
 * @author Germán
 */
public class Ej20 {
    public static Scanner teclado;
            
    
    public static void menu(){
        teclado = new Scanner(System.in);
        int num1=0, num2=0, i=0, a=0;
        System.out.println("ingrese 2 numeros");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        while(i<10){
        }
            
    }
}
  /*  public static void menu(){
        teclado = new Scanner(System.in);
        int num1=0, num2=0, i=0, a=0;
        System.out.println("ingrese 2 numeros");        intente de esta manera pero no sabia como restringir el random
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        while(i<10){
            a = (int) Math.random();
            if(a<num2 && a>num1){
                System.out.print(a);
                i++;
            }
        }
            
    }
}
*/