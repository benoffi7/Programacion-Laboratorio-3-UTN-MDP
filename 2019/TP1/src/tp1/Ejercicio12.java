package tp1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio12 {
    static Scanner sc = new Scanner(System.in);
    public static void doceava(){
        System.out.println("Seleccione la figura del area que desea calcular: ");
        System.out.println("1- Rectángulo");
        System.out.println("2- Cuadrado");
        System.out.println("3- Triangulo");
        System.out.println("4- Circulo");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                basexaltura();
                break;
            case 2:
                basexaltura();
                break;
            case 3:
                basexaltura();
                break;
            case 4:
                System.out.println("Ingrese el radio del circulo: ");
                areaCirculo(sc.nextDouble());
                break;
            default:
                break;
        }
    }
    public static int basexaltura(){
        System.out.println("Ingrese base y altura: ");
        int rta = Ejercicio11.onceava(sc.nextInt(),sc.nextInt()); //grax menor acoplamiento
        System.out.println("El area de la figura es: "+ rta);
        return rta;
    }
    public static double areaCirculo(double radio){
        radio = Math.pow(radio, 2);
        radio *= Math.PI;
        System.out.println("El area del circulo es: "+radio);
        return radio;
    }
}
