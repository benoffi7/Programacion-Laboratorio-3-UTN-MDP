package app;
import java.util.Scanner;
public class Menu {

	static Scanner scan = new Scanner(System.in);
	static int operacion;
	public static Cuenta cuentita;
	
	public static void MostrarMenu() {
		
		System.out.print("\n\n1- Crear cuenta vacía.  ");
		System.out.print("2- Crear cuenta saldo inicial.  ");
		System.out.print("3- Ingresar dinero.  ");
		System.out.print("4- Sacar dinero.  ");
		System.out.print("5- Ver saldo.  ");
		System.out.print("6- Salir.  ");
		
		System.out.print("\n\nEjecutar la operacion: ");
	}
	
	public static void IniciarCuentaVacia() {
		
		cuentita = new Cuenta();
	}
	
	public static void IniciarCuentaCompleta() {
		
		System.out.print("\n\nIngrese nombre: ");
		String nombresito = scan.next(); 		
		System.out.print("Ingrese apellido: ");
		String apellidito = scan.next(); 					
		System.out.print("Ingrese la cantidad a ingresar: ");
		float cantidad = scan.nextFloat();
		cuentita = new Cuenta(nombresito, apellidito, cantidad);	
	}
	
	public static void CargaSaldo() {
		
		IniciarCuentaVacia();
		IniciarCuentaCompleta();
		
		System.out.print("Ingrese la cantidad a cargar: ");
		float cantidad = scan.nextFloat();
		cuentita.Ingresar(cantidad);
	}
	
	public static void ExtraccionSaldo() {
		
		IniciarCuentaVacia();
		IniciarCuentaCompleta();
		
		System.out.print("Ingrese la cantidad a extraer: ");
		float cantidad = scan.nextFloat();
		cuentita.extraer(cantidad);
	}


	public static void MostrarDatos() {
		
		System.out.print("\nNombre: " +cuentita.getNombre());
		System.out.print("\nApellido: " +cuentita.getApellido());
		System.out.print("\nSaldo: " +cuentita.getSaldo());
	}
	
	public static void MostrarDatosEvolucionado() {
		
		System.out.print("\nNombre y Apellido: " +cuentita.getNyA());
		System.out.print("\nSaldo: " +cuentita.getSaldo());
	}
	
	public static void OperarMenu() {
		
		while(operacion != 6)
		{
			if(operacion !=6)
			{
				MostrarMenu();
				operacion = scan.nextInt();
				
				switch(operacion)
				{
					case 1: IniciarCuentaVacia();
					System.out.print("\nSe creo una cuenta vacia.");
							break;
						
					case 2: IniciarCuentaCompleta();
							break;
						
					case 3: CargaSaldo();
							break;
						
					case 4: ExtraccionSaldo(); 
							break;
						
					case 5: //MostrarDatos();
							//System.out.print("\n\nEl saldo es: " +cuentita.getSaldo());
							MostrarDatosEvolucionado();
							break;
						
					case 6: System.out.println("\n\nGuardando la configuracion ...");
							System.out.println("Saliendo del programa ...");
							break;
						
					default: System.out.println("La operacion ingresada NO es valida. Reintente.");
						break;
				}
				
				System.out.flush();
			}
			
			if(operacion == 6)
			{
				System.out.println("\nEl programa ha finalizado con exito.");			
				System.out.flush();
			}
		}		
	}
}