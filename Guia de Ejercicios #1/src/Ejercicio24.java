import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nombre;
		int edad;
		float salario;
		
		System.out.print("Nombre: ");
		nombre=scan.nextLine();
		System.out.print("Edad: ");
		edad=scan.nextInt();
		System.out.print("Salario: ");
		salario=scan.nextFloat();
		System.out.print("");
		if(edad<16)
			System.out.print("No tiene Salario por que no alcanza la edad para trabajar");
		if((edad>=16)&&(edad<=18))
			System.out.print("Salario destinado: "+salario);
		if((edad>=19)&&(edad<=50))
			System.out.print("Salario destinado: "+(salario+salario*5/100));
		if((edad>=51)&&(edad<=60))
			System.out.print("Salario destinado: "+(salario+salario*10/100));
		if(edad>60)
			System.out.print("Salario destinado: "+(salario+salario*15/100));
	}

}
