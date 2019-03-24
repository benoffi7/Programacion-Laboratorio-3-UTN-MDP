package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un dia de la semana:");
		String dia = scan.next();
		scan.close();
		
		consultarDia (dia);
	}
	
	public static void consultarDia (String dia) {
		
		switch (dia) {
			case "Lunes": System.out.println("Es dia laboral");break;
			case "Martes": System.out.println("Es dia laboral");break;
			case "Miercoles": System.out.println("Es dia laboral");break;
			case "Jueves": System.out.println("Es dia laboral");break;
			case "Viernes": System.out.println("Es dia laboral");break;
			case "Sabado": System.out.println("No es dia laboral");break;
			case "Domingo": System.out.println("No es dia laboral");break;
			default: System.out.println("Error");break;
		}
	}

}
