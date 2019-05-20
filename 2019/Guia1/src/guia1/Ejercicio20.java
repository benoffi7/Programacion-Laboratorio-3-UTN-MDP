/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un
 * día laboral o no. Usa un switch para ello.
 *
 * @author Fede
 */
public class Ejercicio20 {

    public static Scanner teclado;

    public static void iniciar() {
        teclado = new Scanner(System.in);
        boolean laboral= false;
        System.out.println("Ingrese un dia de la semana para saber si es laboral");
        String dia = (teclado.next()).toLowerCase();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                laboral= true;
                break;
        }
        if (laboral){
            System.out.println(dia +" es dia laboral");
        }else{
            System.out.println(dia +" no es dia laboral");
        }
        teclado.close();
    }
}
