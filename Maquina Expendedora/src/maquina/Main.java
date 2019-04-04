package maquina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Maquina machine = new Maquina();
		int control = 0;
		System.out.println("\nBienvenido!\nInserte un billete para comenzar.");
		System.out.println("                         "
				+ "El boleto actual cuesta $" + machine.getPrecio());
		menu();
		do {
			control = scan.nextInt();
			
			switch (control) {
			case 1: 
				if(machine.getSaldo() == 0) imprimir();
				machine.setSaldo(5);
				System.out.println("|	      - $5 +             |");
				if(machine.check()) 
				{
					imprimir2();
					System.out.println("          Total: $" + machine.getSaldo());
					System.out.println("          Vuelto: $" + machine.cambio() + "\n"
									 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
									 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
					machine.imprimirBoleto();
					menu();
				}

				break;

			case 2:
				if(machine.getSaldo() == 0)
				{
					imprimir();
				}
				machine.setSaldo(10);
				System.out.println("|	      - $10 +            |");
				if(machine.check()) 
				{
					imprimir2();
					System.out.println("          Total: $" + machine.getSaldo());
					System.out.println("          Vuelto: $" + machine.cambio() + "\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
					machine.imprimirBoleto();
					menu();
				}

				break;
			
			case 3:
				if(machine.getSaldo() == 0)
				{
					imprimir();
				}
				machine.setSaldo(20);
				System.out.println("|	      - $20 +            |");
				if(machine.check()) 
				{
					imprimir2();
					System.out.println("          Total: $" + machine.getSaldo());
					System.out.println("          Vuelto: $" + machine.cambio() + "\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
					machine.imprimirBoleto();
					menu();
				}
				
				break;
			
			case 4:
				if(machine.getSaldo() == 0)
				{
					imprimir();
				}
				machine.setSaldo(50);
				System.out.println("|	      - $50 +            |");
				if(machine.check()) 
				{
					imprimir2();
					System.out.println("          Total: $" + machine.getSaldo());
					System.out.println("          Vuelto: $" + machine.cambio() + "\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
					machine.imprimirBoleto();
					menu();
				}

				break;
			
			case 5:
				if(machine.getSaldo() == 0)
				{
					imprimir();
				}
				machine.setSaldo(100);
				System.out.println("|	      - $100 +           |");
				if(machine.check()) 
				{
					imprimir2();
					System.out.println("          Total: $" + machine.getSaldo());
					System.out.println("          Vuelto: $" + machine.cambio() + "\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
							 + "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
					machine.imprimirBoleto();
					menu();
				}
				break;
				
			case 6:
				System.out.println("\n\nIngrese el nuevo importe del boleto: ");
				float importe = scan.nextFloat();
						if (machine.setPrecio(importe))
						{
							System.out.println("El boleto ahora cuesta $\n" + machine.getPrecio());
						}
						else System.out.println("Error! Importe no valido.\n");
					menu();
					System.out.println("                         "
							+ "El boleto actual cuesta $" + machine.getPrecio());
				break;
				
			case 7:
				System.out.println("\n\nEl total de ingresos es: $" 
						+ machine.getTotal()
						+ "\nTotal de boletos vendidos: " + machine.getBoletos());	
				menu();
				break;
			
			case 8:
				System.out.println("\n\nSe extraera el total de: $ " + machine.getTotal()
									+ ". Desea continuar? s/n");
				char quest = scan.next().charAt(0);
				if (quest == 's')
				{
					machine.retirarDinero();
					System.out.println("\nEl dinero fue retirado. El saldo ahora es de: $ " 
									+ machine.getTotal());
				}
				else System.out.println("\nEl dinero no fue retirado.");
				menu();
			}
		} while (control <= 8 && control > 0);
		scan.close();
	}
	
	private static void menu()
	{
		System.out.println("\n1. $5" + "\n2. $10" 
				+ "\n3. $20" + "\n4. $50" 
				+ "\n5. $100"
				+ "\n6. Modificar importe del boleto."
				+ "\n7. Total de ventas."
				+ "\n8. Vaciar Caja.");
	}
	
	private static void imprimir()
	{
		System.out.println("\n\n\n|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
						 + "|~~~~~~~~~~~~~TICKET~~~~~~~~~~~~~|\n"
						 + "|                                |\n"
						 + "|      Importes:                 |");
	}
	
	private static void imprimir2()
	{
		System.out.println("\n|~~~~~~~~~Total y Vuelto~~~~~~~~~|\n"
						   + "|                                |");
	}
}
