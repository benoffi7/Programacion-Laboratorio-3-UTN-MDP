
package guia1lab3;
import java.util.Scanner;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

        /**
 *
 * @author jaabr
 */


public class Guia1Lab3 {
       static Scanner scan = new Scanner(System.in);
 
    /**
     * @param args the command line arguments
     */
    //public static void ingresarAr(int [ar]){
    
       
       
    //EJERCICIO 1
    public static int sumarAr (int []ar, int val){
        int suma = 0; 
        for (int i = 0; i < val; i++){
            suma += ar[i];
        }
        return suma;
    }
    
    //EJERCICIO 1 Y 8
    public static int cargarAr (int []ar){          
  //      Scanner scan = new Scanner(System.in); 
        int control = 0; 
        int i = 0; 
        do{
            System.out.println("Ingrese el numero "+(i+1));
            ar[i] =scan.nextInt();  
            i++;
            System.out.println("¿Continuar con la carga? 0/-1");
            control = scan.nextInt();
        }while((control!= -1)&&(i<=ar.length));
    return i; 
        /*
        for(int i = 0; i < 5; i++){
            System.out.println("Numero "+i);
            ar[i]=scan.nextInt();
        }*/
    }

    //EJERCICIO 1, NO SE USA.
    public static int cantidadAr(int []ar){
        int cantidad = ar.length;
    return cantidad;
    }
    
    //EJERCICIO 1
    public static float promediarAr( int []ar, int suma, int cantidad ){
        float promedio = (float)suma / (float)cantidad;
    return promedio;
    }
   
    //EJERCICIO 2
    public static boolean parOimpar(int numero){
        boolean num = false;
        if( numero % 2 == 0){
            num = true;
        }
        return num;
    }

    //EJERCICIO 2
    public static void escribirParOimpar( boolean num){
        if(num == true){        
            System.out.println("Es par");   
        }else{
            System.out.println("Es impar");  
        }
    }
        
    //EJERCICIO 3
    public static boolean primo(int numero){
        boolean res = true;
        int i = 2;
        do{
            if(numero % i == 0){
                res = false;
                i++;
            }
            i++;
        }while((i<numero)&&(res));
    return res;
 }
   
    //EJERCICIO 3
    public static void escribirPrimoONo(boolean res){
        if(res == true){
          System.out.println("Es primo");   
        }else{
           System.out.println("No es primo");  
       }
    }
    
    //EJERCICIO 4 y 5
    public static void mostrarNumerosPrimos(int cantidad){
        boolean res = false;
        for ( int i = 0; i < cantidad; i++){
            res = primo(i);
            if(res == true){
                System.out.print(" "+i);
            }
        }
    }   

    //EJERCICIO 6
    public static boolean primoArray(int []ar, int val, int i){
        boolean res = true;
        //int i = 0;
        int cont = 2;
        //do{
            if(ar[i] % cont == 0){
                res = false;
          //      i++;
            }
        //i++;
        //}while(i<val);
    return res;
    }
  
    //EJERCICIO 6
    public static void mostrarSoloPrimosAr(int []ar, int val){
       int i = 0;
        do{
           boolean res = primoArray(ar, val, i);
           if(res == true){
               System.out.println("Es primo: "+ar[i]);
            }
             i++;
         }while (i <val);
    }
           
    //EJERCICIO 7
    public static int numerosNaturales(){
        int suma = 0;
        for ( int i = 1; i < 11; i++){
            suma += i;
        }
    return suma;
    }
    
    //EJERCICIO 8
    public static int numerosPositivos(int []array, int val){
        int cantidad = 0;
        for(int i = 0; i < val; i++){
             if(array[i] >= 0){
                cantidad++;
            }
        }
    return cantidad;
    }
    
    //EJERCICIO 9
    public static boolean anioBisiesto(int anio){
        boolean res = false;
        if(anio % 4 == 0){
            res = true;
        }
    return res;
    }
    
    //EJERCICIO 9
    public static void escribirBisiesto(boolean res){
        if(res == true){
            System.out.println("BISIESTO!");
        }else{
            System.out.println("No es bisiesto");
        }
    }
    
    //EJERCICIO 10
    public static void charAscii(String caracter){
        System.out.println((int) caracter.charAt(0));   
    }    

