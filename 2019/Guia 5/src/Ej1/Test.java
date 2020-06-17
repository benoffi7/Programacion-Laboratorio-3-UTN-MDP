/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author Fede
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio c = new Colegio();
        
        c.addAlumno("Argentina");
        c.addAlumno("Argentina");
        c.addAlumno("Argentina");
        c.addAlumno("Argentina");
        c.addAlumno("Chile");
        c.addAlumno("Chile");
        
        //Muestro cuantas nacionalidades hay cargadas
        System.out.println("Hay "+c.cuantos()+" nacionalidades de alumnos\n");
        
        //Muestro la composicion del colegio
        System.out.println(c.showAll());
        
        
        if(c.borrar("Argentina")){
            System.out.println("Se borro correctamente");
        }else{
            System.out.println("No se pudo borrar correctamente");
        }
        //Muestro la composicion del colegio despues de borrar una
        System.out.println(c.showAll());
    }
    
}
