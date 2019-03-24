package tp1.guia1;

import java.util.Scanner;
import static tp1.guia1.TP1Guia1.scan;


public class Ejercicio5 {

    public static boolean EsPrimo() {
        int contador = 2;
        int numero;
        boolean primo = true;

        scan = new Scanner(System.in);
        System.out.println("Ingrese numero...");
        numero = scan.nextInt();

        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        if(primo == true){
            System.out.println("ITS CHARIZARD!!!(es primo)...");
        }
        else
            System.out.println("ITS TOTODILE!!!(no es primo)...");

        scan.close();
        return primo;
    }

}
