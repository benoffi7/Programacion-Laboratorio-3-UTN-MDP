package trabajoPractico;

import java.util.Scanner;

public class Guia {

	public static void main(String[] args) {
		//Ejercicio 1

		System.out.println("\n>> EJERCICIO 1 <<\n");
		float promedio1=PromedioArregloInicializado();
		System.out.println("El promedio es "+promedio1);
		float promedio2=PromedioArregloCargadoPorTeclado();
		System.out.println("El promedio es "+promedio2);
		
		//Ejercicio 2
		Scanner carga=new Scanner(System.in);
		int numero;
		System.out.println("\n>>Ejercicio 2<<\n");
		System.out.println("Tipee un número");
		numero=carga.nextInt();
		DeterminarSiEsPar(numero);
		
		//Ejercicio 3
		System.out.println("\n>>Ejercicio 3<<\n");
		MostrarPrimeros100NumerosPrimos();
		
		//Ejercicio 4
		System.out.println("\n>>Ejercicio 4<<\n");
		System.out.println("Tipee un número");
		numero=carga.nextInt();
		MostrarPrimerosNNumerosPrimos(numero);
		
		//Ejercicio 6
		System.out.println("\n>>Ejercicio 6<<\n");	
		RevisarSiEsPrimo();
		
		//Ejercicio 7
		System.out.println("\n>>Ejercicio 7<<\n");
		int suma;
		suma=SumaPrimeros10NumerosNaturales();
		System.out.println("La suma de los primeros 10 números naturales es: "+suma);
		
		//Ejercicio 8
		System.out.println("\n>>Ejercicio 8<<\n");
		int numerosPositivos;
		numerosPositivos=NumerosPositivosIngresados();
		System.out.println("El usuario ingresó "+numerosPositivos +" número/s positivo/s");
		
		//Ejercicio 9
		System.out.println("\n>>Ejercicio 9<<\n");
		int anio;
		boolean bisiesto;
		System.out.println("Tipee un año");
		anio=carga.nextInt();
		bisiesto=DeterminarAnioBisiesto(anio);
		if (bisiesto)
			System.out.println("El año ingresado es bisiesto");
		else
			System.out.println("El año ingresado NO es bisiesto");
		
		//Ejercicio 10
		System.out.println("\n>>Ejercicio 10<<\n");
		char caracter;
		System.out.println("Ingrese un caracter");
		caracter=carga.next().charAt(0);
		encontrarYMostrarValorASCII(caracter);
		
		//Ejercicio 11
		System.out.println("\n>>Ejercicio 11<<\n");
		int numero1,numero2,producto;
		numero1=carga.nextInt();
		numero2=carga.nextInt();
		producto=MultiplicarDosNumeros(numero1,numero2);
		System.out.println("El producto de la multiplicacion entre"+numero1 +"y"+numero2 +" es "+producto);
		
		//Ejercicio 12
		System.out.println("\n>>Ejercicio 12<<\n");
		CalcularArea();
		
		//Ejercicio 13
		System.out.println("\n>>Ejercicio 13<<\n");
		SaludoCordial();
		
		//Ejercicio 14
		System.out.println("\n>>Ejercicio 14<<\n");
		DobleYTripleNumeroEntero();
		
		//Ejercicio 15
		System.out.println("\n>>Ejercicio 15<<\n");
		GradosCentigradosAFahrenheit();
		
		//Ejercicio 16
		System.out.println("\n>>Ejercicio 16<<\n");
		leerRadioCircunfYCalcularLongitudYArea();
		
		//Ejercicio 17
		System.out.println("\n>>Ejercicio 17<<\n");
		PasarKMH_A_MS ();
		
		//Ejercicio 18
		System.out.println("\n>>Ejercicio 18<<\n");
		calcularLongitudHipotenusa();
		
		//Ejercicio 19
		System.out.println("\n>>Ejercicio 19<<\n");
		calculoMax_Min_Prom_TemperaturaMes();
		
		//Ejercicio 20
		System.out.println("\n>>Ejercicio 20<<\n");
		GeneradorDeNumerosAleatorios();
		
		//Ejercicio 21
		System.out.println("\n>>Ejercicio 21<<\n");
		DeterminarDiaLaboral();
		
		//Ejercicio 22
		System.out.println("\n>>Ejercicio 22<<\n");
		CantidadCifrasNumeroEnteroPositivo ();
		
		//Ejercicio 23
		System.out.println("\n>>Ejercicio 23<<\n");
		CalculadoraPolacaInversaApp();
		
		//Ejercicio 24
		System.out.println("\n>>Ejercicio 24<<\n");
		MostrarSalario();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////FUNCIONES/////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////
	
	//Funciones Ejercicio 1
	public static float PromedioArregloInicializado()
	{
		int arreglo []={4,2,3,4,5},i=0,acumulador=0;
		float promedio=0;
		for (i=0;i<5;i++)
		{
			acumulador=acumulador+arreglo[i];
		}
		promedio=acumulador/5;
		return promedio;
	}
	
	public static float PromedioArregloCargadoPorTeclado()
	{
		Scanner carga=new Scanner(System.in);
		String control="s";
		int[] arreglo = new int[25];
		int cont=0,acumulador=0;
		float promedio;
		while (control.equals("s") && cont<25)
		{
			System.out.println("Ingrese elemento (número entero): ");
			arreglo[cont]=carga.nextInt();
			acumulador=acumulador+arreglo[cont];
			cont++;
			System.out.println("¿Seguir ingresando elementos? s/n: ");
			control=carga.next();
		}
		promedio=acumulador/cont;
		return promedio;
	}
	
	//Funcion ejercicio 2
	public static void DeterminarSiEsPar(int numero)
	{
		if (numero%2==0)
				System.out.println("EL número ingresado es par");
		else
			System.out.println("El número ingresado no es par");
		
	}
	
	//Funciones ejercicio 3
	public static void MostrarPrimeros100NumerosPrimos ()
	{
		int numero;
		System.out.println("Números primos entre el 2 y el 100:");
		for (numero=2;numero<=100;numero++)//Obviamos el 0 y 1 ya que sabemos que no son primos.
		{
			if (esPrimo(numero))
			{
				System.out.println(+numero);
			}
		}
	}

	public static boolean esPrimo (int numero)
	{
		int contador=0;
		boolean primo=true;
		if (numero>1)
		{
			int i=2;
			while (primo==true && i<numero)
			{
				if (numero%i==0)
					primo=false;
				i++;
			}
		}
		else
			primo=false;

		return primo;
	}
	
	//Funcion ejercicio 4
	public static void MostrarPrimerosNNumerosPrimos (int numero)
	{
		int i;
		System.out.println("Números primos hasta el "+numero +":");
		for (i=2;i<=numero;i++)
		{
			if (esPrimo(i))
			{
				System.out.println(+i);
			}
		}
	}
	
	//Ejercicio 6
	public static void RevisarSiEsPrimo ()
	{
		int numero;
		Scanner carga=new Scanner(System.in);
		String control="s";
		boolean primo;
		while (control.equals("s"))
		{
			System.out.println("Ingrese número entero: ");
			numero=carga.nextInt();
			primo=esPrimo(numero);
			if (primo)
				System.out.println("El número ingresado es primo");
			else
				System.out.println("El número ingresado NO es primo");
			System.out.println("¿Seguir ingresando números? s/n: ");
			control=carga.next();
		}
	}
	
	//Ejercicio 7
	public static int SumaPrimeros10NumerosNaturales ()
	{
		int i,acumulador=0;
		for (i=1;i<=10;i++)//No tomamos en cuenta el 0 ya que no es un número natural
		{
			acumulador=acumulador+i;
		}
		return acumulador;
	}
	
	//Ejercicio 8
	public static int NumerosPositivosIngresados ()
	{
		int numero,contador=0;
		Scanner carga=new Scanner(System.in);
		String control="s";
		while (control.equals("s"))
		{
			System.out.println("Ingrese número entero: ");
			numero=carga.nextInt();
			if (numero>=0)
				contador++;
			System.out.println("¿Seguir ingresando números? s/n: ");
			control=carga.next();
		}
		return contador;
	}
	
	//Ejercicio 9
	public static boolean DeterminarAnioBisiesto (int anio)
	{
        boolean bisiesto=false;
        if (anio%4==0)
        {
            if (anio%100==0)
            {
                if (anio%400==0)
                    bisiesto=true;
                else
                    bisiesto=false;
            }
            else
                bisiesto=true;
        }
        else
            bisiesto=false;
        return bisiesto;
	}
	
	//Ejercicio 10
	public static void encontrarYMostrarValorASCII (char caracter)
	{
		int valorASCII=caracter;
		System.out.println("El valor ASCII del caracter '"+caracter +"' es "+valorASCII);
	}
	//Ejercicio 11
	public static int MultiplicarDosNumeros (int numero1,int numero2)
	{
		int producto=numero1*numero2;
		return producto;
	}
	
	//Ejercicio 12
	public static void CalcularArea ()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Para calcular el área ingrese: 1. Rectángulo - 2. Cuadrado - 3. Triangulo - 4. Círculo.\nOPCION: ");
		boolean bandera=true;
		int opcion=teclado.nextInt();
		float area=0,base,altura,lado,radio;
		switch (opcion)
		{
		case 1:
			System.out.println("Base: ");
			base=teclado.nextFloat();
			System.out.println("Altura: ");
			altura=teclado.nextFloat();
			area=calcularAreaRectangulo(base,altura);
			break;
		case 2:
			System.out.println("Lado: ");
			lado=teclado.nextFloat();
			area=calcularAreaCuadrado(lado);
			break;
		case 3:
			System.out.println("Base: ");
			base=teclado.nextFloat();
			System.out.println("Altura: ");
			altura=teclado.nextFloat();
			area=calcularAreaTriangulo(base,altura);
			break;
		case 4:
			System.out.println("Radio: ");
			radio=teclado.nextFloat();
			area=calcularAreaCirculo(radio);
			break;
		default:
			System.out.println("No ingresó una opción valida... ");
			bandera=false;
			break;
		}
		if (bandera)
			System.out.println("El área es "+area);
	}

