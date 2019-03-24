package ejercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcionNumerica;
		char control,caracter;
		String nombre,dia,operador;
		int arregloE1Cargado[]= new int [5];
		int valorNumerico=0,valorNumerico2=0;
		float decimal1,decimal2;
		float arregloDeTemperaturas[] = new float [30];
		double radio,cateto1,cateto2;
		int arregloE1Inicializado[] = {1,2,3,4,5};
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("Ingrese el ejercicio que desea visualisar (del 1 al 23 seleccione cualquier otro para finalizar)");
			opcionNumerica = leer.nextInt();
			switch (opcionNumerica) {
			
				case 1:
					Ejercicio1.arregloPromedio(arregloE1Inicializado);
					for (int i = 0; i < arregloE1Inicializado.length; i++) {
						System.out.println("Ingrese un numero");
						arregloE1Cargado[i] = leer.nextInt();
					}
					Ejercicio1.arregloPromedio(arregloE1Cargado);
				break;
				
				case 2:
					System.out.println("Ingrese un numero");
					valorNumerico = leer.nextInt();
					Ejercicio2.parOImpar(valorNumerico);
				break;
				
				case 3:
					Ejercicio3.numerosPrimos();
				break;
				
				case 4:
					System.out.println("Se realizara la busqueda de los primeros n numeros primos, ingrese el valor de n");
					valorNumerico = leer.nextInt();
					Ejercicio4.numerosPrimos(valorNumerico);
				break;
				
				case 5:
					do{
						System.out.println("Ingrese un numero para averiguar si es primo");
						valorNumerico = leer.nextInt();
						Ejercicio5.elNumeroEsPrimo(valorNumerico);
						System.out.println("Desea ingresar otro numero? s/n");
						control = leer.next().charAt(0);
					}while (control=='s');
				break;
				
				case 6:
					Ejercicio6.sumaDeDiezPrimerosNaturales();
				break;
				
				case 7:
					do{
						System.out.println("Ingrese un numero");
						valorNumerico = leer.nextInt();
						valorNumerico2+=Ejercicio7.cuantosNumerosPositivos(valorNumerico);
						System.out.println("Desea ingresar otro numero? s/n");
						control = leer.next().charAt(0);
					}while (control=='s');
					System.out.println("Se ingresaron: " + valorNumerico2 + " numeros positivos");
				break;
				
				case 8:
					System.out.println("Ingrese el año que desea saber si es/fue/sera bisiesto");
					valorNumerico = leer.nextInt();
					Ejercicio8.añoBisiesto(valorNumerico);
				break;
				
				case 9:
					System.out.println("Ingrese el caracter que desea saber su codigo ASCII");
					caracter = leer.next().charAt(0);
					valorNumerico=Ejercicio9.valorNumericoASCIIDeCaracter(caracter);
					System.out.println("El codigo ASCII de" + caracter + "es " + valorNumerico);
				break;
				
				case 10:
					System.out.println("Dos numeros para multiplicar");
					valorNumerico = leer.nextInt();
					valorNumerico2 = leer.nextInt();
					Ejercicio10.multiplicarDosNumeros(valorNumerico, valorNumerico2);
				break;
				
				case 11:
					System.out.println("Ingrese que area desea calcular?\nOpciones: \n 1.Rectangulo\n 2.Cuadrado\n 3.Triangulo\n 4.Circulo");
					valorNumerico=leer.nextInt();
					Ejercicio11.preguntarQueAreaCalcular(valorNumerico);
				break;
				
				case 12:
					System.out.println("Ingrese su nombre");
					nombre = leer.next();
					Ejercicio12.buenosDiasX(nombre);
				break;
				
				case 13:
					System.out.println("Ingrese un numero para calcular su doble y triple");
					valorNumerico = leer.nextInt();
					Ejercicio13.dobleYTriple(valorNumerico);
				break;
				
				case 14:
					System.out.println("Ingrese los grados celsius que quiera pasar a fahrenheit ");
					decimal1 = leer.nextFloat();
					decimal2 = Ejercicio14.celsiusAFahrenheit(decimal1);
					System.out.println(decimal1 +" °C =" + decimal2+ " °F");
				break;
				
				case 15:
					System.out.println("Ingrese el radio de la circunferencia");
					radio = leer.nextDouble();
					Ejercicio15.circunferenciaYRadio(radio);
				break;
				
				case 16:
					System.out.println("Ingrese los Kilometros por hora a transformar");
					decimal1 = leer.nextFloat();
					decimal2=Ejercicio16.kilometroHoraAMetroSegundo(decimal1);
					System.out.println( String.format("%.2f", decimal1) +" Km/h equivalen a " + String.format("%.2f", decimal2) + " m/s");
				break;
				
				case 17:
					System.out.println("Ingrese los dos catetos de un triangulo");
					cateto1 = leer.nextDouble();
					cateto2 = leer.nextDouble();
					Ejercicio17.calculoDeHipotenusa(cateto1, cateto2);
				case 18:
					System.out.println("Ingrese las 30 temperaturas de un mes");
					for (int i = 0; i < arregloDeTemperaturas.length; i++) {
						arregloDeTemperaturas[i] = leer.nextFloat();
					}
					Ejercicio18.calcularTemperatura(arregloDeTemperaturas);
				break;
				
				case 19:
					System.out.println("Ingrese dos numeros por los cuales se generaran numeros randoms entre ellos");
					valorNumerico = leer.nextInt();
					valorNumerico2 = leer.nextInt();
					Ejercicio19.alabadoSeaElRNG(valorNumerico, valorNumerico2);
				break;
				
				case 20:
					System.out.println("elija un dia de la semana por favor");
					dia = leer.next();
					dia = dia.toLowerCase();
					Ejercicio20.diaLaboral(dia);
				break;
				
				case 21:
					System.out.println("Ingrese un numero natural para saber la cantidad de cifras que tiene");
					do {
						valorNumerico = leer.nextInt();
						if (valorNumerico<=0) {
							System.out.println("Error. El numero debe ser natural (de 1 en adelante)");
						}
					}while (valorNumerico<1);
					Ejercicio21.cantidadDeSifras(valorNumerico);
				break;
				
				case 22:
					System.out.println("Ingrese dos numeros y un operador suma (+) resta (-) multiplicacion (*) division (/) potencia (^) resto (%)");
					valorNumerico = leer.nextInt();
					valorNumerico2 = leer.nextInt();
					operador = leer.next();
					Ejercicio22.CalculadoraPolacaInversaApp(valorNumerico, valorNumerico2, operador);
				break;
				//Un buen momento para escuchar "Through the Fire and Flames" ante el ultimo ejercicio
				case 23:
					System.out.println("Ingrese su nombre, edad y salario");
					nombre = leer.next();
					valorNumerico = leer.nextInt();
					decimal1 = leer.nextFloat();
					Ejercicio23.calcularSalarioFinal(nombre, valorNumerico, decimal1);
				break;
				default:
					System.out.println("No a selecionado ningun ejercicio. El programa se finalizara");
				break;
			}	
		}while ((opcionNumerica>0) && (opcionNumerica<24));
		leer.close();
	}
}
