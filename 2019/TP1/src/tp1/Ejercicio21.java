package tp1;
import java.util.Scanner;
public class Ejercicio21 {
    static Scanner sc = new Scanner(System.in);
    public static void vigesimoPrimero(){
        System.out.println("Ingrese un dia de la semana en minusculas: ");
        String dia = sc.nextLine();
        switch(dia){
            case "lunes":
                System.out.println("Dia laboral.");
                break;
            case "martes":
                System.out.println("Dia laboral.");
                break;
            case "miercoles":
                System.out.println("Dia laboral.");
                break;
            case "jueves":
                System.out.println("Dia laboral.");
                break;
            case "viernes":
                System.out.println("Dia laboral.");
                break;
            case "sabado":
                System.out.println("Dia laboral.");
                break;
            case "domingo":
                System.out.println("Dia NO laboral.");
                break;
            default:
                System.out.println("El dia ingresado no existe, recuerde escribirlo sin mayusculas.");
                break;
        }
    }
}
