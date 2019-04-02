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
		int opc = -1;
		Cuenta nueva = new Cuenta();

		while (opc != 6)
		{
			System.out.println("\n\nMenu de opciones Cajero Automatico\n");
			System.out.println(
					"[1] Crear cuenta vacia.\n[2] Crear cuenta saldo inicial.\n[3] Ingresar dinero.\n[4] Sacar dinero.\n[5] Ver saldo.\n[6] Salir.");
			System.out.print("\nIngrese una opcion: ");
			opc = scan.nextInt();
			switch (opc)
			{
			case 1:
				if (nueva.getId() == 0)
				{
					nueva.setId((int) (Math.random() * 9999999) + 1);
					System.out.print("\nID: " + nueva.getId());
					System.out.print("\nTitular: ");
					nueva.setTitular(scan.next());
					System.out.print("DNI: ");
					nueva.setDni(scan.nextLong());
					System.out.print("Direccion: ");
					nueva.setDireccion(scan.next());
					System.out.print("Banco: ");
					nueva.setBanco(scan.next());
					System.out.print("Saldo: $" + nueva.getSaldo());
				} else
				{
					System.out.print("\nError! Ya existe una cuenta creada.");
				}
				try
				{
					Thread.sleep(3000);
				} catch (InterruptedException e)
				{
				}
				break;
			case 2:
				if (nueva.getId() == 0)
				{
					nueva.setId((int) (Math.random() * 9999999) + 1);
					System.out.print("\nID: " + nueva.getId());
					System.out.print("\nTitular: ");
					nueva.setTitular(scan.next());
					System.out.print("DNI: ");
					nueva.setDni(scan.nextLong());
					System.out.print("Direccion: ");
					nueva.setDireccion(scan.next());
					System.out.print("Banco: ");
					nueva.setBanco(scan.next());
					System.out.print("Ingrese el saldo inicial: $");
					nueva.setSaldo(scan.nextFloat());
				} else
				{
					System.out.print("\nError! Ya existe una cuenta creada.");
				}
				try
				{
					Thread.sleep(3000);
				} catch (InterruptedException e)
				{
				}
				break;
			case 3:
				System.out.print("Ingrese el monto de dinero que desea abonar: ");
				nueva.ingresar(scan.nextFloat());
				System.out.print("Saldo actual: $" + nueva.getSaldo());
				try
				{
					Thread.sleep(3000);
				} catch (InterruptedException e)
				{
				}
				break;
			case 4:
				System.out.print("Ingrese el monto de dinero que desea extraer: ");
				nueva.extraer(scan.nextFloat());
				System.out.print("\nSaldo actual: $" + nueva.getSaldo());
				try
				{
					Thread.sleep(3000);
				} catch (InterruptedException e)
				{
				}
				break;
			case 5:
				System.out.print("Su saldo actual es de: $" + nueva.getSaldo());
				try
				{
					Thread.sleep(3000);
				} catch (InterruptedException e)
				{
				}
				break;
			case 6:
				System.out.print("Hasta luego " + nueva.getTitular() + "!");
				break;
			default:
				break;
			}
		}
		scan.close();
	}
}
