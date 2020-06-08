package tareaxd;

import java.util.Scanner;

public class Ejercicio10 {
	public static Scanner scan;
 public static int asciiToInt(Character c) {
	 return (int)c;
 }
 public static void asciitToIntMuestra() {
	 scan = new Scanner(System.in);
	 Character c=' ';
	 int valor=0;
	 System.out.println("Ingrese un caracter para saber su valor en ASCII:");
	 c=scan.next().charAt(0);
	 valor=asciiToInt(c);
	 System.out.println(c+" en ASCII es:"+valor);
 }
}

