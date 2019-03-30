import java.util.Scanner;

public class Ejercicio14 {

    public static void Menu(){

        int num=0,doble=0,triple=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        num=scan.nextInt();
        scan.close();
        doble=Calcular_Doble(num);
        triple=Calcular_Triple(num);

        System.out.println("Numero= "+num);
        System.out.println("Doble= "+doble);
        System.out.println("Triple= "+triple);
    }

    public static int Calcular_Doble(int num){
        int doble= num*2;
        return doble;
    }
    public static int Calcular_Triple(int num){
        int triple=num*3;
        return triple;
    }
}
