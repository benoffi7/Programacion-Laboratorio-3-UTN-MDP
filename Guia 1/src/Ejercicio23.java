import java.util.Scanner;

public class Ejercicio23 {

    public static void CalculadoraPolacaInversaApp(){

        int num1=0,num2=0;
        double rta=0;
        String signo, condicion="Si";
        Scanner scan=new Scanner(System.in);

        while(condicion.equalsIgnoreCase("Si")){
            System.out.println("Ingrese el primer numero: ");
            num1 = scan.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scan.nextInt();
            System.out.println("Ingrese la operacion(+,-,*,/,^,%) ");
            signo = scan.next();

            switch (signo) {
                case "+":
                    rta = Sumar_Dos_Numeros(num1, num2);
                    break;
                case "-":
                    rta = Restar_Dos_Numeros(num1, num2);
                    break;
                case "*":
                    rta = Multiplicar_Dos_Numeros(num1, num2);
                    break;
                case "/":
                    rta = Dividir_Dos_Numeros(num1, num2);
                    break;
                case "^":
                    rta = Exponencial(num1,num2);
                    break;
                case "%":
                    rta = Modulo(num1,num2);
                    break;
            }
            if (rta != Double.NaN) {
                System.out.println("Respuesta= " + rta);

            }
            else {
                System.out.println("Uno de los numeros es incorrecto");
            }
            System.out.println("Desea hacer otra cosa(Si/No) ");
            condicion=scan.next();
        }
        scan.close();

    }

    public static double Sumar_Dos_Numeros(int num1,int num2){
        return num1+num2;
    }

    public static double Restar_Dos_Numeros(int num1, int num2){
        return num1-num2;
    }

    public static double Multiplicar_Dos_Numeros(int num1,int num2){
        return num1*num2;
    }

    public static double Dividir_Dos_Numeros(int num1, int num2){
        double rta=Double.NaN;
        if(num2!=0){
            rta=num1/num2;
        }
        return rta;
    }

    public static double Exponencial(int num1,int num2){
        return Math.pow(num1,num2);
    }

    public static double Modulo(int num1, int num2){
        return num1%num2;
    }
}
