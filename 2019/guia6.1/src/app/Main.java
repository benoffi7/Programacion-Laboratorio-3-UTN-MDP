package app;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nIngrese el nombre: ");
        String nombre = scan.next();

        // *----------------------------------

        System.out.print("\nIngrese edad: ");
        int edad = 0;
        boolean bulean;
        do {
            bulean = scanInt();
            if (bulean == true) {
                edad = scan.nextInt();
            }
        } while (bulean != true);

        // *----------------------------------

        System.out.print("\nIngrese sexo (H/M): ");
        char sexo = scan.next().charAt(0);

        // *----------------------------------

        System.out.print("\nIngrese peso en kilogramos: ");
        double peso = 0;
        do {
            bulean = scanDouble();
            if (bulean == true) {
                peso = scan.nextDouble();
            }
        } while (bulean != true);

        // *----------------------------------

        System.out.print("\nIngrese altura en metros: ");
        double altura = 0;
        do {
            bulean = scanDouble();
            if (bulean == true) {
                altura = scan.nextDouble();
            }
        } while (bulean != true);

        // *-----------------------------------

        Persona nuevoAlumnoCompleto = new Persona(nombre, edad, sexo, peso, altura);
        Persona nuevoAlumnoParcial = new Persona("wachin", 17, 'h');
        Persona nuevoAlumnoVacio = new Persona();

        nuevoAlumnoVacio.setNombre("rancho");
        nuevoAlumnoVacio.setEdad(12);
        nuevoAlumnoVacio.setSexo('m');
        nuevoAlumnoVacio.setPeso(50);
        nuevoAlumnoVacio.setAltura(1.4);

        IMC(nuevoAlumnoCompleto);
        IMC(nuevoAlumnoParcial);
        IMC(nuevoAlumnoVacio);

        esMayor(nuevoAlumnoCompleto);
        esMayor(nuevoAlumnoParcial);
        esMayor(nuevoAlumnoVacio);

        
        System.out.println(nuevoAlumnoCompleto.toString());
        System.out.println(nuevoAlumnoParcial.toString());
        System.out.println(nuevoAlumnoVacio.toString());
    }

    public static void esMayor(Persona persona) {

        if (persona.esMayorDeEdad() == true) {
            System.out.println("\nEs mayor de edad");
        } else {
            System.out.println("\nNo es mayor de edad");
        }

    }

    public static void IMC(Persona persona) {

        if (persona.calculaIMC() == -1) {
            System.out.println("\nEsta por debajo del peso ideal...");
        } else if (persona.calculaIMC() == 0) {
            System.out.println("\nEsta en su peso ideal...");
        } else if (persona.calculaIMC() == 1) {
            System.out.println("\nTiene sobrepeso...");
        }else{
            System.out.println("\nInformacion insuficiente...");
        }
    }

    public static boolean scanInt() {

        boolean flag = false;

        if (scan.hasNextInt()) {
            flag = true;

        } else {
            System.out.println("\nError: ingrese un numero...");
            scan.next();
        }

        return flag;

    }

    public static boolean scanDouble() {

        boolean flag = false;

        if (scan.hasNextDouble()) {
            flag = true;

        } else {
            System.out.println("\nError: ingrese un numero...");
            scan.next();
        }

        return flag;

    }
}