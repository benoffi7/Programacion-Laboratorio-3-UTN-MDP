/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
 * la longitud de la hipotenusa según el teorema de Pitágoras.
 *
 * @author Fede
 */
public class Ejercicio17 {
    public static Scanner teclado;
    public static void iniciar() {
        teclado= new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del primer cateto");
        float cateto1 = teclado.nextFloat();
        cateto1= Ejercicio11.comprobarPositivo(cateto1);
        System.out.println("Ingrese la longitud del segundo cateto");
        float cateto2 = teclado.nextFloat();
        cateto2= Ejercicio11.comprobarPositivo(cateto2);
        
        float hipotenusa = calcularHipotenusa(cateto1, cateto2);
        
        System.out.println("El valor de la hipotenusa es "+ hipotenusa);
        
        teclado.close();
    }
    
    public static float calcularHipotenusa(float cateto1, float cateto2){

        return (float) Math.sqrt( (cateto1*cateto1) + (cateto2*cateto2) );
    }
}
