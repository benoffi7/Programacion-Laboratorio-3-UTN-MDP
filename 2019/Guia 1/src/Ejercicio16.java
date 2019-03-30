import java.util.Scanner;

public class Ejercicio16 {

    public static void Menu(){

        Scanner scan=new Scanner(System.in);
        float radio=0, area=0, longitud=0;

        System.out.println("Ingrese el radio: ");
        radio=scan.nextFloat();
        scan.close();
        area=Ejercicio12.Calcular_Area_Circulo(radio);
        longitud=Calcular_Longitud_Circunferencia(radio);

        System.out.println("Area= "+area);
        System.out.println("Longitud= "+longitud);
    }

    public static float Calcular_Longitud_Circunferencia(float radio){
        float longitud=2*(float)Math.PI*radio;
        return longitud;
    }
}
