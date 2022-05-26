package tp1.guia1;
import static tp1.guia1.TP1Guia1.scan;
import java.util.Scanner;

public class Ejercicio16 {
    public static void conversor() {
        scan = new Scanner(System.in);
        double velocidad;
        double aux = 0;
        System.out.println("Ingrese velocidad en km/h...");
        velocidad = scan.nextDouble();

        aux = (velocidad * 1000) / 3600;
        System.out.println("la velocidad es ..." + aux + "m/s");
    }
}
