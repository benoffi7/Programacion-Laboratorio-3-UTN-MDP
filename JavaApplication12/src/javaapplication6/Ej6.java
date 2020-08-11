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
public class Ej6 {
    
    public static Scanner teclado;
            
    
    public static void menu(){
        teclado = new Scanner(System.in);
        int numero=0;
        char res = 's';
        while (res=='s'){
            System.out.println("ingrese un numero entero");
            numero = teclado.nextInt();
            if(esPrimo(numero)==true){
                System.out.println("el numero es primo");
            }else{
                System.out.println("el numero no es primo");
            }
            System.out.println("desea ingresar un nuevo numero?");
            res = (teclado.next()).charAt(0);
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