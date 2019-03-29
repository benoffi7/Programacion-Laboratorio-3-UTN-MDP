package guia2;

import java.util.Scanner;

public class Main {
	public static Cuenta cuenta=null;
	public static void main(String[] args) {
		float transaccion=0;
		int opcion;
		Scanner leer = new Scanner(System.in);
		
		do{
			if (cuenta==null) {
				System.out.println("Bienvenido! elija una opcion:\n 1.Crear cuenta vacia\n 2.Crear cuenta con saldo inicial\n 3.Ingresar saldo\n 4.Sacar dinero\n 5.Ver saldo\n 6.Salir");
			}else{
				System.out.println("Bienvenido "+cuenta.getNombre()+"! elija una opcion:\n 1.Crear cuenta vacia\n 2.Crear cuenta con saldo inicial\n 3.Ingresar saldo\n 4.Sacar dinero\n 5.Ver saldo\n 6.Salir");
			}
			opcion = leer.nextInt();
			
			switch (opcion){
			
			case 1:
				if (cuenta==null){
					System.out.println("Ingrese su nombre, luego apellido, luego su dni");
					cuenta = new Cuenta();
					cuenta.setNombre(leer.next());
					cuenta.setApellido(leer.next());
					cuenta.setIdentificador(leer.nextInt());
				}else{
					System.out.println("Error: Cuenta ya existente\n\n");
				}
			break;
			
			case 2:
				if (cuenta==null){
					System.out.println("Ingrese su saldo inciial, luego su nombre, luego apellido, luego su dni");
					cuenta = new Cuenta(leer.nextFloat());
					cuenta.setNombre(leer.next());
					cuenta.setApellido(leer.next());
					cuenta.setIdentificador(leer.nextInt());
				}else{
					System.out.println("Error: Cuenta ya existente\n\n");
				}
			break;
				
			case 3:
				if (cuenta!=null){
					System.out.println("Ingrese cuanto dinero desea ingresar");
					transaccion = leer.nextFloat();
					cuenta.ingresar(transaccion);
				}else{
					System.out.println("Error: Cuenta aun no creada\n\n");
				}
			break;
			
			case 4:
				if (cuenta!=null){
					System.out.println("Ingrese cuanto dinero desea ingresar");
					transaccion = leer.nextFloat();
					if (cuenta.VerificarExtraccion(transaccion)) {
						System.out.println("El importe a extraer excede el monto de su cuenta. Se extraera en cambio el monto restante de su cuenta");
						cuenta.extaer(cuenta.getSaldo());
					}else {
						cuenta.extaer(transaccion);
					}
				}else{
						System.out.println("Error: Cuenta aun no creada\n\n");
				}
			break;
			
			case 5:
				if (cuenta!=null){
					System.out.println("Su saldo actual es de: "+ String.format("%.2f", cuenta.getSaldo()));
					}else{
						System.out.println("Error: Cuenta aun no creada\n\n");
					}
			break;
			
			case 6:
				System.out.println("Gracias por usar nuestro servicio!\n\n");
			break;
			
			default:
				System.out.println("error: Opcion invalida\n\n");
			break;
			}
		}while (opcion!=6);
		leer.close();
	}

	
}
