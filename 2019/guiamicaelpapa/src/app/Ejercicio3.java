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
public class Ejercicio3 {

    //Ejercicio nº3: Mostrar los primeros 100 números primos.
    public static void Primeros100() {
        int primo = 2;
        boolean condicion;

        for (int i = 0; i < 100;) {
            condicion = false;
            for (int j = (primo - 1); j > 1; j--) {
                if (primo % j == 0) {
                    condicion = true;
                }
            }

            if (condicion == false) {
                System.out.print(primo + " | ");
                i++;
            }
            primo++;
        }
    }
}
