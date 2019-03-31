package guia2;

import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String control = "s";
		int opcion;
		Cuenta miCuenta = null;
		while (control == "s")
		{
			menu();
			opcion = teclado.nextInt();
			switch (opcion)
			{
			case 1:
				if (! comprobarSiExisteCuenta(miCuenta))
					miCuenta = new Cuenta();
				else
					System.out.println("Ya existe cuenta");	
				break;
			case 2:
				if (! comprobarSiExisteCuenta(miCuenta))
				{
					System.out.println("Ingrese saldo inicial: ");
					float saldoInicial;
					saldoInicial = teclado.nextFloat();
					miCuenta = new Cuenta(saldoInicial);
				}
				else
					System.out.println("Ya existe cuenta");	
				break;
			case 3:
				if (comprobarSiExisteCuenta(miCuenta))
				{
					System.out.println("Ingrese cantidad de dinero: ");
					float cantidadDineroAIngresar = 0;
					cantidadDineroAIngresar = teclado.nextFloat();
					miCuenta.ingresar(cantidadDineroAIngresar);	
				}
				else
					System.out.println("No existe cuenta");		
				break;
			case 4:
				if (comprobarSiExisteCuenta(miCuenta))
				{
					System.out.println("Ingrese cantidad de dinero: ");
					float cantidadDineroAExtraer = 0;
					cantidadDineroAExtraer = teclado.nextFloat();
					if (comprobarExtraccion(miCuenta,cantidadDineroAExtraer))
						miCuenta.extraer(cantidadDineroAExtraer);
					else
						System.out.println("Saldo insuficiente");	
				}
				else
					System.out.println("No existe cuenta");	
				break;
			case 5:
				if (comprobarSiExisteCuenta(miCuenta))
					System.out.println("Saldo: $" +miCuenta.retornarSaldo());
				else
					System.out.println("No existe cuenta");	
				break;
			case 6:
				System.out.println("Fin del programa");
				control = "n";
				break;	
			}
			presioneLaTeclaENTERParaContinuar();
		}
		teclado.close();
	}
	
	private static void menu ()
	{
		System.out.println("--------MENU--------\n");
		System.out.println("1. Crear cuenta vacia");
		System.out.println("2. Crear cuenta con saldo inicial");
		System.out.println("3. Ingresar dinero");
		System.out.println("4. Extraer dinero");
		System.out.println("5. Mostrar saldo");
		System.out.println("6. Salir");
		System.out.println("\nIngrese opcion: ");
	}
	
	private static boolean comprobarSiExisteCuenta (Cuenta miCuenta)
	{
		if (miCuenta != null)
			return true;
		else
			return false;
	}
	
	private static boolean comprobarExtraccion (Cuenta miCuenta, float dineroAExtraer)
	{
		if (dineroAExtraer <= miCuenta.retornarSaldo())
			return true;
		else
			return false;
	}
	
	private static void presioneLaTeclaENTERParaContinuar ()
	{
		System.out.println("Presione la tecla ENTER para continuar...");
		try
		{
			System.in.read();
		}
		catch(Exception e)
		{}
	}
}

