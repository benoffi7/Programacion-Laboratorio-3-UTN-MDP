import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero=0;
		
		do
		{
		System.out.print("Ingrese un numero entero positivo: ");
		numero=scan.nextInt();
		}while(numero<0);
		
		if(numero<10)
			System.out.print("Su numero entero positivo de 1 cifra es "+numero);
		if((10<=numero)&&(numero<100))
			System.out.print("Su numero entero positivo de 2 cifras es "+numero);
		if((100<=numero)&&(numero<1000))
			System.out.print("Su numero entero positivo de 3 cifras es "+numero);
		if((1000<=numero)&&(numero<10000))
			System.out.print("Su numero entero positivo de 4 cifras es "+numero);
		if(10000<=numero)
			System.out.print("Su numero entero positivo de 5 cifras o mas es "+numero);
		scan.close();
	}

}
