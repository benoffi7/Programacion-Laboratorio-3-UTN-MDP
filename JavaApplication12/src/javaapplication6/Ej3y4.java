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
public class Ej3y4 {
    
    public static Scanner teclado;
            
    
    public static void menu(){
        teclado = new Scanner(System.in);
        int i=0, j=0, k=0, l=0;
        boolean res = false;
        while (i<100){
            j++;
            res = esPrimo(j);
            if(res == true){
               i++;
               System.out.println(j);
            }
        }
        System.out.println("ingrese cuantos numeros primos quiere mostrar");
        int numero = teclado.nextInt();
        while(k<numero){
            l++;
            res= esPrimo(l);
            if(res == true){
                k++;
                System.out.println(l);
            }
        }
        teclado.close();
    }
    public static boolean esPrimo(int numero){
      int contador = 2;
      boolean primo=true;
      while ((primo) && (contador!=numero)){
        if (numero % contador == 0)
          primo = false;
          contador++;
      }
      return primo;
    }
}