package Main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		int cantEjercicios = 24;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("Guia º1 ejercicios: ");
			for (int i = 1; i <= cantEjercicios; i++) {
				System.out.println(i+") Ejercicio");
			}
			System.out.println("0) Salir");
			System.out.print("Ingrese opcion: ");
			
			int opcion = sc.nextInt();
			switch(opcion) {
				case 0:
					sc.close();
					System.out.println("Has salido del sistema.");
				return;
				case 1:
					ejercicio1();
					break;
				case 2:
					ejercicio2();
					break;
				case 3:
					ejercicio3();
					break;
				case 4:
					ejercicio4();
					break;
				case 5:
					ejercicio4();
					break;
				case 6:
					ejercicio6();
					break;
				case 7:
					ejercicio7();
					break;
				case 8:
					ejercicio8();
					break;
				case 9:
					ejercicio9();
					break;
				case 10:
					ejercicio10();
					break;
				case 11:
					ejercicio11();
					break;
				case 12:
					ejercicio12();
					break;
				case 13:
					ejercicio13();
					break;
				case 14:
					ejercicio14();
					break;
				case 15:
					ejercicio15();
					break;
				case 16:
					ejercicio16();
					break;
				case 17:
					ejercicio17();
					break;
				case 18:
					ejercicio18();
					break;
				case 19: 
					ejercicio19();
					break;
				case 20:
					ejercicio20();
					break;
				case 21:
					ejercicio21();
					break;
				case 22:
					ejercicio22();
					break;
				case 23:
					ejercicio23();
					break;
				case 24:
					ejercicio23b();
					break;
				default:
					System.out.println("Opción incorrecta.");
			}
			linea();
			sc = new Scanner(System.in);
			System.out.print("¿Deseas ver otro ejercicio? (S/N) : ");
			if (!sc.next().equals("s")){
				flag = false;
			}
		}
		sc.close();
	}
	
	static void linea() {
		System.out.println("\n================================");
	}
	
	static void ejercicio1() {
		int max = 5;
		int[] arreglo = new int[max];
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (flag && i < max) {
			System.out.print("Ingrese un valor:");
			arreglo[i] = sc.nextInt();
			i++;
			System.out.println("¿Deseas ingresar mas valores? <S/N>");
			if (!sc.next().equals("s")) {
				flag = false;
			}
		}
		for (int num : arreglo) {
			System.out.print(num+"-");
		}
		System.out.println("El promedio es: "+calcularPromedio(arreglo));
		
	}
	
	static float calcularPromedio(int[] arr) {
		float total = 0;
		
		for (int num : arr) {
			total += num;
		}
		return total/arr.length;
	}
	
	static int numero() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
	/**************************************************/
	static void ejercicio2() {
		int numero = numero();
		if (numero % 2 == 0) {
			System.out.println("El numero "+ numero + " es par");
		} else {
			System.out.println("El numero "+ numero + " es impar");
		}
	}
	/**************************************************/
	static void ejercicio3() {
		int[] numeros = new int[100];
		int pares = 0;
		int i = 1;
		while (pares < 100) {
			int cantDiv = 0;
			int aux = i;
			
			for (int e = 1; e <= aux;e++) {
				if (aux % e == 0) {
					cantDiv++;
				}
			}
			if (cantDiv == 2) {
				numeros[pares] = i;
				pares++;
				
			}
			i++;
		}
		System.out.println("Los primeros 100 numeros primos: ");
		for (int num : numeros) {
			System.out.print(num+"-");
		}
	}
	/*********************************************************/
	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros primos que desea buscar: ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		int pares = 0;
		int i = 1;
		while (pares < n) {
			int cantDiv = 0;
			int aux = i;
			
			for (int e = 1; e <= aux;e++) {
				if (aux % e == 0) {
					cantDiv++;
				}
			}
			if (cantDiv == 2) {
				numeros[pares] = i;
				pares++;
				
			}
			i++;
		}
		System.out.println("Los primeros "+n+" numeros primos: ");
		for (double num : numeros) {
			System.out.print((int)num+"-");
		}
		
	}
	static boolean esPrimo(int dato) {
		boolean flag = false;
		int cantDiv = 0;
		for (int e = 1; e <= dato;e++) {
			if (dato % e == 0) {
				cantDiv++;
			}
		}
		if (cantDiv == 2) {
			flag = true;
			
		}
		return flag;
	}
	/*************************************************************/
	static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("Ingrese un valor:");
			int num = sc.nextInt();
			if (esPrimo(num)) {
				System.out.println("El numero "+num +" es primo.");
			} else {
				System.out.println("El numero "+num +" no es primo.");
			}
			System.out.println("¿Deseas ingresar mas valores? <S/N>");
			if (!sc.next().equals("s")) {
				flag = false;
			}
		}
	}
	/**********************************************************/
	static int sumaNaturales() {
		int i = 1;
		int resultado = 0;
		while (i <= 10) {
			resultado += i;
			i++;
		}
		return resultado;
	}
	static void ejercicio7() {
		System.out.println("La suma de los 10 primeros numeros naturales es de: "+ sumaNaturales());
	}
	/***********************************************************/
	static void ejercicio8() {
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("Ingrese un valor:");
			int num = sc.nextInt();
			resultado += num;
			System.out.println("¿Deseas ingresar mas valores? <S/N>");
			if (!sc.next().equals("s")) {
				flag = false;
			}
		}
		System.out.println("El resultado de la suma de los elementos es de: "+resultado);
	}
	/*************************************************************/
	static void ejercicio9() {
		boolean flag = false;
		System.out.println("Ingrese el año que desea analizar: ");
		Scanner sc = new Scanner(System.in);
		int año = sc.nextInt();
		if (año % 4 == 0) {
			if (año%100 == 0) {
				if (año%400 == 0) {
					flag = true;
				}
			} else {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("El año "+año+" es bisiesto.");
		} else {
			System.out.println("El año "+año+" no es bisiesto.");
		}
	}
	/*************************************************************/
	static void ejercicio10() {
		Random rand = new Random();
		System.out.print("Escribe un caracter(Por ejemplo '"+(char)(rand.nextInt(122-97)+97)+"'): ");
		Scanner sc = new Scanner(System.in);
		String caracter = sc.next();
		System.out.println("El valor ASCII de '"+caracter+"' es "+caracter.hashCode());
	}
	/*************************************************************/
	static void ejercicio11() {
		int num1=0,num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un valor entero: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese otro valor entero: ");
		num2 = sc.nextInt();
		System.out.println(num1+" * "+num2+" = "+ "["+num1*num2+"]");
	}
	/*************************************************************/
	static void ejercicio12() {
		System.out.println("Calculo de Areas: ");
		System.out.println("1) Area de un rectángulo");
		System.out.println("2) Area de un cuadrado");
		System.out.println("3) Area de un triangulo");
		System.out.println("4) Area de un circulo");
		Scanner sc = new Scanner(System.in);
		float resultado = 0;

		float altura = 0;
		float lado = 0;
		float radio = 0;
		float base = 0;
		switch(sc.nextInt()) {
			case 1:
				System.out.print("Ingrese la base: ");
				base = sc.nextFloat();
				System.out.print("Ingrese la altura: ");
				altura = sc.nextFloat();
				resultado = base*altura;
			break;
			case 2:
				System.out.print("Ingrese el tamaño del lado: ");
				lado = sc.nextFloat();
				resultado = lado*lado;
			break;
			case 3:
				System.out.print("Ingrese el base: ");
				base = sc.nextFloat();
				System.out.print("Ingrese la altura: ");
				altura = sc.nextFloat();
				resultado = (base*altura) /2;
			break;
			case 4:
				System.out.print("Ingrese el radio: ");
				radio = sc.nextFloat();
				resultado =  (float) (Math.PI* Math.pow(radio, 2));
			break;
			default:
				System.out.println("Opcion incorrecta");
		}
		System.out.println("El resultado es: "+resultado);
	}
	/*************************************************************/
	static void ejercicio13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		System.out.println("Buenos dias "+sc.next());
	}
	/*************************************************************/
	static void ejercicio14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		int numero = sc.nextInt();
		System.out.println("El doble de ["+numero+"] = " + (int) Math.pow(numero, 2));
		System.out.println("El triple de ["+numero+"] = " +(int)  Math.pow(numero, 3));
	}
	/*************************************************************/
	static void ejercicio15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la temperatura en grados centigrados: ");
		float centigrados = sc.nextFloat();
		float fahrenheit = 32 + (centigrados * 9 / 5);
		System.out.println(centigrados+"° expresados en fahrenheit: "+fahrenheit+" F");
	}
	/*************************************************************/
	static void ejercicio16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el radio de una circunferencia: ");
		float radio = sc.nextFloat();
		float longitud = (float) (2*Math.PI*radio);
		float area = (float) (Math.PI* Math.pow(radio, 2));
		System.out.println("La longitud de la circunferencia es de: "+ longitud);
		System.out.println("El area de la circunferencia es de: "+ area);
	}
	/*************************************************************/
	static void ejercicio17() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la velocidad en Km/h");
		float velocidad = sc.nextFloat();
		float resultado = velocidad*5/18;
		System.out.println(velocidad+" Km/h es igual a "+resultado+"M/s");
	}
	/*************************************************************/
	static void ejercicio18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la longitud del Cateto 1");
		float c1 = sc.nextFloat();
		System.out.println("Ingrese la longitud del Cateto 2");
		float c2 = sc.nextFloat();
		float hipotenusa = (float)Math.sqrt((Math.pow(c1, 2) + Math.pow(c2, 2)));
		System.out.println("La longitud de la hipotenusa es de: "+ hipotenusa);
	}
	/*************************************************************/
	static void ejercicio19() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		float[] tempDias = new float[30];
		Random rand = new Random();
		for (int i = 0; i < 30; i++) {
			
			if (flag == false) {
				System.out.print("Ingrese la temperatura del dia["+(i+1)+"]: ");
				tempDias[i] = sc.nextFloat();
				System.out.println("Deseas que se agregen a los dias restantes temperaturas aleatorias? (S/N)");
				if(sc.next().equals("s")) {
				flag = true;
				}
			} else {
				tempDias[i] = (float) ((float) rand.nextInt(35) + rand.nextInt(100)*0.001);
			}
		}
		tempMostrar(tempDias);
		linea();
		System.out.println("La temperatura promedio es de: "+tempPromedio(tempDias));
		System.out.println("La temperatura Maxima es de: "+tempMaxima(tempDias));
		System.out.println("La temperatura Minima es de: "+tempMinima(tempDias));
		
	}
	static void tempMostrar(float[] temp) {
		int flag = 0;
		for(int i = 0; i < temp.length;i++) {
			if (flag == 5) {
				flag = 0;
				System.out.println("");
			}
			System.out.print("["+temp[i]+"]");
			flag++;
		}
	}
	static float tempMinima(float[] temp) {
		float min = 0;
		for (int i = 0; i < temp.length;i++) {
			if (i == 0) {
				min = temp[i];
			} else {
				if (min > temp[i]) {
					min = temp[i];
				}
			}
		}
		return min;
	}
	static float tempMaxima(float[] temp) {
		float max = 0;
		for (int i = 0; i < temp.length;i++) {
			if (i == 0) {
				max = temp[i];
			} else {
				if (max < temp[i]) {
					max = temp[i];
				}
			}
		}
		return max;
	}
	static float tempPromedio(float[] temp) {
		float aux = 0;
		for (float tempDia : temp) {
			aux += tempDia;
		}
		return aux / temp.length;
	}
	/*************************************************************/
	static void ejercicio20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese otro numero entero: ");
		int num2 = sc.nextInt();
		Random rand = new Random();
		System.out.println("Numeros aleatorios entre "+num1+" y "+num2);
		for (int i = 0; i < 10;i++) {
			if (num1>num2){
				System.out.print(rand.nextInt(num1-num2)+num2+"-");
			} else {
				System.out.print(rand.nextInt(num2-num1)+num1+"-");
			}
			
		}
	}
	/*************************************************************/
	static void ejercicio21()  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un dia de la semana (1-7): ");
		int dia = sc.nextInt();
		switch(dia) {
			case 1://LUNES
				System.out.println("El dia ingresado("+dia+") lunes si es un dia laboral.");
				break;
			case 2://MARTES
				System.out.println("El dia ingresado("+dia+") martes si es un dia laboral.");
				break;
			case 3://MIERCOLES
				System.out.println("El dia ingresado("+dia+") miercoles si es un dia laboral.");
				break;
			case 4://JUEVES
				System.out.println("El dia ingresado("+dia+") jueves si es un dia laboral.");
				break;
			case 5://VIERNES
				System.out.println("El dia ingresado("+dia+") viernes si es un dia laboral.");
				break;
			case 6://SABADO
				System.out.println("El dia ingresado("+dia+") sabado no es un dia laboral.");
				break;
			case 7://DOMINGO
				System.out.println("El dia ingresado("+dia+") domingo no es un dia laboral.");
				break;
			default:
				System.out.println("El dia ingresado no es correcto.");
		}
	}
	/*************************************************************/
	static void ejercicio22() {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Ingrese un numero entero positivo:");
			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("El numero ["+numero+"] no es correcto, por favor ingrese un numero positivo.");
			}
		}while(numero < 0);
		int cifras = (int) Math.ceil(Math.log10(numero));
		
		System.out.println("El numero tiene en total "+cifras+" cifras./");
	}
	/*************************************************************/
	static void ejercicio23() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese otro numero entero: ");
		int num2 = sc.nextInt();
		float resultado = 0;
		System.out.println("Que operacion desea realizar(+|-|*|/|^|%): ");
		String operador = sc.next();
		switch (operador) {
			case "+":
				resultado = num1+num2;
				break;
			case "-":
				resultado = num1-num2;
				break;
			case "*":
				resultado = num1*num2;
				break;
			case "/":
				resultado = num1/num2;
				break;
			case "^":
				resultado = (float) Math.pow(num1, num2);
				break;
			case "%":
				resultado = num1%num2;
				break;
			default:
				System.out.println("Has ingresado un operador incorrecto.");
				return;
		}
		System.out.println(num1+" "+operador+" "+num2+" = "+resultado);
	}
	/*************************************************************/
	static void ejercicio23b() {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		float salario = 0;
		System.out.println("Ingrese el nombre: ");
		nombre = sc.next();
		System.out.println("Ingrese la edad: ");
		edad = sc.nextInt();
		System.out.println("Ingrese el salario: ");
		salario = sc.nextFloat();
		if (edad < 16) {
			System.out.println("No tienes edad para trabajar.");
			return;
		} else if (edad >19 && edad <= 50) {
			salario += salario*5/100;
		} else if(edad > 51 && edad <= 60) {
			salario += salario*10/100;
		}else if(edad > 60) {
			salario += salario*15/100;
		}
		System.out.println("Tu salario será de: "+salario+"$.");
	}
}
