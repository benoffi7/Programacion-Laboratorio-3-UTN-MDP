package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio9 {
    public static void ASCII(){

        scan = new Scanner(System.in);
        System.out.println("Ingrese los caracteres...");
        String Caracter = scan.next();

        for (int x=0;x<Caracter.length();x++)
            System.out.println(Caracter.charAt(x) + " = " + Caracter.codePointAt(x));;

        scan.close();
    }
}
