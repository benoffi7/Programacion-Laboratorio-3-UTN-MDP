package paquete;

import java.util.Scanner;

public class Main {
	
	public static float ingresarVelocidad ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Ingrese los km/h que quiere pasar a m/s: ");
		float kmH = scan.nextFloat();
		scan.close();
		return kmH;
	}
	public static float pasarKmHoraToMSeg ()
	{
		//float valorParaElPasaje = (5/18) ; Trate de hacer asi pero guarda el valor cero en vez de 5/18
		float valorConvertido = ingresarVelocidad() * 5/18 ;
		return valorConvertido;
	}
	
	public static void main(String[] args) {
		System.out.println("Esa velocidad en km/h es equivalente a " + pasarKmHoraToMSeg() + " m/s");
	}

}
