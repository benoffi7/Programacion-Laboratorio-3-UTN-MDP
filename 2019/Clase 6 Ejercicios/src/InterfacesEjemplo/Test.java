/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesEjemplo;

import java.util.ArrayList;

/**
 *
 * @author Fede
 */
public class Test {
    public static void main (String [] args){
        ArrayList<IEdificio> edificaciones = new ArrayList<>();
        
        EdificionOficinas e1 = new EdificionOficinas(100,150);
        EdificionOficinas e2 = new EdificionOficinas(200,400);
        
        Polideportivo e3 = new Polideportivo(2, 300, "El Tehuelche") ;
        Polideportivo e4 = new Polideportivo(1, 700, "Kimberley") ;
        Polideportivo e5 = new Polideportivo(3, 150, "Racing") ;
        
        edificaciones.add(e1);
        edificaciones.add(e2);
        edificaciones.add(e3);
        edificaciones.add(e4);
        edificaciones.add(e5);
        
        for(IEdificio e: edificaciones){
            System.out.println(e.toString());
        }
    }
}
