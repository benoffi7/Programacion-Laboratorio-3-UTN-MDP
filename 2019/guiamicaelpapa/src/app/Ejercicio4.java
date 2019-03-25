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
public class Ejercicio4 {
  
    //Ejercicio nº4: Mostrar los primeros n números primos.
    
    public static void nNumerosPrimos() {
        int primo = 2;
        boolean condicion;
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Cantidad de numeros primos: ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n;) {
            condicion = false;
            for (int j = (primo - 1); j > 1; j--) {
                if (primo % j == 0) {
                    condicion = true;
                }
            }

            if (condicion == false) {
                System.out.print(primo + " | ");
                i++;
            }
            primo++;
        }
    }
}
