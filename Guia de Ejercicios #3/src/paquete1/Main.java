package paquete1;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		menu();
	}

	public static void menu()
	{
		Scanner scan = new Scanner(System.in);
		int opc = 0;
		MaqExpe maquina = new MaqExpe();
		String control = "Si";
		boolean unlock = false;

		while (opc != 3)
		{
			unlock=maquina.corroborarRecaudacion();
			if(unlock==true)
			{
				System.out.println("SISTEMA CERRADO! Fondos insuficientes.");
				break;
			}
			unlock=false;
			System.out.println("------>>>Maquina Expendedora<<<-------");
			System.out.println("\n[1]Consultar | [2]Comprar | [3]Salir\n");
			System.out.print("Opcion: ");
			opc = scan.nextInt();
			switch (opc)
			{
			case 1:
				System.out.println("___________________________________________________\n");
				unlock = maquina.corroborarCantidadDeBoletos();
				if (unlock == true)
				{
					System.out.println("Hay boletos disponibles para su compra");
				} else
				{
					System.out.println("Lo lamento, se han agotado los boletos disponibles para la venta");
				}
				unlock = false;
				System.out.println("Precio boleto: $" + maquina.getPrecio());
				System.out.println("___________________________________________________\n\n");
				try
				{
					Thread.sleep(5000);
				} catch (InterruptedException e)
				{
				}
				break;
			case 2:
				while (control.equalsIgnoreCase("Si"))
				{
					unlock=maquina.corroborarRecaudacion();
					if(unlock==true)
					{
						break;
					}
					unlock=false;
					unlock = maquina.corroborarCantidadDeBoletos();
					if (unlock == false)
					{
						System.out.println("Lo lamento, se han agotado los boletos disponibles para la venta");
						try
						{
							Thread.sleep(5000);
						} catch (InterruptedException e)
						{
						}
						break;
					} 
					do
					{
						System.out.println("___________________________________________________\n");
						System.out.print("Ingrese dinero: $");
						maquina.ingresarDinero(scan.nextInt());
						unlock = maquina.corroborarDinero();
					} while (unlock == false);
					unlock = false;
					maquina.darVuelto();
					System.out.println("Su vuelto es de: $" + maquina.getVuelto());
					maquina.efectuarUnaCompra();
					maquina.imprimirBoleto();
					System.out.print("\nDesea continuar?(Si/No): ");
					control = scan.next();
					System.out.println("___________________________________________________\n");
				}
				break;
			case 3:
				System.out.println("Hasta luego!\n");
				break;
			default:
				menu();
				break;
			}
		}
		scan.close();
	}
}
