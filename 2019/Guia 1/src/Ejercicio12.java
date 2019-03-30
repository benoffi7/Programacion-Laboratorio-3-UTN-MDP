import java.util.Scanner;

public class Ejercicio12 {

    public static void Menu(){

        Scanner scan= new Scanner(System.in);
        int condicion=0;
        String continuar="Si";
        float area=0,base=0,altura=0;
        while (continuar.equalsIgnoreCase("Si")) {

            System.out.println("Que area calcular? ");
            System.out.println("1-Rectangulo");
            System.out.println("2-Cuadrado");
            System.out.println("3-Triangulo");
            System.out.println("4-Circulo");

            condicion = scan.nextInt();

            switch (condicion) {
                case 1:
                    System.out.println("Ingrese la base: ");
                    base = scan.nextFloat();
                    System.out.println("Ingrese la altura: ");
                    altura = scan.nextFloat();

                    area = Calcular_Area_Rectangulo(base, altura);
                    System.out.println("Area= " + area);
                    break;
                case 2:
                    System.out.println("Ingrese la medida de un lado: ");
                    base = scan.nextFloat();
                    area = Calcular_Area_Cuadrado(base);
                    System.out.println("Area= " + area);
                    break;
                case 3:
                    System.out.println("Ingrese la base: ");
                    base = scan.nextFloat();
                    System.out.println("Ingrese la altura: ");
                    altura = scan.nextFloat();

                    area = Calcular_Area_Triangulo(base, altura);
                    System.out.println("Area= " + area);
                    break;
                case 4:
                    System.out.println("Ingrese el radio: ");
                    base = scan.nextFloat();
                    area = Calcular_Area_Circulo(base);
                    System.out.println("Area= " + area);
                    break;
                default:
                    break;
            }


            System.out.println("Calcular otra cosa?(Si/No) ");
            continuar=scan.next();
        }
        scan.close();
    }

    public static float Calcular_Area_Rectangulo(float base,float altura){
        float area=base*altura;
        return area;
    }

    public static float Calcular_Area_Cuadrado(float lado){
        float area=(float)Math.pow(lado,2);
        return area;
    }

    public static float Calcular_Area_Triangulo(float base, float altura){
        float area=(float)0.5*(base*altura);
        return area;
    }

    public static float Calcular_Area_Circulo(float radio){
        float area=(float) Math.PI*(float)Math.pow(radio,2);
        return area;
    }
}
