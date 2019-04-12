package guia1;

import java.util.Scanner;

public class Ejercicio18 {
	
	static Scanner scan;
	static double catetoA;
	static double catetoB;
	static double hipotenusa;
	
	public static void resolucionEjer18()
	{
		scan = new Scanner(System.in);
		System.out.print("\nCateto A: ");
		catetoA = scan.nextDouble();
		System.out.print("\nCateto B: ");
		catetoB = scan.nextDouble();
		hipotenusa = hipotenusa();
		System.out.print("\nHipotenusa: "+hipotenusa);
	}
	
    public static double hipotenusa()
    {
    	hipotenusa = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));
    	return hipotenusa;
    }
}
