import java.util.Scanner;

public class Ejercicio10 {
        public static void Menu(){
            Scanner scan=new Scanner(System.in);
            char caracter;
            int caracter_ASCII=0;
            System.out.println("Ingrese el caracter: ");
            caracter=scan.next().charAt(0);
            scan.close();
            caracter_ASCII=(int)caracter;
            System.out.println(caracter+"="+caracter_ASCII);
        }
}
