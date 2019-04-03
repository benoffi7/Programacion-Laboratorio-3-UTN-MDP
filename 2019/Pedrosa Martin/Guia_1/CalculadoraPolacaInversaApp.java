/**
 * CalculadoraPolacaInversaApp
 */
public class CalculadoraPolacaInversaApp {

    // char[] operandosAceptables = new char[] { '+', '-', '*', '/', '^', '%' };

    public static double calculo(int num1, int num2, char signo) {

        double result = Double.NaN;

        switch (signo) {

        case '+':

            result = suma(num1, num2);

            break;

        case '-':

            result = resta(num1, num2);

            break;

        case '*':

            result = multiplicacion(num1, num2);

            break;

        case '/':

            result = division(num1, num2);

            break;

        case '^':

            result = potencia(num1, num2);

            break;

        case '%':

            result = modulo(num1, num2);

        default:

            System.out.println("ERROR: Simbolo Incorrecto");

            break;
        }

        return result;

    }

    private static double modulo(int num1, int num2) {

        double result = num1 % num2;

        return result;
    }

    private static double potencia(int num1, int num2) {

        double result = num1 ^ num2;

        return result;
    }

    private static double division(int num1, int num2) {

        double result = num1 / num2;

        return result;
    }

    public static int suma(int num1, int num2) {

        int result = num1 + num2;

        return result;
    }

    public static int resta(int num1, int num2) {

        int result = num1 - num2;

        return result;
    }

    public static double multiplicacion(int num1, int num2) {

        double result = num1 * num2;

        return result;
    }

}