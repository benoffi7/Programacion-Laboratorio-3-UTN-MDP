package guiaNumero2;
import java.util.Scanner;

public class Menu {
	
	static Scanner scan;
	static int opcion;
	public static Cuenta cuentaN = null;
	
	public static void menu()
	{
		System.out.print("\n1.Crear cuenta vacia\n");
		System.out.print("2.Crear cuenta saldo inicial\n");
		System.out.print("3.Ingresar dinero\n");
		System.out.print("4.Sacar dinero\n");
		System.out.print("5.Ver dinero\n");
		System.out.print("6.Salir\n");
	}
	
	public static int ingresarOpcion()
	{
	scan = new Scanner(System.in);
	System.out.print("\nIngrese una opcion: ");
	opcion = scan.nextInt();
	return opcion;
	}

	public static void iniciarPrograma() throws Exception
	{
		menu();
		opcion = ingresarOpcion();
		switch(opcion)
		{
		case 1:
			if(cuentaN == null) 
			{
			    System.out.print("Ingrese nombre de cuenta: ");
			    cuentaN = new Cuenta(scan.next());
			}else{
			    System.out.print("La cuenta ya ha sido creada");
			    Thread.sleep(5000);
			}
		    iniciarPrograma();
			break;
		case 2:
			if(cuentaN == null)
			{
		        cuentaN = new Cuenta();
			    System.out.print("Ingrese nombre de cuenta: ");
			    cuentaN.setNombre(scan.next());
			    System.out.print("Ingrese saldo de la cuenta: ");
			    cuentaN.setSaldo(scan.nextFloat());
			}else {
				System.out.print("La cuenta ya ha sido creada");
				Thread.sleep(5000);
			}
		    iniciarPrograma();
			break;
		case 3:
			if(cuentaN != null)
			{
			    System.out.print("Ingrese la cantidad de dinero a depositar: ");
			    cuentaN.setMovimientos(scan.nextFloat());
			    cuentaN.ingresar(cuentaN.getMovimientos());
			}else {
				System.out.print("La cuenta no ha sido creada");
				Thread.sleep(5000);
			}
			 iniciarPrograma();
			break;
		case 4:
			if(cuentaN != null)
			{
			    System.out.print("Ingrese la cantidad de dinero a retirar: ");
			    cuentaN.setMovimientos(scan.nextFloat());
			    cuentaN.extraer(cuentaN.getMovimientos());
			}else {
				System.out.print("La cuenta no ha sido creada");
				Thread.sleep(5000);
			}
			 iniciarPrograma();
			break;
		case 5:
			System.out.print("\nCuenta : "+cuentaN.getNombre());
			System.out.print("\nSu saldo es de: $"+cuentaN.getSaldo());
		    Thread.sleep(5000);
			 iniciarPrograma();
			break;
		case 6:
			System.exit(0);
			break;
		}
	}

}
