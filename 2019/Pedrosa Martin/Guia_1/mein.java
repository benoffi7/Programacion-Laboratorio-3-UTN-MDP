
import java.util.Scanner;
//import java.util.Random;
// import java.lang.Math.*;

public class mein {

    public static Scanner scan = new Scanner(System.in);

    // Ejercicio 1 --------------------------------------

    public static float promediar(int[] array) {
        int i = 0;
        var suma = 0;
        while (i < 5) {
            suma = suma + array[i];
            i++;
        }
        var promedio = suma / 5;

        return promedio;

    }

    public static int[] arrayCl(int[] arreglo) {
        int i;
        int cant = 5;

        System.out.println("Ingrese los contenidos del arreglo: ");
        for (i = 0; i < cant; i++) {
            System.out.print("Celda " + (i + 1) + " = ");
            arreglo[i] = scan.nextInt();
        }
        i = 0;
        while (i < cant) {
            System.out.print("/" + arreglo[i]);
            i++;
        }
        return arreglo;
    }
    // Ejercicio 2-------------------------------

    public static void isPar(double num) {
        if (num % 2 == 0) {
            System.out.println("\nEs par\n");
        } else {
            System.out.println("\nEs impar\n");
        }
    }
    // Ejercicio 3--------------------------------

    public static void Primos() {
        int pNums = 0;
        int num = 1;
        while (pNums < 100) {
            int i = 1;
            int divisible = 0;
            while ((i - 2) != num) {

                if (num % i == 0) {
                    divisible++;
                }
                if (divisible == 2 && (i - 1) == num) {
                    pNums++;
                    System.out.print(" / " + num);
                }

                i++;
            }
            num++;
        }
    }
    // Ejercicio 4----------------------------------

    public static void nPrimos(int n) {
        int pNums = 0;
        int num = 1;
        while (pNums < n) {
            int i = 1;
            int divisible = 0;
            while ((i - 2) != num) {

                if (num % i == 0) {
                    divisible++;
                }
                if (divisible == 2 && (i - 1) == num) {
                    pNums++;
                    System.out.print(" / " + num);
                }

                i++;
            }
            num++;
        }
    }
    // Ejercicio 5---------------------------

    public static void isPrime(int n) {
        int i = 1;
        int divisible = 0;
        while ((i - 1) != n) {

            if (n % i == 0) {
                divisible++;
            }
            i++;
        }
        if (divisible == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }

    // Ejercicio 6-------------------------------
    public static int sumNat() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = num + i;
            // System.out.println("" + num);
        }

