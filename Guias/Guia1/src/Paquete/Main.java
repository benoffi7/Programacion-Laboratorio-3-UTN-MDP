package Paquete;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc = 0;
        int value = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el ejercicio que quiere ver (1-22");

        opc = scan.nextInt();

        switch (opc) {
            case 1:

                int[] array = new int[]{8, 7, 8, 7, 8};
                int[] array2 = new int[5];
                int i = 0;
                String flag = "s";
                int valid = array.length;
                int valid2 = 0;

                valid2 = chargeArray(array2, 5);
                scan.close();

                float average = averageArray(array, valid);
                float average2 = averageArray(array2, valid2);
                System.out.println("El promedio del arreglo 1 es: " + average);
                System.out.println("El promedio del arreglo 2 es: " + average2);

                break;


            case 2:
                System.out.println("Intruzca un numero: ");
                int number = scan.nextInt();
                boolean result = false;

                result = evenOrodd(number);

                if (evenOrodd(number)) {
                    System.out.println("El numero " + number + " es impar");
                } else
                    System.out.println("El numero " + number + " es par");

                break;

            case 3:

                primenumberfirst100();
                break;

            case 4:
                primenumberfirstn();
                break;

            case 5:
                System.out.println("Introduce un numero");
                number = scan.nextInt();
                isprime(number);
                break;

            case 6:
                sum10narutal();
                break;

            case 7:

                sumPositive();

                break;

            case 8:

                System.out.println(leap_year(scan.nextInt()));

                break;
            case 9:
                ascii_value();
                break;
            case 10:
                int x = 0;
                int y = 0;
                System.out.println("Ingrese el primero numero:");
                x = scan.nextInt();
                System.out.println("Ingrese el segundo numero:");
                y = scan.nextInt();
                System.out.println("Resultado es: " + multiply(x, y));
                break;

            case 11:

                area();
                ;
                break;

            case 12:
                String name = "";
                System.out.println("Ingrese unn nombre: ");
                name = scan.next();
                showName(name);
                break;

            case 13:

                nby2_3();

                break;
            case 14:
                System.out.println("Ingrese la temperatura en celcius:");
                System.out.println("La temperatura es " + CtoF(scan.nextInt()) + "F");
                break;

            case 15:

                System.out.println("Ingrese el radio del circulo: ");
                circunferencia(scan.nextInt());

                break;
            case 16:
                System.out.println("Introduce km/h para convertir en m/s:");
                float k = 0;
                k = KmhToMs(scan.nextFloat());
                System.out.println("El resultado es " + k + "m/s");

                break;
            case 17:
                System.out.println("Intoduce los catetos del triangulo: \n cateto a:");
                int a = scan.nextInt();
                System.out.println("\ncateto b:");
                int b = scan.nextInt();
                hipotenusa(a, b);
                break;
            case 18:
                temperatura();
                break;
        }

        scan.close();
    }


    //Ejecicio 1 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static float averageArray(int[] array, int valid) {

        int i = 0, sum = 0;
        float average = 0;

        while (i < valid) {

            sum += array[i];
            average = (float) sum / (float) valid;
            i++;
        }

        return (average);
    }

    public static int chargeArray(int[] array, int size) {
        int i = 0;
        String flag = "s";
        Scanner scan = new Scanner(System.in);

        while (flag.equals("s") && i < size) {

            System.out.println("Cargar un numero: ");
            array[i] = scan.nextInt();

            i++;

            if (i < 5 && i != 5) {

                System.out.println("Desea continuar ? s/n");
                flag = scan.next();

            }

        }
        return (i);
    }
/// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Ejercicio 2

    public static boolean evenOrodd(int number) {

        boolean result = false;


        if (number % 2 == 0) {

            result = false;
        } else
            result = true;

        return (result);
    }


/// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 3

    public static void primenumberfirst100() {

        int limit = 100;
        int o = 1;


        for (int i = 1; o < limit; i++) {


            int count = 0;
            for (int e = 1; e <= i; e++) {
                if (i % e == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println(i);
                o++;


            }

        }
        System.out.println("Cantidad de primos " + o);
    }
/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// EJERCICIO 4

    public static void primenumberfirstn() {

        int limit = 0;
        int o = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce cuantos numeros primos quiere buscar:");
        limit = scan.nextInt();


        for (int i = 1; o < limit; i++) {

            int count = 0;

            for (int e = 1; e <= i; e++) {

                if (i % e == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println(i);
                o++;


            }

        }
        System.out.println("Cantidad de primos " + o);
    }


/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO 5

    public static void isprime(int number) {

        boolean prime = false;

        for (int i = 1; i <= number; i++) {

            int count = 0;

            for (int e = 1; e <= i; e++) {

                if (i % e == 0)
                    count++;

            }
            if (count == 2) {
                prime = true;

            } else
                prime = false;

        }

        if (prime) {
            System.out.println("Es primo");
        } else
            System.out.println("No es primo");

    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO 6

    public static void sum10narutal() {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        System.out.println("La suma de los primeros 10 es " + sum);

    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//EJERCICIO 7

    public static void sumPositive() {

        Scanner scan = new Scanner(System.in);

        String flag = "s";
        int i = 0, num = 0;

        while (flag.equals("s")) {

            System.out.println("Ingrese un numero: ");
            num = scan.nextInt();

            if (num >= 0)
                i++;

            System.out.println("Desea continuar ? s/n");
            flag = scan.next();
        }

        System.out.println("Ingreso (" + i + ") numeros");
    }
/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO 8

    public static boolean leap_year(int year) {
        boolean ans = false;

        if ((year % 400) == 0) {

            ans = true;
        } else if ((year % 4) == 0 && (year % 100) != 0) {
            ans = true;
        } else
            ans = false;

        return ans;

    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //EJERCICIO 9


    public static void ascii_value() {
        Scanner scan = new Scanner(System.in);

        char c = ' ';

        int value = 0;

        System.out.println("Ingrese un caracter");
        c = scan.next().charAt(0);

        value = (int) c;

        System.out.println("El valor ascii es: " + value);

    }
/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO10

    public static int multiply(int x, int y) {
        return (x * y);
    }


    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void area() {
        int opc = 0;
        Scanner scan = new Scanner(System.in);


        while (opc != 5) {

            System.out.println("Elija que area desea calcular: 1.rectángulo 2.cuadrado  3.triangulo  4.circulo.");

            opc = scan.nextInt();

            switch (opc) {
                case 1:                                                 //

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    opc = 5;
                    break;

            }


        }
    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO 12


    public static void showName(String name) {
        System.out.println("Buenos dias " + name);

    }


/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO 13

    public static void nby2_3() {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("Ingrese un numero: ");
        num = scan.nextInt();

        System.out.println("Doble= " + num * 2 + " Triple: " + num * 3);
    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static float CtoF(int c) {
        float result = 0;

        result = 32 + (9 * c / 5);

        return (result);
    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void circunferencia(int r) ///Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
    {
        double l = 0;
        double a = 0;

        l = (2 * Math.PI * r);
        a = (Math.PI * Math.pow(r, 2));

        System.out.println("La longitud de la circunferencia es " + l + "\nEl area de la circunferencia es " + a + "\n");
    }

/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO16

    public static float KmhToMs(float k) {
        return (k * 5 / 18);

    }


    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO18
    public static void hipotenusa(int a, int b) {
        double h = 0;

        h = Math.pow(a, 2) + Math.pow(b, 2);

        System.out.println("La hipotenusa del triangulo es " + h);

    }

    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //EJERCICIO19
    public static void temperatura() {
        int[] t = new int[29];
        int m = 0, valid = 29;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese las 30 temperaturas");
        for (int i = 0; i < valid; i++) {
            t[i] = scan.nextInt();
        }
        int max = t[0], min = t[0];
        System.out.println("Ingrese el mes (1-12)");
        m = scan.nextInt();

        for (int i = 0; i < valid; i++) {
            if (max <= t[i]) {
                max = t[i];
            }
            if (min >= t[i]) {
                min = t[i];
            }
        }
        float average = averageArray((t), valid);

        System.out.println("Temperatura max [" + max + "] Temperatura min [" + min+"] El promedio es [" + average+"] Del mes ["+m+"]");
    }


/// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
