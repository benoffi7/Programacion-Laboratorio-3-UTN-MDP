
package tplab;
import java.util.Scanner;

public class Ejercicio12 {

    
    private static Scanner sc = new Scanner(System.in);

    public static void mostrarOpciones() {
        int option;
        option=ShowOptions();
         
        switch (option) {
            case 1:
                System.out.println("You selected a square");
                break;
            case 2:
                System.out.println("You selected a triangle");
                break;
            case 3:
                System.out.println("You selected a rectangle");
                break;
            case 4:
                System.out.println("You selected a circle");
                break;
        }
        
        
        
        }
      public static int ShowOptions(){
          int option;
            System.out.println("1) SQUARE ");
            System.out.println("2) TRIANGLE ");
            System.out.println("3) RECTANGLE ");
            System.out.println("4) CIRCLE ");
            option=sc.nextInt();
            return option;
    }

}
