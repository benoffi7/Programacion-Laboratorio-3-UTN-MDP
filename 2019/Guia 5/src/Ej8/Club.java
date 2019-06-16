/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Fede
 */
public class Club {
    private Set<Socio> miembros;
    
    public Club(){
        miembros = new HashSet();
    }
    
    public void agregarSocio(Socio s){
        miembros.add(s);
    }
    
    public Socio buscarSocio(String idBuscado){
        Iterator i = miembros.iterator();
        boolean bandera = false;
        Socio s= null;
        
        while(i.hasNext() && bandera ==false){
            s = (Socio) i.next();
            if( s.getId().equals(idBuscado)){
               bandera =true; 
            }
        }
        return s;
    }
    
    public String listarSocios(){
        StringBuilder informacion = new StringBuilder();
        Iterator i = miembros.iterator();

        while (i.hasNext()) {  
            Socio s = (Socio) i.next();
            informacion.append(s.toString());
            informacion.append("\n");
            informacion.append(s.estadoDeuda());
            informacion.append("\n");
        }
        return informacion.toString();
    }    
}
