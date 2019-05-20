/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Fede
 */
public class Test {
    public static void main (String [] args){
        ListinProfesores lista = new ListinProfesores();
        
        Profesor p1 = new ProfesorTitular(11111, "Pepe Perez", 12345, 20);
        Profesor p2 = new ProfesorInterino(333, "Ayudante JR",123, 4);
        
        Profesor p3 = new ProfesorTitular(2222, "Rodrigo Rodriguez", 54321, 45);
        Profesor p4 = new ProfesorInterino(14795, "Ayudante JR 2",123, 7);
        
        lista.agregar(p1);
        lista.agregar(p2);
        lista.agregar(p3);
        lista.agregar(p4);
        
        System.out.println("La suma de los salarios es $"+ lista.importeTotalNominaProfesorado());
        
        System.out.println("Lista de profesores");
        System.out.println(lista.imprimirListin());
                
    }
}