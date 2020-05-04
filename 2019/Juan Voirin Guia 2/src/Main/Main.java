package Main;

import java.util.Scanner;

public class Main
{

	static Scanner scan;
	static Cuenta cajaDeAhorro;
	
	public static void main(String[] args) 
	{
			scan = new Scanner(System.in);
			menu();
			scan.close();
	}		
			
			static void menu()
			{
				System.out.println("1. Crear cuenta vacia.");
				System.out.println("2. Crear cuenta saldo inicial.");
				System.out.println("3. Ingresar dinero.");
				System.out.println("4. Retirar dinero.");
				System.out.println("5. Ver saldo.");
				System.out.println("6. Salir");
				switch(seleccionMenu())
				{
					case 1:
						if(cajaDeAhorro==null)
							cajaDeAhorro = new Cuenta();
						volverMenu();
						break;
					case 2:
						if(cajaDeAhorro==null)
							cajaDeAhorro = new Cuenta(ingresaMontoInicial());
						else System.out.println("Ya hay una cuenta creada.");
						volverMenu();
						break;
					case 3:
						if(cajaDeAhorro!=null)
							cajaDeAhorro.ingresar(ingresaMonto());
						else System.out.println("Cuenta no encontrada, cree una primero.");
						volverMenu();
						break;
					case 4:
						if(cajaDeAhorro!=null)
							extraerDineroCuenta();
						else System.out.println("Cuenta no encontrada, cree una primero.");
						volverMenu();
						break;
					case 5:
						if(cajaDeAhorro!=null)
							System.out.println("El saldo de la cuenta es: " + cajaDeAhorro.getSaldo());
						else
							System.out.println("Cuenta no encontrada, cree una primero.");
						volverMenu();
						break;
					case 6:
						System.out.println("Saliendo....");
						break;
				}
			}
			
			static int seleccionMenu()
			{
				int selec = scan.nextInt();;
				while(selec<1 || selec>6)
				{
					System.out.println("Numero fuera del menu, ingrese otra vez: ");
					selec = scan.nextInt();
				}
				return selec;
			}
			
			static void volverMenu()
			{
				System.out.println("Desea volver al menu?");
				char control = scan.next().charAt(0);
				if(control == 's')
					menu();
			}
			
			static void extraerDineroCuenta()
			{
				float monto = ingresaMonto();
				if(monto > cajaDeAhorro.getSaldo())
					System.out.println("Monto mayor que saldo en cuenta.");
				else
					cajaDeAhorro.extraer(monto);
			}
			
			static float ingresaMontoInicial()
			{
				System.out.println("Ingresar monto inicial: ");
				return scan.nextInt();
			}
			
			static float ingresaMonto()
			{
				System.out.println("Ingresar monto: ");
				return scan.nextInt();
			}
}
