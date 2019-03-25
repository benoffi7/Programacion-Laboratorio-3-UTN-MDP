package tp1;

import java.util.Scanner;

public class Ej20 {
	public static void menu (Scanner scan) {
		System.out.println("Ejercicio nº20: Crea una aplicación que nos pida un día de la semana y que\r\n" + 
				"nos diga si es un día laboral o no. Usa un switch para ello.");
		String dia= "";
		
		while(!dia.equals("salida")) {
			System.out.println("Ingresa el dia "+"\r\n"+"lunes"+"\r\n"+"martes"+"\r\n"+"miercoles"+"\r\n"+"jueves"+"\r\n"+"viernes"
					+"\r\n"+"sabados"+"\r\n"+"domingos"+"\r\n"+"escribir salida para salir ");
			dia = scan.next().toLowerCase();
			switch(dia) {
			
			case "lunes":
				try 
				{
					System.out.println("Dia laboral");

					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				
				break;
				
			case "martes":
				try 
				{
					System.out.println("Dia laboral");

					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				break;
				
			case "miercoles":
				try 
				{
					System.out.println("Dia laboral");

					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				break;
				
			case "jueves":
				try 
				{
					System.out.println("Dia laboral, pero unas birras afterOffice van como pinia");

					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				
				break;
				
			case "viernes":
				try 
				{
					System.out.println("Dia laboral");

					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				break;
				
			case "sabados":
				try 
				{
					System.out.println("Dia no laboral , podes ir de parranda pillin");
					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				break;
				
			case "domingos":
				try 
				{
					System.out.println("Dia no laboral , podes ir de parranda pillin");
					Thread.sleep(3000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				break;
				
			default:
				try 
				{
					if (!dia.equals("salida")){
					System.out.println("Ingresa bien el dia pavote/a XD");
					Thread.sleep(3000);
					}else
					{
						System.out.println("Saliendo del programa");
						Thread.sleep(2000);
					}
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}
				
				break;
				
			}
		}
	}

}
