import java.util.Scanner;

public class Ejercicio11 {

    public static void Menu(){

        int num1=0, num2=0, rta=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1=scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=scan.nextInt();
        scan.close();
        rta=Multiplicar_dos_numeros(num1,num2);
        System.out.println(num1+"x"+num2+"="+rta);
    }

    public static int Multiplicar_dos_numeros(int num1, int num2){
        int rta=0;

        rta=num1*num2;

        return rta;
    }
}
