package guia1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int op1;
		Scanner entero= new Scanner (System.in);
		System.out.println("Ingrese el numero de ejercicio 1-25");
		op1= entero.nextInt();
		switch (op1){
        case 1:
        {
        	int arregloCargado[]= new int[5];
    		int arregloInicializado[] = {1, 2, 3, 4, 5};
    		Scanner leer= new Scanner (System.in);
    		Ejercicio1.arregloPromedio(arregloInicializado);
    		for(int i = 0; i< arregloCargado.length; i++)
    		{
    			System.out.println("ingrese 5 numeros ");
    			arregloCargado[i]= leer.nextInt();
    		}
    		Ejercicio1.arregloPromedio(arregloCargado);
    		leer.close();
        	break;
        }
           
        case 2:
        {
        	Scanner leer= new Scanner (System.in);
        	System.out.println("Ejercicio 2");
    		System.out.println("Ingrese un numero para verificar si es par o no");
    		;
    		Ejercicio2.verificarParidad(leer.nextInt());
    		break;
        }
           
        case 3:
        	{
        		Ejercicio3.verificarSiEsPrimo();
        		break;
        	}
        case 7:
        {
        	Ejercicio7.encontrarSumaDiezNumeros();
        	break;
        }
           
        case 8:
        {
        	Ejercicio8.sumarPositivos();
        	break;
        }
        case 9:
        {
        	Ejercicio9.verificarBisiesto();
        	break;
        }
        case 10:
        {
        	Ejercicio10.encontrarASCII();
        	break;
        }
        case 11:
        {
        	Ejercicio11.multiplicar2Numeros();
        	break;
        }
        case 12:
        {
        	Ejercicio12.calcularAreas();
        	break;
        }
        case 13:
        {
        	Ejercicio13.mostrarNombre();
        	break;
        }
        case 14:
        {
        	Ejercicio14.calcularDobleTriple();
        	break;
        }
        case 15:
        {
        	Ejercicio15.calcularGrados();
        	break;
        }
        case 16:
        {
        	Ejercicio16.calcularLongitudYarea();
        	break;
        }
        case 17:
        {
        	Ejercicio17.pasarDeKMaMS();
        	break;
        }
        case 18:
        {
        	Ejericicio18.calcularHipotenusa();
        	break;
        }
        case 19:
        {
        	Ejercicio19.calcularTemperaturas();
        	break;
        }
        case 20:
        {
        	Ejercicio20.generarRandoms();
        	break;
        }
        case 21:
        {
        	Ejercicio21.diaLaboral();
        	break;
        }
        case 22:
        {
        	Ejercicio22.calcularDigitos();
        	break;
        }
        case 23:
        {
        	Ejercicio23.CalculadoraPolacaInversaApp();
        	break;
        }
        case 24:
        {
        	Ejercicio24.persona();
        	break;
        }
        
        
		}
		
	}
}

