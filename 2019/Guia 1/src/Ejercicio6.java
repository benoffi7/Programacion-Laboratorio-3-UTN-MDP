import java.util.Scanner;

public class Ejercicio6 {

    public static void Menu(){
        String condicion="Si";
        int num=0;
        boolean bandera=false;
        Scanner scan=new Scanner(System.in);
        while (condicion.equalsIgnoreCase("Si")){

            System.out.println("Ingrese el numero: ");
            num=scan.nextInt();
            bandera=Ejercicio3.Comprobar_Primo(num);
            if(bandera){
                System.out.println("El numero es primo.");
            }
            else{
                System.out.println("El numero no es primo.");
            }

            System.out.println("Desea ingresar otro numero:(Si/No) ");
            condicion=scan.next();
        }
        scan.close();
    }
}
