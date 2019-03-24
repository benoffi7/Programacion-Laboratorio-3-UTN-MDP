package tp1;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio23 {
    static Scanner sc = new Scanner(System.in);
    public static void CalculadoraPolacaInversaApp(){
        int op1,op2;
        String signo;
        System.out.println("Ingrese una cuenta matematica (EJ. 7/3) (Presione ENTER luego de cada dato): ");
        op1=sc.nextInt();
        signo=sc.next();
        op2=sc.nextInt();
        double rta=0;
        switch(signo){
            case "+":
                rta = op1+op2;
                break;
            case "-":
                rta = op1-op2;
                break;
            case "*":
                rta = op1*op2;
                break;
            case "/":
                rta = op1/op2;
                break;
            case "^":
                rta = Math.pow(op1,op2);
                break;
            case "%":
                rta = op1%op2;
                break;
            default:
                System.out.println("Signos aritméticos disponibles: +,-,*,/,^,%");
                break;
        }
        if(rta!=0){
            System.out.println(op1+signo+op2+" = "+rta);
        }else
            System.out.println("Signo invalido.");
    }
}
