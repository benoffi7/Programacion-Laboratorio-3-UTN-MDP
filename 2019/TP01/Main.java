import java.net.PortUnreachableException;
import java.util.List;
import  java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static final int SIZE_ARRAY = 10;
    public static final int SIZE_BIG_ARRAY = 100;
    public static final int MONTH_SIZE = 30;
    public static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        String choice="Z";
        boolean breaker1=true;

        while (breaker1==true) {
            System.out.println("Trabajo Practico Nº1\nHecho por Santiago G. Paak");
            System.out.println("Menu Principal\nPresione un numero entre el 1 al 23 para ejecutar ese ejercicio");
            System.out.println("1 - Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.");
            System.out.println("2 - Calcular si un número es par o no");
            System.out.println("3 - Mostrar los primeros 100 números primos.");
            System.out.println("4 - Mostrar los primeros n números primos.");
            System.out.println("5 - Mostrar los primeros n números primos.");
            System.out.println("6 - Ingresar un número o tantos como quiera el usuario y revisar si es primo.");
            System.out.println("7 - Encontrar la suma de los primeros 10 números naturales.");
            System.out.println("8 - Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.");
            System.out.println("9 - Revisar si un año es bisiesto o no.");
            System.out.println("10 - Encontrar el valor ASCII de un carácter.");
            System.out.println("11 - Multiplicar dos números.");
            System.out.println("12 - Realizar un programa que le pregunte al usuario que área desea calcular. Las opciones son: rectángulo, cuadrado, triangulo y circulo.");
            System.out.println("13 - Programa que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”");
            System.out.println("14 - Escribir un programaque lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.");
            System.out.println("15 - Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)");
            System.out.println("16 - Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.");
            System.out.println("17 - Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.");
            System.out.println("18 - Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.");
            System.out.println("19 - Programa lea 30 temperaturas correspondientes a un mes y calcule el maximo, el minimo y el promedio.");
            System.out.println("20 - Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio ");
            System.out.println("21 - Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.");
            System.out.println("22 - Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.");
            System.out.println("23 - Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de diálogo.");
            System.out.println("24 - Pide por teclado el nombre, edad y salario y muestra el salario");
            System.out.println("E - Salir del programa");
            choice=scan.next();
            switch (choice) {
                case "1":
                    A01();
                    break;
                case "2":
                    A02();
                    break;
                case "3":
                    A03();
                    break;
                case "4":
                    A04();
                    break;
                case "5":
                    System.out.println("El punto 5 es igual al punto 4. Ejecutando punto 4");
                    //Creo que hay un error aqui
                    A04();
                    break;
                case "6":
                    A06();
                    break;
                case "7":
                    A07();
                    break;
                case "8":
                    A08();
                    break;
                case "9":
                    A09();
                    break;
                case "10":
                    A10();
                    break;
                case "11":
                    A11();
                    break;
                case "12":
                    A12();
                    break;
                case "13":
                    A13();
                    break;
                case "14":
                    A14();
                    break;
                case "15":
                    A15();
                    break;
                case "16":
                    A16();
                    break;
                case "17":
                    A17();
                    break;
                case "18":
                    A18();
                    break;
                case "19":
                    A19();
                    break;
                case "20":
                    A20();
                    break;
                case "21":
                    A21();
                    break;
                case "22":
                    A22();
                    break;
                case "23":
                    A23();
                    break;
                case "24":
                    A24();
                    break;
                case "E":
                    breaker1=false;
                    break;
                case "e":
                    breaker1=false;
                    break;
                default:
                    System.out.println("Valor no valido");
            }
            System.out.println("Programa finalizado");
        }
        scan.close();
    }

    public static void A01(){
        double[] list;
        list = new double[SIZE_ARRAY];
        char choice='Z';

        System.out.println("PUNTO 1: Calcular el promedio de un arreglo de números enteros. Realizar variantes con arreglos ya inicializados e ingreso por teclado.");
        System.out.print("1 - Generar una lista automaticamente\n" + "2 - Ingresar la lista manualmente\n" + "> ");
        choice=scan.next().charAt(0);

        switch (choice){
            case '1':
                listGenerator(list);
                break;
            case '2':
                listScanner(list);
                break;
            default:
                System.out.println("Valor no valido");
        }
        showAverage(list,-1);
    }

    public static int randomNumber(int min,int max){
        int x = 0;
        x = (int) (Math.random()*((max-min)+1))+min;
        return x;
    }

    public static void listGenerator(double list[]){
        int cont=0;

        for(cont=0;cont<list.length;cont++){
            list[cont]=randomNumber(1,100);
        }
    }

    public static void listScanner(double list[]){
        int cont=0;

        for(cont=0;cont<list.length;cont++){
            System.out.println("Valor " + (cont+1) + " de " + list.length);
            System.out.print("Ingrese un valor numerico > ");
            list[cont]=scan.nextInt();
        }
    }

    public static double listAverage(double list[],double cant){
        int cont=0;
        int accumulator=0;
        int ret=0;

        for(cont=0;cont<cant;cont++){
            accumulator += list[cont];
        }

        ret= accumulator / list.length;

        return ret;
    }

    public static void showAverage(double list[],double cant){
        if(cant==-1){
            cant=list.length;
        }
        int cont=0;
        double aver=0;

        aver=listAverage(list,cant);
        System.out.println("La lista recibida es: ");
        for(cont=0;cont<cant;cont++){
            System.out.println(list[cont]);
        }
        System.out.println("El promedio es: "+aver);
    }

    public static void A02(){
        int num=0;
        boolean comp=false;

        System.out.print("Ingrese un numero para determinar si es par o no\n>");
        num=scan.nextInt();
        comp=par(num);
        if(comp==true){
            System.out.println("El numero "+num+" es par");
        }
        else{
            System.out.println("El numero "+num+" es impar");
        }
    }

    public static boolean par(int num){
        boolean ret=false;

        if(num%2==0){
            ret=true;
        }
        else{
            ret=false;
        }
        return ret;
    }

    public static void A03(){
        double[] list;
        list = new double[SIZE_BIG_ARRAY];

        primoListGenerator(list,list.length);
        showAverage(list,-1);
    }

    public static void primoListGenerator(double list[],int cant){
        int cont=2;
        int pos=0;
        boolean comp=false;

        for(pos=0;pos<cant;pos++){
            do{
                comp=primo(cont);
                if(comp==true){
                    list[pos]=cont;
                }
                cont++;
            }while(comp==false);
        }
    }

    public static boolean primo(int num){
        int cont=0;
        boolean ret=true;

        if(num==1){
            ret=false;
        }
        else{
            if(num==2){
                ret=true;
            }
            else{
                for(cont=2;cont<num;cont++){
                    if(num%cont==0){
                        ret=false;
                    }
                }
            }
        }
        return ret;
    }

    public static void A04(){
        double[] list = new double[SIZE_BIG_ARRAY];
        int cant=0;

        do {
            System.out.print("Ingrese la cantidad de numeros primos a listar. Maximo 100\n> ");
            cant = scan.nextInt();
            if(cant>100 || cant<1){
                System.out.println("Valor no valido");
            }
        }while (cant>100 || cant<1);
        primoListGenerator(list,cant);
        showAverage(list,cant);
    }

    public static void A06(){
        int num=0;
        boolean ver=true;
        boolean breaker=true;

        while(breaker==true) {
            System.out.print("Ingrese un numero. El programa determinara si es primo o no. Ingrese 0 para terminar el programa\n> ");
            num = scan.nextInt();
            if(num!=0) {
                ver = primo(num);
                if (ver = true) {
                    System.out.println("El numero " + num + " es primo");
                } else {
                    System.out.println("El numero " + num + " es compuesto");
                }
            }
            else{
                breaker=false;
            }
        }
    }

    public static void A07(){
        System.out.println("1+2+3+4+5+6+7+8+9+10="+(1+2+3+4+5+6+7+8+9+10));
        //Podria haber hecho 1000 funciones que hagan exactamente lo mismo con muchos calculos y funciones,
        //pero no le encontre mucha logica a hacer algo fijo y simple innecesariamente complejo.
    }

    public static void A08(){
        int positive=0;
        int num=0;
        boolean breaker=true;

        while (breaker==true){
            System.out.println("Ingrese cuantos numeros desee. Presione 0 para terminar\n> ");
            num=scan.nextInt();
            if(num==0){
                breaker=false;
            }
            else{
                if(num>0){
                    positive++;
                }
            }
        }
        System.out.println("Ha ingresado "+positive+" numeros positivos");
    }

    public static void A09(){
        int year=0;
        boolean ver=true;
        year= (int) onlyPositive("Ingrese un año. El programa determinara si es bisiesto o no");
        ver=leapYear(year);
        if(ver==true){
            System.out.println("El año "+year+" es bisiesto.");
        }
        else {
            System.out.println("El año "+year+" no es bisiesto.");
        }

    }

    public static boolean leapYear(int year){
        boolean ret=true;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    ret=true;
                }
                else{
                    ret=false;
                }
            }
            else {
                ret=true;
            }
        }
        else {
            ret=false;
        }
        return ret;
    }

    public static void A10(){
        int val=0;
        char character='Z';

        System.out.print("Presione una tecla y el programa le dara el numero ASCII de esa tecla\n> ");
        character=scan.next().charAt(0);
        val=character;
        System.out.println("Esa tecla es el valor "+val+" en ASCII.");
    }

    public static void A11(){
        int num1=0;
        int num2=0;

        System.out.print("Ingrese el primer producto\n> ");
        num1=scan.nextInt();
        System.out.print("Ingrese el segundo producto\n> ");
        num2=scan.nextInt();
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }

    public static void A12() {
        boolean breaker = true;
        int choice = 0;
        double num1 = 0;
        double num2 = 0;
        double ret = 0;

        do {
            System.out.println("Seleccione una figura");
            System.out.println("1 - Cuadrado");
            System.out.println("2 - Rectangulo");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Circulo");
            System.out.print("> ");
            choice = scan.nextInt();
            if (choice != 1 || choice != 2 || choice != 3 || choice != 4) {
                System.out.println("Opcion no valida");
            }
        } while (choice != 1 || choice != 2 || choice != 3 || choice != 4);
        switch (choice) {
            case 1:
                num1=onlyPositive("Ingrese la medida del lado");
                ret = rectangleTriangeArea(num1, num1, false);
                System.out.println("El cuadrado de lado " + num1 + " tiene un area de " + ret);
                break;
            case 2:
                num1= onlyPositive("Ingrese la altura");
                num2=onlyPositive("Ingrese el ancho");
                ret = rectangleTriangeArea(num1, num2, false);
                System.out.println("El rectangulo de altura " + num1 + " y de ancho " + num2 + " tiene un area de " + ret);
                break;
            case 3:
                num1= onlyPositive("Ingrese la altura");
                num2=onlyPositive("Ingrese el ancho");
                ret = rectangleTriangeArea(num1, num2, true);
                System.out.println("El triangulo de altura " + num1 + " y de ancho " + num2 + " tiene un area de " + ret);
                break;
            case 4:
                num1=onlyPositive("Ingrese el radio");
                ret = circleArea(num1);
                System.out.println("El circulo de radio " + num1 + " tiene un area de " + ret);
                break;
            default:
                System.out.println("Valor no valido");
                break;
        }
    }

    public static double rectangleTriangeArea ( double height, double width, boolean triangle){
        double ret = 0;

        ret = height * width;
        if (triangle == true) {
            ret = ret / 2;
        }
        return ret;
    }

    public static double circleArea ( double rad){
        double ret = 0;

        ret = (Math.PI * (rad * rad));
        return ret;
    }

    public static void A13(){
        String name="Juan";

        System.out.print("Cual es tu nombre?\n> ");
        name=scan.next();
        System.out.println("Buenos dias "+name);
    }

    public static void A14(){
        int num=0;

        System.out.print("Ingrese un numero entero\n> ");
        num=scan.nextInt();

        System.out.println("El numero es "+num);
        System.out.println("El doble de "+ num +" es "+ (num*2));
        System.out.println("El triple de "+ num +" es "+ (num*3));
    }

    public static void A15(){
        double celsius=0;
        double farenheight=0;

        System.out.print("Ingrese una temperatura en Celsius\n> ");
        celsius=scan.nextInt();
        farenheight=celsiusToFarenheight(celsius);
        System.out.println("La temperatura "+celsius+"º Celsius es igual a "+farenheight+"º Farenheight.");
    }

    public static double celsiusToFarenheight(double celsius){
        double ret=0;

        ret=32+(celsius*1.8);
        return ret;
    }

    public static void A16(){
        double radio=0;
        double area=0;
        double length=0;

        radio=onlyPositive("Ingrese el radio del circulo");
        area=circleArea(radio);
        length=circleLength(radio);
        System.out.println("Un circulo de un radio de "+radio+" tiene un area de "+area+" y una longitud de "+length);
    }

    public static double circleLength(double radio){
        double ret=0;

        ret=2*Math.PI*radio;
        return ret;
    }

    public static void A17(){
        double kilo=0;
        double meter=0;

        kilo=onlyPositive("Ingrese velocidad en kilometros por hora");
        meter=kmhToms(kilo);
        System.out.println(kilo+" km/h es igual a "+meter+" m/s.");
    }

    public static double kmhToms(double kilo){
        double ret=0;

        ret=(kilo/1000)/3600;
        return ret;
    }

    public static void A18(){
        double cat1=0;
        double cat2=0;
        double hipo=0;

        cat1=onlyPositive("Ingrese la medida del primer cateto");
        cat2=onlyPositive("Ingrese la medida del segundo cateto");
        hipo=pitagoras(cat1,cat2);
        System.out.println("Un triangulo rectangulo con los catetos de "+cat1+" y "+cat2+" tiene una hipotenusa de "+hipo);
    }

    public static double pitagoras(double cat1,double cat2){
        double ret=0;

        ret=Math.sqrt((cat1*cat1)+(cat2*cat2));
        return ret;
    }

    public static double onlyPositive(String message){
        double ret;

        do {
            System.out.print(message + "\n> ");
            ret=scan.nextInt();
            if(ret<=0){
                System.out.println("Valor no valido");
            }
        }while (ret<=0);
        return ret;
    }

    public static void A19(){
        double[] month=new double[MONTH_SIZE];
        int cont=0;
        double aver=0;
        int min=0;
        int max=0;

        for (cont=0;cont<month.length;cont++){
            month[cont]=onlyPositive("Ingrese la temperatura del dia "+(cont+1));
        }
        aver=listAverage(month,month.length);
        min=locateMin(month,month.length);
        max=locateMax(month,month.length);

        System.out.println("La temperatura minima del mes fue "+month[min]+". La temperatura maxima del mes fue "+month[max]);
    }

    public static int locateMin(double list[],int cant){
        double min=0;
        int minPos=0;
        int cont=0;

        min=list[0];
        for(cont=0;cont<cant;cont++){
            if(list[cont]<min){
                min=list[cont];
                minPos=cont;
            }
        }
        return minPos;
    }

    public static int locateMax(double list[],int cant){
        double max=0;
        int maxPos=0;
        int cont=0;

        max=list[0];
        for(cont=0;cont<cant;cont++){
            if(list[cont]>max){
                max=list[cont];
                maxPos=cont;
            }
        }
        return maxPos;
    }

    public static void A20(){
        int min=0;
        int max=0;
        int cont=0;

        System.out.print("Ingrese un numero menor\n> ");
        min=scan.nextInt();
        System.out.print("Ingrese un numero mayor\n> ");
        max=scan.nextInt();
        for(cont=0;cont<10;cont++){
            System.out.println(randomNumber(min,max));
        }
    }

    public static void A21(){
        String day="";
        int comp=0;

        System.out.print("Ingrese un dia de la semana. Se determinara si es un dia laboral o no\n> ");
        day=scan.next();
        day=day.toLowerCase();
        switch (day){
            case "lunes":
                System.out.println("El Lunes es un dia laboral");
                break;
            case "martes":
                System.out.println("El Martes es un dia laboral");
                break;
            case "miercoles":
                System.out.println("El Miercoles es un dia laboral");
                break;
            case "jueves":
                System.out.println("El Jueves es un dia laboral");
                break;
            case "viernes":
                System.out.println("El Viernes es un dia laboral");
                break;
            case "sabado":
                System.out.println("El Sabado no es un dia laboral");
                break;
            case "domingo":
                System.out.println("El Domingo no es un dia laboral");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }

    public static void A22(){
        int num=0;
        int cant=0;

        num=(int) onlyPositive("Ingrese un valor. Se determinara la cantidad de cifras");
        cant=cipherCount(num);
        System.out.println("La cantidad de cifras de "+num+" es "+cant);
    }

    public static int cipherCount(int num){
        int cont=0;

        num=scan.nextInt();
        while (num!=0){
            num=num/10;
            cont++;
        }
        return cont;
    }

    public static void A23(){
        int num1=0;
        int num2=0;
        double result=0;
        String sign="";

        System.out.println("CalculadoraPol22acaInversaApp");
        System.out.print("Ingrese el primer numero\n> ");
        num1=scan.nextInt();
        do {
            System.out.print("Suma -> +\nResta -> -\nMultiplicacion -> *\nDivision -> /\nPotencia -> ^\nResto de Division -> %\n");
            System.out.print("Ingrese el signo correspondiente\n> ");
            sign = scan.next();
            if((sign.compareTo("+")!=0) && (sign.compareTo("-")!=0) && (sign.compareTo("/")!=0) && (sign.compareTo("*")!=0) && (sign.compareTo("^")!=0) && (sign.compareTo("%")!=0)){
                System.out.println("Valor no valido");
            }
        }while ((sign.compareTo("+")!=0) && (sign.compareTo("-")!=0) && (sign.compareTo("/")!=0) && (sign.compareTo("*")!=0) && (sign.compareTo("^")!=0) && (sign.compareTo("%")!=0));
        System.out.println("CalculadoraPolacaInversaApp");
        System.out.print("Ingrese el segundo numero\n> ");
        num2=scan.nextInt();
        result=calc(num1,num2,sign);
        alert(num1+sign+num2+"="+result,"Resultado");
    }

    public static double calc(int num1,int num2,String sign){
        double ret=0;

        switch (sign){
            case "+":
                ret=num1+num2;
                break;
            case "-":
                ret=num1-num2;
                break;
            case "/":
                ret=num1/num2;
                break;
            case "*":
                ret=num1*num2;
                break;
            case "^":
                ret=num1^num2;
                break;
            case "%":
                ret=num1%num2;
                break;
            default:
                System.out.println("Wait, what I am doing here. This is wrong. I am a bug");
        }
        return ret;
    }

    public static void alert(String msg,String title){
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void A24(){
        String name="";
        int age=0;
        double salary=0;

        System.out.print("Ingrese su nombre\n> ");
        name=scan.next();
        age=(int) onlyPositive("Ingrese su edad");
        salary=onlyPositive("Ingrese su salario");
        if(age>16){
            if(age>19){
                if(age>50){
                    if(age>60){
                        salary=discount(salary,15);
                    }
                    else {
                        salary=discount(salary,10);
                    }
                }
                else {
                    salary=discount(salary,5);
                }
            }
        }
        else {
            salary=0;
        }
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+age);
        System.out.println("Salario: "+salary);
    }

    public static double discount(double num,int percent){
        double ret=0;
        double middle=0;
        middle=num*((100)/percent);
        ret=num+middle;
        return ret;
    }
}