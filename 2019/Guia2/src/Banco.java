import java.util.Scanner;

public class Banco {
	private Cuenta c;

	private static Scanner teclado = new Scanner(System.in);
	
	public void iniciar() {
		int opcion;
				
		do {
			
			imprimirMenu();
			opcion = leerOpcionTeclado();
			limpiar();
			switch (opcion) {
				case 1:
					if(c == null) {						
						crearCuentaVacia();
					}else {
						estadoCuenta(c);
					}
					break;
				
				case 2:
					if(c == null) {						
						crearCuentaConSaldo();
					}else {
						estadoCuenta(c);
					}
					break;
				
				case 3:
					if(c != null) {
						ingresarDinero();
					}else {
						estadoCuenta(c);
					}
					break;
					
				case 4:
					if(c != null) {
						sacarDinero();
					}else {
						estadoCuenta(c);
					}
					break;
				case 5:
					if(c != null) {
						verSaldo();
					}else {
						estadoCuenta(c);
					}
					break;
				
				case 6:
					break;
			}
			
		} while (opcion != 6);
		teclado.close();
	}

	/**
	 * Imprime un mensaje correspondiente a si la cuenta ya ha sido creada
	 * @param c
	 */
	private void estadoCuenta(Cuenta c) {
		if (c != null) {
			System.out.println("Ya hay una cuenta creada");			
		}else {
			System.out.println("No hay una cuenta creada");
		}			
	}
	
	/**
	 * Imprime los mensajes:
	 * 1. Crear cuenta vacía
	 * 2. Crear cuenta saldo inicial
	 * 3. Ingresar dinero
	 * 4. Sacar dinero
	 * 5. Ver saldo
	 * 6. Salir
	 * 
	 */
	private void imprimirMenu() {
		System.out.println("1. Crear cuenta vacía");
		System.out.println("2. Crear cuenta saldo inicial");
		if (c != null)
			System.out.println("3. Ingresar dinero");
		if (c != null)
			System.out.println("4. Sacar dinero");
		if (c != null)
			System.out.println("5. Ver saldo");
		System.out.println("6. Salir");
		System.out.println("Ingrese un numero");
	}

	private void limpiar() {
		for (int i = 0; i<15;i++)
			System.out.println();
	}
	
	/**
	 * Devuelve un numero entero
	 * 
	 * @return
	 */
	private int leerOpcionTeclado() {
		int num = teclado.nextInt();
		return num;
	}
	
	
	/**
	 * Crea un objeto Cuenta con saldo 0
	 */
	private void crearCuentaVacia() {
		int numero;
		String nombre;
				
		System.out.println("Ingrese numero de la cuenta");
		numero = teclado.nextInt();

		while(numero <= 0) {
			System.out.println("Ingrese un numero mayor a 0");
			numero = teclado.nextInt();
		}
		
		System.out.println("Ingrese nombre del titular de la cuenta");
		nombre = teclado.next();
		
		c = new Cuenta(numero,nombre,0f);
	}
	
	/**
	 * Crea un objeto Cuenta con un saldo inicial 
	 * @param saldoInicial
	 */
	private void crearCuentaConSaldo() {
		int numero;
		String nombre;
		float saldoInicial;
		
		System.out.println("Ingrese numero de la cuenta");
		numero = teclado.nextInt();
		
		while(numero <= 0) {
			System.out.println("Ingrese un numero mayor a 0");
			numero = teclado.nextInt();
		}
		
		System.out.println("Ingrese nombre del titular de la cuenta");
		nombre = teclado.next();
		
		System.out.println("Ingrese el saldo inicial de la cuenta");
		saldoInicial= teclado.nextFloat();
		
		c = new Cuenta(numero,nombre,saldoInicial);
	}
	
		
	/**
	 * Ingresa dinero en una cuenta ya creada 
	 */
	private void ingresarDinero() {
		float monto;
		
		System.out.println("Ingrese el monto de dinero que ingresara");
		monto = teclado.nextFloat();
		
		while (monto < 0) {
			System.out.println("Ingrese un valor mayor a 0");
			monto = teclado.nextFloat();
		}
		
		c.ingresar(monto);
		System.out.println("Se ha ingresado el dinero");
	}
	
	/**
	 * Extrae dinero de una cuenta ya creada
	 */
	private void sacarDinero() {
		float monto;
		
		System.out.println("Ingrese el monto de dinero que extraera");
		monto = teclado.nextFloat();
		
		while ( (c.getSaldo() - monto) < 0 ) {
			System.out.println("El monto ingresado superado el saldo que hay en la cuenta");
			System.out.println("Ingrese un monto menor o 0");
			monto = teclado.nextFloat();
		}
		
		c.extraer(monto);
		System.out.println("Se ha extraido el dinero");
	}
	
	/**
	 * Muestra el saldo de la cuenta creada
	 */
	private void verSaldo() {
		System.out.println("Numero de la cuenta #"+ c.getNroCuenta());
		System.out.println("Titular de la cuenta: "+ c.getNombreUsuario());		
		System.out.println("Saldo: $" +c.getSaldo());
	}
}
