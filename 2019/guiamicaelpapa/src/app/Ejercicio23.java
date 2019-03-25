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
public class Ejercicio23 {

    /*Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp,
    nos pedirá 2 operandos (int) y un signo aritmético (String), según este 
    último se realizará la operación correspondiente. Al final mostrara el 
    resultado en un cuadro de diálogo.
Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
     */
    public static void CalculadoraPolacaInversaApp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primer operando: ");
        int operando = scan.nextInt();
        System.out.println("Operacion a realizar( + , - , * , / , ^ , %): ");
        String operacion = scan.next();
        System.out.println("Segundo operando: ");
        int operando2 = scan.nextInt();

        switch (operacion) {
            case "+":
                System.out.println("Suma: "+(operando+operando2));
                break;
            case "-":
                System.out.println("Resta: "+(operando-operando2));
                break;
            case "*":
                System.out.println("Multiplicacion: "+(operando*operando2));
                break;
            case "/":
                double resultado = (double)operando/operando2;
                System.out.println("Division: "+resultado);
                break;
            case "^":
                for (int i = 1; i < operando2; i++) {
                    operando*=operando;
                }
                System.out.println("Potenciacion: "+operando);
                break;
            case "%":
                System.out.println("Resto: "+(operando%operando2));
                break;
            default:
                System.out.println("Operacion no reconocida");
                break;
        }
    }
}
