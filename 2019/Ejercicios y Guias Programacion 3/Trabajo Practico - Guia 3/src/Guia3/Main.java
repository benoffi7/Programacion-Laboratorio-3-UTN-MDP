package Guia3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombreYApellidoCliente,generoCliente;
		String control = "s",control2="s",control3="s",control4="s";
		String muestraMiAutor = null, muestraMiLibro=null,NombreLibro="Effective Java";
		float idCliente,saldoCuenta,dineroAExtraer;
		int op2,opcion,op3,op4;
		Autor miAutor = new Autor("Joshua","Bloch","Joshua@email.com","M");
		//String titulo/ float precio/ int stock /string autor
		Libro miLibro = new Libro("Effective Java",450,150,miAutor);
		//
		Cliente miCliente=null;
		//
		Cuenta	miCuenta=new Cuenta(1,10000,miCliente);;
		while (control == "s")
		{
			menuPrincipal();
			opcion=teclado.nextInt();
			switch(opcion)
			{
			case 1:
				while (control2=="s")
				{
					menuLibro();
					op2=teclado.nextInt();
					switch(op2)
					{
					case 1:
						muestraMiAutor=miAutor.toString();
						System.out.println(""+muestraMiAutor);
						break;
					case 2:
						mostrarLibro(miLibro);
						break;
					case 3:
						if(miLibro.retornoTitulo()==NombreLibro)
						{
							modificarPrecioYStockDeLibro(500,50,miLibro);
							mostrarLibro(miLibro);
						}
						break;
					case 4:
						if(miLibro.retornoTitulo()==NombreLibro)
							muestraMiAutor=miLibro.retornoAutor().toString();
							System.out.println(""+muestraMiAutor);
						break;
					case 5:
						muestraMiLibro=miLibro.toString();
						System.out.println(""+muestraMiLibro);
						break;
					case 6:
						control2 = "n";
						control3="s";
						break;
					}
					presioneLaTeclaENTERParaContinuar();
				}
			case 2:
				while (control3=="s")
				{
					menuCuentaBancaria();
					op3=teclado.nextInt();
					switch(op3)
					{
					case 1:
						System.out.println("Ingrese el Id del cliente: ");
						idCliente=teclado.nextFloat();
						System.out.println("Ingrese el nombre y apellido del cliente: ");
						nombreYApellidoCliente=teclado.next();
						teclado.nextLine();
						System.out.println("Ingrese el género del cliente: ");
						generoCliente=teclado.nextLine();
						miCliente=new Cliente(idCliente,nombreYApellidoCliente,generoCliente);
						mostrarCliente(miCliente);
						break;
					case 2:
						System.out.println("Ingrese el Id del cliente: ");
						idCliente=teclado.nextFloat();
						System.out.println("Ingrese el nombre y apellido del cliente: ");
						nombreYApellidoCliente=teclado.next();
						teclado.nextLine();
						System.out.println("Ingrese el género del cliente: ");
						generoCliente=teclado.next();
						miCliente=new Cliente(idCliente,nombreYApellidoCliente,generoCliente);
						////
						//idCuenta/Saldo/Cliente
						miCuenta=new Cuenta(1,10000,miCliente);
						mostrarCuenta(miCuenta);
						break;
					case 3:
						while(control4=="s")
						{
							menuOperaciones();
							op4=teclado.nextInt();
							switch(op4)
							{
							case 1:
								System.out.println("Ingrese el dinero a depositar: ");
								saldoCuenta=teclado.nextFloat();
								miCuenta.depositar(saldoCuenta);
								mostrarCuenta(miCuenta);
								break;
							case 2:
								System.out.println("Ingrese el dinero a extraer: ");
								dineroAExtraer=teclado.nextFloat();
								if (miCuenta.verificarDineroSuficiente(dineroAExtraer))
								{
									miCuenta.extraer(dineroAExtraer);
									mostrarCuenta(miCuenta);
								}
								else
									System.out.println("ERROR: La cuenta no posee saldo suficiente. ");

								break;
							case 3:
								control4="n";
								break;
							}
							presioneLaTeclaENTERParaContinuar();
						}
						break;
					case 4:
						break;
					case 5:
						control3 = "n";
						control2 = "s";
						break;
					}
					presioneLaTeclaENTERParaContinuar();
				}
				break;
			case 3: 
				control= "n";
				break;
			}
		}
		teclado.close();
	}
	
	private static void menuPrincipal()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Ejercicios de Libro");
		System.out.println("2 - Ejercicios de Cuenta Bancaria");
	}
	private static void menuLibro()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Inicializar e imprimir por pantalla un Autor");
		System.out.println("2 - Inicializar e imprimir por pantalla un Libro");
		System.out.println("3 - Modificar y aumentar el precio y las copias de un libro");
		System.out.println("4 - Imprimir por pantalla atributos de Joshua Bloch");
		System.out.println("5 - Mostrar Datos de Libro");
		System.out.println("6 - Salir.");
		
	}
	private static void menuCuentaBancaria()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Inicializar e imprimir por pantalla un Cliente");
		System.out.println("2 - Crear Cuenta Bancaria y imprimirla por pantalla");
		System.out.println("3 - Realizar operaciones de depósito y extracción de dinero");
	}
	
	private static void menuOperaciones()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Realizar depósito.");
		System.out.println("2 - Realizar extracción.");
		System.out.println("3 - Salir.");
	}
	
	private static void mostrarLibro(Libro miLibro)
	{
		System.out.println("Titulo: "+miLibro.retornoTitulo()+" || "+"Precio: $"+miLibro.retornoPrecio()+" || "+"Stock: "+miLibro.retornoStock()+" || "+"Autor: "+miLibro.retornoAutor().retornoNombre()+" "+miLibro.retornoAutor().retornoApellido());
	}
	
	public static void modificarPrecioYStockDeLibro(float precio, int stock, Libro miLibro)
	{
		miLibro.igualarPrecio(precio);//Funcion que utiliza set
		miLibro.igualarStock(stock+miLibro.retornoStock());//Funcion que utiliza set
	}
	
	private static void presioneLaTeclaENTERParaContinuar ()
	{
		System.out.println("Presione la tecla ENTER para continuar...");
		try
		{
			System.in.read();
		}
		catch(Exception e)
		{}
	}
	
	private static void mostrarCliente(Cliente miCliente)
	{
		System.out.println("Id cliente:"+miCliente.retornoId()+" || "+"Genero cliente: "+miCliente.retornoGenero()+" || "+"Nombre y Apellido cliente: "+miCliente.retornoNombreYApellido());
	}
	
	private static void mostrarCuenta(Cuenta miCuenta)
	{
		System.out.println("Id cuenta:"+miCuenta.retornoId()+" || "+"saldo cuenta: $"+miCuenta.retornoSaldo()+" || "+"Cliente asociado a la cuenta:"+miCuenta.miCliente.retornoNombreYApellido());
	}
	
}
