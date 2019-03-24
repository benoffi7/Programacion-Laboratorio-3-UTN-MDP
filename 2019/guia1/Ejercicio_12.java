package guia1;

import java.util.Scanner;

public class Ejercicio_12 
{
	public static void menu ()
	{
		Scanner scan = new Scanner(System.in);
	      boolean salir = false;
	      int opcion; 
	      
	      while(!salir)
	      {
	            
	           System.out.println("1. Rectangulo");
	           System.out.println("2. Cuadrado");
	           System.out.println("3. Triangulo");
	           System.out.println("4. Circulo");
	           System.out.println("5. Salir");
	            
	           System.out.print("Seleccina una opcion: ");
	           opcion = scan.nextInt();
	            
	           switch(opcion)
	           {
	               case 1:
	                   System.out.println("Has seleccionado el rectangulo");
	                   ;
	               case 2:
	                   System.out.println("Has seleccionado el cuadrado");
	                   ;
	                case 3:
	                   System.out.println("Has seleccionado el triangulo");
	                   ;
	                case 4:
		               System.out.println("Has seleccionado el circulo");
		               ;
	                case 5:
	                   salir=true;
	                   ;
	                default:
	                   System.out.println("Solo números entre 1 y 5");
	           
	           }
	      }
	      scan.close();
	}

}
