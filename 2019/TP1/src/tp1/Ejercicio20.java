package tp1;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio20 {
    static Scanner sc = new Scanner(System.in);
    public static void veinteavo(){
        System.out.println("Ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int num2 = sc.nextInt();
        int range,numRandom;
        if(num1>num2){ //se realiza esta evaluacion en caso de que primero ingresen un numero mayor y luego uno menor
            range = num1-num2;
            for(int i=0;i<10;i++){
                numRandom = (int)(Math.random()*range-1)+(num2+1); //de esta forma excluimos los extremos
                System.out.println(numRandom);
            }
        }else{
            range = num2-num1;
            for (int i=0;i<10;i++){
                numRandom = (int)(Math.random()*range-1)+(num1+1);
                System.out.println(numRandom);
            }
        }
    }
}
