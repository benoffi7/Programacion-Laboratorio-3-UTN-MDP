import java.util.Scanner;

public class Ejercicio17 {

    public static void Menu(){
        float kmh=0,ms=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese la velocidad en Km/h");
        kmh=scan.nextFloat();
        scan.close();
        ms=Pasar_de_KMH_a_MS(kmh);

        System.out.println("Km/h= "+kmh);
        System.out.println("M/s= "+ms);
    }

    public static float Pasar_de_KMH_a_MS(float kmh){
        float ms=kmh*1000/3600;
        return ms;
    }
}
