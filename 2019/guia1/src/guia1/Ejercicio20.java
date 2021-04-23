package guia1;

public class Ejercicio20 {
	public static void generarRandoms()
	{
		int min=1, max=100,aleatorio=0;
		for (int i=0;i<10;i++){
            aleatorio=(int)Math.floor(Math.random()*(min-max)+max);
            System.out.println(aleatorio);
        }
	}
}
