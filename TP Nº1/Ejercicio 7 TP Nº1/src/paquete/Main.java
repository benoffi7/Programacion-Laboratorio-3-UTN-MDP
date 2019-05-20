package paquete;

public class Main {

	public static int suma10PrimerosNrosNaturales ()
	{
		int suma=0;
		for (int i=1;i<=10;i++)
			suma+=i;
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println("La suma de los 10 primeros numeros naturales es: " + suma10PrimerosNrosNaturales());
	}

}
