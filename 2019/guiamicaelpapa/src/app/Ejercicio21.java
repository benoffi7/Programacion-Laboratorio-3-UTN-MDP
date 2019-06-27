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
public class Ejercicio21 {

    /*Ejercicio nº21:  Crea una aplicación que nos pida un día 
    de la semana y que nos diga si es un día laboral o no. Usa un switch
    para ello.*/
    public static void DiaLaboral() {
        System.out.println("Escriba el nombre de un dia: ");
        Scanner scan = new Scanner(System.in);
        String dia = scan.next();
        dia = dia.toUpperCase();
        
        switch (dia) {
            case "SABADO":
                System.out.println("Dia no laboral");
                break;
            case "DOMINGO":
                System.out.println("Dia no laboral");
                break;
            default:
                System.out.println("Dia laboral");
                break;
        }
    }
}
