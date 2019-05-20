package paquete;

public class Main {

	final static int dim = 30;

	public static void mostrarArreglo(int [] arreglo, int validos)
	{
		for (int i=0; i<validos; i++)
		{
			System.out.print(arreglo [i] + "  ");
		}
	}
	public static int cargarTemperaturas (int [] arreglo)
	{
		int valor = 0 ;
		int i=0;
		for (i=0; i<dim; i++)
		{
			valor = (int) Math.floor(Math.random()*40);
			arreglo[i] = valor;
		}
		return i;
	}
	public static int maxTemperatura (int [] arreglo, int validos)
	{
		int maximo = arreglo [0];
		for (int i=1; i<validos; i++)
			if (arreglo[i] > maximo)
				maximo = arreglo [i];
		return maximo;
	}
	public static int minTemperatura (int [] arreglo, int validos)
	{
		int minimo = arreglo [0];
		for (int i=1; i<validos; i++)
			if (arreglo[i] < minimo)
				minimo = arreglo [i];
		return minimo;
	}
	public static float promTemperatura (int [] arreglo, int validos)
	{
		int total = 0;
		for (int i=0; i<validos; i++)
			total += arreglo[i];
		float promedio = (float) (total/validos);
		return promedio;
	}
	public static void main(String[] args) {
		int [] arreglo = new int [dim]; 
		int validos = cargarTemperaturas(arreglo);
		System.out.println("Temperaturas de un mes: ");
		mostrarArreglo(arreglo, validos);
		System.out.println("");
		System.out.println("La maxima temperatura es " + maxTemperatura(arreglo, validos) + " , la minima es " + minTemperatura(arreglo, validos) + " y la promedia es " + promTemperatura(arreglo, validos));
	}

}
