package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner scan;
public static void ingresoCaracter(){
	
scan = new Scanner(System.in);
char caracter;

System.out.println("ingrese el caracter a transformar");
caracter=scan.next().charAt(0);
	ascii(caracter);
}

public static void ascii(char caracter)
{
	int cambio;
cambio=(int) caracter;
System.out.println(cambio);


}
}
