/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author micae
 */
public class Ejercicio7 {
    //Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.

    public static void Suma10PrimerosNumeros() {

        int suma = 0;

        for (int i = 1; i < 11; i++) {
            suma += i;
        }
        System.out.println("Suma: " + suma);
    }
}
