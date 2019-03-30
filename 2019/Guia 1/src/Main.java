import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ejercicio=0;
        String condicion="Si";

        while (condicion.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el numero de ejercicio: ");
            ejercicio = scan.nextInt();
            switch (ejercicio) {
                case 1:
                    Ejercicio1.Menu();
                    break;
                case 2:
                    Ejercicio2.Menu();
                    break;
                case 3:
                    Ejercicio3.Menu();
                    break;
                case 4:
                    Ejercicio4.Menu();
                    break;
                case 6:
                    Ejercicio6.Menu();
                    break;
                case 7:
                    Ejercicio7.Menu();
                    break;
                case 8:
                    Ejercicio8.Menu();
                    break;
                case 9:
                    Ejercicio9.Menu();
                    break;
                case 10:
                    Ejercicio10.Menu();
                    break;
                case 11:
                    Ejercicio11.Menu();
                    break;
                case 12:
                    Ejercicio12.Menu();
                    break;
                case 13:
                    Ejercicio13.Menu();
                    break;
                case 14:
                    Ejercicio14.Menu();
                    break;
                case 15:
                    Ejercicio15.Menu();
                    break;
                case 16:
                    Ejercicio16.Menu();
                    break;
                case 17:
                    Ejercicio17.Menu();
                    break;
                case 18:
                    Ejercicio18.Menu();
                    break;
                case 19:
                    Ejercicio19.Menu();
                    break;
                case 20:
                    Ejercicio20.Menu();
                    break;
                case 21:
                    Ejercicio21.Menu();
                    break;
                case 22:
                    Ejercicio22.Menu();
                    break;
                case 23:
                    Ejercicio23.CalculadoraPolacaInversaApp();
                    break;
                case 24:
                    Ejercicio24.Menu();
                    break;
                default:
                    System.out.println("El ejercicio no existe.");
                    break;
            }

            System.out.println("Desea realizar otro ejercicio?(Si/No) ");
            condicion=scan.next();
        }
        scan.close();

    }
}
