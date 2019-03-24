package paquete;

import java.util.Scanner;

public class Main {

	public static int pedirNumeroPrimerosNumPrimos ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros primos que quiere mostrar a partir del primero:");
		int num = scan.nextInt();
		scan.close();
		return num;
	}
	public static boolean revisarSiEsPrimo (int num)
	{
		boolean control = false; 
		if (num>=1) //no compruebo dividir por 1 porque todos los numeros excepto el cero son divisibles por 1
		{							//tampoco compruebo si el numero ingresado es divisible por el numero ingresado porque es obvio que si lo va a ser siempre 
			control = true; 		//si lo declaro en la condicion del for un int, se declara en cada iteracion?
			for (int i=2;i<num;i++) //empiezo desde dos porque por uno ya se que es divisible y avanzo hasta uno anterior al numero ingresado porque tambien se que ese es divisible el numero por si mismo 
				if(num%i==0)		//si algun numero entre 2 y uno anterior al numero ingresado puede dividir al numero ingresado
					control = false;//entonces es falso que es primo ya que la condicion de que un numero sea primo es que puede dividirse nomas por uno y por si mismo
		}
		return control;		
	}
	public static void mostrarPrimeros_n_NumerosPrimos (int cant)
	{
		int num=1;
		int i=0;
		System.out.println(" ");
		System.out.print("Cantidad de numeros primos a mostrar: " + cant + "\n");
		System.out.print("Numeros primos: \n");
		while (i!=cant)
		{
			if (revisarSiEsPrimo(num))
			{
				System.out.print(num+" ");
				i++;
			}			
		 	num++;
		}
	}
	
	public static void main(String[] args) {
		mostrarPrimeros_n_NumerosPrimos(pedirNumeroPrimerosNumPrimos());
	}

}
