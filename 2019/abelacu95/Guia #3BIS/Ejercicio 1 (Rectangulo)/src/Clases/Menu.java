package Clases;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        System.out.println("Ingrese Ancho: ");
        float ancho = scan.nextFloat();

        System.out.println("Ingrese Altura: ");
        float altura = scan.nextFloat();

        Rectangulo rectangulo1 = new Rectangulo(ancho, altura);

        //b. Imprimir por pantalla el alto y ancho.
        System.out.println(rectangulo1.mostrarAnchoyAltura());

        //c. Imprimir por pantalla el área y perímetro.
        System.out.println(rectangulo1.mostrarAreayPerimetro());

        //d. Modificar el alto y el ancho de la instancia.
        rectangulo1.modificarAltura(2.5f);
        rectangulo1.modificarAncho(5);

        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println(rectangulo1.mostrarAreayPerimetro());

        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        Rectangulo rectangulo2 = new Rectangulo(2,1);

        System.out.println(rectangulo2.mostrarAnchoyAltura());
        System.out.println(rectangulo2.mostrarAreayPerimetro());

    }
}