	public static float calcularAreaRectangulo (float base, float altura)
	{
		float area;
		area=base*altura;
		return area;
	}

	public static float calcularAreaCuadrado (float lado)
	{
		float area;
		area=lado*lado;
		return area;
	}

	public static float calcularAreaTriangulo (float base, float altura)
	{
		float area;
		area=(base*altura)/2;
		return area;
	}

	public static float calcularAreaCirculo (float radio)
	{
		float area;
		area=(float) (Math.PI*(radio*radio));
		return area;
	}
	
	//Ejercicio 13
	public static void SaludoCordial ()
	{
		Scanner carga=new Scanner(System.in);
		String nombre;
		System.out.println("Nombre: ");
		nombre=carga.next();
		System.out.println("¡Buenos días "+nombre +"!");
	}
	
	//Ejercicio 14
	public static void DobleYTripleNumeroEntero ()
	{
		Scanner carga=new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		int numero=carga.nextInt();
		int doble=numero*2,triple=numero*3;
		System.out.println("El doble del numero es "+doble +" y el triple es "+triple);
	}
	
	//Ejercicio 15
	public static void GradosCentigradosAFahrenheit ()
	{
		Scanner carga=new Scanner(System.in);
		System.out.println("Ingrese temperatura en ºC. Ej 30: ");
		float gradosCentigrados=carga.nextFloat();
		float gradosFahrenheit=32+(9*gradosCentigrados/5);
		System.out.println("Grados centígrados: "+gradosCentigrados);
		System.out.println("Grados Fahrenheit"+gradosFahrenheit);
		
	}
	
