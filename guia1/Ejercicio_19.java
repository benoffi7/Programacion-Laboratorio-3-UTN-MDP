package guia1;
import java.util.Scanner;
import java.lang.Math;


public class Ejercicio_19 
{
	public static void max_min_promedio ()
	{
		Scanner scan= new Scanner (System.in);
		int tempMayor=0, tempMenor=0, temp, sumarTemp, promedio;
		
		for (int i=1; i<=30; i++)
		{
			System.out.println("Ingrese la temperatura del dia " + i + ":");
			int temp= scan.nextInt();
			
			sumarTemp += temp;
			
			tempMayor= Math.max(temp, tempMayor);
			tempMenor= Math.min (temp, tempMenor);
			
		}
		scan.close();
		
		System.out.print("La temperatura mayor es: " + tempMayor);
		System.out.print("La temperatura menor es: " + tempMenor);
		
		promedio= sumarTemp/1;
		System.out.print("El promedio de la temperatura es: " + promedio);
		
	}
}
