import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static final int dimencion=5;

    public static void Menu(){

        int[] arreglo= new int[dimencion];
        Arrays.fill(arreglo,0);
        int cant_elementos=0;
        float prom=0;
        cant_elementos=Cargar_Arreglo_Enteros(arreglo);
        Mostar_Arreglo_Enteros(arreglo,cant_elementos);
        prom=Sacar_Promedio(arreglo,cant_elementos);
        System.out.println("promedio: "+prom);

    }

    public static int Cargar_Arreglo_Enteros(int arreglo[]){

        int i=0;
        String condicion="Si";
        Scanner scan= new Scanner(System.in);

        while((condicion.equalsIgnoreCase("Si")) && (i<dimencion)){

            System.out.println("Ingrese un numero: ");
            arreglo[i]=scan.nextInt();
            i++;
            System.out.println("Desea cargar otro numero?(Si/No) ");
            condicion=scan.next();
        }
        scan.close();
        return i;
    }

    public static void Mostar_Arreglo_Enteros(int arreglo[], int cant_elementos){

        int i=0;
        System.out.println("Arreglo: ");
        while(i<cant_elementos){
            System.out.println(""+arreglo[i]);
            i++;
        }
    }

    public  static int Sumar_Arreglo_Enteros(int arreglo[], int cant_elementos){

        int suma=0,i=0;
        while(i<cant_elementos){

            suma+=arreglo[i];
            i++;
        }

        return suma;
    }

    public static float Sacar_Promedio(int arreglo[],int cant_elementos){
        float prom=0;
        int suma=0;
        suma=Sumar_Arreglo_Enteros(arreglo,cant_elementos);
        prom=suma/cant_elementos;
        return prom;
    }
}
