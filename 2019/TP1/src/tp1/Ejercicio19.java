package tp1;
import java.util.Scanner;
public class Ejercicio19 {
    static Scanner sc = new Scanner(System.in);
    public static void diecinueveavo(){
        double temp;
        double acumulador=0;
        double max=0,min=0;
        int i;
        for(i=1;i<=30;i++){
            System.out.println("Ingrese la temperatura del dia "+i);
            temp = sc.nextDouble();
            if(i==1){
                min=temp;
                max=temp;
            }
            if((i!=1)&&(temp>=max))
                max=temp;
            if((i!=1)&&(temp<=min))
                min=temp;
            acumulador+=temp;
        }
        double prom = acumulador/i;
        System.out.println("La temperatura maxima del mes fue: "+max);
        System.out.println("La temperatura minima del mes fue: "+min);
        System.out.println("La temperatura promedio del mes fue: "+prom);
    }
}
