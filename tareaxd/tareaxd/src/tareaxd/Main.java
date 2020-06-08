package tareaxd;

import java.util.Scanner;

public class Main {

	public static Scanner scan;
	public static int[] a = new int[10];
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		long inicio,fin,tiempo;
		inicio=System.currentTimeMillis();
		String opcion=" ";
		boolean flag=true;
		while(flag==true) {
		System.out.println("Elija el  ejercicio al que quier acceder, no todos los numeros estan disponibles y existe el 23a y el 23b. 0 para salir");
		opcion=scan.next();
		switch (opcion) {
		case "1":
			Ejercicio1.promedioArrayMuestra();
			break;
		case "2":
			Ejercicio2.controlParMuestra();
			break;
		case "3":
			Ejercicio3.primosHastaN();
			break;
		case "6":
			Ejercicio6.primoControlMuestra();
			break;
		case "7":
			Ejercicio7.sumaNatDesdeNMuestra();
			break;
		case "8":
			Ejercicio8.cantNumPosIngresadosMuestra();
			break;
		case "9":
			Ejercicio9.bisiestoControlMuestra();
			break;
		case "10":
			Ejercicio10.asciitToIntMuestra();
			break;
		case "11":
			Ejercicio11.multAxBMuestra();
			break;
		case "12":
			Ejercicio12.menuAreas();
			break;
		case "13":
			Ejercicio13.saludarUsuario();
			break;
		case "14":
			Ejercicio14.multiplicarPor2y3();
			break;
		case "15":
			Ejercicio15.centigradosToFahrMuestra();
			break;
		case "16":
			Ejercicio16.areaCircunCirculo();
			break;
		case "17":
			Ejercicio17.kmhToMhMuestra();
			break;
		case "18":
			Ejercicio18.pitagorasConCatetosMuestra();
			break;
		case "19":
			Ejercicio19.informacionTemperaturas();
			break;
		case "20":
			Ejercicio20.numsRandomEntreXY(10);
			break;
		case "21":
			Ejercicio21.preguntarDiaHabil();
			break;
		case "22":
			Ejercicio22.cantidadCifras();
			break;
		case "23a":
			Ejercicio23A.calculadoraPolacaInversaApp();
			break;
		case "23b":
			Ejercicio23B.consultarSueldo();
			break;
		case "0":
		flag=false;
		break;
			default:
				System.out.println("La opcion seleccionada no se encuentra disponible");
				break;
		}
		}
fin=System.currentTimeMillis();
tiempo=fin-inicio;
System.out.println("Tiempo de ejecucion:"+tiempo);
	}

}
