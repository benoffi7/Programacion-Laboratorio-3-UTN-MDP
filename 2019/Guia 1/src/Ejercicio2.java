import java.util.Scanner;

public class Ejercicio2 {

    public static void Menu(){
        Scanner scan=new Scanner(System.in);
        int num=0;
        boolean bandera=false;
        System.out.println("Ingrese un numero: ");
        num=scan.nextInt();
        scan.close();
        bandera=Comprobar_paridad(num);
        if (bandera){
            System.out.println("El numero es par.");
        }
        else{
            System.out.println("El numero es impar.");
        }
    }

    public static boolean Comprobar_paridad(int num){

        boolean bandera=false;
        if(num%2==0){
            bandera=true;
        }
        return bandera;
    }
}
