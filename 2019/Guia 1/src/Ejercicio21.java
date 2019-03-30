import java.util.Scanner;

public class Ejercicio21 {

    public static void Menu(){

        Scanner scan=new Scanner(System.in);
        String dia;
        boolean condicion=true;
        while (condicion) {
            System.out.println("Ingrese el dia de la semana(Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo)");
            dia = scan.nextLine();

            switch (dia){
                case "Lunes":

                case "Martes":

                case "Miercoles":

                case "Jueves":

                case "Viernes":

                case "Sabado":
                    System.out.println("Dia laboral.");
                    condicion=false;
                    break;
                case "Domingo":
                    System.out.println("Dia NO laboral");
                    condicion=false;
                    break;
                default:
                    System.out.println("El dia ingresado no es valido, intentelo nuevamente");
            }
        }
        scan.close();
    }
}
