package guia2;
import java.util.Scanner;

public class Main {
	public static Cuenta cuenta_cliente1= null; 

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		boolean salir = false;
		int opcion=0; 
		
		while (!salir)
		{
			System.out.println("1. Crear una cuenta vacia.");
			System.out.println("2.Crear cuenta saldo inicial.");
			System.out.println ("Ingresar dinero.");
			System.out.println("4.Sacar dinero.");
			System.out.println("5.Ver saldo.");
			System.out.println("6.Salir");
			System.out.println("Seleccione una opcion:");
			opcion= scan.nextInt();
			
			switch (opcion)
			{
				case 1: 
					if (cuenta_cliente1==null)
					{
						cuenta_cliente1 = new Cuenta();
						System.out.println ("Ingrese su nombre:");
						cuenta_cliente1.setNombre(scan.next());
						System.out.println("Ingrese su apellido:");
						cuenta_cliente1.setApellido(scan.next());
						System.out.println("Ingrese su id:");
						cuenta_cliente1.setIdentificador(scan.nextInt());
					}
					else
					{
						System.out.println("Ya hay una cuenta existente");
					}
					;
				
				case 2:
					if (cuenta_cliente1==null)
					{
						System.out.println("Ingrese su monto inicial:");
						cuenta_cliente1 = new Cuenta(scan.nextFloat());
						System.out.println ("Ingrese su nombre:");
						cuenta_cliente1.setNombre(scan.next());
						System.out.println("Ingrese su apellido:");
						cuenta_cliente1.setApellido(scan.next());
						System.out.println("Ingrese su id:");
						cuenta_cliente1.setIdentificador(scan.nextInt());
					}
					else
					{
						System.out.println("Ya hay una cuenta existente");
					}
					;
					
				case 3:
					if (cuenta_cliente1!=null)
					{
						System.out.println("Ingrese la cantidad de dinero que desea ingresar:");
						cuenta_cliente1.ingresar(scan.nextFloat());
					}
					else
					{
						System.out.println("Aun no se ha creado la cuenta.");
					}
					;
					
				case 4:
					if (cuenta_cliente1!=null)
					{
						System.out.println("Ingrese la cantidad de dinero que desea retirar:");
						cuenta_cliente1.extraer(scan.nextFloat());
					}
					System.out.println("Aun no se ha creado la cuenta.");
					
					;
				case 5:
					if (cuenta_cliente1!=null)
					{
						System.out.println("Su saldo actual es:" +cuenta_cliente1.getSaldo());
					}
					else
					{
						System.out.println("Aun no se ha creado la cuenta.");
					}
					;
				case 6: 
					salir= true;
					;
				default: 
					System.out.println("Solo numeros entre 1 y 5.");
					;
			}
			scan.close ();
		}
		
		
		
	}

}