    //EJERCICIO 11 Y 12
    public static int multiplicarAxB(int a, int b){
        int res = a * b;
    return res;
    }
    
    //EJERCICIO 12
    public static void areaRectangulo(){
      //  Scanner scan = new Scanner(System.in);
        System.out.println("Rectángulo!: ");
        System.out.print("Ingrese la longitud en cm. de la altura del rectangulo: ");
        int h = scan.nextInt();
        System.out.print("Ingrese la longitud en cm. de la base del rectangulo: ");
        int b = scan.nextInt();
        int area = multiplicarAxB(b, h);
        System.out.println("El area del cuadrado es de: "+area);
    }
    
    //EJERCICIO 12
    public static void areaCuadrado(){
      //  Scanner scan = new Scanner(System.in);
        System.out.println("Cuadrado!: ");
        System.out.print("Ingrese la longitud en cm. de un lado del cuadrado: ");
        int lado = scan.nextInt();
        int area = multiplicarAxB(lado, lado);
        System.out.println("El area del cuadrado es de: "+area);
    }
    
    //EJERCICIO 12 
    public static float areaTriangulo(int hXb){
        float area = (hXb)/2;
    return area;
    }
    
    //EJERCICIO 12
    public static void areaTriangulo(){
      //  Scanner scan = new Scanner(System.in);
        System.out.println("triangulo!: ");
        System.out.print("Ingrese la longitud en cm. de la altura del triangulo: ");
        int h = scan.nextInt();
        System.out.print("Ingrese la longitud en cm. de la base del triangulo: ");
        int b = scan.nextInt();       
        int hXb = multiplicarAxB(h, b);
        float area = areaTriangulo(hXb);
        System.out.println("El area del triangulo es de: "+area);
    }
    //EJERCICIO 12
    public static double areaCirculo(float r){
        double area = Math.PI * Math.pow(r, 2);
    return area;
    }
    
    //EJERCICIO 12
    public static void areaCirculo(){
      //  Scanner scan = new Scanner(System.in);
        System.out.println("Circulo!: ");
        System.out.print("Ingrese la longitud en cm. del radio del círculo: ");
        float r = scan.nextInt();
        double area = areaCirculo(r);
        System.out.println("El area del circulo es de: "+area);
    }
   
    //EJERCICIO 12
    public static void eleccionAreas(int opcion){
        if((opcion <5)||(opcion >0)){
            if(opcion ==1){
                areaRectangulo();
            }else{
                if(opcion ==2){
                    areaCuadrado();
                }else{
                    if(opcion ==3){
                        areaTriangulo();
                    }else{
                        areaCirculo();
                    }
                }
            }
        }else{
            System.out.println("Opcion ingresada incorrecta!");
        }
    }
   
    //EJERCICIO 14  
    public static int dobleNum (int num){
        int doble = num *2;
    return doble;
  }
    
    //EJERCICIO 14   
    public static int tripleNum (int num){
        int triple = num *3;
    return triple;
  }
    
    //EJERCICIO 15  
    public static float centigradosAFarenheit( float C){
        float F = 32 + (9 * C / 5);
    return F;
    }
    
    //EJERCICIO 16
    public static double longitudCircunferencia( float radio){
        double longitud = 2 * Math.PI * radio;
    return longitud;
    }
        
    //EJERCICIO 17
    public static double kAm(double k){
        double m;
        m = (k / (3.6));
    return m;
    }
    
    //EJERCICIO 18
    public static double hipotenusa (float CA, float CB){
        double H = ((Math.pow(CA, 2))+(Math.pow(CB, 2)));
    return H;
    }

    //EJERCICIO19
    public static float promedioMes (float suma){
        float prom;
    return  prom = (suma / 30);
    }
    
    //EJERCICIO19
    public static float sumaMes (float []mes){
        int suma = 0;
        for ( int i = 0; i < 30; i++){
            suma += mes[i];
        }
    return suma; 
    }
    
