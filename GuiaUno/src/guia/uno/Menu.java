package guia.uno;

import java.util.Scanner;

public class Menu {

    private static Scanner scan = new Scanner(System.in);
    private static Integer opcion = null;

    public static void gestorMenu() {

        mostrarMenu();
        setOpcion();
        mostrarEjercicio();
    }

    public static void mostrarMenu() {
        System.out.println("------------------Bienvenido al Menú de la Guía nº 1------------------\n\nAcontinuación seleccione un ejercicio\n");
        System.out.println("\t1 ->> Calcular promedio de un arreglo de enteros");
        System.out.println("\t2 ->> Saber si un número es par");
        System.out.println("\t3 ->>  Mostrar los primeros 100 números primos");
        System.out.println("\t4 ->>  Mostrar los primeros n números primos");
        System.out.println("\t5 ->> ");
        System.out.println("\t6 ->> Ingresar un número o tantos como quiera el usuario y revisar si es primo");
        System.out.println("\t7 ->> Encontrar la suma de los primeros 10 números naturales");
        System.out.println("\t8 ->> Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario");
        System.out.println("\t9 ->> Revisar si un año es bisiesto o no");
        System.out.println("\t10 ->> Encontrar el valor ASCII de un carácter");
        System.out.println("\t11 ->> Multiplicar dos números");
        System.out.println("\t12 ->> Realizar un programa que le pregunte al usuario que área desea calcular");
        System.out.println("\t13 ->> Programa que lea un nombre y muestre por pantalla:\n"
                + "“Buenos dias nombre_introducido");
        System.out.println("\t14 ->> Leer un número entero por teclado y obtenga y mostrar por pantalla el doble y el triple de ese número");
        System.out.println("\t15 ->> Pasar de grados centígrados a Fahrenheit");
        System.out.println("\t16 ->> Pedir radio, calcular longitud y área");
        System.out.println("\t17 ->> Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado");
        System.out.println("\t18 ->> Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras");
        System.out.println("\t19 ->> Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio");
        System.out.println("\t20 ->> Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio ");
        System.out.println("\t21 ->> Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.");
        System.out.println("\t22 ->> conocer cifras de un número");
        System.out.println("\t23 ->>  Crea una aplicación llamada CalculadoraPolacaInversaApp");
        System.out.println("\t24 ->>  Calcula salario");

        System.out.println("\nSu opción es: ");
    }

    public static void setOpcion() {
        opcion = scan.nextInt();
    }

    public static void mostrarEjercicio() {
        switch (opcion) {
            case 1:
                Ejercicio1.setArregloAzar();
                Ejercicio1.mostrarArreglo();
                System.out.println("El promedio es ->> " + Ejercicio1.getPromedio());
                break;

            case 2:
                Ejercicio2.saberPar();
                break;

            case 3:
                Ejercicio3.mostrar();
                break;

            case 4:
                Ejercicio4.mostrar();
                break;

            case 6:
                Ejercicio6.mostrar();
                break;

            case 7:
                Ejercicio7.mostrarSuma();
                break;

            case 8:
                Ejercicio8.contarPositivos();
                break;

            case 9:
                Ejercicio9.saberBisiesto();
                break;

            case 10:
                Ejercicio10.saberValor();
                break;

            case 11:
                Ejercicio11.multiplicar(5, 6);
                break;

            case 12:
                Ejercicio12.mostrarOpciones();
                break;

            case 13:
                Ejercicio13.pedirNombre();
                Ejercicio13.mostrarNombre();
                break;

            case 14:
                Ejercicio14.calcular();
                break;

            case 15:
                Ejercicio15.pedirCentigrado();
                Ejercicio15.conversorFahrenheit();
                Ejercicio15.mostrarFahrenheit();
                break;

            case 16:
                Ejercicio16.pedirRadio();
                Ejercicio16.calcularArea();
                Ejercicio16.calcularLongitud();
                break;

            case 17:
                Ejercicio17.pedirVelocidad();
                Ejercicio17.calcular();
                break;

            case 18:
                Ejercicio18.pedirMedidas();
                Ejercicio18.calcularHipotenusa();
                break;

            case 19:
                Ejercicio19.cargarArreglo();
                //Ejercicio19.pedirTemperatura();
                Ejercicio19.calcularPromedio();
                Ejercicio19.hallarMenor();
                Ejercicio19.hallarMayor();
                break;

            case 20:
                Ejercicio20.pedirNumeros();
                Ejercicio20.generarAleatorios();
                break;

            case 21:
                Ejercicio21.pedirDia();
                Ejercicio21.saberLaboral();
                break;

            case 22:
                Ejercicio22.pedirNumero();
                Ejercicio22.saberCifras();
                break;

            case 23:
                Ejercicio23.pedirNumeros();
                Ejercicio23.calculadoraPolacaInversa();
                break;

            case 24:
                Ejercicio24.pedirEdad();
                Ejercicio24.pedirNombre();
                Ejercicio24.pedirSalario();
                Ejercicio24.calcularSalario();
                break;

            default:
                System.out.println("Ha presionado una opción incorrecta");
                break;
        }

    }
}
