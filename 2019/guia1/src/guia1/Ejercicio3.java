package guia1;

public class Ejercicio3 {
	public static void verificarSiEsPrimo()
	{
		int i=1, j=100;
		int inicial=2, numfinal=100;
		boolean primo=true; // 1 si es primo
		for(i=inicial;i<=numfinal;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i % j == 0)
				{
					primo=false;
				}
			}
		}
		if(primo)
		{
			System.out.println(i+"\n");
		}
	}
	
}
