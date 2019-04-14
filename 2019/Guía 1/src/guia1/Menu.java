package guia1;

import java.util.Scanner;

public class Menu
{
	public static void main(String[] args)
	{		
		System.out.println("\n>>> EJERCICIO 1 <<<\n");
		float promedio1 = promedioArregloYaInicializado();
		System.out.println("El promedio es " + promedio1);
		float promedio2 = promedioArregloPorTeclado();
		System.out.println("El promedio es " + promedio2);
				
		System.out.println("\n>>> EJERCICIO 2 <<<\n");
		int numeroEjercicio2 = 5;
		numeroPar(numeroEjercicio2);
		
		System.out.println("\n>>> EJERCICIO 3 <<<\n");
		mostrarPrimeros100Primos();
		
		System.out.println("\n>>> EJERCICIO 4 <<<\n");
		int n = 5;
		mostrarPrimerosNPrimos(n);
		
		System.out.println("\n>>> EJERCICIO 6 <<<\n"); //No hay ejer. 5
		revisarSiEsPrimo();
		
		System.out.println("\n>>> EJERCICIO 7 <<<\n");
		int suma;
		suma = sumaPrimeros10NumerosNaturales();
		System.out.println("La suma de los primeros 10 números naturales es: " + suma);
		
		System.out.println("\n>>> EJERCICIO 8 <<<\n");
		int numerosPositivos;
		numerosPositivos = numerosPositivosIngresados();
		System.out.println("El usuario ingresó " + numerosPositivos + " número/s positivo/s");
		
		System.out.println("\n>>> EJERCICIO 9 <<<\n");
		int anio = 2012;
		boolean bisiesto;
		bisiesto = revisarAnioBisiesto(anio);
		if (bisiesto)
			System.out.println("El año " + anio + " es bisiesto");
		else
			System.out.println("El año " + anio + " NO es bisiesto");
		
		System.out.println("\n>>> EJERCICIO 10 <<<\n");
		char caracter = 'G';
		encontrarYMostrarValorASCII(caracter);
		
		System.out.println("\n>>> EJERCICIO 11 <<<\n");
		int numero1 = 5, numero2 = 7, producto;
		producto = multiplicarDosNumeros(numero1, numero2);
		System.out.println("El producto de la multiplicacion de " + numero1 + "x" + numero2 + " es " + producto);
		
		System.out.println("\n>>> EJERCICIO 12 <<<\n");
		calcularArea();
		
		System.out.println("\n>>> EJERCICIO 15 <<<\n");
		buenosDias();
		
		System.out.println("\n>>> EJERCICIO 14 <<<\n");
		obtenerDobleYTripleNumeroIn();
		
		System.out.println("\n>>> EJERCICIO 15 <<<\n");
		leerYPasarCenAFar();

		System.out.println("\n>>> EJERCICIO 16 <<<\n");
		leerRadioCircunfYCalcularLongitudYArea();

		System.out.println("\n>>> EJERCICIO 17 <<<\n");
		leerYPasarVelocidad();
			
		System.out.println("\n>>> EJERCICIO 18 <<<\n");
		calcularHipotenusa();
		
		System.out.println("\n>>> EJERCICIO 19 <<<\n");
		calculoMaxMinPromTemperaturasMes();
		
		System.out.println("\n>>> EJERCICIO 20 <<<\n");
		generarNumerosAleatorios();
		
		System.out.println("\n\n>>> EJERCICIO 21 <<<\n");
		diaLaboral();
		
		System.out.println("\n>>> EJERCICIO 22 <<<\n");
		cifrasNumeroEnteroPositivo();
		
		System.out.println("\n>>> EJERCICIO 23 <<<\n");
		calculadoraPolacaInversaApp ();
		
		System.out.println("\n>>> EJERCICIO 23 (24) <<<\n");
		mostrarSalario();
	}

	//EJERCICIO 1
	
	public static float promedioArregloYaInicializado()
	{
		int arreglo [] = {1, 2, 3, 4, 5}, i = 0, acumulador = 0;
		float promedio = 0;
		for (i = 0; i < 5; i++)
		{
			acumulador = acumulador + arreglo[i];
		}
		promedio = acumulador / 5;
		return promedio;
	}
	
