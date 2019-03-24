import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opc=0;
		
		System.out.println("Seleccion una opcion:\n[1]Domingo\n[2]Lunes\n[3]Martes\n[4]Miercoles\n[5]Jueves\n[6]Viernes\n[7]Sabado");
		System.out.print("\nOpcion: ");
		opc=scan.nextInt();
		System.out.println("");
		switch(opc)
		{
		case 1:
			System.out.println("No es un dia laboral");
			break;
		case 2:
			System.out.println("Es un dia laboral con excepcion en algunos labores");
			break;
		case 3:
			System.out.println("Es un dia laboral");
			break;
		case 4:
			System.out.println("Es un dia laboral");
			break;
		case 5:
			System.out.println("Es un dia laboral");
			break;
		case 6:
			System.out.println("Es un dia laboral");
			break;
		case 7:
			System.out.println("Depende del labor");
			break;
		default:
			System.out.println("No selecciono ninguna de las opciones permitidas");
			break;
		}
		scan.close();

	}

}
