
import java.util.Scanner;

public class menu {

    public static Scanner scan = new Scanner(System.in);

    public static <StringUtils> void main(String[] args) {
        boolean exit = false;
        while (exit == false) {
            System.out.println("\n     Seleccione ejercicio del 1 al 23, presione 0 para salir: ");
            int opcion = scan.nextInt();
            // System.out.println(+opcion);
            switch (opcion) {

            case 0:
                exit = true;
                break;

            case 1:
                // 1.
                var arreglo = new int[5];
                var promedio = mein.promediar(mein.arrayCl(arreglo));
                System.out.println(" El promedio es: " + promedio);
                break;

            case 2:
                System.out.print("Par o Impar, ingrese un numero: ");
                double num = scan.nextInt();
                mein.isPar(num);
                break;

            case 3:
                System.out.println("Primeros 100 numeros primos");
                mein.Primos();
                System.out.println("\n\n");
                break;

            case 4:
                System.out.println("Ingrese cuantos numeros primos desea ver");
                int n = scan.nextInt();
                mein.nPrimos(n);
                System.out.println("\n\n");
                break;

            case 5:
                System.out.println("Ingrese un numero para saber si es primo: ");
                n = scan.nextInt();
                mein.isPrime(n);
                break;

            case 6:
                System.out.println("La suma de los primeros 10 numeros naturales da: " + mein.sumNat());
                break;

            case 7:
                System.out.println("ha ingresado " + mein.posCant() + " numeros positivos");
                break;

            case 8:
                System.out.print("Ingrese un anio: ");
                n = scan.nextInt();
                mein.isLeap(n);
                break;

            case 9:
                System.out.print("Ingrese un caracter: ");
                char cha = scan.next().charAt(0);
                mein.aski(cha);
                break;

            case 10:

                System.out.println("Ingrese 2 numeros para multiplicar: ");
                // System.out.println("Primer numero: ");
                int solucion = mein.multiply(scan.nextInt(), scan.nextInt());
                System.out.println("resultado: " + solucion);

                break;

            case 11:

                float solution = 0, l, h, r;
                System.out.println("\n\t\tAreas:\n\nR: Rectangulo\t\tS: Cuadrado\nT: Triangulo\t\tC: Circulo");
                char chOpcion = scan.next().charAt(0);
                switch (chOpcion) {

                case 'r':
                case 'R':

                    System.out.print("Ingrese longitud: ");
                    l = scan.nextFloat();
                    System.out.print("Ingrese altura: ");
                    h = scan.nextFloat();
                    solution = mein.areaRectagle(l, h);

                    break;

                case 's':
                case 'S':

                    System.out.print("Ingrese longitud de sus lados: ");
                    l = scan.nextFloat();
                    solution = mein.areaSquare(l);

                    break;

                case 't':
                case 'T':

                    System.out.print("Ingrese longitud de la base: ");
                    l = scan.nextFloat();
                    System.out.print("Ingrese altura: ");
                    h = scan.nextFloat();
                    solution = mein.areaTriangle(l, h);

                    break;

                case 'c':
                case 'C':

                    System.out.print("Ingrese el radio: ");
                    r = scan.nextFloat();
                    solution = mein.areaCircle(r);

                    break;

                }
                System.out.println("El resultado es: " + solution);
                break;

            case 12:

                System.out.println("¿Como se llama?");
                String name = scan.next();
                mein.buenas(name);
                break;

            case 13:

                System.out.println("Ingrese un numero: ");
                mein.dobleTriple(scan.nextInt());

                break;

            case 14:

                System.out.print("Ingrese la cantidad de Grados Centigrados: ");
                System.out.println("\nSon " + mein.toFahrenheit(scan.nextDouble()) + " Fahrenheit.\n");

                break;

            case 15:

                System.out.print("Ingrese el radio de su circulo: ");
                mein.areaYlongCircle(scan.nextFloat());

                break;

            case 16:

                System.out.print("Ingrese una velocidad en Km/h: ");
                double speed = mein.speedChange(scan.nextDouble());
                System.out.println("La velocidad es de " + speed + " m/s");

                break;

            case 17:

                System.out.println("Ingrese la longitud del Cateto Base: ");
                double b = scan.nextDouble();
                System.out.println("Ingrese la longitud del Cateto Adyacente");
                double a = scan.nextDouble();
                System.out.printf("La hipotenusa es %.2f: ", mein.hypotenuse(b, a));

                break;

            case 18:

                System.out.println("\nIngrese la temperatura de 30 dias individualmente: ");
                weather.cargarTemp();
                mein.clima();

                break;

            case 19:

                System.out.println("Ingrese el principio y el final de un intervalo\n");
                System.out.print("Principio: ");
                int p = scan.nextInt();
                System.out.print("\nFin: ");
                int f = scan.nextInt();
                System.out.println("\n");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%.0f\n", mein.chooseRands(p, f));
                }

                break;

            case 20:

                opcion = 's';
                while (opcion == 's') {
                    System.out.print("Ingrese por escrito un dia de la semana: ");
                    mein.workDays(scan.next());
                    System.out.println("¿Elegir otro dia? (S/N)");
                    opcion = scan.next().charAt(0);
                }

                break;

            case 21:

                System.out.print("Ingrese un numero entero positivo: ");
                int cant = mein.calcDigits(scan.next());
                if (cant != 0) {
                    System.out.println("\n\tEl numero contiene " + cant + " digitos\n");
                }

                break;

            case 22:

                System.out.println(
                        "Ingrese los dos numeros con los cuales desea hacer un calculo, luego elija la operacion correspondiente para ellos");
                char sino = 's';
                while (sino == 's') {
                    mein.calculadora();
                    System.out.println("¿Desea realizar otra operacion? (S/N)");
                    sino = scan.next().charAt(0);
                }

                break;

            case 23:

                System.out.println("Ingrese su nombre: ");
                Ejercicio_23.nombre = scan.next();

                System.out.println("Ingrese su edad: ");
                Ejercicio_23.edad = scan.nextInt();
                System.out.println("Ingrese su salario: ");
                Ejercicio_23.salario = scan.nextInt();
                mein.salary();

                break;

            }

        }
        scan.close();
    }
}