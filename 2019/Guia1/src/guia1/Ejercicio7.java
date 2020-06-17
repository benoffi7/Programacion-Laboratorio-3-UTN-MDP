/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 * Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario
 *
 * @author Fede
 */
public class Ejercicio7 {
    public static Scanner teclado;
    
    public static void iniciar() {
        teclado= new Scanner(System.in);
        char res = ' ';
        int contador = 0;
        float numero;
        
        System.out.println("Se contara los numeros positivos que se ingresen");
        
        do {
            System.out.println("Ingrese un numero");
            numero= teclado.nextInt();
            
            if ( esPositivo(numero)){
                contador++;
            }
            
            System.out.println("Desea seguir cargando? s/n");
            res = Ejercicio1.leerCaracter();
        } while (res == 's');
        System.out.println("Se ingresaron "+ contador +" numeros");
        
        teclado.close();
    }
/**
 * Calcula si <STRONG>numero</STRONG> es positivo o no
 * @param numero
 * @return boolean
 */
    public static boolean esPositivo(float numero) {
        return (numero > 0);
    }
}
