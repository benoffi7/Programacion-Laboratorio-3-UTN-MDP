package tp1.guia1;

import java.util.Scanner;

import static tp1.guia1.TP1Guia1.scan;

public class Ejercicio22 {
    public static void Calculadora(){
        int opeA =0;
        int opeB =0;
        double rta =0;
        String signo = new String();


            System.out.println("Operadores: Ejemplo de funcion A + B...");

            System.out.println("Cargue el operador A...");
            scan = new Scanner(System.in);
            opeA = scan.nextInt();

            System.out.println("Cargue el operador B...");
            scan = new Scanner(System.in);
            opeB = scan.nextInt();

            System.out.println("Cargue el signo...");
            scan = new Scanner(System.in);
            signo = scan.next();

            switch (signo){
                case "+": System.out.println("SUMA");
                        rta = opeA + opeB;
                        System.out.println("Resultado..."+ rta);

                        break;
                case "-": System.out.println("RESTO");
                        rta = opeA - opeB;
                        System.out.println("Resultado..."+ rta);

                        break;
                case "*": System.out.println("MULTIPLICACION");
                        rta = opeA * opeB;
                        System.out.println("Resultado..."+ rta);

                        break;
                case "/": System.out.println("DIVISION");
                        rta = opeA/opeB;
                        System.out.println("Resultado..."+ rta);

                        break;
                case "^": System.out.println("POTENCIA");
                        rta = opeA^opeB;
                        System.out.println("Resultado..."+ rta);

                        break;
                case "%": System.out.println("MODULO");
                        rta = opeA%opeB;
                        System.out.println("Resultado..."+ rta);

                        break;

            }
    }
}
