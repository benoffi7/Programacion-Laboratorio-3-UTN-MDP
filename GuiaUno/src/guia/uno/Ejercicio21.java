/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.uno;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Ejercicio21 {
    private static Scanner scan = new Scanner(System.in);
    private static String dia = " ";
    
    public static void pedirDia(){
        do{
            System.out.println("Ingrese un día de la semana ->> ");
            dia = scan.nextLine();
            dia = dia.toLowerCase();
        }while(!(dia.equals("lunes")) && !(dia.equals("martes")) && !(dia.equals("miercoles")) && !(dia.equals("jueves")) && !(dia.equals("viernes")) && !(dia.equals("sabado")) && !(dia.equals("domingo")));
    }
    
    public static void saberLaboral(){
        boolean laboral;
        
        switch(dia){
            case "sabado":
                laboral = false;
                break;
            case "domingo":
                laboral = false;
                break;
            default:
                laboral = true;
                break;
        }
        
        if(laboral){
            System.out.println("Es un día laboral");
        }else{
            System.out.println("No es un día laboral");
        }
    }
}
