import java.util.Scanner;

public class Ejercicio19 {
    public static final int dimencion=30;
    public static void Menu(){

        int[] temperaturas=new int[dimencion];
        int max=0,min=0;
        float prom=0;
        Scanner scan=new Scanner(System.in);

        for (int i=0;i<dimencion;i++){
            System.out.println("Ingrese la temperatura: ");
            temperaturas[i]=scan.nextInt();
        }
        scan.close();
        max=Temperatura_Maxima(temperaturas);
        min=Temperatura_Minima(temperaturas);
        prom=Ejercicio1.Sacar_Promedio(temperaturas,dimencion);
        System.out.println("Temperatura maxima: "+max);
        System.out.println("Temperatura minima: "+min);
        System.out.println("Temperatura promedio: "+prom);
    }

    public static int Temperatura_Maxima(int temperaturas[]){
        int max=temperaturas[0];

        for(int i=1;i<dimencion;i++){
            if(temperaturas[i]>max){
                max=temperaturas[i];
            }
            i++;
        }
        return max;
    }

    public static int Temperatura_Minima(int temperaturas[]){
        int min=temperaturas[0];

        for(int i=1;i<dimencion;i++){
            if(temperaturas[i]<min){
                min=temperaturas[i];
            }
            i++;
        }
        return min;
    }
}
