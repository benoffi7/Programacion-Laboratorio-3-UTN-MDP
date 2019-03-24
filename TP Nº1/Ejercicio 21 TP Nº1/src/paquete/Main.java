package paquete;

import java.util.Scanner;

public class Main {

	public static void diaLaboralONo ()
	{
		int nro = -1;
		Scanner scan = new Scanner (System.in);
		while (nro != 0)
		{
			System.out.println("Saber si un dia es laboral");
			System.out.println("");
			System.out.println("1. Domingo");
			System.out.println("2. Lunes");
			System.out.println("3. Martes");
			System.out.println("4. Miercoles");
			System.out.println("5. Jueves");
			System.out.println("6. Viernes");
			System.out.println("7. Sabado");
			System.out.println(" ");
			System.out.print("Escoja una opcion: ");
			nro = scan.nextInt();
			System.out.println("");
			switch (nro)
			{
				case 0:
					break;
				case 1:
					System.out.println("No es un dia laboral.");
					break;
				case 2:
					System.out.println("Es un dia laboral.");
					break;
				case 3:
					System.out.println("Es un dia laboral.");
					break;
				case 4:
					System.out.println("Es un dia laboral.");
					break;
				case 5:
					System.out.println("Es un dia laboral.");
					break;
				case 6:
					System.out.println("Es un dia laboral.");
					break;
				case 7:
					System.out.println("No un dia laboral.");
					break;
				default:
					System.out.println("Opcion incorrecta.");
					break;
			}
			System.out.println("");
		}
		scan.close();
	}
	public static void main(String[] args) {
		diaLaboralONo();
	}

}
