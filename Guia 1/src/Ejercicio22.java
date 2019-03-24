import java.util.Scanner;

public class Ejercicio22 {

    public static void Menu(){
        int num=0, cifras=0;
        Scanner scan=new Scanner(System.in);
        boolean condicion=true;
        while (condicion){
            System.out.println("Ingrese un numero entero: ");
            num=scan.nextInt();
            if(num>0){

                cifras=(int)(Math.log10(num)+1);
                if(cifras>0){
                    System.out.println("El numero de cifras de "+num+" es de "+cifras);
                    condicion=false;
                }
                else {
                    System.out.println("El numero de cifras es menor que uno, intentelo nuevamente.");
                }
            }
            else{
                System.out.println("El numero debe ser positivo, intentelo nuevamente.");
            }
        }
        scan.close();

    }
}
