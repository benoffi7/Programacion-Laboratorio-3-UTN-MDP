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
public class Ejercicio11 {
    //Ejercicio nº11: Multiplicar dos números.
    
    public static void Multiplicar()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Multiplicando: ");
        int multiplicando=scan.nextInt();
        System.out.println("Multiplicador: ");
        int resultado=scan.nextInt();
        
        resultado*=multiplicando;
        System.out.println("Resultado: "+resultado);
    }
}
