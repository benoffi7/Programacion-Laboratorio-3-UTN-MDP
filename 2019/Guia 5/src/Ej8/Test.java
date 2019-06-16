/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class Test {

    private static Scanner teclado;

    public static String menuTexto() {
        return "1- Ingresar socio nuevo"
                + "\n2-Ingresar socio vitalicio"
                + "\n3-Ingresar socio ausente"
                + "\n4-Pagar cuota del socio especificado"
                + "\n5-Estado de la cuota del socio especificado"
                + "\n6-Lista el estado de todos los socios";
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Club c = new Club();
        int opcion = -1;
        Socio temp = null;
        String nombre = null;
        String id = null;
        float cuota = 0f;

        while (opcion != 0) {
            System.out.println(menuTexto());

            System.out.println("\nIngrese un numero");            
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del socio");
                    nombre = teclado.next();

                    System.out.println("Ingrese el id del socio");
                    id = teclado.next();

                    System.out.println("Ingrese el monto de la cuota");
                    cuota = teclado.nextFloat();

                    c.agregarSocio(new Normal(nombre, id, cuota));

                    break;
                case 2:
                    System.out.println("Ingrese el nombre del socio");
                    nombre = teclado.next();

                    System.out.println("Ingrese el id del socio");
                    id = teclado.next();

                    c.agregarSocio(new Vitalicio(nombre, id));
                    break;
                    
                case 3:
                    System.out.println("Ingrese el nombre del socio");
                    nombre = teclado.next();

                    System.out.println("Ingrese el id del socio");
                    id = teclado.next();

                    System.out.println("Ingrese el monto de la cuota");
                    cuota = teclado.nextFloat();

                    c.agregarSocio(new Ausente(nombre, id, cuota));
                    break;

                case 4:
                    System.out.println("Ingrese el id del socio a pagar");
                    id = teclado.next();
                    temp = c.buscarSocio(id);
                    temp.pagar();
                    break;
                case 5:
                    System.out.println("Ingrese el id del socio a buscar");
                    id = teclado.next();
                    temp = c.buscarSocio(id);
                    System.out.println(temp.estadoDeuda());
                    break;
                case 6:
                    System.out.println(c.listarSocios());
                    break;
                
                case 0:
                    System.out.println("Saliendo, presione un boton y enter");
                    teclado.next();
                    break;
            }            
        }
        teclado.close();
    }
}
