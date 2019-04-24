package Clases;

public class Menu {

    public static void main(String[] args){


        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        Empleado empleado1 = new Empleado("23.456.345", "Carlos","Gutiérrez",25000 );

        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Empleado empleado2 = new Empleado("34234123","Ana","Sánchez",27500);

        //c. Imprima ambos objetos por pantalla.
        System.out.println( empleado1.getDescripcion());
        System.out.println(empleado2.getDescripcion());

        /*d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        salario anual del mismo. */

        empleado1.aumentarSalario(15);
        empleado1.salarioAnual();
        System.out.println(empleado1.getDescripcion());
        System.out.println(empleado1.mostrarSalarioAnual());

    }

}
