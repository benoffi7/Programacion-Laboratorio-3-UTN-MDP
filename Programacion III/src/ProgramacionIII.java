import java.util.Scanner;

public class ProgramacionIII {
    public static void main(String[] args) {

        System.out.println("Hola Clase");
        int opcion;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar una acción.");
        System.out.println("Menu:\n1_ Ejercicio nº1:Sacar un promedio de un array." +
                "\n2_ Ejercicio nº2: Calcular si un número es par o no. " +
                "\n3_ Ejercicio nº3: Cantidad numero primos encontrados." +
                "\n4_ Ejercicio n°4: Cantidad numero primos que desea ver." +
                "\n6_ Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo" +
                "\n7_ Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales."+
                "\n8_ Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario."+
                "\n9_ Ejercicio nº9: Revisar si un año es bisiesto o no."+
                "\n10_Ejercicio nº10: Encontrar el valor ASCII de un carácter."+
                "\n11_Ejercicio nº11: Multiplicar dos números. "+
                "\n12_Ejercicio nº12: Que area desea calcular"+
                "\n13_Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:\n" +
                        "“Buenos dias nombre_introducido”."+
                "\n14_Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número."+
                "\n15_Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)"+
                "\n16_Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math."+
                "\n17_Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado."+
                "\n18_Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras."+
                "\n19_Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio."+
                "\n20_Ejercicio nº20: Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio "+
                "\n21_Ejercicio nº21: Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello."+
                "\n22_Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje."+
                "\n23_Ejercicio nº23: Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo."+
                "\n24_Ejercicio nº24: Pide por teclado el nombre, edad y salario y muestra el salario");



        System.out.println("\nIngrese un numero: ");
        opcion = scanf.nextInt();


        switch (opcion) {
            case 1:
                /**
                 * Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
                 * Realizar variantes con arreglos ya inicializados e ingreso por teclado.
                 */
                int[] arreglo = new int[]{1, 2, 10, 4, 15};

                float a = promedio(arreglo);

                System.out.println("RTA: " + a);
                break;
            case 2:
                //Ejercicio nº2: Calcular si un número es par o no.
                System.out.println("Ingrese un numero para comparar: ");
                int numero = scanf.nextInt();

                if (par_o_impar(numero)) {
                    System.out.println("El numero " + numero + " es par.");
                } else {
                    System.out.println("El numero " + numero + " es impar");
                }

                break;
            case 3:
                //Ejercicio nº3: Mostrar los primeros 100 números primos.
                mostrar_n_primos(100);
                break;
            case 4:
                //Ejercicio n°4: Mostrar n primo.
                System.out.println("Ingrese la cantidad de numeros primos que desea ver: ");
                int n_numero_primo = scanf.nextInt();
                mostrar_n_primos(n_numero_primo);
                break;
            case 6:
                //Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo
                ingresa_numero_a_evaluar();
                break;
            case 7:
                //Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.
                suma_numeros_naturales();
                break;
            case 8:
                //)Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.
                int b=cantidad_numeros_positivos();
                System.out.println("Cantidad de numeros positivos: "+b);
            case 9:
                //Ejercicio nº9: Revisar si un año es bisiesto o no.
                ano_bisiesto();
                break;
            case 10:
                //Ejercicio nº10: Encontrar el valor ASCII de un carácter.
                char letra;
                System.out.println("Ingrese una letra para ver el valor ASCII ");
                letra = scanf.next().charAt(0);
                System.out.println("Ingrese un caracter: "+ (int) letra);
                break;
            case 11:
                //Ejercicio n°11: Multiplicar 2 numeros.
                multiplicar();
                break;
            case 12:
                //Ejercicio nº12: Calcular areas.
                calculo_area();
                break;
            case 13:
                //Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:\n" +
                //                        "“Buenos dias nombre_introducido”
                asignar_nombre();
                break;
            case 14:
                //Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número."
                doble_triple();
                break;
            case 15:
                //Ejercicio nº15: Cantidad de grados centigrados pasados a grados Fahrenheit.
                grados_fahrenheint();
            case 16:
                //Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
                long_circunferencia();
                break;
            case 17:
                //Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
                km_a_metros();
                break;
            case 18:
                //Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
                hipotenusa();
                break;
            case 19:
                //Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.
                promedio_temperatura();
                break;
            case 20:
                //Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio.
                int num1=1;
                int num2=10;
                int dato=aleatorio(num1,num2);
                System.out.println(" Esta vez el resultado fue: " + dato);
                dato=aleatorio(num1,num2);
                System.out.println(" Esta vez el resultado fue: " + dato);
                break;
            case 21:
                //Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
                dia_laborar();
                break;
            case 22:
                //Ejercicio nº22: Cantidad cifras de un numero positivo.
                cifras_numeros_positivos();
                break;
            case 23:
                //Ejercicio nº23: Calculadora.
                CalculadoraPolacaInversaApp();
                break;
            case 24:
                MostrarSalario();
                break;

            default:
                break;
        }

    }


