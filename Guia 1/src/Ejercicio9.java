import java.util.Scanner;

public class Ejercicio9 {

    public static void Menu(){

        int anio=0;
        Scanner scan=new Scanner(System.in);
        boolean bandera=false, condicion=true;
        while(condicion) {
            System.out.println("Ingrese el a\u00f1o: ");
            anio = scan.nextInt();
            if (anio > 0) {
                bandera=Anio_Bisiesto(anio);
                if(bandera){
                    System.out.println("El a\u00f1o es bisiesto");
                }
                else{
                    System.out.println("El a\u00f1o no es bisiesto");
                }
                condicion=false;
            }
            else {
                System.out.println("El a\u00f1o no es valido.");
            }
        }
        scan.close();
    }

    public static boolean Anio_Bisiesto(int anio){
        boolean bandera=false;
        if((anio%4==0) && ((anio%100!=0) || (anio%400==0))){
            bandera=true;
        }
        return bandera;
    }
}
