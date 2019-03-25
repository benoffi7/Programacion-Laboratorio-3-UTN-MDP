/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 * Mostrar los primeros 100 números primos.
 *
 * @author Fede
 */
public class Ejercicio3 {

    public static void iniciar() {
        System.out.println("Se mostrara los primeros 100 numeros primos");
        mostrarPrimos(100);        
    }

    /**
     * Metodo que retorna true si un numero es primo
     *
     * @param numero
     * @return boolean
     */
    public static boolean esPrimo(int numero) {
        boolean bandera = false;

        int cantDivisores = 0;
        int dividendo = numero;
        int divisor = 1;

        while (divisor <= dividendo) {
            if ((dividendo % divisor) == 0) {
                cantDivisores++;
            }
            divisor++;
        }

        if (cantDivisores == 2) {
            bandera = true;
        }
        return bandera;
    }

    /**
     * Metodo que imprime en la consola "cantidad"- numeros primos
     *
     * @param cantidad cuantos numeros primos seran impresos
     */
    public static void mostrarPrimos(int cantidad) {
        int numero = 1;
        int contador = 0;

        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