    public static float promedio(int[] arreglo) {
        int b = 0;
        int suma = 0;
        while (arreglo.length > b) {
            suma += arreglo[b];
            b++;
        }
        float c = (float) suma / (float) b;
        return c;
    }

    public static boolean par_o_impar(int numero) {
        boolean vof;
        if (numero % 2 == 0) {
            vof = true;
        } else {
            vof = false;
        }
        return vof;
    }

    public static void mostrar_n_primos(int n_numero) {
        int numeros = 2;
        int cuenta_contador = 1;
        int cantidad_divisibles = 1;
        int numero_primo_encontrado = 0;

        while (numero_primo_encontrado < n_numero) {
            while (numeros > cuenta_contador && cantidad_divisibles < 3) {
                if (numeros % cuenta_contador == 0) {
                    cantidad_divisibles++;
                }
                cuenta_contador++;

            }
            if (cantidad_divisibles <= 2) {
                numero_primo_encontrado++;
                System.out.println("Numero " + numero_primo_encontrado + " primo " + numeros);
            }

            numeros++;
            cuenta_contador = 1;
            cantidad_divisibles = 0;

        }

    }

    public static boolean es_primo(int numero_a_evaluar) {
        int divisores = 1;
        int cantidad_divisibles = 1;
        boolean flag_primo = false;
        while (numero_a_evaluar > divisores && cantidad_divisibles < 3) {
            if (numero_a_evaluar % divisores == 0) {
                cantidad_divisibles++;
            }
            divisores++;

        }
        if (cantidad_divisibles == 2) {
            flag_primo = true;
        }
        return flag_primo;
    }

