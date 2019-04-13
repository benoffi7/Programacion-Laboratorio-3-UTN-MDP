package ejercicio;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String control = "s", boleto;
		int opcion, opcionAdmin;
		float cantidadDineroAIngresar, nuevoPrecioBoleto;
		MaquinaExpendedora miMaquinaExpendedora = new MaquinaExpendedora(100, 10, 10); //(float limiteRecaudacion, float precioBoleto, int limiteBoletos)
		while (control == "s")
		{
			menu(miMaquinaExpendedora);
			opcion = teclado.nextInt();
			switch(opcion)
			{
				case 1:
					System.out.println("Cantidad de dinero a ingresar ($): ");
					cantidadDineroAIngresar = teclado.nextFloat();
					Cliente miCliente = new Cliente(cantidadDineroAIngresar);
					boleto = miMaquinaExpendedora.imprimirBoleto(miCliente.getDineroAIngresar());
					miCliente.ingresarVuelto(miMaquinaExpendedora.retornarVuelto());
					System.out.println(boleto);
					break;
				case 2:
					menuAdmin(miMaquinaExpendedora);
					opcionAdmin = teclado.nextInt();
					switch (opcionAdmin)
					{
					case 1:
						System.out.println("Ingrese el precio del boleto: ");
						nuevoPrecioBoleto = teclado.nextFloat();
						miMaquinaExpendedora.setPrecioBoleto(nuevoPrecioBoleto);
						break;
					case 2:
						miMaquinaExpendedora.vaciar();
						break;
					}
					break;
				case 3:
					control = "n";
					System.out.println("Fin del programa");
					break;
			}
			presioneLaTeclaENTERParaContinuar();
		}
		teclado.close();
	}
	
	public static void menu(MaquinaExpendedora miMaquinaExpendedora)
	{
		System.out.println(" -----------------------------------------------------");
		System.out.println("|              >>>MAQUINA EXPENDEDORA<<<");
		System.out.println("|Precio boleto: $" + miMaquinaExpendedora.getPrecioBoleto());
		System.out.println("|1. Comprar boleto");
		System.out.println("|2. Modo administrador");
		System.out.println("|3. Salir");
		System.out.println(" -----------------------------------------------------");
		System.out.println("Ingrese opcion: ");
	}
		
	public static void menuAdmin(MaquinaExpendedora miMaquinaExpendedora)
	{
		System.out.println(" -----------------------------------------------------");
		System.out.println("|              >>>Modo administrador<<<");
		System.out.println("|" + miMaquinaExpendedora.retornarDatosMaquina());
		System.out.println("|1. Cambiar precio del boleto");
		System.out.println("|2. Vaciar todo el dinero de la maquina");
		System.out.println("|Otro numero para volver al menu");
		System.out.println(" -----------------------------------------------------");
		System.out.println("\nIngrese opcion: ");
	}
	
	public static void presioneLaTeclaENTERParaContinuar()
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