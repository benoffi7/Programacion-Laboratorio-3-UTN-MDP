
package guia.uno;

import java.util.Scanner;


public class Ejercicio23 {
    private static Scanner scan = new Scanner(System.in);
    private static Integer numero1 = null;
    private static Integer numero2 = null;
    private static String operacion = " ";
    
    public static void pedirNumeros(){
        
            System.out.println("Ingrese el primer número ->> ");
            numero1 = scan.nextInt();

            scan.nextLine();

            System.out.println("Ingrese el segundo número ->> ");
            numero2 = scan.nextInt();

            scan.nextLine();
        do{
            
            System.out.println("Ingrese la operación a realizar ->> ");
            operacion = scan.nextLine();
            
        }while(!(operacion.equals("+")) && !(operacion.equals("-")) && !(operacion.equals("*")) && !(operacion.equals("/")) && !(operacion.equals("^")) && !(operacion.equals("%")));
    }
    
    public static void calculadoraPolacaInversa(){
        double resultado = 0;
        
        switch(operacion){
            case "+":
                resultado = numero1 + numero2;
                break;
                
            case "-":
                resultado = numero1 - numero2;
                break;
                
            case "*":
                resultado = numero1*numero2;
                break;
                
            case "/":
                if(numero2!=0){
                    resultado = numero1/numero2;
                }else{
                    System.out.println("No se puede dividir por cero");
                }
                break;
             
            case "^":
                resultado = Math.pow(numero1, numero2);
                break;
                
            case "%":
                resultado = numero1%numero2;
                break;
                
        }
        
        System.out.println("El resultado de la operacion " + operacion + " es ->> " + resultado);
    }
}
