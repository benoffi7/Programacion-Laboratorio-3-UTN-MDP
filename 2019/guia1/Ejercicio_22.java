package guia1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_22 
{
	public static void mostrar_cant_de_cifras ()
	{
		Scanner scan = new Scanner(System.in);
		int num, cifras=0;
		
		System.out.println("Introduce un número positivo: ");
		int num= scan.nextInt();
		if (num<=0)
		{
			System.out.print("Numero incorrecto. Por favor ingrese un valor POSITIVO:");
			int num= scan.nextInt();
		}
		scan.close();
		while(num!=0)  //mientras al numero le queden cifras
		{             
            num = num/10;         //le sacamos el último dígito
           cifras++;          //sumamos 1 al contador de cifras
		}
		System.out.println("El número tiene " + cifras + " cifras");
	
	}
}
