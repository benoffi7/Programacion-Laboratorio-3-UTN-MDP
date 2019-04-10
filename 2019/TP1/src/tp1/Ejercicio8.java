package tp1;
import java.util.Scanner;
public class Ejercicio8 {
    static Scanner sc = new Scanner(System.in);
    static public void octavo(){
        int aux;
        int contador=0;
        for(int i=10;i>0;i--){
            System.out.println("Ingrese un numero: ");
            aux = sc.nextInt();
            if(aux > 0){
                contador++;
            }
        }
        System.out.println("Cantidad de numeros positivos ingresados: "+ contador);
    }
}
