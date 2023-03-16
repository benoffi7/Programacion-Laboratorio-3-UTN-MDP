import java.sql.Date;
import java.util.Scanner;

public class Main
{
    /*
        aca estoy declarando una variable. la variable del tipo objeto/clase empieza en NULL
        los NULOS SON MALOS! porque? porque viene el NPE
     */
    static Scanner teclado;

    public static void main(String[] args)
    {
        //la palabra 'new' crea efectivamente el espacio de memoria y lo aloja en teclado
        teclado = new Scanner(System.in);

        String palabra = "";

        System.out.println("ingresa tu nombre");

        palabra = teclado.nextLine();

        System.out.println("tu nombre es "+palabra);

        System.out.println("ingresa tu nombre");

        palabra = teclado.nextLine();

        System.out.println("tu nombre es "+palabra);

        System.out.println("ingresa un numero");

        int numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("ingresa tu nombre");

        palabra = teclado.nextLine();

        System.out.println("tu nombre es "+palabra);


        System.out.println("ingresa tu sueldo");

        float numeroConDecimales = teclado.nextFloat();

        System.out.println("tu sueldo es "+numeroConDecimales);

        System.out.println("Ingrese 's' si desea seguir");

        teclado.nextLine();

        String aux = teclado.nextLine();

        /*
        while (aux.equals("si"))
        {

        }*/
        //esto extrae el primer caracter de un string
        char mander = aux.charAt(10000);

        if (mander == 's')
        {

        }



        //sumaEnteros();

        teclado.close();
    }
    public static void sumaEnteros()
    {
        System.out.println("Ingrese el primer numero");

        int numero1 = teclado.nextInt();

        System.out.println("Ingrese el francia numero");

        int numero2 = teclado.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("El resultado es "+resultado);
    }
}