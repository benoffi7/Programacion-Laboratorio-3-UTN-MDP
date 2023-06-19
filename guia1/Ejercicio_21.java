package guia1;
import java.util.Scanner;

public class Ejercicio_21 
{
	public static void menu_semana()
	{
		Scanner scan = new Scanner(System.in);
	    boolean salir = false;
	    int opcion; 
	      
	      while(!salir)
	      {
	            
	           System.out.println("1. Lunes");
	           System.out.println("2. Martes");
	           System.out.println("3. Miercoles");
	           System.out.println("4. Jueves");
	           System.out.println("5. Viernes");
	           System.out.println("6. Sabado");
	           System.out.println("7. Domingo");
	           System.out.println("8. Salir");
	            
	           System.out.print("Seleccione un dia: ");
	           opcion = scan.nextInt();
	            
	           switch(opcion)
	           {
	               case 1:
	                   System.out.println("LUNES: Dia laboral.");
	                   ;
	               case 2:
	                   System.out.println("MARTES: Dia laboral.");
	                   ;
	                case 3:
	                   System.out.println("MIERCOLES: Dia laboral.");
	                   ;
	                case 4:
		               System.out.println("JUEVES: Dia laboral.");
		               ;
	                case 5:
		               System.out.println("VIERNES: Dia laboral.");
		               ;
		            case 6:
		               System.out.println("SABADO: Dia laboral.");
		               ;
		            case 7:
			          System.out.println("DOMINGO: Dia no laboral.");
			          ;
	                case 8:
	                   salir=true;
	                   ;
	                default:
	                   System.out.println("Solo números entre 1 y 8");
	           
	           }
	      }
	      scan.close();
	}
}
