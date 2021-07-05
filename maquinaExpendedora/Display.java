package maquinaExpendedora;

import java.util.Scanner;

public class Display {

	private static Scanner scan;

	public static void menu()
	{
		scan = new Scanner (System.in);
		int menu=0;
		int contador=0;
		int edad;
		String nombre;
		
		Cuenta c= new Cuenta();
		
		do{
		System.out.println("\ningrese 1 para crear cuenta vacia");
		System.out.println("ingrese 2 para crear una cuenta con un saldo inicial ");
		System.out.println("ingrese 3 para ingresar dinero ");
		System.out.println("ingrese 4 para extraer dinero");
		System.out.println("ingrese 5 para ver el saldo ");
		System.out.println("ingrese 6 para salir ");
		
		menu=scan.nextInt();
		while((menu==1 || menu==2) && contador>0){

            System.out.print("Cuenta ya creada, ingrese otra opcion: ");
            menu= scan.nextInt();
        }

        while((menu==3 || menu==4 || menu==5) && contador==0){

            System.out.print("Primero cree una cuenta, ingrese opcion 1 o 2: ");
            menu=scan.nextInt();
        }
				
		switch (menu)
		{
		case 1:
		{
			c= new Cuenta();
			System.out.println("ingrese nombre");
			nombre=scan.nextLine();
			
			scan.nextLine();
			c.setNombre(nombre);
			
			System.out.println("ingrese edad");
			edad=scan.nextInt();
			c.setEdad(edad);			
			break;
		}
		case 2:
		{
			float saldoInic=0;
			
			System.out.println("ingrese saldo inicial");
			saldoInic=scan.nextInt();
			c= new Cuenta(saldoInic);
			
			scan.nextLine();
			System.out.println("ingrese nombre");
			nombre=scan.nextLine();
			c.setNombre(nombre);
			
			System.out.println("ingrese edad");
			edad=scan.nextInt();
			c.setEdad(edad);
		
			break;
		}
		case 3:
		{
			float cantidad=0;
			
			System.out.println("ingrese monto ");
			
			cantidad=scan.nextFloat();
			c.ingresar(cantidad);
			break;
		}
		case 4:
		{
			float cantidad;
			cantidad=scan.nextFloat();
			c.extraer(cantidad);
			System.out.println("Extraccion completada");
			break;
		}
		case 5:
		{
			System.out.println("Su saldo es... "+c.getSaldo());
			break;
		}
		case 6:
		{
			System.out.println("Adios!");
		}
		}

		contador++;
	}
		while (menu!=6);
	}

}
