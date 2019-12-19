
import java.util.Scanner;

public class weather {

    public static Scanner scan = new Scanner(System.in);

    public static int[] tempDia = new int[30];

    public static void cargarTemp() {

        for (int i = 0; i < 30; i++) {
            System.out.print("Ingrese la temperatura del dia " + (i + 1) + ": ");
            tempDia[i] = scan.nextInt();
        }

    };

    public static int minTemp() {

        int min = tempDia[0];
        for (int i = 0; i < 30; i++) {

            if (tempDia[i] < min) {

                min = tempDia[i];

            }

        }
        return min;
    };

    public static int maxTemp() {

        int max = tempDia[0];
        for (int i = 0; i < 30; i++) {

            if (tempDia[i] > max) {

                max = tempDia[i];

            }

        }
        return max;
    };

    public static double promedioTemp() {

        int prmd = tempDia[0];
        for (int i = 1; i < 30; i++) {

            prmd = prmd + tempDia[i];

        }
        return prmd / 30;

    };

};