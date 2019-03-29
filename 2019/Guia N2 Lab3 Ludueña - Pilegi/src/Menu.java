import java.util.Scanner;

public class Menu {
	public static Scanner scan;

	public static void sistemaBancario() {
		scan = new Scanner(System.in);
		Cuenta prueba = null;
		int opcion = 0;
		double saldoC = 0;
		boolean flag=true;
		String nombreC = " ";
		do {
			System.out.println("Ingrese el numero de la operacion que desee realizar: ");
			System.out.println("1. Crear cuenta vacia");
			System.out.println("2. Crear cuenta con saldo inicial");
			System.out.println("3. Ingresar dinero");
			System.out.println("4. Sacar dinero");
			System.out.println("5. Ver saldo");
			System.out.println("6. Salir");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				if (prueba == null) {

					System.out.println("Creacion de cuenta: ");
					System.out.println("Ingrese el nombre de usuario que va a usar: ");
					nombreC = scan.next();
					prueba = new Cuenta(nombreC);

				} else {
					System.out.println("ERROR. Usted ya creo una cuenta.");
				}
				break;

			case 2:

				if (prueba == null) {

					System.out.println("Creacion de cuenta: ");
					System.out.println("Ingrese el nombre de usuario que va a usar: ");
					nombreC = scan.next();
					System.out.println("Ingrese su saldo: ");
					saldoC = scan.nextDouble();
					prueba = new Cuenta(nombreC, saldoC);

				} else {
					System.out.println("ERROR. Usted ya creo una cuenta.");
				}
				break;

			case 3:
				if (prueba != null) {
					System.out.println("Ingrese el monto que desea cargar a su cuenta: ");
					saldoC = scan.nextDouble();
					prueba.ingresarDinero(saldoC);
				} else {
					System.out.println("ERROR. Usted no tiene una cuenta. Creela antes de proceder.");
				}

				break;

			case 4:

				if (prueba != null) {
					System.out.println("Ingrese el monto a extraer: ");
					saldoC = scan.nextDouble();
					if (saldoC <= prueba.getSaldo()) {
						prueba.retirarDinero(saldoC);
					} else {
						System.out.println("ERROR. No dispone de los fondos para realizar la transaccion.");
					}
				} else {
					System.out.println("ERROR. Usted no tiene una cuenta. Creela antes de proceder.");
				}

				break;

			case 5:

				if (prueba != null) {
					saldoC = prueba.getSaldo();
					System.out.println("El saldo disponible es de: " + saldoC + " pesos.");
				} else {
					System.out.println("ERROR. Usted no tiene una cuenta. Creela antes de proceder.");
				}

				break;

			case 6:
				flag = false;
				break;

			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
		} while (flag == true);
	}
}
