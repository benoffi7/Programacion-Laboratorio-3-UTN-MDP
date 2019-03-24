package paquete;

public class Main {

	public static int multiplicarDosNumeros (int num, int num2)
	{
		int multiplicacion = num*num2;
		return multiplicacion;
	}
	public static void main(String[] args) {
		System.out.println("El resultado de la multiplicación es: " + multiplicarDosNumeros(5, 2));
	}

}