    //EJERCICIO19
    public static void cargarArMes(float []mes){
      //  Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 30; i++){
            System.out.println("DIA: "+i);

            mes[i] = scan.nextFloat();
        }
    }
    
    //EJERCICIO19
    public static float valorMinimo(float []mes){
        float minimo = mes[0];
        for ( int i = 0; i < 30; i++){
            if(minimo > mes[i]){
                minimo = mes[i];
            }
        }
    return minimo; 
    }
    
    //EJERCICIO19
     public static float valorMaximo(float []mes){
        float maximo = mes[0];
        for ( int i = 0; i < 30; i++){
            if(maximo < mes[i]){
                maximo = mes[i];
            }
        }
    return maximo; 
    }
    
     //EJERCICIO 20
    public static void random(int d, int h){
        for(int i = 0; i < 10; i++){
            int numero =(int)(Math.random()*h)+d;
            System.out.println(+numero);
        }
     }
    
    //EJERCICIO 21
    public static void diaLaboral(String dia){
        switch (dia){
            case "lunes": System.out.println("LABORAL!");
            break;
            case "martes": System.out.println("LABORAL!");
            break;
            case "miercoles": System.out.println("LABORAL!");
            break;
            case "jueves": System.out.println("LABORAL!");
            break;
            case "viernes": System.out.println("LABORAL!");
            break;
            case "sabado": System.out.println("NO LABORAL!");
            break;
            case "domingo": System.out.println("NO LABORAL!");
            break;
            
            default: System.out.println("El dìa ingresado no corresponde con el calendario de la Tierra");
            break;
        }
    }
    
    //EJERCICIO 22
    public static int cifras(int numero){
        int cantidad = (int)(Math.log10(numero)+1);
    return cantidad;
    }

    //EJERCICIO 23
    public static float suma(int a, int b){
        float res = (a + b);
    return res; 
    }

    //EJERCICIO 23
    public static float resta(int a, int b){
        float res = (a - b);
    return res; 
    }

    //EJERCICIO 23
    public static float multiplicacion(int a, int b){
        float res = (a * b);
    return res; 
    }

    //EJERCICIO 23
    public static float division(int a, int b){
        float res = ((float)a / (float)b);
    return res; 
    }

    //EJERCICIO 23
    public static double potencia(int a, int b){
        double res = Math.pow(a, b);
    return res; 
    }

    //EJERCICIO 23
    public static float modulo(int a, int b){
        float res = ((float)a % (float)b);
    return res; 
    }
    
    //EJERCICIO 23    
    public static float CalculadoraPolacaInversaApp(int a, int b, String signo){
        float res = 0; 
        double resP = 0;
        switch (signo){
             case "+":  res = suma(a, b);         
             break;
             
             case "-":  res = resta(a, b);
             break;
             
             case "*":  res = multiplicacion(a, b);
             break;
             
             case "/":  res = division(a, b);
             break;
             
             case "^":  resP = potencia(a, b);        
             break;
             
             case "%":  res = modulo(a, b);  
             break;
             
             default : System.out.println("Signo incorrecto");
        }
    return res;     
    }
   
    //EJERCICIO 24
    public static double nombreEdadSalario(String nombre, int edad, int salario){
        double salarioTotal = 0;
        if(edad < 16){
            System.out.println("NO PUEDE TRABAJAR; ES MENOR!!!");
        }else{
            if((edad > 18)&&(edad < 51)){
                salarioTotal = (salario * 1.05);
            }else{
                if((edad > 50)&&(edad < 61)){
                    salarioTotal = (salario * 1.10);
            }else{
                if(edad > 59){
                    salarioTotal = (salario * 1.15);
                    }
                }
           }
        }
    return salarioTotal; 
    }
    
    
    
    public static void ejercicio1(){
      //Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.
      //  Scanner scan = new Scanner(System.in);
        // int []array = { 1, 2, 3, 4, 5};
       int []array = new int[10]; 
       int num; 
       int val = cargarAr(array);
       int suma = sumarAr(array, val);
       System.out.println("Suma: "+suma);
    //   int cant = cantidadAr(array);
       System.out.println("Cantidad de elementos: "+val);
       float prom = promediarAr(array, suma, val); 
       System.out.println("Promedio: "+prom);
     }

    public static void ejercicio2(){
    //Ejercicio nº2: Calcular si un número es par o no.
      // Scanner scan = new Scanner(System.in);
       System.out.println("Ingrese el numero a analizar:");
       int numero = scan.nextInt();
       boolean num = parOimpar(numero);
       escribirParOimpar(num);
    }
    
    public static void ejercicio3(){
        //Ejercicio nº3: Mostrar los primeros 100 números primos.
      //  Scanner scan = new Scanner(System.in);
     //  System.out.println("Ingrese el numero: ");
     //  int numero = scan.nextInt();
        for( int i = 0; i < 100; i++){  
            boolean res = primo(i);
            if(res == true){
                System.out.println(i);
            }
     //  escribirPrimoONo(res);
        }
    }
   
    public static void ejercicio4(){
        //Ejercicio nº4: Mostrar los primeros n números primos.
      //  Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese hasta qué numero desea ver los numeros primos");
        int cantidad = scan.nextInt();
        mostrarNumerosPrimos(cantidad);
    }

    public static void ejercicio6(){
        //Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo
      //  Scanner scan = new Scanner(System.in);
        int []array = new int[10];
        System.out.println("Ingresar los numeros a revisar");
        int val = cargarAr(array);
        System.out.println("VALIDOS "+val);
        mostrarSoloPrimosAr(array, val);
    }
  
    public static void ejercicio7(){
      //Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.
      // Scanner scan = new Scanner(System.in);
       System.out.println("Suma de los 10 primeros numeros naturales:");
       int suma= numerosNaturales();
       System.out.println("La suma es de: "+suma);
    }
   
    public static void ejercicio8(){
        //Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario. 
      //  Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numeros positivos y negativos");
        int []array = new int[10];
        int val = cargarAr(array);
        int cantidad = numerosPositivos(array, val);
        System.out.println("Cantidad de numeros positivos: "+cantidad);
    }
  
    public static void ejercicio9(){
        //Ejercicio nº9: Revisar si un año es bisiesto o no.
    //    Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el año a calcular: ");
        int anio = scan.nextInt();
        boolean res = anioBisiesto(anio);
        escribirBisiesto(res);
    }
    
    public static void ejercicio10(){
        //Ejercicio nº10: Encontrar el valor ASCII de un carácter
     //   Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el caracter a encontrar el valor ASCII");
       // char c = (char)83; //ascii de 83 corresponde a S
       // System.out.println("Es: "+c);
      /* String cadena ="hola";
       System.out.println((int) cadena.charAt(0));
       int c = 0;
       for(int i = 0; i < cadena.length(); i++){
           c+=(int)cadena.charAt(i);
       }
           System.out.println(c);
    } Mas o menos*/
        String caracter = scan.next();
        charAscii(caracter);
    }

    public static void ejercicio11(){
        //Ejercicio nº11: Multiplicar dos números. 
        System.out.println("a x b: ");
        System.out.print("Ingrese el numero a: ");
     //   Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Ingrese el numero b: ");
        int b = scan.nextInt();
        int res = multiplicarAxB(a, b);
        System.out.println("El resultado es de: "+res);
    }            
    
    public static void ejercicio12(){
        //Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular.
        //Las opciones son: rectángulo, cuadrado, triangulo y circulo.
     //   Scanner scan = new Scanner(System.in); 
        System.out.println("Vamos a calcular areas! \nIngrese la opción del área a calcular:");
        System.out.println("1- Rectángulo. \n2- Cuadrado. \n3- Triangulo. \n4-Circulo");
        int opcion = scan.nextInt();
        eleccionAreas(opcion);
    }
    
    public static void ejercicio13(){
        //Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
        //“Buenos dias nombre_introducido”.
     //   Scanner scan = new Scanner(System.in); 
        System.out.print("Ingrese su nombre: ");
        String nombre= scan.nextLine();
        System.out.println("Buenos días "+nombre);
    }
        
    public static void ejercicio14(){
        //Ejercicio nº14: Escribir un programa que lea un número entero por teclado 
        //y obtenga y muestre por pantalla el doble y el triple de ese número.
     //   Scanner scan = new Scanner(System.in); 
        System.out.print("Ingrese un número entero: ");
        int numero = scan.nextInt();
        int doble = dobleNum(numero);
        System.out.println("Doble: "+doble);
        int triple = tripleNum(numero);        
        System.out.println("Triple: "+triple);
    }
    
    public static void ejercicio15(){
        //Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        //La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)
     //   Scanner scan = new Scanner(System.in); 
        System.out.print("Ingrese los grados a convertir: ");
        float C = scan.nextFloat();
        float F = centigradosAFarenheit(C);
        System.out.println("Fahrenheit: "+F);
    }
    
    public static void ejercicio16(){
        //Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y 
        //el área de la circunferencia. Investigar el uso de la librería Math.
        //Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
     //   Scanner scan = new Scanner(System.in); 
        System.out.print("Ingrese el radio: ");
        float R = scan.nextFloat();
        double area = areaCirculo(R);
        System.out.print("Area: "+area);
        double longitud = longitudCircunferencia(R);
        System.out.print("Longitud: "+longitud);
    }
    
    public static void ejercicio17(){
     //   Scanner scan = new Scanner(System.in); 
        //Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        System.out.println("Velocidad a convertir: ");
        double K = scan.nextDouble(); 
        double M =kAm(K);
        System.out.println("Velocidad En m/s: "+M);
    }
   
    public static void ejercicio18(){
   //Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y 
   //calcule la longitud de la hipotenusa según el teorema de Pitágoras.
     //   Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto A: ");
        float CA = scan.nextFloat();
        System.out.println("Ingrese el valor del cateto B: ");
        float CB = scan.nextFloat();
        double H = hipotenusa(CA, CB);
        System.out.println("Hipotenusa: "+H);
    }
    
    public static void ejercicio19(){
   //Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.
     //   Scanner scan = new Scanner(System.in); 
        float []mes = new float[30];
        cargarArMes(mes);       //Dependiendo el mes es la cantidad de días. lo voy a hacer de a 30, pero con un switch se podría hacer. 
        float suma = sumaMes(mes);
        float prom = promedioMes(suma);
        System.out.println("EL promedio de las temperaturas del mes es de: "+prom);
        float minimo = valorMinimo(mes);
        System.out.println("EL valor minimo es de: "+minimo);
        float maximo = valorMaximo(mes);
        System.out.println("EL valor maximo es de: "+maximo);
    }
             
    public static void ejercicio20(){
   //Ejercicio nº20:Pide por teclado dos números y genera 10 números aleatorios entre esos números. 
   // Usa el método Math.random para generar un número entero aleatorio 
     //   Scanner scan = new Scanner(System.in); 
        System.out.println("Desde:");
        int desde = scan.nextInt();
        System.out.println("Hasta: ");
        int hasta = scan.nextInt();
        random(desde, hasta);
    }
    
    public static void ejercicio21(){
   //Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
     //   Scanner scan = new Scanner(System.in);    
        System.out.println("Ingrese el día de la semana: ");
        String dia = scan.nextLine();
        diaLaboral(dia);
    }
    
    public static void ejercicio22(){
   //Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. 
  // Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, 
   //al mostrar el mensaje.
       // Scanner scan = new Scanner(System.in); 
        System.out.println("Ingrese un numero entero y positivo");
        int numero = scan.nextInt();
        int cant = cifras(numero);
        System.out.println("Cifras: "+cant);
    }
    
