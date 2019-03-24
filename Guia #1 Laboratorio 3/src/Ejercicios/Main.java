package Ejercicios;

import java.util.Scanner;


public class Main {

	public static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println("Ingrese el número del ejercicio al cual desea ingresar del 1 al 24 exceptuando el 5: ");
		
		scan = new Scanner(System.in);
		
		int opcion=0;
		
		opcion=scan.nextInt();
		
		
			
			switch (opcion) {
			
			case 1:
				 int val = 0; 
				 int[] a = new int[10];
				 float promedio_Ej1 = 0; 
				 val = Ejercicio1.cargarArray(a, val);
				 promedio_Ej1 = Ejercicio1.promedioArray(a, val); 
				 System.out.println("El promedio es: " + promedio_Ej1);
			break;
			
			case 2:
				System.out.println("Ingrese el número que desea saber si es par o no: ");
				int num_Ej2=0;
				num_Ej2=scan.nextInt();
				boolean flag_Ej2=true;
				flag_Ej2=Ejercicio2.controlPar(num_Ej2);
				if(flag_Ej2==false) {
					System.out.println(num_Ej2 + " no es número par.");
				}
				else {
					System.out.println(num_Ej2 + " es número par.");
				}
			break;
			
			case 3:
				for (int num_Ej3 = 2; num_Ej3 <= 100; num_Ej3++) { 
					boolean flag_Ej3 = true; 
					flag_Ej3 =Ejercicio3.numPrimo(num_Ej3); 
						if (flag_Ej3==true) { 
						  System.out.println(num_Ej3); 
						} 
					  }
			break;
			
			case 4:
				int cantidad_Ej4= 0;
				System.out.println("Ingrese el número hasta el cual desea conocer los numeros primos existentes: ");
				cantidad_Ej4 = scan.nextInt();
				for (int num_Ej4 = 2; num_Ej4 <= cantidad_Ej4; num_Ej4++) {
					boolean flag_Ej4 = true;
					flag_Ej4 = Ejercicio4.numPrimo(num_Ej4);
					if (flag_Ej4 == true) {
						System.out.println(num_Ej4);
					} 
			}
			break;
			
			case 6:
				 int numero_Ej6=0; 
				  boolean flag_Ej6; 
				  Character control_Ej6 = new Character (' ');
				  control_Ej6='s'; 
				  while(control_Ej6=='s') {
				  System.out.println("Ingrese el número que desea saber si es primo o no: ");
				  numero_Ej6=scan.nextInt(); 
				  flag_Ej6=Ejercicio6.numPrimo(numero_Ej6); 
				  if(flag_Ej6==true) {
				  System.out.println(numero_Ej6 + " es número primo"); 
				  } 
				  else {
				  System.out.println(numero_Ej6 + " no es número primo"); 
				  }
				  System.out.println("¿Desea seguir ingresando números? s / n");
				  control_Ej6=scan.next().charAt(0); 
				  }
			break;
			
			case 7: 
				int suma_Ej7=0;
				suma_Ej7=Ejercicio7.sumaDiezNumNat();
				System.out.println("La suma de los diez primeros números naturales es: " + suma_Ej7);
			break;
			
			case 8:
				int cantidad_Ej8 = 0; 
				  cantidad_Ej8 = Ejercicio8.contadorPositivos(cantidad_Ej8);
				  System.out.println("La cantidad de numeros positivos ingresados es: " + cantidad_Ej8);
			break;
			
			case 9:
				  int anio_Ej9 = 0; 
				  boolean flag_Ej9 = false; 
				  System.out.println("Inserte el año: ");
				  anio_Ej9 = scan.nextInt(); 
				  flag_Ej9 = Ejercicio9.anioBisiesto(anio_Ej9);
				  if(flag_Ej9==true) {
				  System.out.println("El año es bisiesto.");
				  }
				  else {
					System.out.println("El año no es bisiesto.");
				  }
			break;
			
			case 10:
				 Character caracter_Ej10 = new Character (' '); 
				  int valorASCII_Ej10=0;
				  System.out.println("Ingrese el cáracter del cual desea saber su valor ASCII"); 
				  caracter_Ej10=scan.next().charAt(0);
				  valorASCII_Ej10=Ejercicio10.asciiValorInt(caracter_Ej10);
				  System.out.println("El valor ASCII de " + caracter_Ej10 + " es: " + valorASCII_Ej10);
			break;
			
			case 11:
				 int num1_Ej11=0, num2_Ej11=0, rta_Ej11=0;
				  System.out.println("Ingrese los numeros a multiplicar: ");
				  System.out.println("Primer numero: "); num1_Ej11=scan.nextInt();
				  System.out.println("Segundo numero: "); num2_Ej11=scan.nextInt();
				  rta_Ej11=Ejercicio11.multiplicacionDosNum(num1_Ej11, num2_Ej11);
				  System.out.println("El resultado de " + num1_Ej11 + " * " + num2_Ej11 + " es: " + rta_Ej11);
			break;
			
			case 12:
				  int opcion_Ej12=0;
				  System.out.println("Ingrese la figura de la cual desea calcular el área: ");
				  System.out.println("1. Rectángulo"); 
				  System.out.println("2. Cuadrado");
				  System.out.println("3. Triángulo"); 
				  System.out.println("4. Círculo");
				  opcion_Ej12=scan.nextInt(); 
				  Ejercicio12.menuCalcularAreas(opcion_Ej12);
			break;
			
			case 13:
				String nombre_Ej13 = new String (""); 
				  System.out.println("Ingrese su nombre: ");
				  nombre_Ej13=scan.next(); 
				  Ejercicio13.mostrarMensaje(nombre_Ej13);
			break;
			
			case 14:
				  int num_Ej14=0, rtaDoble_Ej14=0, rtaTriple_Ej14=0;
				  System.out.println("Ingrese un número: "); 
				  num_Ej14=scan.nextInt();
				  rtaDoble_Ej14=Ejercicio14.dobleDelNum(num_Ej14); 
				  System.out.println("El doble de " + num_Ej14 + " es: " + rtaDoble_Ej14); 
				  rtaTriple_Ej14=Ejercicio14.tripleDelNum(num_Ej14);
				  System.out.println("El triple de " + num_Ej14 + " es: " + rtaTriple_Ej14);
			break;
			
			case 15:
				float gradosC_Ej15=0, gradosF_Ej15=0;
				  System.out.println("Ingrese los grados centígrados: ");
				  gradosC_Ej15=scan.nextFloat();
				  gradosF_Ej15=Ejercicio15.deCentigradoAFarenheit(gradosC_Ej15);
				  System.out.println(gradosC_Ej15 + " °C son " + gradosF_Ej15 + " °F");
			break;
			
			case 16:
				 float radio_Ej16=0, perimetro_Ej16=0, area_Ej16=0;
				  System.out.println("Ingrese el radio del círculo en centímetros: ");
				  radio_Ej16=scan.nextFloat(); 
				  perimetro_Ej16=Ejercicio16.perimetroCirculo(radio_Ej16);
				  System.out.println("El perímetro del círculo es: " + perimetro_Ej16 + " centímetros."); 
				  area_Ej16=Ejercicio16.areaCirculo(radio_Ej16);
				  System.out.println("El área del círculo es: " + area_Ej16 + " centímetros cuadrados.");
			break;
			
			case 17:
				  float velocidadKM_Ej17=0, velocidadMS_Ej17=0;
				  System.out.println("Ingrese la velocidad en KM: ");
				  velocidadKM_Ej17=scan.nextFloat();
				  velocidadMS_Ej17=Ejercicio17.pasarDeKMAMS(velocidadKM_Ej17);
				  System.out.println(velocidadKM_Ej17 + " Km/h son " + velocidadMS_Ej17 + " m/s");
			break;
			
			case 18:
				  float cateto1_Ej18=0, cateto2_Ej18=0, hipotenusa_Ej18=0;
				  System.out.println("Ingrese los catetos del triangulo rectangulo: ");
				  System.out.println("Cateto menor: "); cateto1_Ej18=scan.nextFloat();
				  System.out.println("Cateto mayor: "); cateto2_Ej18=scan.nextFloat();
				  hipotenusa_Ej18=Ejercicio18.calcularHipotenusa(cateto1_Ej18, cateto2_Ej18);
				  System.out.println("La hipotenusa tiene como valor: " + hipotenusa_Ej18);
			break;
			
			case 19:
				  Ejercicio19.infomacionTemperaturas();
			break;
			
			case 20:
				  int num1_Ej20=0, num2_Ej20=0; 
				  System.out.println("Ingrese los numeros entre los cuales desea que se generen 10 números aleatorios: ");
				  System.out.println("Numero mínimo: "); 
				  num1_Ej20=scan.nextInt();
				  System.out.println("Numero máximo: "); 
				  num2_Ej20=scan.nextInt();
				  Ejercicio20.generarNumRandom(num1_Ej20, num2_Ej20);
			break;
			
			case 21:
				  String dia_Ej21 = new String(""); 
				  System.out.println("Ingrese el día de la semana que desea saber si pertenece a un día laboral o no: "); 
				  dia_Ej21 = scan.next(); 
				  dia_Ej21=dia_Ej21.toLowerCase();
				  Ejercicio21.menuDiaLaboral(dia_Ej21);
			break;
			
			case 22:
				int numero_Ej22=0, cifras_Ej22=0;
				System.out.println("Ingrese el número del cual desea conocer su cantidad de cifras: ");
				numero_Ej22=scan.nextInt();
				if(numero_Ej22<0){
				System.out.println("El número ingresado no es válido.");
				}
				else {
				cifras_Ej22=Ejercicio22.cantidadCifras(numero_Ej22);
				System.out.println("La cantidad de cifras del número " + numero_Ej22 + " es " + cifras_Ej22);
				}
			break;
			
			case 23:
				 System.out.println("Bienvenido/a a la Calculadora Polaca Inversa App");
				  System.out.println("Ingrese el signo de la operación que desea realizar: ");
				  System.out.println(" + : suma de los operandos");
				  System.out.println(" - : resta de los operandos");
				  System.out.println(" * : multiplicación de los operandos");
				  System.out.println(" / : división de los operandos");
				  System.out.println(" ^ : 1° operando como base y 2º como exponente");
				  System.out.println(" % :  módulo, resto de la división entre el operando 1 y el operando 2"); 
				  String opcion_Ej23 = new String (" "); 
				  opcion_Ej23=scan.next();
				  Ejercicio23.menuCalculadora(opcion_Ej23);
			break;
			
			case 24:
				String nombre_Ej24 = new String (" "); 
				  int edad_Ej24=0; 
				  float salario_Ej24=0;
				  System.out.println("Ingrese su nombre: "); 
				  nombre_Ej24=scan.next();
				  System.out.println("Ingrese su edad: "); 
				  edad_Ej24=scan.nextInt(); 
				  if(edad_Ej24>16) {
				  System.out.println("Ingrese su salario: "); 
				  salario_Ej24=scan.nextFloat();
				  Ejercicio24.calcularSalarioPorEdad(edad_Ej24, salario_Ej24, nombre_Ej24); 
				  } 
				  else {
				  System.out.println(nombre_Ej24 + ", usted no tiene edad para trabajar."); 
				  }
			break;
			
			default:
				System.out.println("Opción inválida.");
				
		    break;
				 
		}
	}

}
