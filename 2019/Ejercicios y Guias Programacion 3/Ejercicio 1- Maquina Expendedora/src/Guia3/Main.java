package Guia3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String control = "s";
		int opcion;
		float cantidadDineroAIngresar,dineroFinal;
		MaquinaExpendedora miMaquinaExpendedora = new MaquinaExpendedora(30,10,5); //(float limiteRecaudacion, float precioBoleto, int limiteBoletos)
		while (control == "s")
		{
			menu(miMaquinaExpendedora);
			opcion=teclado.nextInt();
			switch(opcion)
			{
				case 1:
					System.out.println("Ingrese cantidad de dinero a ingresar: ");
					cantidadDineroAIngresar=teclado.nextFloat();
					Cliente miCliente = new Cliente(cantidadDineroAIngresar);
					if (comprobarBoletosSuficientes(miMaquinaExpendedora) && comprobarRecaudacion(miMaquinaExpendedora) && comprobarDineroSuficiente(miCliente,miMaquinaExpendedora))
					{
						dineroFinal=miMaquinaExpendedora.comprarBoleto(miCliente.retornarDineroFinal());
						miCliente.ingresarDineroFinal(dineroFinal);
						System.out.println("|| Boleto comprado. Vuelto = $" + miCliente.retornarDineroFinal() + " ||");
					}
					else
					{
						System.out.println("Fallo en la compra");
					}
					break;
				case 2:
					System.out.println(miMaquinaExpendedora.retornarDatosMaquina());
					break;
				case 3:
					control = "n";
					System.out.println("Fin del programa");
					System.out.println("________________________________________________________\n");
					break;
			}
			presioneLaTeclaENTERParaContinuar();
		}
		teclado.close();
	}
	
	public static void menu (MaquinaExpendedora miMaquinaExpendedora)
	{
		System.out.println("________________________________________________________\n");
		System.out.println("           >>>MENU MAQUINA EXPENDEDORA<<<\n");
		System.out.println("Precio boleto: $" + miMaquinaExpendedora.retornarPrecioBoleto());
		System.out.println("\n1. Comprar boleto");
		System.out.println("2. MENU ADMIN");
		System.out.println("3. Salir");
		System.out.println("\nIngrese opcion: ");
	}
	
	public static boolean comprobarBoletosSuficientes (MaquinaExpendedora miMaquinaExpendedora)
	{
		boolean bandera;
		if (miMaquinaExpendedora.retornarCantidadBoletos() < miMaquinaExpendedora.retornarLimiteBoletos())
			bandera=true;
		else
			bandera=false;
		return bandera;
	}
	
	public static boolean comprobarRecaudacion (MaquinaExpendedora miMaquinaExpendedora)
	{
		boolean bandera;
		if ((miMaquinaExpendedora.retornarRecaudacion() + miMaquinaExpendedora.retornarPrecioBoleto()) <= miMaquinaExpendedora.retornarLimiteRecaudacion())
			bandera=true;
		else
			bandera=false;
		return bandera;
	}
	
	public static boolean comprobarDineroSuficiente (Cliente miCliente, MaquinaExpendedora miMaquinaExpendedora)
	{
		boolean bandera;
		if (miCliente.retornarDineroAIngresar() >= miMaquinaExpendedora.retornarPrecioBoleto() && (miCliente.retornarDineroAIngresar()-miMaquinaExpendedora.retornarPrecioBoleto()) <= miMaquinaExpendedora.retornarRecaudacion())
			bandera=true;
		else
			bandera=false;
		return bandera;
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

 