	//Ejercicio 16
	public static void leerRadioCircunfYCalcularLongitudYArea ()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el radio de la circunferencia: ");
		float longitud,area,radio=teclado.nextFloat();
		longitud=(float) (2*radio*Math.PI);
		area=(float) (Math.PI*(radio*radio));
		System.out.println("La longitud es " +longitud +" y el área es " +area);
	}
	
	//Ejercicio 17
	public static void PasarKMH_A_MS ()
	{
		Scanner carga=new Scanner(System.in);
		System.out.println("Ingrese la velocidad en km/h: ");
		float velocidad=carga.nextFloat();
		velocidad=(velocidad/(float)3.6);
		System.out.println("La velocidad ingresada en m/s es " +velocidad);
	}
	
	//Ejercicio 18
	public static void calcularLongitudHipotenusa ()
	{
		Scanner carga=new Scanner(System.in);
		System.out.println("Ingrese el valor del cateto 1: ");
		float cateto1=carga.nextFloat();
		System.out.println("Ingrese el valor del cateto 2: ");
		float cateto2=carga.nextFloat();
		float hipotenusa=(float) Math.sqrt((Math.pow(cateto1,2)+(Math.pow(cateto2,2))));
		System.out.println("La hipotenusa es " +hipotenusa);
	}
	
	//Ejercicio 19
	
	public static void calculoMax_Min_Prom_TemperaturaMes()
	{
		float []arreglo={28,30,27,15,24};//Podria cargar las 30 temperaturas pero no afecta en nada a la función.
		int cant=5;
		float max,min,prom;
		max=maximoValorArreglo(arreglo);
		min=minimoValorArreglo(arreglo);
		prom=promedioArreglo(arreglo);
		System.out.print("Máximo=" +max +" - Mínimo=" +min +" - Promedio=" +prom);
	}
	
	public static float maximoValorArreglo (float [] arreglo)
	{
		float maximoValor=arreglo[0];
		for (int i=1;i<arreglo.length;i++)//arreglo.length----> longitud del arreglo
		{
			if (arreglo[i]>maximoValor)
				maximoValor=arreglo[i];
		}
		return maximoValor;
	}

	public static float minimoValorArreglo (float [] arreglo)
	{
		float minimoValor=arreglo[0];
		for (int i=1;i<arreglo.length;i++)
		{
			if (arreglo[i]<minimoValor)
				minimoValor=arreglo[i];
		}
		return minimoValor;
	}

	public static float promedioArreglo (float [] arreglo)
	{
		float promedio=0,acumulador=0;
		for (int i=0;i<arreglo.length;i++)
		{
			acumulador=acumulador+arreglo[i];
		}
		promedio=acumulador/(arreglo.length);
		return promedio;
	}
	//Ejercicio 20
	public static void GeneradorDeNumerosAleatorios ()
	{
		Scanner carga=new Scanner(System.in);
		int arreglo []=new int [10];
		System.out.print("Tipee el número mínimo: ");
		int min=carga.nextInt();
		System.out.print("Tipee el número máximo: ");
		int max=carga.nextInt();
		for (int i=0;i<10;i++)
		{
			arreglo[i]=min+(int)(Math.random()*((max-min)+1));//Método Math Random.
			System.out.print("[" +arreglo[i] +"]-");
		}
	}
	
	//Ejercicio 21
	public static void DeterminarDiaLaboral ()
	{
		Scanner carga=new Scanner(System.in);
		String Dia;
		System.out.print("Ingrese día de semana [lunes,martes,miercoles,jueves,viernes,sabado,domingo]: ");
		Dia=carga.nextLine();
		switch (Dia)
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
	
	//Ejercicio 22
	public static void CantidadCifrasNumeroEnteroPositivo ()
	{
		Scanner carga=new Scanner(System.in);
		int numero=0;
		boolean bandera=true;
		while (bandera==true)
		{
			System.out.print("Ingrese un número entero positivo: ");
			numero=carga.nextInt();
			if (numero>=0)
				bandera=false;
			else
			{
				System.out.print("El número ingresado no es un entero positivo. Intente nuevamente... ");
			}
		}
		int cifras=String.valueOf(numero).length(); //Convierte int a string para poder usar length
		if (cifras>=1)
			System.out.print("El número tiene " +cifras +" cifras");
	}
	//Ejercicio 23
	public static void CalculadoraPolacaInversaApp ()
	{
		Scanner carga=new Scanner(System.in);
		int PrimerOperando,SegundoOperando;
		String control="s",Signo;
		while (control.equals("s"))
		{	
			System.out.print("Ingrese el primer operando (número entero): ");
			PrimerOperando=carga.nextInt();
			System.out.print("Ingrese el segundo operando (número entero): ");
			SegundoOperando=carga.nextInt();
			System.out.print("Ingrese un signo aritmético para poder realizar la operación: [ + | - | * | / | ^ | % ]: ");
			Signo=carga.next();
			double resultado=calculadora(PrimerOperando,SegundoOperando,Signo);
			System.out.print("Resultado="+resultado);
			System.out.print("\n¿Desea seguir usando la calculadora? s/n: ");
			control=carga.next();
		}
	}

	public static double calculadora (int PrimerOperando,int SegundoOperando,String Signo)
	{
		double resultado=0;
		switch (Signo)
		{
		case "+":
			resultado=PrimerOperando+SegundoOperando;
			break;
		case "-":
			resultado=PrimerOperando-SegundoOperando;
			break;
		case "*":
			resultado=PrimerOperando*SegundoOperando;
			break;
		case "/":
			resultado=PrimerOperando/SegundoOperando;
			break;
		case "^":
			resultado=(float) Math.pow(PrimerOperando, SegundoOperando);
			break;
		case "%":
			resultado=PrimerOperando%SegundoOperando;
			break;
		default:
			System.out.print("¡Error! : El signo ingresado es incorrecto.\n");
			break;
		}
		return resultado;
	}
	
	//Ejercicio 24
	public static void MostrarSalario ()
	{
		Scanner carga=new Scanner(System.in);
		String nombre;
		int edad;
		float salario;
		System.out.print("Ingrese el nombre: ");
		nombre=carga.next();
		System.out.print("Ingrese la edad: ");
		edad=carga.nextInt();
		System.out.print("Ingrese el salario: ");
		salario=carga.nextFloat();
		if (edad<16)
			System.out.print("No tiene edad suficiente para trabajar");
		else
		{
			if (edad>=19 && edad<=50)
				salario=(float) (salario+(0.05*salario));
			else if (edad>=51 && edad<=60)
				salario=(float) (salario+(0.1*salario));
			else
				salario=(float) (salario+(0.15*salario));
			System.out.print("Nombre: "+nombre);
			System.out.print("Edad: "+edad);
			System.out.print("Salario: "+salario);
		}
	}

}
