import java.util.Scanner;

public class Ejercicio13 {

    public static void Menu(){

        String nombre;
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre=scan.nextLine();
        scan.close();
        System.out.println("Buenos dias "+nombre);
    }
}