    public static void ingresa_numero_a_evaluar() {
        String respuesta = "si";
        Scanner scanf = new Scanner(System.in);
        int numero = 0;
        boolean esPrimo;
        while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI")) {
            //escaneo l
            System.out.println("Ingrese un valor: ");
            numero = scanf.nextInt();
            es_primo(numero);
            if (es_primo(numero)) {
                System.out.println("El " + numero + " es primo");
            } else {
                System.out.println("El " + numero + " no es primo");
            }
            System.out.println("Desea realizar otra acción Si/No: ");
            respuesta = scanf.next();
        }
    }

    public static void suma_numeros_naturales()
    {
        int i=1;
        int suma=0;
        for(i=1;i<11;i++)
        {
            suma+=i;
        }
        System.out.println("La suma de los primeros 10 numeros naturales es: "+suma);
    }
    public static int cantidad_numeros_positivos ()
    {
        String respuesta = "si";
        Scanner scanf = new Scanner(System.in);
        int contador = 0;
        int numero;
        while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI"))
        {
            //escaneo l
            System.out.println("Ingrese un valor: ");
            numero = scanf.nextInt();
            if(numero>0)
            {
                contador++;
            }
            System.out.println("Desea realizar otra acción Si/No: ");
            respuesta = scanf.next();
        }
        return contador;
    }
    public static void ano_bisiesto ()
    {
        String respuesta = "si";
        Scanner scanf = new Scanner(System.in);
        int numero;
        while (respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI"))
        {
            //escaneo l
            System.out.println("Ingrese un año para ver si es bisiesto: ");
            numero = scanf.nextInt();
            if(numero % 4 == 0 && numero % 100 !=0 && numero % 400 == 0)
            {
                System.out.println("El año "+numero+"es bisiesto");
            }else
            {
                System.out.println("El año "+numero+" no es bisiesto");
            }
            System.out.println("Desea realizar otra acción Si/No: ");
            respuesta = scanf.next();
        }

    }
    public static void multiplicar ()
    {
        int num1 = 0;
        int num2 = 0;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1=scanf.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=scanf.nextInt();
        int num=num1*num2;
        System.out.println("La multiplicacion de " + num1 + " x " + num2 + " es: "+num);
    }
    public static void calculo_area()
    {
        {
            String respuesta = "area";
            Scanner scanf = new Scanner(System.in);
            int numero;
            float base=0;
            int altura=0;
            double valor=0;
            System.out.println("Que area desea calcular? ");
            respuesta = scanf.next();
            while (respuesta.equals("area") || respuesta.equals("rectangulo") || respuesta.equals("cuadrado") || respuesta.equals("triangulo") || respuesta.equals("circulo") )
            {
                if(respuesta.equals("rectangulo"))
                {
                    System.out.println("Ingrese valor de la base: ");
                    base = scanf.nextInt();
                    System.out.println("Ingrese valor de la altura: ");
                    altura = scanf.nextInt();
                    valor = base*altura;
                    System.out.println("El area del rectangulo es " + valor);
                }
                if(respuesta.equals("cuadrado"))
                {
                    System.out.println("Ingrese valor del lado del cuadrado: ");
                    base=scanf.nextInt();
                    valor = base*base;
                    System.out.println("El area del cuadrado es " + valor);
                }
                if(respuesta.equals("triangulo"))
                {
                    System.out.println("Ingrese valor de la base: ");
                    base=scanf.nextInt();
                    System.out.println("Ingrese valor de la altura: ");
                    altura=scanf.nextInt();
                    valor = base*altura/2;
                    System.out.println("El area del triangulo es " + valor);
                }
                if(respuesta.equals("circulo"))
                {
                    System.out.println("Ingrese valor del radio: ");
                    base=scanf.nextInt();
                    valor = base * base *Math.PI;
                    System.out.println("El area del ciculo es " + valor);
                }
                System.out.println("Desea calcular otra area Rectangulo, Cuadrado, Triangulo, Circulo ");
                respuesta = scanf.next();
            }

        }
    }
    public static void asignar_nombre()
    {
        String nombre;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Que nombre desea ingresar?: ");
        nombre = scanf.next();
        System.out.println("Buenos dias "+ nombre);
    }

    public static void doble_triple ()
    {
        int num1 = 0;
        int a=num1;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Ingrese numero para saber el doble y triple del mismo: ");
        num1=scanf.nextInt();
        a=num1*2;
        System.out.println("El doble de "+ num1 + " es: "+a);
        a=num1*3;
        System.out.println("El triple de "+ num1 + " es: "+a);
    }

    public static void grados_fahrenheint ()
    {
        double c=-5;
        double f=0;
        for(c=-5;c<40;c++)
        {
            f= 32 + (9 * c/5 );
            System.out.println(c + " grados, equivalen a "+ f + (" grados Fahrenheit"));
        }
    }
    public static void long_circunferencia ()
    {
        double radio = 0;
        double valor = 0;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Ingrese valor del radio: ");
        radio=scanf.nextInt();
        valor = 2 * radio * Math.PI;
        System.out.println("La longitud de la circunferencia  " + valor);
        valor = radio * radio * Math.PI;
        System.out.println("El area del ciculo es " + valor);

    }

    public static void km_a_metros ()
    {
        double km = 0;
        double metros = 0;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de km/h que desea conducir: ");
        km = Double.parseDouble(scanf.next());
        metros = km/3.6;
        System.out.println(km +"km/h equivalen a " + metros + "m/s");
        if(km>120)
        {
            System.out.println("Te vas a pegar lindo palo, bajale la pata al acelerador.");
        }
        else
        {
            System.out.println("Vas a una velocidad perfecta. Vas a vivir muchos años.");
        }
    }
    public static void hipotenusa ()
    {
        double cat1 = 0;
        double cat2 = 0;
        double hip = 0;
        Scanner scanf = new Scanner (System.in);
        System.out.println("Ingrese valor del primer cateto: ");
        cat1 = Double.parseDouble(scanf.next());
        System.out.println("Ingrese valor del segundo cateto: ");
        cat2= Double.parseDouble(scanf.next());
        hip=cat1*cat1+cat2*cat2;
        System.out.println("Longitud de la hipotenusa es: " + hip);
    }

    public static void promedio_temperatura()
    {
        float [] arreglo = {10,5,20,30,42,8,7};
        float max=maximo_valor_temperatura(arreglo);
        System.out.println("Maximo valor temperatura en el mes: "+max);
        float min=minimo_valor_temperatura(arreglo);
        System.out.println("Minimo valor temperatura en el mes: "+min);
        float prom=contar_cantidad_temperatura(arreglo);
        System.out.println("El promedio del mes es: "+prom);

    }
    public static float maximo_valor_temperatura (float [] arreglo)
    {
        float max=arreglo[0];
        for(int i=0;i<arreglo.length;i++)
        {
            if(arreglo[i]>max)
            {
                max=arreglo[i];
            }
        }
        return  max;
    }
    public static float minimo_valor_temperatura (float [] arreglo)
    {
        float min=arreglo[0];
        for(int i=0;i<arreglo.length;i++)
        {
            if(arreglo[i]<min)
            {
                min=arreglo[i];
            }
        }
        return  min;
    }
    public static float contar_cantidad_temperatura (float [] arreglo)
    {
        int i = 0;
        float suma=0;
        float promedio=0;
        while (i<arreglo.length)
        {
            suma+=arreglo[i];
            i++;
        }
        promedio=suma/i;
        return promedio;
    }

    public static int aleatorio(int min, int max) {
        int resultado, rango;
        rango = (max - min)+1;
        resultado =(int)(Math.random()*rango)+ min;
        return resultado;
    }

    public static void dia_laborar () {
        String dia;
        Scanner scanf = new Scanner(System.in);

        String op = "si";
        while (op == "si" || op == "Si") {
            System.out.println("Ingrese dia laboral: ");
            dia = scanf.nextLine();
            switch (dia) {
                case "Lunes":
                    System.out.println("Dia laboral");
                    break;
                case "Martes":
                    System.out.println("Dia laboral");
                    break;
                case "Miercoles":
                    System.out.println("Dia laboral");
                    break;
                case "Jueves":
                    System.out.println("Dia laboral");
                    break;
                case "Viernes":
                    System.out.println("Dia laboral");
                    break;
                case "Sabado":
                    System.out.println("Dia NO laboral");
                    break;
                case "Domingo":
                    System.out.println("Dia NO laboral");
                    break;
            }
        }
    }
        public static void cifras_numeros_positivos ()
        {
            Scanner carga=new Scanner(System.in);
            int numero=0;
            boolean flag=true;
            while (flag==true)
            {
                System.out.print("Ingrese un número entero positivo: ");
                numero=carga.nextInt();
                if (numero>=0)
                    flag=false;
                else
                {
                    System.out.print("El número ingresado no es un entero positivo. Intente nuevamente... ");
                }
            }
            int cifras=String.valueOf(numero).length();
            if (cifras>=1)
                System.out.print("El número tiene " +cifras +" cifras");
        }

        public static void CalculadoraPolacaInversaApp()
        {
            int numero1, numero2;
            Scanner scan = new Scanner(System.in);
            String operando = "";
            while(!operando.equals("salida"))
            {
                System.out.println("\r\n Bienvenido a la CalculadoraPolacaInversaApp \r\n por favor ingresar el Primer numero");
                numero1 = Integer.parseInt(scan.next());
                System.out.println("Ingresar el segundo numero");
                numero2 = Integer.parseInt(scan.next());

                System.out.println("Ingresar un operando : \r\n" + " +: suma los dos operandos.\r\n" +
                        " -: resta los operandos.\r\n" +
                        " *: multiplica los operandos.\r\n" +
                        " /: divide los operandos, este debe dar un resultado con decimales\r\n" +
                        "(double)\r\n" +
                        " ^: 1º operando como base y 2º como exponente.\r\n" +
                        " %: módulo, resto de la división entre operando1 y operando2.");
                operando = scan.next().toLowerCase();

                switch (operando) {
                    case "+":
                        System.out.println("La suma de los 2 numeros es : " + suma(numero1, numero2));
                        break;

                    case "-":
                        System.out.println("La resta de los 2 numeros es : " + resta(numero1, numero2));
                        break;

                    case "/":
                        System.out.println("La division de los 2 numeros es : " + division(numero1, numero2));
                        break;

                    case "*":
                        System.out.println("La multiplicacion de los 2 numeros es :" + multiplicacion(numero1, numero2));
                        break;

                    case "^":
                        System.out.println("El resultado numero1(base) y numero2 (exponente)" + exponente(numero1, numero2));
                        break;

                    case "%":
                        System.out.println("El resto de la division de los 2 numeros es :" + resto(numero1, numero2));
                        break;

                    default:
                        try {
                            if (!operando.equals("salida")) {
                                System.out.println("Ha introducido un valor incorrecto, vuelva a intentarlo...");
                                Thread.sleep(3000);
                            } else {
                                System.out.println("Saliendo del programa");
                                Thread.sleep(2000);
                            }
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        break;
                }
            }


        }


    public static int suma (int numero1, int numero2)
    {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static int resta (int numero1, int numero2)
    {
        int resultado;
        if(numero1 > numero2)
            resultado = numero1 - numero2;
        else
            resultado = numero2 - numero1;
        return resultado;
    }

    public static int multiplicacion(int numero1, int numero2)
    {
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static double division (int numero1, int numero2)
    {
        double resultado = (double)(numero1 / numero2);
        return resultado;
    }

    public static int exponente(int numero1, int numero2)
    {
        int resultado = (int)Math.pow(numero1,numero2);
        return resultado;
    }

    public static double resto (int numero1, int numero2)
    {
        double resultado = numero1 % numero2;
        return resultado;
    }


    public static void MostrarSalario ()
    {
        Scanner carga=new Scanner(System.in);
        String nombre;
        int edad;
        float salario;
        System.out.print("Ingrese el nombre: ");
        nombre=carga.next();
        System.out.print(" Ingrese la edad: ");
        edad=carga.nextInt();
        System.out.print(" Ingrese el salario: ");
        salario=carga.nextFloat();
        if (edad<16)
            System.out.print("No tiene edad suficiente para trabajar");
        else
        {
            if (edad>=19 && edad<=50)
                salario=(float) (salario+(0.05*salario));
            else if (edad>=51 && edad<=60)
                salario=(float) (salario+(0.1*salario));
            else
                salario=(float) (salario+(0.15*salario));
            System.out.print("Nombre: "+nombre);
            System.out.print("Edad: "+edad);
            System.out.print("Salario: "+salario);
        }
    }

}