//if(miNombre.equals(intento)) {
    public static void ejercicio23(){
       //Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String),
       //según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.
       // Los signos aritméticos disponibles son:
        //+: suma los dos operandos.
        //-: resta los operandos.
      //  *: multiplica los operandos.
       // /: divide los operandos, este debe dar un resultado con decimales (double)
       // ^:  1º operando como base y 2º como exponente.
       // %:  módulo, resto de la división entre operando1 y operando2.
       
     //   Scanner scan = new Scanner(System.in); 
        
        System.out.println("Primer operando: ");
        int opA = scan.nextInt();
                
        System.out.println("Signo aritmètico: ");
        String signo = scan.next();
        
        System.out.println("Segundo operando: ");
        int opB = scan.nextInt();
        
        float res = CalculadoraPolacaInversaApp(opA, opB, signo);
        // JOptionPane.showInputDialog(""); entrada de datos
        //salida de datos:
        JOptionPane.showMessageDialog(null, "El resultado es de: "+res);
    }
                
    public static void ejercicio24(){
    //  Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario
    // Si es menor de 16 no tiene edad para trabajar
    //  Entre 19 y 50 años el salario es un 5 por ciento más
    // Entre 51 y 60 años el salario es un 10 por ciento más
    //Si es mayor de 60 el salario es un 15 por ciento más
      //  Scanner scan = new Scanner(System.in); 
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Edad: ");
        int edad = scan.nextInt();
        System.out.println("Salario: ");
        int salario = scan.nextInt();                        
        double salarioTotal = nombreEdadSalario(nombre, edad, salario);
        System.out.println("Salario inicial: "+salario);
        System.out.println("El Salario final es de: "+salarioTotal);
    }
    
    
    
    public static void menu(){
        System.out.println("\n" +
        "Trabajo Práctico Nº1: Java\n" +
        "\n" +
        "Ejercicio nº1: Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.\n" +
        "\n" +
        "Ejercicio nº2: Calcular si un número es par o no. \n" +
        "\n" +
        "Ejercicio nº3: Mostrar los primeros 100 números primos.\n" +
        "\n" +
        "Ejercicio nº4: Mostrar los primeros n números primos.\n" +
        "\n" +
        "Ejercicio nº5: Mostrar los primeros n números primos.\n" +
        "\n" +
        "Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo\n" +
        "\n" +
        "Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.\n" +
        "\n" +
        "Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario. \n" +
        "\n" +
        "Ejercicio nº9: Revisar si un año es bisiesto o no.\n" +
        "\n" +
        "Ejercicio nº10: Encontrar el valor ASCII de un carácter.\n" +
        "\n" +
        "Ejercicio nº11: Multiplicar dos números. \n" +
        "\n" +
        "Ejercicio nº12: Realizar un programa que le pregunte al usuario que área desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.\n" +
        "\n" +
        "Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:\n" +
        "“Buenos dias nombre_introducido”.\n" +
        "\n" +
        "Ejercicio nº14: Escribir un programa que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.\n" +
        "\n" +
        "Ejercicio nº15: Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)\n" +
        "\n" +
        "Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.\n" +
        "Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2\n" +
        "\n" +
        "Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.\n" +
        "\n" +
        "Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.\n" +
        "\n" +
        "Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.\n" +
        "\n" +
        "Ejercicio nº20:Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio \n" +
        "\n" +
        "Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.\n" +
        "Ejercicio nº22: Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.\n" +
        "\n" +
        "Ejercicio nº23:  Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.\n" +
        "Los signos aritméticos disponibles son:\n" +
        "+: suma los dos operandos.\n" +
        "-: resta los operandos.\n" +
        "*: multiplica los operandos.\n" +
        "/: divide los operandos, este debe dar un resultado con decimales (double)\n" +
        "^:  1º operando como base y 2º como exponente.\n" +
        "%:  módulo, resto de la división entre operando1 y operando2.\n" +
        "\n" +
        "Ejercicio nº23: Pide por teclado el nombre, edad y salario y muestra el salario\n" +
        "\n" +
        "Si es menor de 16 no tiene edad para trabajar\n" +
        "Entre 19 y 50 años el salario es un 5 por ciento más\n" +
        "Entre 51 y 60 años el salario es un 10 por ciento más\n" +
        "Si es mayor de 60 el salario es un 15 por ciento más\n" +
        "");
    }
            
    
    
    public static void main(String[] args) {
     //   menu();
      //  Scanner scan = new Scanner(System.in);
        int control = 1; 
         do{
            System.out.print("Ingrese el nunmero del ejercicio a resolver 1-24: ");
            int opcion = scan.nextInt();
            switch (opcion){
               case 1: ejercicio1();
               break;        

               case 2: ejercicio2();
               break;

               case 3: ejercicio3();
               break;        

               case 4: ejercicio4();
               break; 

               case 5: ejercicio4();
               break;

               case 6: ejercicio6();
               break; 

               case 7: ejercicio7();
               break;       

               case 8: ejercicio8();
               break;

               case 9: ejercicio9();
               break;

               case 10: ejercicio10();
               break;     

               case 11: ejercicio11();
               break;

               case 12: ejercicio12();
               break;

               case 13: ejercicio13();
               break;

               case 14: ejercicio14();
               break;

               case 15: ejercicio15();
               break;

               case 16: ejercicio16();
               break;

               case 17: ejercicio17();
               break;

               case 18: ejercicio18();
               break;

               case 19: ejercicio19();
               break;

               case 20: ejercicio20();
               break;

               case 21: ejercicio21();
               break;

               case 22: ejercicio22();
               break;   

               case 23: ejercicio23();
               break;   

               case 24: ejercicio24();
               break;

               default: System.out.println("Opcion ingresada incorrecta. ☺");
            }   
            System.out.println("Continuar con la resolucion de los ejercicios?, 0/-1");
            control = scan.nextInt();
        }while(control !=-1);   
    scan.close();    
    }
}

