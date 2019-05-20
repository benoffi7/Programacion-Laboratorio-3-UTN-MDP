import java.util.Scanner;

public class Ejercicio8 {

    public static void Menu(){
        String condicion="Si";
        Scanner scan= new Scanner(System.in);
        int suma=0,num=0;
        while (condicion.equalsIgnoreCase("Si")) {

            System.out.println("Ingrese un numero: ");
            num = scan.nextInt();
            if (num >= 0) {
                suma += num;
            }

            System.out.println("Desea ingresar otro numero:(Si/No)");
            condicion = scan.next();
        }
        scan.close();
        System.out.println("La suma de todos los numeros positivos ingresados es: "+suma);

    }
}
