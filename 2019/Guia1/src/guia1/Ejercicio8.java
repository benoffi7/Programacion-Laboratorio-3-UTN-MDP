/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.time.Year;
import java.util.Scanner;

/**
 * Revisar si un año es bisiesto o no.
 *
 * @author Fede
 */
public class Ejercicio8 {

    public static Scanner teclado;

    /*Uso la libreria Year porque tiene un metodo static que me permite saber
    si un año es bisiesto o no
     */
    public static void iniciar() {
        long year;
        teclado = new Scanner(System.in);
        System.out.println("Ingrese un año");

        year = teclado.nextLong();
        
        year= (long)Ejercicio11.comprobarPositivo(year);
        
        if (Year.isLeap(year)) {
            System.out.println(year + " es año bisiesto");
        } else {
            System.out.println(year + " no es año bisiesto");
        }
        teclado.close();
        
    }

}
