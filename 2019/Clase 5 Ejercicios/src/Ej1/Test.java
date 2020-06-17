/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.ArrayList;

/**
 * Declara una clase abstracta Legislador que herede de la clase Persona, con un
 * atributo provinciaQueRepresenta (tipo String) y otros atributos. Declara un
 * método abstracto getCamaraEnQueTrabaja. Crea dos clases concretas que hereden
 * de Legislador: la clase Diputado y la clase Senador que sobreescriban los
 * métodos abstractos necesarios. Crea una lista de legisladores y muestra por
 * pantalla la cámara en que trabajan haciendo uso del polimorfismo.
 *
 * @author Fede
 */

/*

*/
public class Test {
    public static void main (String []args){
        ArrayList<Legislador> legisladores = new ArrayList<>();
        
        legisladores.add(new Diputado(112233, "Guido Kaska", "Tucuman"));
        legisladores.add(new Senador (1111,"Pepe Perez","Cordoba"));
        legisladores.add(new Diputado(77778, "Guido Pasa Frio", "Tierra del Fuego"));
        
        for(Legislador l: legisladores){
            System.out.println(l.toString());
            System.out.println(l.getCamaraEnQueTrabaja());
        }
        
    }
}
