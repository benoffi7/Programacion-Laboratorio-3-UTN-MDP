import java.util.Scanner;

import Clases.Ejercicio1;
import Clases.Ejercicio10;
import Clases.Ejercicio12;
import Clases.Ejercicio13;
import Clases.Ejercicio15;
import Clases.Ejercicio16;
import Clases.Ejercicio18;
import Clases.Ejercicio19;
import Clases.Ejercicio2;
import Clases.Ejercicio20;
import Clases.Ejercicio21;
import Clases.Ejercicio22;
import Clases.Ejercicio23;
import Clases.Ejercicio24;
import Clases.Ejercicio3;
import Clases.Ejercicio6;
import Clases.Ejercicio7;
import Clases.Ejercicio8;
import Clases.Ejercicio9;

//Guia I

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scanf= new Scanner(System.in);
			//Ejercicio 1
			/*int []a= new int [5];
			double  promedio;
			
			Ejercicio1 ejercicio1=new Ejercicio1();
			ejercicio1.cargar_elementos(a);
			promedio=ejercicio1.sacar_promedio_array(a);
			ejercicio1.mostrar_array(a);
			System.out.println("El promedio es : " +promedio);
			
			*/
			//Ejercicio 2
			/*Boolean i;
			int a=10;
			Ejercicio2 ejercicio2= new Ejercicio2();
			i=ejercicio2.sacar_par(a);
			
			if(i == true) {
				System.out.println("Es par");
			}
			else {
				System.out.println("Es impar");
			}
			*/
			// Ejercicio 3 y 4
			/*
	          Ejercicio3 ejercicio3 =new Ejercicio3();
	          ejercicio3.mostrar_n_primos(100);

	          int cantidad;
	          cantidad=scanf.nextInt();
	          System.out.println("Ingrese la cantidad de numeros primos que quiere ver |:)|");
	          ejercicio3.mostrar_n_primos(cantidad);
			
			*/
			
			//Ejercicio 6
			/*
			Boolean flag;
			String control="si";
			Ejercicio6 ejercicio6= new Ejercicio6();
			
			while (control.equalsIgnoreCase("si")) {
	            System.out.println("Ingrese el numero para verificar si es primo");
	            int numero = scanf.nextInt();
	            flag = ejercicio6.esPrimo(numero);
	            if (flag == true) {
	                System.out.println("El numero es primo");
	            } else {
	                System.out.println("El numero no es primo");
	            }

	            System.out.println("Desea seguir cargando otro numero?");
	            control = scanf.next();

	        }*/
			
			//Ejercicio 7
			/*
			int suma=0;
			Ejercicio7 ejercicio7= new Ejercicio7();
			suma= ejercicio7.SumaNumerosNaturales();
			System.out.println("La suma de los primeros numeros naturales es de "+suma);
			*/
			//Ejercicio 8
			/*Boolean flag;
			int i;
			int cont=0;
			
			Ejercicio8 ejercicio8= new Ejercicio8();
			String control="si";
			
			while(control.equalsIgnoreCase("si")) {
				
				System.out.println("Ingrese un numero");
				i=scanf.nextInt();
				
				flag= ejercicio8.esPositivo(i);
				if(flag==true) {
					cont++;
				}
				
				System.out.println("Desea seguir cargando otro numero?");
	            control = scanf.next();
				
			}
			System.out.println("La cantidad de numeros positivos ingresados es de "+cont);
			*/
			//Ejercicio 9
			/*Boolean flag;
			int anio;
			Ejercicio9 ejercicio9= new Ejercicio9();
			
			System.out.println("Ingrese el anio ");
			anio= scanf.nextInt();
			
			flag=ejercicio9.esBisiesto(anio);
			
			if(flag==true) {
				System.out.println("El anio "+anio+ " es Bisiesto");
			}else {
				
				System.out.println("El anio "+ anio+ " no es Bisiesto");
			}*/
			
			//Ejercicio 10
			/*Ejercicio10 ejercicio10= new Ejercicio10();
			
			
			
			ejercicio10.obtener_valor_ascii();
			*/
			/*Ejercicio 11 
			  int numero1=2;
	        int numero2=2;
	        int resultado;
	
	        Ejercicio11 ejercicio11=new Ejercicio11();
	        resultado=ejercicio11.multiplicar(numero1,numero2);
	        System.out.println("El resultado de la multiplicacion es : " +resultado);	
			*/
			
			//Ejercicio 12
			/*
			int opcion;
			int areaT=0,areaR=0,areaCu=0;
			int altura=0,base=0;
			double radio=0,areaC=0;
			Ejercicio12 ejercicio12= new Ejercicio12();
			System.out.println("Elija una Opcion para sacar el Area");
			System.out.println("1)Triangulo" +
					"\n2)Rectangulo" +
					"\n3)Circulo"+
					"\n4)Cuadrado");
			opcion=scanf.nextInt();
			switch(opcion) {
			
			case 1:
				System.out.println("Escriba el valor de la altura");
				altura=scanf.nextInt();
				System.out.println("Escriba el valor de la base");
				base=scanf.nextInt();
				areaT=ejercicio12.areaTriangulo(base, altura);
				System.out.println("El area de su Triangulo es de: " + areaT);
				
				
				break;
				
			case 2:
				System.out.println("Escriba el valor de la altura");
				altura=scanf.nextInt();
				System.out.println("Escriba el valor de la base");
				base=scanf.nextInt();
				areaR=ejercicio12.areaRectangulo(altura, base);
				
				System.out.println("El area de su Rectangulo es de: " + areaR);

				break;
			
			case 3:
				System.out.println("Escriba el valor del radio");
				radio=scanf.nextDouble();
				
				areaC= ejercicio12.areaCirculo(radio);
				
				System.out.println("El area de su Circulo es de: " + areaC);

				break;
			
			case 4:
				
				System.out.println("Escriba el valor de la base");
				base=scanf.nextInt();
				
				areaCu= ejercicio12.areaCuadrado(base);
				
				System.out.println("El area de su Cuadrado es de: " + areaCu);

				
				break;
				
			case 0:
				opcion=0; 
				break;
			
			}
			*/
			
			//Ejercicio 13
			/*Ejercicio13 ejercicio13= new Ejercicio13();
			String nombre;
			System.out.println("Ingrese su Nombre");
			nombre=scanf.next();
			
			ejercicio13.saludar_como_buen_samaritano(nombre);
			*/
			//Ejercicio 14
			/*Ejercicio14 ejercicio14=new Ejercicio14();

	        int numero;

	        System.out.println("Ingrese el numero:");
	        numero=scanf.nextInt();

	        ejercicio14.numero_Doble_Triple(numero);
			
			
			
			//Ejercicio 15
			double gradoC=0,gradoF=0;
			Ejercicio15 ejercicio15= new Ejercicio15();
			
			System.out.println("Ingrese sus grados Celcius para convertir a Farenheit");
			gradoC=scanf.nextDouble();
			
			gradoF=ejercicio15.pasar_deCelcius_aFarenheit(gradoC);
			System.out.println("Grados Celcius : " +gradoC + "\nConvertido a Farenheit: "+gradoF);
			*/
			// Ejercicio 16 
			/*
	        Ejercicio16 ejercicio16=new Ejercicio16();
	        int radio;
	        System.out.println("Ingrese el valor de radio: ");
	        radio=scanf.nextInt();
	        ejercicio16.calcular_Longitud_Area(radio);
		
			*/
			//Ejercicio 17
			/*
	        int resultado;
	        int km;

	        Ejercicio17 ejercicio17 = new Ejercicio17();

	        System.out.println("Ingrese los kilometros a convertir a metros");
	        km=scanf.nextInt();
	        resultado=ejercicio17.conversion_km_m(km);

	        System.out.println("La conversion es: " +resultado);
	        
	        */
			//Ejercicio 18
	        /*
	        Ejercicio18 ejercicio18= new Ejercicio18();
	        
	        double hipotenusa=0,cateto1=12,cateto2=7;
	        
	        hipotenusa= ejercicio18.obtener_la_hipotenusa(cateto1, cateto2);
	        
	        System.out.println("La hipotenusa es : "+hipotenusa);
	        */
			
			//Ejercicio 19
			/*
			 Ejercicio19 ejercicio19=new Ejercicio19();
		       ejercicio19.calcular_temperaturas();
			*/
			
			
			////
			
			//Ejercicio 20
			/*
			Ejercicio20 ejercicio20= new Ejercicio20();
			
			int numero1=0,numero2=0;
			
			System.out.println("Ingrese el primer valor: ");
			numero1= scanf.nextInt();
			
			System.out.println("Ingrese el segundo valor: ");
			numero2= scanf.nextInt();
			
			ejercicio20.generar_numeros_random_entre_dosNumeros(numero1, numero2);
			*/
			
			//Ejercicio 21
			/*
			Ejercicio21 ejercicio21= new Ejercicio21();
			
			int opcion=0;
			
			System.out.println("Elija un dia de la semana");
			System.out.println("1)Domingo" +
					"\n2)Lunes" +
					"\n3)Martes"+
					"\n4)Miercoles"+
					"\n5)Jueves"+
					"\n6)Viernes"+
					"\n7)Sabado");
			opcion= scanf.nextInt();
			
			ejercicio21.es_un_dia_Laboral(opcion);
			
			*/
			
			//Ejercicio 22
			/*
			Ejercicio22 ejercicio22=new Ejercicio22();
	        int numero = 0;
	        System.out.println("Ingrese un numero positivo");

	            numero=scanf.nextInt();

	            while(numero<0)
	            {
	                System.out.println("Error ingresaste un numero negativo ,intentalo denuevo champion :)");
	                numero=scanf.nextInt();
	            }

	            ejercicio22.positivo(numero);
			
			
			*/
			
						
			//Ejercicio 23
			/*
			Ejercicio23 ejercicio23= new Ejercicio23();
			
			int numero1=0,numero2=0;
			String signoAritmetico;
			
			System.out.println("Ingrese el primer valor");
			numero1= scanf.nextInt();
			System.out.println("Ingrese el segundo valor");
			numero2=scanf.nextInt();
			System.out.println("Ingrese la operacion a realizar (+ (suma) , - (resta) , * (multiplicacion) , / (division) , ^ (potenciar) , % (sacar resto) ) valor");
			signoAritmetico=scanf.next();
			
			ejercicio23.calculadoraPolacaInversaAPP(numero1, numero2, signoAritmetico);
			*/
			
			
			//Ejercicio 24
			/*
	        Ejercicio24 ejercicio24=new Ejercicio24();
	        int edad;
	        double salario;
	        String nombre;

	        System.out.println("Ingrese el nombre:");
	        nombre=scanf.nextLine();

	        System.out.println("Ingrese la edad:");
	        edad=scanf.nextInt();

	        if(edad<18)
	        {

	            System.out.println("Sos menor amigo,ingresa bien tu edad :smiley: ");

	        }
	        else
	        {
	            System.out.println("Ingrese el salario:");
	            salario=scanf.nextDouble();
	            ejercicio24.consultar_salario(salario, edad, nombre);
	        }
			*/
			
			
			
			
			
			
			
			
			
			
			

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}
	
	
	
	
	
	

	

}