	public static float promedioArregloPorTeclado()
	{
		Scanner teclado = new Scanner(System.in);
		String control = "s";
		int[] arreglo = new int[25];
		int cont = 0, acumulador = 0;
		float promedio;
		while (control.equals("s") && cont < 25)
		{
			System.out.println("Ingrese elemento (número entero): ");
			arreglo[cont] = teclado.nextInt();
			acumulador = acumulador + arreglo[cont];
			cont++;
			System.out.println("¿Seguir ingresando elementos? s/n: ");
			control = teclado.next();
		}
		promedio = acumulador / cont;
		return promedio;
	}
	
	//EJERCICIO 2
	
	public static void numeroPar(int numero)
	{
		if (numero % 2 == 0)
		{
			System.out.println("El número " + numero + " es par");
		}
		else
		{
			System.out.println("El número " + numero + " es impar");
		}
	}
	
	//EJERCICIO 3
	
	public static void mostrarPrimeros100Primos()
	{
		int i, contador = 0;
		System.out.println("Primeros 100 números primos:");
		for (i = 2; contador < 100; i++)
		{
			if (esPrimo(i))
			{
				contador++;
				System.out.println("[" + contador + "] " + i);
			}
		}
	}
	
	public static boolean esPrimo(int num)
	{
		boolean primo = true;
		if (num > 1)
		{
			int i = 2;
			while (primo == true && i < num)
			{
				if (num % i == 0)
					primo = false;
				i++;
			}
		}
		else
			primo = false;

		return primo;
	}
	
	//EJERCICIO 4
	
	public static void mostrarPrimerosNPrimos(int num)
	{
		int i;
		System.out.println("Números primos hasta el " + num + ":");
		for (i = 2; i <= num; i++)
		{
			if (esPrimo(i))
			{
				System.out.println(i);
			}
		}
	}
	
	//NO HAY EJERCICIO 5
	
	//EJERCICIO 6
	
	public static void revisarSiEsPrimo()
	{
		int i;
		Scanner teclado = new Scanner(System.in);
		String control = "s";
		boolean primo;
		while (control.equals("s"))
		{
			System.out.println("Ingrese número entero: ");
			i = teclado.nextInt();
			primo = esPrimo(i);
			if (primo)
				System.out.println("El número " + i + " es primo");
			else
				System.out.println("El número " + i + " NO es primo");
			System.out.println("¿Seguir ingresando números? s/n: ");
			control = teclado.next();
		}
	}
	
	//EJERCICIO 7
	
	public static int sumaPrimeros10NumerosNaturales()
	{
		int i, acumulador = 0;
		for (i = 1; i <= 10; i++)
		{
			acumulador = acumulador + i;
		}
		return acumulador;
	}
	
	//EJERCICIO 8
	
	public static int numerosPositivosIngresados()
	{
		int numero, contador = 0;
		Scanner teclado = new Scanner(System.in);
		String control = "s";
		while (control.equals("s"))
		{
			System.out.println("Ingrese número entero: ");
			numero = teclado.nextInt();
			if (numero >= 0)
				contador++;
			System.out.println("¿Seguir ingresando números? s/n: ");
			control = teclado.next();
		}
		return contador;
	}
	
	//EJERCICIO 9
	
	public static boolean revisarAnioBisiesto(int anio)
	{
        boolean bisiesto = false;
        if (anio % 4 == 0)
        {
            if (anio % 100 == 0)
            {
                if (anio % 400 == 0)
                    bisiesto = true;
                else
                    bisiesto = false;
            }
            else
                bisiesto = true;
        }
        else
            bisiesto = false;
        return bisiesto;
	}
	
	//EJERCICIO 10
	
	public static void encontrarYMostrarValorASCII(char caracter)
	{
		int valorASCII = caracter;
		System.out.println("El valor ASCII del caracter '" + caracter + "' es " + valorASCII);
	}
	
	//EJERCICIO 11

	public static int multiplicarDosNumeros(int numero1, int numero2)
	{
		int producto = numero1 * numero2;
		return producto;
	}
	
	//EJERCICIO 12
	
