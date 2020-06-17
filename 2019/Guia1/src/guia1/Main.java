/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class Main {
    public static Scanner teclado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de ejercicio que desea ejecutar");
        int ej = teclado.nextInt();
        switch (ej){
            case 1:
                Ejercicio1.iniciar();
                break;
            case 2:
                Ejercicio2.iniciar();
                break;
            case 3:
                Ejercicio3.iniciar();
                break;
            case 4:
                Ejercicio4.iniciar();
                break;
            case 5:
                Ejercicio5.iniciar();
                break;
            case 6:
                Ejercicio6.iniciar();
                break;
            case 7:
                Ejercicio7.iniciar();
                break;
            case 8:
                Ejercicio8.iniciar();
                break;
            case 9:
                Ejercicio9.iniciar();
                break;
            case 10:
                Ejercicio10.iniciar();
                break;
            case 11:
                Ejercicio11.iniciar();
                break;
            case 12:
                Ejercicio12.iniciar();
                break;
            case 13:
                Ejercicio13.iniciar();
                break;
            case 14:
                Ejercicio14.iniciar();
                break;
            case 15:
                Ejercicio15.iniciar();
                break;
            case 16:
                Ejercicio16.iniciar();
                break;
            case 17:
                Ejercicio17.iniciar();
                break;
            case 18:
                Ejercicio18.iniciar();
                break;
            case 19:
                Ejercicio19.iniciar();
                break;            
            case 20:
                Ejercicio20.iniciar();
                break;
            case 21:
                Ejercicio21.iniciar();
                break;
            case 22:
                Ejercicio22.CalculadoraPolacaInversaApp();
                break;
            case 23:
                Ejercicio23.iniciar();
                break;
        }
    }
    
}
