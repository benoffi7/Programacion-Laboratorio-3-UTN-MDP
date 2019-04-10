package tp1;
import java.util.Scanner;
public class Ejercicio15 {
    static Scanner sc = new Scanner(System.in);
    public static void quinceavo(){
        System.out.println("Ingrese temperatura en grados centigrados: ");
        double temp = sc.nextDouble();
        double rta = centigradosAFahrenheit(temp);
        System.out.println("Temperatura en grados Fahrenheit: "+rta);
    }
    public static double centigradosAFahrenheit(double cent){
        double valor = 32+(9*cent/5);
        return valor;
    }
}
