package guia.uno;

import java.util.Scanner;

public class Ejercicio6 {

    private static Integer num = null;
    private static Scanner scan = new Scanner(System.in);
    private static String opcion = "";

    public static void mostrar() {
        do {
            System.out.println("Ingrese un número");
            num = scan.nextInt();
            
            if(saberPrimo(num)){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
            
            scan.nextLine();
            System.out.println("¿Desea seguir? (s/n)");
            opcion = scan.nextLine();
            
        } while (opcion.equals("s"));
    }

    public static boolean saberPrimo(Integer num) {
        int contador = 0;
        boolean primo = false;

        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                contador++;
            }
            primo = (contador == 2);
        }
        return primo;
    }
}
