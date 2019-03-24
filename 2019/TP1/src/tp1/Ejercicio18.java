package tp1;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio18 {
    static Scanner sc = new Scanner(System.in);
    public static void dieciochoavo(){
        System.out.println("Ingrese longitud de cateto A: ");
        double catetoA = sc.nextDouble();
        System.out.println("Ingrese longitud de cateto B: ");
        double catetoB = sc.nextDouble();
        double hipotenusa = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        hipotenusa = Math.sqrt(hipotenusa);
        System.out.println("La hipotenusa del triangulo rectangulo es: "+hipotenusa);
    }
}
