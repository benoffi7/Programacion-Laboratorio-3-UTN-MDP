package cajero;

import java.util.Scanner;

public class Main {

	static Scanner scan;
	static Cuenta cuenta;
	
	public static void main(String[] args) {
		int seleccion;
		System.out.println("Bienvenido");
		showmenu();
		do {
		scan = new Scanner(System.in);
		seleccion = scan.nextInt();
		
			switch (seleccion) {
			case 1:
					crearCuentavacia();
					showbienvenido();
					showmenuCuenta();
					break;
	
			case 2:
				crearCuentaSaldo();
				showbienvenido();
				showmenuCuenta();
				break;
				
			case 3:
				ingresarDinero();
				showmenuCuenta();
				break;
				
			case 4:
				sacarDinero();
				showmenuCuenta();
				break;
				
			case 5:
				mostrarSaldo();
				showmenuCuenta();
				break;
			
			case 6:
				System.exit(1);
			}	


		} while (seleccion <= 6 && seleccion > 0);
		
		scan.close();
	}
	
	private static void showbienvenido()
	{
		System.out.println("\n\nBienvenido" + 
				" " + 
				cuenta.getNombre() + 
				", " + 
				"puede realizar las siguientes operaciones.");
	}
	
	private static void showmenu()
	{
		System.out.println("\n\n1. Crear cuenta vacía\r\n" + 
				"2. Crear cuenta saldo inicial\r\n" + 
				"3. Ingresar dinero\r\n" + 
				"4. Sacar dinero\r\n" + 
				"5. Ver saldo\r\n" + 
				"6. Salir\r\n" + 
				"");
		System.out.println("Ingrese una opcion: ");
	}
	
	private static void showmenuCuenta()
	{
		System.out.println("\n\n3. Ingresar dinero\r\n" + 
				"4. Sacar dinero\r\n" + 
				"5. Ver saldo\r\n" + 
				"6. Salir\r\n" + 
				"");
		System.out.println("Ingrese una opcion: ");
	}
	
	private static void crearCuentavacia()
	{
		System.out.println("\nIngrese un nombre para su cuenta: ");
		String nombre = scan.next();
		if (cuenta == null)
		{
			cuenta = new Cuenta(nombre);			
		}
	}
	
	private static void crearCuentaSaldo()
	{
		System.out.println("\nIngrese un nombre para su cuenta: ");
		String nombre = scan.next();
		if (cuenta == null)
		{
			cuenta = new Cuenta(nombre);
			cuenta.setSaldoinicial();
		}
	}
	
	private static void ingresarDinero()
	{
		System.out.println("\n\nCuanto dinero desea ingresar?: ");
		float dinero = scan.nextFloat();
		cuenta.ingresar(dinero);
		System.out.println("Dinero Ingresado con exito!");
	}
	
	private static void mostrarSaldo()
	{
		System.out.println("El saldo de su cuenta es: " + cuenta.getSaldo());
	}
	
	private static void sacarDinero()
	{
		System.out.println("\n\nCuanto dinero desea retirar?: ");
		float dinero = scan.nextFloat();
		if (cuenta.checkExtraccion(dinero))
		{
			cuenta.extraer(dinero);
			System.out.println("Dinero extraido con exito!");
		}
		else
		{
			System.out.println("Ups! No puedes retirar esa cantidad.");
		}
		
	}

}
