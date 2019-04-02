package app;

public class Ejercicio3Primos {
	
	public static void Primitos()
	{		
		int num = 2;
		int num2= 0;
		
		while(num <= 100)
		{
			num2= num-1;
			while((num%num2)!=0)/// esto va bien
			{
				num2--;			
			}
			
			if(num2 == 1)/// esto va bien
			{
				System.out.print("\nEl numero: "+num +" es primo.");
			}			
			num++;
		}
	}
}
