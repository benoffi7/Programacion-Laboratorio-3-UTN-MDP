import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String area = "Ninguna";
		int opc;
		System.out.println("Seleccion el area que desea:\n\n[1]Rectangulo\n[2]Cuadrado\n[3]Triangulo\n[4]Circulo");
		opc = scan.nextInt();
		switch (opc) {
		case 1:
			area = "Rectangulo";
			break;
		case 2:
			area = "Cuadrado";
			break;
		case 3:
			area = "Triangulo";
			break;
		case 4:
			area = "Circulo";
			break;
		default:
			area = "Ninguna";
			break;
		}
		System.out.println("Usted ha seleccionado la siguiente area: " + area);
		scan.close();
	}
}
