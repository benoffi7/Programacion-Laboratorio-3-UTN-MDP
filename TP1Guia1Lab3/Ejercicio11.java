package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;
import java.lang.Math;

public class Ejercicio11 {
    public static void Opciones(){
        int opcion =0;
        int rectangulo=0;
        int cuadrado =0;
        int triangulo =0;
        double circulo =0;

        System.out.println("Eliga la opcion a calcular...");
        System.out.println("1) rectangulo | 2) cuadrado | 3) triangulo | 4) circulo | 5) Exit ");
        scan = new Scanner(System.in);
        opcion = scan.nextInt();
        switch(opcion){
            case 1:
                rectangulo = AreaR();
                System.out.println("El area del rectangulo es... " + rectangulo);
                break;
            case 2:
                cuadrado = AreaC();
                System.out.println("El area del cuadrado es... " + cuadrado);
                break;
            case 3:
                triangulo = AreaT();
                System.out.println("El area del triangulo es... " + triangulo);
                break;
            case 4:
                circulo = AreaO();
                System.out.println("El area del circulo es... " + circulo);
                break;
            case 5:
                break;
            default:
                Opciones();
        }
        scan.close();
    }
    public static int AreaR(){
        int base=0;
        int altura=0;
        int area =0;
        System.out.println("RECTANGULO ");
        System.out.println("Ingrese la base ");
        scan = new Scanner(System.in);
        base = scan.nextInt();

        System.out.println("Ingrese la altura ");
        scan = new Scanner(System.in);
        altura = scan.nextInt();

        area = (base * altura);
        scan.close();
        return area;
    }

    public static int AreaC(){
        int altura=0;
        int area =0;
        System.out.println("CUADRADO ");
        System.out.println("Ingrese la altura ");
        scan = new Scanner(System.in);
        altura = scan.nextInt();

        area = (altura * altura);
        scan.close();
        return area;
    }

    public static int AreaT(){
        int altura=0;
        int base =0;
        int area =0;
        System.out.println("TRIANGULO ");
        System.out.println("Ingrese la altura ");
        scan = new Scanner(System.in);
        altura = scan.nextInt();

        System.out.println("Ingrese la altura ");
        scan = new Scanner(System.in);
        altura = scan.nextInt();

        area = (base * altura)/2;
        scan.close();
        return area;
    }
    public static double AreaO(){
        int radio=0;
        double area =0;
        System.out.println("CIRCULO ");
        System.out.println("Ingrese la altura ");
        scan = new Scanner(System.in);
        radio = scan.nextInt();

        area = (3.14 * (Math.pow(radio,2)));
        scan.close();
        return area;
    }


}
