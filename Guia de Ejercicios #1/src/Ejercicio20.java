import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0;
		
		System.out.println("Ingrese el primer numero: ");
		num1=scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2=scan.nextInt();
		System.out.println("\nSus 10 numeros aleatorios dentro del rango establecido son: \n");
		for(int i=0;i<10;i++)
		{
			System.out.println(" "+(int)Math.floor(Math.random()*(num2-num1+1)+num1));
		}
		scan.close();
	}

}