        return num;

    }

    // Ejercicio 7--------------------------------
    public static int posCant() {
        int n;
        int o = 's';
        int pos = 0;
        while (o == 's') {
            System.out.print("Ingrese un numero positivo o negativo: ");
            n = scan.nextInt();
            if (n >= 0) {
                pos++;
            }

            System.out.println("Desea ingresar otro? (S/N)");
            o = scan.next().charAt(0);

        }
        return pos;

    }

    // Ejercicio 8--------------------------------

    public static void isLeap(int n) {
        if ((n % 4 == 0) && ((n % 100 != 0) || (n % 400 == 0))) {
            System.out.println("Es bisiesto");
        } else
            System.out.println("El año no es bisiesto");
    }

    // Ejercicio 9--------------------------------
    public static void aski(char cha) {
        int ki = (int) cha;
        System.out.println("El valor de " + cha + " en ASCII es: " + ki + "\n");
    }

    // Ejercicio 10
    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // Ejercicio 11--------------------------------

    public static float areaRectagle(float l, float h) {
        float solution = l * h;
        return solution;
    }

    public static float areaSquare(float l) {
        float solution = l * l;
        return solution;
    }

    public static float areaTriangle(float l, float h) {
        float solution = (l * h) / 2;
        return solution;
    }

    public static float areaCircle(float r) {
        double solution = Math.PI * (r * r);
        return (float) solution;
    }

    // Ejercicio 12--------------------------------------

    public static void buenas(String name) {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\t\tBuenos dias, " + name + "\n\n\n\n");

    }

    // Ejercicio 13---------------------------

    public static void dobleTriple(int num) {
        System.out.println("Doble: " + (num + num));
        System.out.println("Triple: " + (num + num + num));
    }

    // Ejercicio 14-------------------------------

    public static double toFahrenheit(double degrees) {

        degrees = (degrees * 9) / 5 + 32;

        return degrees;
    }

    // Ejercicio 15--------------------------------

    public static void areaYlongCircle(float radius) {

        System.out.println("\nArea: " + areaCircle(radius));
        System.out.println("Longitud: " + 2 * Math.PI * radius + "\n");

    }

    // Ejercicio 16--------------------------------

    public static double speedChange(double speed) {

        speed = speed / 3.6;
        return speed;

    }

    // Ejercicio 17----------------------------------

    public static double hypotenuse(double b, double a) {

        double hip;
        hip = Math.sqrt((b * b) + (a * a));

        return hip;
    }

    // Ejercicio 18------------------------------------

    public static void clima() {

        System.out.println("\nLa temperatura minima es: " + weather.minTemp());

        System.out.println("La temperatura maxima es: " + weather.maxTemp());

        System.out.println("Promedio de : " + weather.promedioTemp() + "\n");
    }

    // Ejercicio 19--------------------------------------

    public static double chooseRands(int a, int b) {

        if (a >= b) {
            throw new IllegalArgumentException("El primer valor debe ser menor al segundo");
        }
        // System.out.println("Hmm " +(Math.random() * ((b - a) + 1) + a));
        return Math.random() * ((b - a) + 1) + a;
    }

    // Ejercicio 20--------------------------------------

    public static void workDays(String dia) {

        switch (dia) {

        case "sabado":
        case "SABADO":
            System.out.println("Dia no laboral");
            break;
        case "domingo":
        case "DOMINGO":
            System.out.println("Dia no laboral");
            break;
        case "lunes":
        case "LUNES":
            System.out.println("Dia laboral");
            break;
        case "martes":
        case "MARTES":
            System.out.println("Dia laboral");
            break;
        case "miercoles":
        case "MIERCOLES":
            System.out.println("Dia laboral");
            break;
        case "jueves":
        case "JUEVES":
            System.out.println("Dia laboral");
            break;
        case "viernes":
        case "VIERNES":
            System.out.println("Dia laboral");
            break;
        default:
            System.out.println("ERROR: Ingrese un dia de la semana");
            break;

        }

    }

    // Ejercicio 21-------------------------------

    public static int calcDigits(String num) {

        int i = 0;
        int cant = 0;
        num += '\0';
        while (num.charAt(i) != '\0' && Character.isDigit(num.charAt(i)) == true) {
            cant++;
            i++;
        }
        if (Character.isDigit(num.charAt(i)) == false && num.charAt(i) != '\0') {
            System.out.println("\n\tEl valor ingresado contiene caracteres que no son numeros\n");
            cant = 0;
        }

        return cant;
    }

    // Ejercicio 22-----------------------------------

    public static void calculadora() {

        System.out.print("\nPrimer numero: ");
        int num1 = scan.nextInt();
        System.out.print("\nSegundo numero: ");
        int num2 = scan.nextInt();
        System.out.print(
                "\n\n\tSumar: +\t\tRestar: -\n\n\tMultiplicar: *\t\tDividir: /\n\n\tPotenciar: ^\t\tModulo: % \n\n\t\t\t");
        char signo = scan.next().charAt(0);
        double result = CalculadoraPolacaInversaApp.calculo(num1, num2, signo);
        if (result != Double.NaN) {
            System.out.printf("El resultado es: %.2f \n", result);
        }

    }

    // Ejercicio 23-------------------------------------

    public static void salary() {

        System.out.println("\n" + Ejercicio_23.nombre + " recibe un salario de " + Ejercicio_23.calcSalario());

    }

}