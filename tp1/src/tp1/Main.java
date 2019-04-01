package tp1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 23;
		Scanner scan = new Scanner(System.in);
		int eleccion;
		
		do {
			System.out.println("Ingrese Ejercicio Deseado ( 0 para limpiar pantalla)"+"\r\n"+ " 1.Ejercicio 1 "+ "\r\n" +" 2.Ejercicio 2"+ "\r\n" 
					+" 3.Ejercicio 3"+"\r\n"+ " 4.Ejercicio 4 "+ "\r\n"+ " 5.Ejercicio 5 "+ "\r\n"
					+ " 6.Ejercicio 6 "+ "\r\n"+ " 7.Ejercicio 7 "+ "\r\n"+ " 8.Ejercicio 8 "+ "\r\n"+ " 9.Ejercicio 9 "+ "\r\n"+
					" 10.Ejercicio 10 "+ "\r\n" + " 11.Ejercicio 11 "+ "\r\n"+ " 12.Ejercicio 12 "+ "\r\n"
					+ " 12.Ejercicio 12 "+ "\r\n"+ " 13.Ejercicio 13 "+ "\r\n"+ " 14.Ejercicio 14 "+ "\r\n"+ " 15.Ejercicio 15 "+ "\r\n"
					+ " 16.Ejercicio 16 "+ "\r\n"+ " 17.Ejercicio 17 "+ "\r\n"+ " 18.Ejercicio 18 "+ "\r\n"
					+ " 18.Ejercicio 18 "+ "\r\n"+ " 19.Ejercicio 19 "+ "\r\n"+ " 20.Ejercicio 20 "+ "\r\n"+ " 21.Ejercicio 21 "+ "\r\n"
					+ " 22.Ejercicio 22 "+ "\r\n"+ " 23.Ejercicio 23 "+ "\r\n");
			eleccion =Integer.parseInt(scan.next());
			switch(eleccion) {
				case 1:
					Ej1.menu(scan);
					break;
				
				case 2:
					Ej2.menu(scan);
					break;
				
				case 3:
					Ej3.menu();
					break;
					
				case 4:
					Ej4.menu(scan);
					break;
					
				case 5:
					Ej5.menu(scan);
					break;
					
				case 6:
					Ej6.menu();
					break;
					
				case 7:
					Ej7.menu(scan);
					break;
					
				case 8:
					Ej8.menu(scan);
					break;
					
				case 9:
					Ej9.menu(scan);
					break;
					
				case 10:
					Ej10.menu(scan);
					break;
					
				case 11:
					Ej11.menu(scan);
					break;
					
				case 12:
					Ej12.menu(scan);
					break;
					
				case 13:
					Ej13.menu(scan);
					break;
					
				case 14:
					Ej14.menu(scan);
					break;
					
				case 15:
					Ej15.menu(scan);
					break;
					
				case 16:
					Ej16.menu(scan);
					break;
					
				case 17:
					Ej17.menu(scan);
					break;
					
				case 18:
					Ej18.menu();
					break;
				
				case 19:
					Ej19.menu(scan);
					break;
					
				case 20:
					Ej20.menu(scan);
					break;
					
				case 21:
					Ej21.menu(scan);
					break;
					
				case 22:
					Ej22.menu(scan);
					break;
					
				case 23:
					Ej23.menu(scan);
					break;
					
				case 0: 
					for (int i = 0; i < 49; ++i) System.out.println();
					break;
					
					default : 
						
						System.out.println("Made by ZeroCooler All rights reserved");
						break;
		
			}
			
		}while (eleccion <= MAX);
		scan.close();
		
	}

}
