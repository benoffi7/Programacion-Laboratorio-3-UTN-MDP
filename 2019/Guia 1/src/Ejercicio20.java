import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {
    public static final int dimencion=10;
    public static void Menu(){

        int num_menor=0,num_mayor=0;
        int[] arreglo=new int[dimencion];
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese el numero menor: ");
        num_menor=scan.nextInt();
        System.out.println("Ingrese el numero mayor: ");
        num_mayor=scan.nextInt();
        scan.close();
        Generar_Arreglo_random_Entre_Dos_Numeros(arreglo,num_mayor,num_mayor);
        Ejercicio1.Mostar_Arreglo_Enteros(arreglo,dimencion);

    }

    public static void Generar_Arreglo_random_Entre_Dos_Numeros(int arreglo[], int min, int max){
        int rango=0;
        rango=(max-min)+1;
        for(int i=0;i<dimencion;i++){
            arreglo[i]= (int)Math.floor(Math.random()*max-min)+min;
            System.out.println("aa: "+arreglo[i]);
        }
    }
}
