import java.util.Scanner;

public class Ejercicio18 {

    public static void Menu(){

        float cateto1=0,cateto2=0, hipotenusa=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese la longitud del cateto 1: ");
        cateto1=scan.nextFloat();
        System.out.println("Ingrese la longitud del cateto 2: ");
        cateto2=scan.nextFloat();
        scan.close();
        hipotenusa=Calcular_Hipotenusa(cateto1,cateto2);
        System.out.println("Cateto 1: "+cateto1);
        System.out.println("Cateto 2: "+cateto2);
        System.out.println("Hipotenusa: "+hipotenusa);
    }

    public static float Calcular_Hipotenusa(float cateto1, float cateto2){
        float hipotenusa=(float) Math.sqrt((float)Math.pow(cateto1,2)+(float)Math.pow(cateto2,2));
        return hipotenusa;
    }
}
