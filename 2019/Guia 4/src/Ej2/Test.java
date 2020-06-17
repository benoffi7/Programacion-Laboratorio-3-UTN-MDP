/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
//Faltan cargar el objeto vacio
public class Test {

    private static Scanner teclado;

    public static boolean cargarInformacion(Empleado e) {
        boolean rta = false;
        if (e.verificarEmpleado()) {
            rta = true;
            System.out.println("Ingrese DNI");
            String dni = teclado.next();
            System.out.println("Ingrese Nombre");
            String nombre = teclado.next();
            System.out.println("Ingrese Apellido");
            String apellido = teclado.next();

            System.out.println("Ingrese año");
            int anio = teclado.nextInt();

            if (e instanceof EAsalariado) {
                System.out.println("Ingrese el salario base");
                float salarioBase = teclado.nextFloat();
                ((EAsalariado) e).cargarDatos(dni, nombre, apellido, anio, salarioBase);
            } else {
                if (e instanceof EComision) {
                    System.out.println("Ingrese cantidad de clientes");
                    int cantClientes = teclado.nextInt();
                    System.out.println("Ingrese el monto de cobro de los clientes");
                    float montoDeCobro = teclado.nextFloat();
                    ((EComision) e).cargarDatos(dni, nombre, apellido, anio, cantClientes, montoDeCobro);
                }
            }

        }
        return rta;
    }

    public static boolean cargarInformacion(Empleado e, String dni, String nombre, String apellido, int anio, int cant, float monto) {
        boolean rta = false;
        if (e.verificarEmpleado()) {
            ((EComision) e).cargarDatos(dni, nombre, apellido, anio, cant, monto);
            rta = true;
        }
        return rta;
    }

    public static boolean cargarInformacion(Empleado e, String dni, String nombre, String apellido, int anio, float salarioBase) {
        boolean rta = false;

        if (e.verificarEmpleado()) {
            ((EAsalariado) e).cargarDatos(dni, nombre, apellido, anio, salarioBase);
            rta = true;
        }
        return rta;
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        Empleado e1 = new EAsalariado("569587A", "Javier", "Gomez", 2008, 1225.0f);
        Empleado e2 = new EComision("695235B", "Eva", "Nieto", 2010, 179, 8.10f);

        Empleado e3 = new EComision();
        Empleado e4 = new EAsalariado();

        if (cargarInformacion(e3, "741258C", "José", "Ruiz", 2012, 81, 7.90f)) {
            System.out.println("Se cargo correctamente el empleado");
        } else {
            System.out.println("Empleado ya creado");
        }

        if (cargarInformacion(e4, "896325D", "María", "Núñez", 2013, 1155.00f)) {
            System.out.println("Se cargo correctamente el empleado");
        } else {
            System.out.println("Empleado ya creado");
        }

        Gestor empresa = new Gestor();
        empresa.agregar(e1);
        empresa.agregar(e2);
        empresa.agregar(e3);
        empresa.agregar(e4);

        System.out.println("");
        System.out.println("El empleado con mayor el mayor salario es");
        System.out.println(empresa.sueldoMayor());
        System.out.println("");
        
        System.out.println(empresa.mostrarTodos());

        teclado.close();
    }
}
