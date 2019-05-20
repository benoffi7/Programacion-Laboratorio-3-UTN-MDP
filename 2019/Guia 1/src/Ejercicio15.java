import java.util.Scanner;

public class Ejercicio15 {

    public static void Menu(){

        float centigrados=0, fahrenheit=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados centigrados: ");
        centigrados=scan.nextFloat();
        scan.close();
        fahrenheit=Calcular_Fahrenheit(centigrados);

        System.out.println("Centigrados: "+centigrados);
        System.out.println("Fahrenheit: "+fahrenheit);

    }

    public static float Calcular_Fahrenheit(float centigrados){

        float fahrenheit=32+(9*centigrados/5);
        return fahrenheit;
    }
}
