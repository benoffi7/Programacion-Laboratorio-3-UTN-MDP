package tp1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio16 {
    static Scanner sc = new Scanner(System.in);
    public static void dieciseisavo(){
        System.out.println("Ingrese el radio de su circulo: ");
        double radio = sc.nextDouble();
        double area = Ejercicio12.areaCirculo(radio);
        double longitud = longitudCirculo(radio);
        System.out.println("El area es de: "+area+" y la longitud de la circunferencia: "+longitud);
    }
    public static double longitudCirculo(double radio){
        double valor = 2*Math.PI*radio;
        return valor;
    }
}
