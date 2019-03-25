/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2
 * operandos (int) y un signo aritmético (String), según este último se
 * realizará la operación correspondiente. 
 * Al final mostrara el resultado en un cuadro de diálogo. 
 * Los signos aritméticos disponibles son: 
 * + : suma los dos operandos. 
 * - : resta los operandos
 * . : multiplica los operandos. 
 * / : divide los operandos, este debe dar un resultado con decimales (double) 
 * ^ : 1º operando como base y 2º como exponente
 * % : módulo, resto de la división entre operando1 y operando2
 *
 * @author Fede
 */
public class Ejercicio22 {
   public static Scanner teclado;

    public static void CalculadoraPolacaInversaApp() {
        teclado= new Scanner(System.in);
        double res= 0;
        
        System.out.println("Ingrese el primer valor");
        int numero1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        int numero2 = teclado.nextInt();
        
        System.out.println("Ingrese el simbolo correspondiente a la operacion");
        System.out.println("+ Suma");
        System.out.println("- Resta");
        System.out.println(". Multiplicacion");
        System.out.println("/ Division");
        System.out.println("^ Potencia");
        System.out.println("% Resto de una division");
        
        char operacion = (teclado.next()).charAt(0);
        
        switch (operacion){
            case '+':
                res= numero1 + numero2;
                break;
            case '-':
                res= numero1 - numero2;
                break;
            case '.':
                res= numero1 * numero2;
                break;
            case '/':
                res = (double) numero1 / (double) numero2;
                break;
            case '^':
                res= Math.pow(numero1, numero2);
                break;
            case '%':
                res= numero1 % numero2;
                break;
        }
        String mensaje = "El resultado de la operacion "+ operacion +" es ";
        
        mostrarResultadoVentana(mensaje, res);
        
        System.out.println("El resultado de la operacion "+ operacion +" es "+ res );
        teclado.close();
    }
    public static void mostrarResultadoVentana(String msj, double res){
        JOptionPane.showMessageDialog(null, msj+ res);
    }
}
