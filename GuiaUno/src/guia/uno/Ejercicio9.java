/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.uno;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Ejercicio9 {

    private static Integer agno = null;
    private static Scanner scan = new Scanner(System.in);
    private static GregorianCalendar calendar = new GregorianCalendar();

    public static void saberBisiesto() {
        System.out.println("Ingrese un año ->> ");
        agno = scan.nextInt();

        if ((agno % 4 == 0) && ((agno % 100 != 0) || (agno % 400 == 0))) {
            System.out.println("El año ingresado es bisiesto");
        } else {
            System.out.println("El año ingresado no es bisiesto");
        }
    }

    public static void saberBisiestoYaHecho() {

        System.out.println("Ingrese un año ->> ");
        agno = scan.nextInt();

        if (calendar.isLeapYear(agno)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
