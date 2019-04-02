package app;

public class Main {

	public static void main(String[] args) {
		
		/// PUNTO 1
		//Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. Realizar variantes 
		//con arreglos ya inicializados e ingreso por teclado.		
		//REUTILIZANDO FUNCIONES PARA OTROS EJERCICIOS FUNCIONA BIEN
		//int tam = 10; int [] arreglito = new int[tam]; Ejercicio1.ScanearArrayInt(arreglito, tam);		
		Ejercicio1Arreglos.Punto1(); /// esta funcion llama a todas las anteriores dentro de ella
	
		/// PUNTO 2
		//Ejercicio nº2: Calcular si un número es par o no. 
		Ejercicio2parimpar.VerificacionPar();
		
		/// PUNTO 3
		//Ejercicio nº3: Mostrar los primeros 100 números primos.
		//System.out.print("\nEjercicio 3:\n\n");
		Ejercicio3Primos.Primitos();
	
		/// PUNTO 4
		//Ejercicio nº4: Mostrar los primeros n números primos.
		Ejercicio4Nprimos.Nprimitos();
		
		/// PUNTO 6
		//Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo
		Ejercicio6RevisionPrima.RevisionPrima();
		
		/// PUNTO 7
		//Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.
		Ejercicio7SumaNaturales.SumaNatural();
		
		/// PUNTO 8
		// Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos
		//ingresa un usuario. 
		Ejercicio8SumarCantidadPositivos.SumarContarPositivo();
		
		/// PUNTO 9
		//Ejercicio nº9: Revisar si un año es bisiesto o no.1
		Ejercicio9Bisiesto.AnioBisiesto();		
		
		/// PUNTO 10
		//Ejercicio nº10: Encontrar el valor ASCII de un carácter.
		Ejercicio10valorASCII.ASCIIdelCaracter();
		
		/// PUNTO 11 
		// Ejercicio nº11: Multiplicar dos números. 
		//float numero1 =  4.12f, numero2 =  8.36f; /// asi se declaran los float
		float resultadoMulti = Ejercicio11mutiplicar2Numeros.Multiplicar(12.5f, 45.21f);
		System.out.print("\n\nEl resultado de la multiplicacion es: "+resultadoMulti);
		
		/// PUNTO 12
		//Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular.
		//Las opciones son: rectángulo, cuadrado, triangulo y circulo.
		Ejercicio12CalcularArea.CalcularArea();
		
		/// PUNTO 13
		//Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
		//“Buenos dias nombre_introducido”.
		Ejercicio13Saludar.Saludar();		
		
		/// PUNTO 14
		//Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga
		//y muestre por pantalla el doble y el triple de ese número.
		Ejercicio14TrabajarNum.DuplicarTriplicar();
		
		/// PUNTO 15
		//Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a
		//grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados
		//a fahrenheit es:  F = 32 + ( 9 * C / 5)
		Ejercicio15CaF.CelciusaFaren();
		
		/// PUNTO 16
		//Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia
		//y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar
		//el uso de la librería Math.
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		Ejercicio16Circunferncia.Circunferencia();
		
		/// PUNTO 17
		//Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se
		//lee por teclado.
		Ejercicio17KmaMs.KmaMs();
		
		/// PUNTO 18
		//Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo
		//y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		Ejercicio18catetos.calcular();
		
		/// PUNTO 19
		//Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule
		//el maximo, el minimo y el promedio.
		Ejercicio19TemMes.TemperaturasMes();
		Ejercicio19TemMes.MinimoTemp();
		Ejercicio19TemMes.MaximoTemp();
		Ejercicio19TemMes.promedioTemp();
		
		/// PUNTO 20
		//Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios 
		//entre esos números. Usa el método Math.random para generar un número entero aleatorio 
		Ejercicio20Naleatorios.NumerosAleatorios();
		
		/// PUNTO 21
		//Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos
		//diga si es un día laboral o no. Usa un switch para ello.
		Ejercicio21DiasLaburales.DiasLaburales();
	
		/// PUNTO 22
		//Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo)
		//y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos
		//muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al
		//mostrar el mensaje.
		Ejercicio22contarCifras.ContarCifras();
		
		// PUNTO 23		
		//Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp,
		//nos pedirá 2 operandos (int) y un signo aritmético (String), según este último 
		//se realizará la operación correspondiente. Al final mostrara el resultado en un
		//cuadro de diálogo.
		//Los signos aritméticos disponibles son:
		//+: suma los dos operandos.
		//-: resta los operandos.
		//*: multiplica los operandos.
		// /: divide los operandos, este debe dar un resultado con decimales (double)
		//^:  1º operando como base y 2º como exponente.
		//%:  módulo, resto de la división entre operando1 y operando2.
		Ejercicio23Calculadora.MenuCalcu();
		
		//Ejercicio nº24: Pide por teclado el nombre, edad y salario
		//y muestra el salario. 
		//Si es menor de 16 no tiene edad para trabajar
		//Entre 19 y 50 años el salario es un 5 por ciento más
		//Entre 51 y 60 años el salario es un 10 por ciento más
		//Si es mayor de 60 el salario es un 15 por ciento más
		Ejercicio24edades.EdadesLaburales();
	}
}