	public static void calcularArea()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para calcular el área ingrese: 1. Rectángulo - 2. Cuadrado - 3. Triangulo - 4. Círculo.\nOPCION: ");
		boolean bandera = true;
		int opcion = teclado.nextInt();
		float area = 0, base, altura, lado, radio;
		switch (opcion)
		{
		case 1:
			System.out.println("Base: ");
			base = teclado.nextFloat();
			System.out.println("Altura: ");
			altura = teclado.nextFloat();
			area = calcularAreaRectangulo(base, altura);
			break;
		case 2:
			System.out.println("Lado: ");
			lado = teclado.nextFloat();
			area = calcularAreaCuadrado(lado);
			break;
		case 3:
			System.out.println("Base: ");
			base = teclado.nextFloat();
			System.out.println("Altura: ");
			altura = teclado.nextFloat();
			area = calcularAreaTriangulo(base, altura);
			break;
		case 4:
			System.out.println("Radio: ");
			radio = teclado.nextFloat();
			area = calcularAreaCirculo(radio);
			break;
		default:
			System.out.println("No ingresó una opción valida... ");
			bandera = false;
			break;
		}
		if (bandera)
			System.out.println("El área es " + area);
	}
	
	public static float calcularAreaRectangulo(float base, float altura)
	{
		float area;
		area = base * altura;
		return area;
	}
	
	public static float calcularAreaCuadrado(float lado)
	{
		float area;
		area = lado * lado;
		return area;
	}

	public static float calcularAreaTriangulo(float base, float altura)
	{
		float area;
		area = (base * altura) / 2;
		return area;
	}
	
	public static float calcularAreaCirculo(float radio)
	{
		float area;
		area = (float) (Math.PI * (radio * radio));
		return area;
	}
	
	//EJERCICIO 13
	
	public static void buenosDias()
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		System.out.println("Nombre: ");
		nombre = teclado.next();
		System.out.println("¡Buenos días " + nombre + "!");
	}
	
	//EJERCICIO 14
	
	public static void obtenerDobleYTripleNumeroIn()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese número entero: ");
		int numero = teclado.nextInt();
		int doble = numero * 2, triple = numero * 3;
		System.out.println("El doble del numero es " + doble + " y el triple es " + triple);
	}
	
	//EJERCICIO 15
	
	public static void leerYPasarCenAFar()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese temperatura en ºC: ");
		float gradosCentigrados = teclado.nextFloat();
		float gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
		System.out.println(gradosCentigrados + "ºC ----> " + gradosFahrenheit + "ºF");
	}
	
	//EJERCICIO 16
	
	public static void leerRadioCircunfYCalcularLongitudYArea()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el radio de la circunferencia: ");
		float longitud, area, radio = teclado.nextFloat();
		longitud = (float) (2 * radio * Math.PI);
		area = (float) (Math.PI * (radio * radio));
		System.out.println("La longitud es " + longitud + " y el área es " + area);
	}
	
	//EJERCICIO 17
	
	public static void leerYPasarVelocidad()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la velocidad en km/h: ");
		float velocidad = teclado.nextFloat();
		velocidad = (velocidad / (float)3.6);
		System.out.println("La velocidad ingresada en m/s es " + velocidad);
	}
	
	//EJERCICIO 18
	
	public static void calcularHipotenusa()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese valor del cateto 1: ");
		float cateto1 = teclado.nextFloat();
		System.out.println("Ingrese valor del cateto 2: ");
		float cateto2 = teclado.nextFloat();
		float hipotenusa = (float) Math.sqrt((Math.pow(cateto1, 2) + (Math.pow(cateto2, 2))));
		System.out.println("La hipotenusa es " + hipotenusa);
	}
	
	//EJERCICIO 19
	
	public static void calculoMaxMinPromTemperaturasMes()
	{
		float [] arreglo = {24, 25, 22, 17 ,18, 18, 19, 22, 27, 32, 34, 32, 39, 29, 16, 15, 12, 15, 17, 19, 23, 29, 31, 32, 31, 27, 30, 32, 36, 40};
		float max, min, prom;
		max = maximoValorArreglo(arreglo);
		min = minimoValorArreglo(arreglo);
		prom = promedioArreglo(arreglo);
		System.out.print("Máximo=" + max + " - Mínimo=" + min + " - Promedio=" + prom);
	}
	
	public static float maximoValorArreglo(float [] arreglo)
	{
		float maximoValor = arreglo[0];
		for (int i = 1; i < arreglo.length; i++)
		{
			if (arreglo[i] > maximoValor)
				maximoValor = arreglo[i];
		}
		return maximoValor;
	}
	
	public static float minimoValorArreglo(float [] arreglo)
	{
		float minimoValor = arreglo[0];
		for (int i = 1; i < arreglo.length; i++)
		{
			if (arreglo[i] < minimoValor)
				minimoValor = arreglo[i];
		}
		return minimoValor;
	}
	
	public static float promedioArreglo(float [] arreglo)
	{
		float promedio = 0, acumulador = 0;
		for (int i = 0; i < arreglo.length; i++)
		{
			acumulador = acumulador + arreglo[i];
		}
		promedio = acumulador / (arreglo.length);
		return promedio;
	}
	
	//EJERCICIO 20
	
	public static void generarNumerosAleatorios()
	{
		Scanner teclado = new Scanner(System.in);
		int arreglo [] = new int [10];
		System.out.print("Ingrese número mínimo: ");
		int min = teclado.nextInt();
		System.out.print("Ingrese número máximo: ");
		int max = teclado.nextInt();
		for (int i = 0; i < 10; i++)
		{
			arreglo[i] = min + (int)(Math.random() * ((max - min) +1));
			System.out.print("[" + arreglo[i] + "]");
		}
	}
	
	//EJERCICIO 21
	
	public static void diaLaboral()
	{
		Scanner teclado = new Scanner(System.in);
		String diaSemana;
		System.out.print("Ingrese día de semana [lunes, martes, miercoles, jueves, viernes, sabado, domingo]: ");
		diaSemana = teclado.nextLine();
		switch (diaSemana)
		{
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
		case "sabado":
			System.out.print("Día laboral");
			break;
		case "domingo":
			System.out.print("Día NO laboral");
			break;
		}
	}
	
	//EJERCICIO 22
	
	public static void cifrasNumeroEnteroPositivo()
	{
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		boolean bandera = true;
		while (bandera == true)
		{
			System.out.print("Ingrese un número entero positivo: ");
			numero = teclado.nextInt();
			if (numero >= 0)
				bandera = false;
			else
			{
				System.out.print("El número ingresado no es un entero positivo. Intente nuevamente... ");
			}
		}
		int cifras = String.valueOf(numero).length(); //Convierte int a string para poder usar length
		if (cifras >= 1)
			System.out.print("El número tiene " + cifras + " cifras");
	}
	
	//EJERCICIO 23
	
	public static void calculadoraPolacaInversaApp()
	{
		Scanner teclado = new Scanner(System.in);
		int operando1, operando2;
		String control = "s", signo;
		while (control.equals("s"))
		{	
			System.out.print("Ingrese el primer operando (número entero): ");
			operando1 = teclado.nextInt();
			System.out.print("Ingrese el segundo operando (número entero): ");
			operando2 = teclado.nextInt();
			System.out.print("Ingrese un signo aritmético [ + | - | * | / | ^ | % ]: ");
			signo = teclado.next();
			double resultado = calculadora(operando1, operando2, signo);
			System.out.print("RESULTADO=" + resultado);
			System.out.print("\n¿Seguir usando la calculadora? s/n: ");
			control = teclado.next();
		}
	}
	
	public static double calculadora(int operando1, int operando2, String signo)
	{
		double resultado = 0;
		switch (signo)
		{
		case "+":
			resultado = operando1 + operando2;
			break;
		case "-":
			resultado = operando1 - operando2;
			break;
		case "*":
			resultado = operando1 * operando2;
			break;
		case "/":
			resultado = operando1 / operando2;
			break;
		case "^":
			resultado = (float) Math.pow(operando1, operando2);
			break;
		case "%":
			resultado = operando1 % operando2;
			break;
		default:
			System.out.print("¡Signo incorrecto!\n");
			break;
		}
		return resultado;
	}
		
	//EJERCICIO 23 (24)
		
	public static void mostrarSalario()
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		int edad;
		float salario;
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
		System.out.print("Ingrese salario: ");
		salario = teclado.nextFloat();
		if (edad < 16)
			System.out.print("No tiene edad para trabajar");
		else
		{
			if (edad >= 19 && edad <= 50)
				salario = (float) (salario + (0.05 * salario));
			else if (edad >= 51 && edad <= 60)
				salario = (float) (salario + (0.1 * salario));
			else
				salario = (float) (salario + (0.15 * salario));
			System.out.print("Nombre: " + nombre + " | Edad: " + edad + " | Salario=$" + salario);
		}
	}
}
