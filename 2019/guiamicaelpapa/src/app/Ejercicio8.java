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
public class Ejercicio8 {
    /*Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números 
positivos ingresa un usuario. */
    
    public static void SumarCantidadPositivos()
    {
        int cantidad = 0;
        int num;
        String opcion;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Numero: ");
            num = scan.nextInt();
            
            if(num > 0)
            {
                cantidad++;
            }
            
            System.out.println("Seguir?(s/n)");
            opcion = scan.next();
        } while (opcion.equalsIgnoreCase("s"));
        System.out.println("Cantidad de numeros positivos: "+cantidad);
    }
}
