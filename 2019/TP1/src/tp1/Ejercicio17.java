package tp1;
import java.util.Scanner;
public class Ejercicio17 {
    static Scanner sc = new Scanner(System.in);
    public static void decimoseptimo(){
        System.out.println("Ingrese una velocidad en km/h: ");
        double kmh = sc.nextDouble();
        double ms = kmhtoms(kmh);
        System.out.println("La velocidad en m/s es de: "+ms);
    }
    public static double kmhtoms(double kmh){
        double ms = (kmh*1000)/3600;
        return ms;
    }
}
