package tp1;
import java.util.Scanner;
public class TP1 {
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion,aux;
        do{
            do{
                System.out.println("Ingrese el ejercicio que desea realizar: \n");
                System.out.println("Ejercicio 1  Ejercicio 6  Ejercicio 11  Ejercicio 16  Ejercicio 21");
                System.out.println("Ejercicio 2  Ejercicio 7  Ejercicio 12  Ejercicio 17 Ejercicio 22");
                System.out.println("Ejercicio 3  Ejercicio 8  Ejercicio 13  Ejercicio 18  Ejercicio 23");
                System.out.println("Ejercicio 4  Ejercicio 9  Ejercicio 14  Ejercicio 19  Ejercicio 24");
                System.out.println("Ejercicio 5  Ejercicio 10  Ejercicio 15  Ejercicio 20");
                opcion = scan.nextInt();
            }while(opcion<1 || opcion>24);
            switch(opcion){
                case 1:
                    Ejercicio1.primero();
                    break;
                case 2:
                    Ejercicio2.segundo();
                    break;
                case 3:
                    Ejercicio3.tercero();
                    break;
                case 4:
                    System.out.println("Mostrar los numeros primos hasta: ");
                    Ejercicio4.cuarto(scan.nextInt());
                    break;
                case 5:
                    do{
                        System.out.println("Ingrese un numero y se verificara si es primo, si desea salir pulse 0: ");
                    }while(!ejercicio5.quinto(scan.nextInt()));
                    break;
                case 6:
                    Ejercicio6.sexto();
                    break;
                case 7:
                    break;
                case 8:
                    Ejercicio8.octavo();
                    break;
                case 9:
                    Ejercicio9.noveno();
                    break;
                case 10:
                    Ejercicio10.decimo();
                    break;
                case 11:
                    int valor = Ejercicio11.onceava(10, 5);
                    System.out.println("10x5: " +valor);
                    break;
                case 12:
                    Ejercicio12.doceava();
                    break;
                case 13:
                    Ejercicio13.treceavo();
                    break;
                case 14:
                    Ejercicio14.catorceavo();
                    break;
                case 15:
                    Ejercicio15.quinceavo();
                    break;
                case 16:
                    Ejercicio16.dieciseisavo();
                    break;
                case 17:
                    Ejercicio17.decimoseptimo();
                    break;                   
                case 18:
                    Ejercicio18.dieciochoavo();
                    break;
                case 19:
                    Ejercicio19.diecinueveavo();
                    break;
                case 20:
                    Ejercicio20.veinteavo();
                    break;
                case 21:
                    Ejercicio21.vigesimoPrimero();
                    break;
                case 22:
                    Ejercicio22.vigesimoSegundo();
                    break;
                case 23:
                    Ejercicio23.CalculadoraPolacaInversaApp();
                    break;
                case 24:
                    Ejercicio24.vigesimoCuarto();
                    break;
                default:
                    break;
            }
            System.out.println("Desea realizar otro ejercicio? SI=1 NO=0: ");
            aux = scan.nextInt();
        }while(aux==1);
    }
    
}
