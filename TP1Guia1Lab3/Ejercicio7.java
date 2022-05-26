package tp1.guia1;
import java.util.Scanner;
import static  tp1.guia1.TP1Guia1.scan;

public class Ejercicio7 {
    public static int Positivos(){
        int[] aPositivos = new int [100];
        int x=0;
        int suma=0;

        scan = new Scanner(System.in);
        System.out.println("Ingrese numeros positivos...");

        while (x < 5) {
            aPositivos[x] = scan.nextInt();
            x++;
        }
        System.out.println("Cargado exitosamente!!!");

        for(int i = 0;i < 5 ;i++){
            if (aPositivos[i] >= 0) {
                suma++;
            }
        }
        System.out.println("La cantidad de elementos positivos es..." + suma);
        return suma;
    }
}
