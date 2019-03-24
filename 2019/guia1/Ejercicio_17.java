package guia1;
import java.util.Scanner;

public class Ejercicio_17 
{
	public static void pasar_kilometros ()
	{
		Scanner scan= new Scanner (System.in);
		int km, m;
		System.out.println ("Ingrese la velocidad en km/h: ");
		int km= scan.nextInt();
		scan.close();
		
		m= (km*10)/36;
		
		System.out.println ("La velocidad en m/s es: " + m);
	}
}
