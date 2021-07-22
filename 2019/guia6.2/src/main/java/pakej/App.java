package pakej;

import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int cant = 0;
        int cantSize = 0;
        boolean bulean = false;

        do {
            System.out.print("\nIngrese cuantas contraseñas van a ser ingresadas: ");
            bulean = scanInt();
            if (bulean == true) {
                cant = scan.nextInt();
            }
        } while (bulean == false);

        Lista contraseñas = new Lista(cant);

        System.out.print("\nIngrese el tamaño de las proximas contraseñas: ");

        do {
            bulean = scanInt();
            if (bulean == true) {
                cantSize = scan.nextInt();
            }
        } while (bulean == false);

        for (int i = 0; i < cant; i++) {

            Password password = new Password(cantSize);
            contraseñas.addPswrd(password);

        }

        System.out.println(contraseñas.mostrar());

    }

    public static boolean scanInt() {
        boolean bulean = false;

        if (scan.hasNextInt()) {
            bulean = true;
        } else {
            System.out.println("\nError: ingrese un numero...");
            scan.next();
        }

        return bulean;
    }

}
