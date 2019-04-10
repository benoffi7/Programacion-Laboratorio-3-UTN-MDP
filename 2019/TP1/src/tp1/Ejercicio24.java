package tp1;
import java.util.Scanner;
public class Ejercicio24 {
    static Scanner sc = new Scanner(System.in);
    public static void vigesimoCuarto(){
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if(edad>=16){
            System.out.println("Ingrese su salario: ");
            double salario = sc.nextDouble();
            if(edad>18 && edad<51){
                salario += 0.05*salario;
            }else if(edad>50 && edad<61){
                salario +=0.10*salario;
            }else if(edad>60){
                salario +=0.15*salario;
            }
            System.out.println(nombre+", debido a su edad su salario ahora es de: "+salario);
        }
        
    }
}
