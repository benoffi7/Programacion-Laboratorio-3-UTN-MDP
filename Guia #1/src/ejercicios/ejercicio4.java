package ejercicios;

public class ejercicio4 {

	public static void Primos(int cantidad)
	{
		int i, comparador, div=0;			/// div es la cantidad de veces que dara resto 0
		//int primo=0;
		for (i=1;i<cantidad;i++)
		{
			div=0;
		
	    for (comparador=1; comparador<=i; comparador++)
			{
				if (i%comparador == 0)
				{
					div++;
				}
			}
	    if (div==2)
		{
			/*
			arreglo[primo]=i;
			primo++; */
			System.out.println(i);
		}
		}
	}
}
