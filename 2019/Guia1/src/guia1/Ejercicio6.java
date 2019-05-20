/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 * Encontrar la suma de los primeros 10 números naturales
 * @author Fede
 */
public class Ejercicio6 {
    public static void iniciar(){
        int suma = 0;
        for(int i=1; i< 11; i++){
            suma+= i;
            System.out.println(suma);
        }
        System.out.println("La suma de los 10 primeros numeros naturales es " + suma);
    }
}
