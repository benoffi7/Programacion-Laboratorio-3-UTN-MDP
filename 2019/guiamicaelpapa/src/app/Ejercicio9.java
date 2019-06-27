/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author micae
 */
public class Ejercicio9 {
    //Ejercicio nº9: Revisar si un año es bisiesto o no.

    public static void AnioBisiesto() {
        GregorianCalendar calendar = new GregorianCalendar();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el anio: ");
        int anio = scan.nextInt();

        if (calendar.isLeapYear(anio)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

}
