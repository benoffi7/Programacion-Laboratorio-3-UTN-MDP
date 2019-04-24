import javax.swing.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        menu();

    }

        public static void menu(){

            char control = 's';

                do{
                    int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite Número del Ejercicio (1-23):"));

                    switch(dato){

                        case 1:
                            ejercicio01();
                            break;

                        case 2:
                            ejercicio02();
                            break;

                        case 3:
                            ejercicio03();
                            break;

                        case 4:
                            ejercicio04();
                            break;

                        case 5:
                            ejercicio05();
                            break;

                        case 6:
                            ejercicio06();
                            break;

                        case 7:
                            ejercicio07();
                            break;

                        case 8:
                            ejercicio08();
                            break;

                        case 9:
                            ejercicio09();
                            break;

                        case 10:
                            ejercicio10();
                            break;

                        case 11:
                            ejercicio11();
                            break;

                        case 12:
                            ejercicio12();
                            break;

                        case 13:
                            ejercicio13();
                            break;

                        case 14:
                            ejercicio14();
                            break;

                        case 15:
                            ejercicio15();
                            break;

                        case 16:
                            ejercicio16();
                            break;

                        case 17:
                            ejercicio17();
                            break;

                        case 18:
                            ejercicio18();
                            break;

                        case 19:
                            ejercicio19();
                            break;

                        case 20:
                            ejercicio20();
                            break;

                        case 21:
                            ejercicio21();
                            break;

                        case 22:
                            ejercicio22();
                            break;

                        case 23:
                            ejercicio23();
                            break;

                        default:
                            System.out.println("ERROR.Ingrese Nuevamente!");
                            break;
                    }
                    control = JOptionPane.showInputDialog("Desea Continuar (s/n)?:").charAt(0);
                }while (control == 's');
            }

            /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
                Realizar variantes con arreglos ya inicializados e ingreso por teclado.*/
            public static void ejercicio01(){

                //Promedio de Arreglo Aleatorio

                int[] arreglo = new int [5];
                float prom;

                arreglo = cargarArregloRandom(arreglo);

                prom = promedioArreglo(arreglo, arreglo.length);

                mostrarArreglo(arreglo, arreglo.length);
                System.out.println("Promedio del Arreglo = " + prom);

                //Promedio de Arreglo cargado por el Usuario

                int[] arreglo2 = new int [10];

                int i  = cargarArregloUsuario(arreglo2);

                float prom2 = promedioArreglo(arreglo2,i);

                mostrarArreglo(arreglo2, i);
                System.out.println("Promedio del Arreglo = " + prom2);
            }

            public static int cargarArregloUsuario(int arr[]){

                char control = 's';
                int i = 0;
                Scanner scan = new Scanner(System.in);

                do {
                    System.out.println("Digite un Numero:");
                    arr[i] = scan.nextInt();

                    System.out.println("Desea Continuar (s/n)?");
                    control = scan.next().charAt(0);
                    i++;

                } while ((control == 's') && (i < arr.length));

                return i;
            }

            public static int[] cargarArregloRandom(int arr[]){

                int i;
                for(i=0 ; i < arr.length ; i++){

                    arr[i] = (int) (Math.random()*24)+1;
                }
                return arr;
            }

            public static float promedioArreglo(int[] arr, int val){

                float prom;
                int acum = 0;

                for (int i = 0; i < val; i++) {
                    acum += arr[i];
                }
                prom = (float)acum / (float)val;

                return prom;
            }

            public static void mostrarArreglo(int[] arr, int val){

                System.out.print("Arreglo : [ ");
                for(int i=0 ; i<val ;i++){
                    if(i<val-1){
                        System.out.print(""+arr[i] + " - ");
                    }
                    else{
                        System.out.println(""+arr[i] + " ] ");
                    }
                }
            }

            // Ejercicio nº2: Calcular si un número es par o no.
            public static void ejercicio02(){

                int numero;
                Scanner scan = new Scanner( System.in );

                System.out.printf( "Introduzca un número entero: " );
                numero = scan.nextInt();

                if ( numero % 2 == 0 )
                {
                    System.out.printf( "ES PAR" );
                }
                else
                {
                    System.out.printf( "ES IMPAR" );
                }
            }

            // Ejercicio nº3: Mostrar los primeros 100 números primos.
            public static void ejercicio03(){

                for (int i=1;i<=100;i++){

                    int raiz=(int)Math.sqrt(i);
                    int contador=0;

                    //Hacemos otro bucle para contar los divisibles
                    for (int j=raiz;j>1;j--){
                        if (i%j==0){
                            contador++;
                        }
                    }

            /*Segun el numero de divisibles, sabemos si es primo o no
              Si es primo el contador sera 0 */

                    if (contador<1){
                        System.out.println(i);
                    }
                }
            }

            //Ejercicio nº4: Mostrar los primeros n números primos.
            public static void ejercicio04(){

                Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese un numero");

                int num = scan.nextInt();

                for (int i=1;i<=num;i++){

                    int raiz=(int)Math.sqrt(i);
                    int contador=0;

                    for (int j=raiz;j>1;j--){
                        if (i%j==0){
                            contador++;
                        }
                    }

                    if (contador<1){
                        System.out.println(i);
                    }
                }

            }

            public static boolean numPrimo(int numero){
                int contador = 2;
                boolean primo=true;
                while ((primo) && (contador!=numero)){
                    if (numero % contador == 0)
                        primo = false;
                    contador++;
                }
                return primo;
            }

            //Ejercicio nº5: Ingresar un número o tantos como quiera el usuario y revisar si es primo.
            public static void ejercicio05(){

                int num;
                char control = 's';
                Scanner scan = new Scanner(System.in);

                do{
                    System.out.println("Ingrese un Nùmero: ");
                    num = scan.nextInt();

                    if(numPrimo(num)){
                        System.out.println("El Nùmero es Primo!");
                    }
                    else{
                        System.out.println("El Nùmero NO es Primo!");
                    }

                    System.out.println("Desea continuar (s/n) ?");
                    control = scan.next().charAt(0);

                }while (control == 's');
            }


            //Ejercicio nº6: Encontrar la suma de los primeros 10 números naturales.
            public static void ejercicio06(){

                int suma=0;

                for (int i=0 ; i<10 ; i++){

                    suma += i;
                }

                System.out.println("La suma los primero 10 numeros naturales : "+suma);
            }

            // Ejercicio nº7: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.
            public static void ejercicio07(){

                int num;
                int cont = 0;
                char control = 's';
                Scanner scan = new Scanner(System.in);

                do {
                    System.out.println("Digite un Numero:");
                    num  = scan.nextInt();
                    if (num >= 0){
                        cont++;
                    }

                    System.out.println("Desea Continuar (s/n)?");
                    control = scan.next().charAt(0);
                } while (control == 's');

                System.out.println("El Usuario Ingreso "+cont+" Numeros Positivos");
            }

            //Ejercicio nº8: Revisar si un año es bisiesto o no.
            public static void ejercicio08(){

                int anio;
                Scanner scan  = new Scanner(System.in);

                System.out.println("Ingrese Año:");

                do{
                    anio = scan.nextInt();
                    if(anio < 0){
                        System.out.println("Numero Invalido. Ingrese Nuevamente:");
                    }
                }while(anio < 0);

                GregorianCalendar calendar = new GregorianCalendar();

                if (calendar.isLeapYear(anio))
                    System.out.println("El año es bisiesto");
                else
                    System.out.println("El año no es bisiesto");

            }

            //Ejercicio nº9: Encontrar el valor ASCII de un carácter.
            public static void ejercicio09(){

                char c;
                Scanner scan = new Scanner (System.in);

                System.out.println("Ingrese un caracter: ");

                c = scan.next().charAt(0);

                int asciiValor = (int)c;

                System.out.println("El valor de "+ c + "en ASCII es : "+asciiValor);
            }

            //Ejercicio nº10: Multiplicar dos números.
            public static void ejercicio10(){

                int num1, num2, multi;
                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese un Numero: ");
                num1 = scan.nextInt();

                System.out.println("Ingrese otro Numero: ");
                num2 = scan.nextInt();

                multi = num1 * num2;

                System.out.println("La Multiplicacion de los 2 numeros es :"+multi);
            }

            /*Ejercicio nº11: Realizar un programa que le pregunte al usuario que área desea calcular.
                Las opciones son: rectángulo, cuadrado, triangulo y circulo. */
            public static void ejercicio11(){

                char control = 's';
                Scanner scan = new Scanner(System.in);

                System.out.println("¿Qué Area Desea Calcular?");
                System.out.println("1 - Rectangulo:");
                System.out.println("2 - Cuadrado:");
                System.out.println("3 - Triangulo:");
                System.out.println("4 - Circulo:");

                int dato = scan.nextInt();
                do{

                    switch (dato){


                        case 1 :
                            areaRectangulo();
                            break;

                        case 2 :
                            areaCuadrado();
                            break;

                        case 3 :
                            areaTriangulo();
                            break;

                        case 4 :
                            areaCirculo();
                            break;
                        default :
                            System.out.println("ERROR");
                            break;

                    }

                    System.out.println("Desea Continuar (s/n)?:");
                    control = scan.next().charAt(0);
                }while(control == 's');
            }

            public static void areaRectangulo(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Base del Rectangulo:");
                int base = scan.nextInt();

                System.out.println("Ingrese Altura del Rectangulo:");
                int altura = scan.nextInt();

                int area = base*altura;

                System.out.println("El Area del Rectangulo es: "+area);
            }

            public static void areaCuadrado(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Lado del Cuadrado:");
                double lado = scan.nextDouble();

                double area = lado*lado;

                System.out.println("El Area del Cuadrado es: "+area);

            }

            public static void areaTriangulo(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Base del Triangulo:");
                int base = scan.nextInt();

                System.out.println("Ingrese Altura del Triangulo:");
                int altura = scan.nextInt();

                double area = (base*altura)/2;

                System.out.println("El Area del Triangulo es: "+area);
            }

            public static void areaCirculo(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Radio del Circulo:");

                double radio = scan.nextDouble();

                double area = 3.1416 * Math.pow(radio,2);

                System.out.println("El Area del Circulo es: "+area);
            }

            /* Ejercicio nº12: Programa que lea un nombre y muestre por pantalla:
                “Buenos dias nombre_introducido”. */
            public static void ejercicio12(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese su Nombre :");
                String nombre = scan.nextLine();

                System.out.println("Buenos dias "+nombre+"!!");
            }

            /* Ejercicio nº13: Escribir un programa que lea un número entero por teclado
                y obtenga y muestre por pantalla el doble y el triple de ese número. */
            public static void ejercicio13(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Un Número entero:");
                int dato = scan.nextInt();

                int doble = 2*dato;
                int triple = 3*dato;

                System.out.println("El Doble del Numero es: "+doble+" Y el Triple es: "+triple);
            }

            /*Ejercicio nº14: Programa que lea una cantidad de grados centígrados y
            la pase a grados Fahrenheit. La fórmula correspondiente para pasar de
                grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5). */
            public static void ejercicio14(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Temperatura en °C :");

                double C = scan.nextDouble();

                double F = 32 + (9 * C /5);

                System.out.println("La Temperatura en °F es : "+F);
            }

            /*Ejercicio nº15: Programa que lea por teclado el valor del radio de una circunferencia y calcula
                y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
               Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2. */
            public static void ejercicio15(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Radio de Circunferencia: ");
                double radio = scan.nextDouble();

                double longitud = 2*3.1416*radio;
                double area = 3.1416 * Math.pow(radio,2);

                System.out.println("La Longitud es: "+longitud+" Y su Area es: "+area);
            }

            /*Ejercicio nº16: Programa que pase una velocidad en Km/h a m/s.
                La velocidad se lee por teclado. */
            public static void ejercicio16(){
                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Velocidad en Km/h: ");

                double vel = scan.nextDouble();

                double vel2 = vel / 3.6 ;

                System.out.println("La Velocidad en m/s es: "+vel2);
            }

            /*Ejercicio nº17: Programa lea la longitud de los catetos de un triángulo rectángulo
                y calcule la longitud de la hipotenusa según el teorema de Pitágoras. */
            public static void ejercicio17(){

                Scanner scan = new Scanner(System.in);
                double cateto1, cateto2;

                System.out.print("Introduzca longitud del primer cateto: ");
                cateto1 = scan.nextDouble();

                System.out.print("Introduzca longitud del segundo cateto: ");
                cateto2 = scan.nextDouble();
                System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2)));

            }

            /* Ejercicio nº18: Programa lea 30 temperaturas correspondientes a un mes y
                calcule el maximo, el minimo y el promedio. */
            public static void ejercicio18(){

                Scanner scan = new Scanner(System.in);
                int i,tempMayor,tempMenor,temp,sumaTemp;

                int dias = 30;
                tempMayor = 0;
                tempMenor = 100;
                sumaTemp = 0;


                for(i = 1; i <= dias; i++){

                    System.out.print("Ingrese la temperatura del Dia " + i + " : ");
                    temp = scan.nextInt();

                    sumaTemp = sumaTemp + temp;
                    if(temp > tempMayor){
                        tempMayor = temp;
                    }
                    if(temp < tempMenor){
                        tempMenor = temp;
                    }
                }

                System.out.print("La Temperatura Mayor del Mes es: " + tempMayor + "\n");
                System.out.print("La Temperatura Menor del Mes es: " + tempMenor + "\n");

                float prom = (float) sumaTemp/(float)dias;

                System.out.print("El promedio es: " + prom + "\n");
            }

            /*Ejercicio nº19:Pide por teclado dos números y genera 10 números aleatorios entre esos números.
                Usa el método Math.random para generar un número entero aleatorio.  */
            public static void ejercicio19(){

                Scanner scan = new Scanner(System.in);

                int[] arr = new int [10];

                System.out.println("Ingrese un Numero: ");
                int dato1 = scan.nextInt();

                System.out.println("Ingrese otro Numero: ");
                int dato2 = scan.nextInt();


                for(int i=0; i < 10 ; i++ ){
                    if(dato1 >= dato2){
                        arr[i] =  (int) (Math.random()*dato1)+dato2;
                    }
                    else{
                        arr[i] =  (int) (Math.random()*dato2)+dato1;
                    }
                }

                mostrarArreglo(arr, arr.length);
            }

            /*Ejercicio nº20:  Crea una aplicación que nos pida un día de la semana y que nos diga
                si es un día laboral o no. Usa un switch para ello.*/
            public static void ejercicio20(){

                Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese Dia de la Semana: ");

                String dia = scan.nextLine();

                switch(dia){

                    case "lunes":
                    case "martes":
                    case "miercoles":
                    case "jueves":
                    case "viernes":
                        System.out.println("Dia Laboral");
                        break;

                    case "sabado":
                    case "domingo":
                        System.out.println("Dia No Laboral");

                    default:
                        System.out.println("Ingrese Dia de la Semana: ");
                }
            }

            /*Ejercicio nº21: Pide por teclado un número entero positivo (debemos controlarlo) y muestra
                el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras.
                Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje. */
            public static void ejercicio21(){

                Scanner scan = new Scanner(System.in);
                int numero;
                System.out.println("Ingrese un Numero Positivo: ");
                do{

                    numero = scan.nextInt();
                    if(numero < 0){
                        System.out.println("Numero Incorrecto.Ingrese Nuevamente: ");
                    }
                }while(numero < 0);

                System.out.println("El número " + numero + " tiene " + Integer.toString(numero).length() + " dígitos");
            }

            /*Ejercicio nº22:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int)
                y un signo aritmético (String), según este último se realizará la operación correspondiente.
                Al final mostrara el resultado en un cuadro de diálogo.
                    Los signos aritméticos disponibles son:
                    +: suma los dos operandos.
                    -: resta los operandos.
                    *: multiplica los operandos.
                    /: divide los operandos, este debe dar un resultado con decimales (double)
                    ^:  1º operando como base y 2º como exponente.
                    %:  módulo, resto de la división entre operando1 y operando2. */
            public static void ejercicio22(){

                int operando1;
                int operando2;
                Scanner scan = new Scanner(System.in);

                //Nos pide los operandos y el signo de operacion
                System.out.println("Escribe el operando 1");
                operando1=scan.nextInt();

                System.out.println("Escribe el codigo de operacion");
                String signo = scan.next();

                System.out.println("Escribe el operando 2");
                operando2=scan.nextInt();

                CalculadoraPolacaInversaApp(operando1,operando2,signo);
            }

            public static void CalculadoraPolacaInversaApp (int operando1 , int operando2, String signo){

                int resultado=0;

                switch (signo){
                    case "+":
                        resultado=operando1+operando2;
                        break;
                    case "-":
                        resultado=operando1-operando2;
                        break;
                    case "*":
                        resultado=operando1*operando2;
                        break;
                    case "/":
                        resultado=operando1/operando2;
                        break;
                    case "^":
                        resultado=(int)Math.pow(operando1, operando2);
                        break;
                    case "%":
                        resultado=operando1%operando2;
                        break;

                }

                JOptionPane.showMessageDialog(null, operando1+" "+signo+" "+operando2+" = "+resultado);
            }

            /*Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario

                - Si es menor de 16 no tiene edad para trabajar.
                - Entre 19 y 50 años el salario es un 5 por ciento más.
                - Entre 51 y 60 años el salario es un 10 por ciento más.
                - Si es mayor de 60 el salario es un 15 por ciento más. */
            public static void ejercicio23(){

                Scanner scan = new Scanner(System.in);

                System.out.println("Ingrese Nombre: ");
                String nombre = scan.nextLine();

                System.out.println("Ingrese Edad: ");
                int edad = scan.nextInt();

                System.out.println("Ingrese Salario: ");
                double salario = scan.nextDouble();

                if(edad < 16){
                    System.out.println(" "+nombre+" No tiene edad para trabajar.");
                }

                if((edad > 19) && (edad < 50)){
                    double sal = salario + (salario * 0.05);
                    System.out.println(" "+nombre+" su  Salario es : $"+sal);
                }

                if((edad >= 51) && (edad < 60)){
                    double sal2 = salario + (salario * 0.1);
                    System.out.println(" "+nombre+" su  Salario es : $"+sal2);
                }

                if(edad > 60){
                    double sal3 = salario + (salario * 0.15);
                    System.out.println(" "+nombre+" su  Salario es : $"+sal3);
                }
            }
        }





