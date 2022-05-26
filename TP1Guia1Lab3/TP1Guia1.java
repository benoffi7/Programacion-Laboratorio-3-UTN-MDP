/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.guia1;

import java.util.Scanner;
public class TP1Guia1 {
    
    static Scanner scan;
    public static int numero =0;
    public static int opcion =0;
    public static int[] aCargar = new int[5];

    public static void main(String[] args) {

            System.out.println("Ingrese numero de ejercicio a realizar...");
            System.out.println("Las opciones son del 1 al 23, caso que ingrese un numero fuera de la opcion se cerrara...");
            scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1: //Ejercicio 1
                    // Calcular el promedio de un arreglo de números enteros.
                    // Realizar variantes con arreglos ya inicializados e ingreso por teclado.
                    Ejercicio1.Cargar(aCargar);
                    Ejercicio1.Suma(aCargar);
                    Ejercicio1.Promedio(aCargar);
                    break;
                case 2: //Ejercicio 2
                    //Calcular si un número es par o no.
                    Ejercicio2.ParOinPar();
                    break;
                case 3: //Ejercicio 3
                    //Mostrar los primeros 100 números primos.
                    Ejercicio3.MostrarPrimeros10();
                    break;
                case 4: //Ejercicio 4
                    //Mostrar los primeros n números primos.
                    Ejercicio4.MostrarNcantPrimos();
                    break;
                case 5: //Ejercicio 5
                    //Ingresar un número o tantos como quiera el usuario y revisar si es primo.
                    Ejercicio5.EsPrimo();
                    break;
                case 6: //Ejercicio 6
                    //Encontrar la suma de los primeros 10 números naturales.
                    Ejercicio6.Natural();
                    break;
                case 7: //Ejercicio 7
                    //Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.
                    Ejercicio7.Positivos();
                    break;
                case 8: //Ejercicio 8
                    //Revisar si un año es bisiesto o no.
                    Ejercicio8.AnoBisiesto();
                    break;
                case 9: //Ejercicio 9
                    //Encontrar el valor ASCII de un carácter.
                    Ejercicio9.ASCII();
                    break;
                case 10://Ejercicio 10
                    //Multiplicar dos números.
                    Ejercicio10.Multiplicar();
                    break;
                case 11://Ejercicio 11
                    //Realizar un programa que le pregunte al usuario que área desea calcular.
                    // Las opciones son: rectángulo, cuadrado, triangulo y circulo.
                    Ejercicio11.Opciones();
                    break;
                case 12://Ejercicio 12
                    // Programa que lea un nombre y muestre por pantalla:“Buenos dias nombre_introducido”.
                    Ejercicio12.MuestraBuenosDias();
                    break;
                case 13://Ejercicio 13
                    //Escribir un programa que lea un número entero por teclado y obtenga y
                    // muestre por pantalla el doble y el triple de ese número.
                    Ejercicio13.MuestraDobleYTriple();
                    break;
                case 14://Ejercicio 14
                    //Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
                    // La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)
                    Ejercicio14.PasaCAF();
                    break;
                case 15://Ejercicio 15
                    //Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
                    // Investigar el uso de la librería Math.
                    //Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
                    Ejercicio15.LongYArea();
                    break;
                case 16://Ejercicio 16
                    //Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
                    Ejercicio16.conversor();
                    break;
                case 17://Ejercicio 17
                    //Programa lea la longitud de los catetos de un triángulo rectángulo y
                    // calcule la longitud de la hipotenusa según el teorema de Pitágoras.
                    Ejercicio17.Pitagoras();
                    break;
                case 18://Ejercicio 18
                    //Programa lea 30 temperaturas correspondientes a un mes y
                    // calcule el maximo, el minimo y el promedio.
                    Ejercicio18.Temperaturas();
                    break;
                case 19://Ejercicio 19
                    //Pide por teclado dos números y genera 10 números aleatorios entre esos números.
                    // Usa el método Math.random para generar un número entero aleatorio
                    Ejercicio19.Random();
                    break;
                case 20://Ejercicio 20
                    //Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no.
                    // Usa un switch para ello.
                    Ejercicio20.SeTrabaja();
                    break;
                case 21://Ejercicio 21
                    //Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
                    // Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
                    // Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.
                    Ejercicio21.Digitos();
                    break;
                case 22://Ejercicio 22
                    //Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String),
                    // según este último se realizará la operación correspondiente.
                    // Al final mostrara el resultado en un cuadro de diálogo.
                    Ejercicio22.Calculadora();
                    break;
                case 23://Ejercicio 23
                    //Pide por teclado el nombre, edad y salario y muestra el salario.
                    //Si es menor de 16 no tiene edad para trabajar
                    //Entre 19 y 50 años el salario es un 5 por ciento más
                    //Entre 51 y 60 años el salario es un 10 por ciento más
                    //Si es mayor de 60 el salario es un 15 por ciento más
                    Ejercicio23.Trabajador();
            }
        System.out.println("Gracias por usar el sistema! Se cerrara por cada vez que se finalize la opcion elegida");
    }
    
}
