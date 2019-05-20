package e2;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		Cliente miCliente = new Cliente(45, "Gaspar", 'M');
		System.out.println(">Datos del cliente< " + miCliente.retornarDatosCliente());
		Cuenta miCuenta = new Cuenta(1, 10000, miCliente);
		System.out.println("Balance del cliente: $" + miCuenta.getBalance());
		float montoADepositar = 5000;
		System.out.println("Depositando $" + montoADepositar +" ...");
		miCuenta.depositar(montoADepositar);
		System.out.println("Balance del cliente: $" + miCuenta.getBalance());
		float montoAExtraer = 17000;
		System.out.println("Extrayendo $" + montoAExtraer +" ...");
		extraerDinero(montoAExtraer, miCuenta);
		String[] registro = new String[10];
		int i, op;
		float montoRegistro;
		boolean resultado;
		for (i = 0; i < 10; i++)
		{
			System.out.println("________________________________");
			System.out.println("OPERACION: " + (i+1) + "/10 | SALDO: $" + miCuenta.getBalance());
			menu();
			op=teclado.nextInt();
			switch (op)
			{
				case 1:
					System.out.println("Ingrese monto a depositar:");
					montoRegistro = teclado.nextFloat();
					miCuenta.depositar(montoRegistro);
					registro[i] = (i+1) + ". El cliente " + miCuenta.retornarNombreCliente() + " deposito $" + montoRegistro;
				break;
				case 2:
					System.out.println("Ingrese monto a extraer:");
					montoRegistro = teclado.nextFloat();
					resultado = miCuenta.extraer(montoRegistro);
					if (resultado)
						registro[i] = (i+1) + ". El cliente " + miCuenta.retornarNombreCliente() + " retiro $" + montoRegistro;
					else
					{
						System.out.println("No posee saldo suficiente. Balance del cliente: $" + miCuenta.getBalance());
						i--;	
					}
				break;
				default:
					i--;
				break;
			}
		}
		mostrarRegistro(registro);
		teclado.close();
	}
	
	public static void extraerDinero(float montoAExtraer, Cuenta miCuenta)
	{
		if (miCuenta.extraer(montoAExtraer))
			System.out.println("Balance del cliente: $" + miCuenta.getBalance());
		else
			System.out.println("No posee saldo suficiente. Balance del cliente: $" + miCuenta.getBalance());
	}
	
	public static void menu()
	{
		System.out.println("Ingrese:");
		System.out.println("1. Para depositar dinero");
		System.out.println("2. Para extraer dinero");
	}
	
	public static void mostrarRegistro(String [] registro)
	{
		System.out.println("________________________________");
		System.out.println("REGISTRO:");
		int i;
		for (i = 0; i < 10; i++)
		{
			System.out.println(registro[i]);
		}
	}
}
