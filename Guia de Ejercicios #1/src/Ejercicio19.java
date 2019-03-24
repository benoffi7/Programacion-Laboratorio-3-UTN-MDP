import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float tempMes[] = new float[30];
		float promedio = 0, suma = 0, maximo = 0, minimo = 0;
		String control = "Si";
		int i = 0;

		while ((control.equalsIgnoreCase("Si")) && (i < 30)) 
		{
			System.out.println("Ingrese una temperatura en °C: ");
			tempMes[i]=scan.nextFloat();
			if(i==0)
			{
				minimo=tempMes[i];
				maximo=tempMes[i];
			}
			if(minimo>tempMes[i])
				minimo=tempMes[i];
			if(maximo<tempMes[i])
				maximo=tempMes[i];
			suma=suma+tempMes[i];
			System.out.println("Desea continuar?(Si/No): ");
			control=scan.next();
			i++;
		}
		promedio=suma/i;
		System.out.println("La temperatura promedio del mes es "+promedio+"°c ,la temperatura minima es "+minimo+"°c y la temperatura maxima es "+maximo+"°c");
		scan.close();
	}

}
