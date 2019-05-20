/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author Fede
 */
public class ListinProfesores {
    ArrayList<Profesor> profesores;
    
    public ListinProfesores(){
        profesores = new ArrayList<>();
    }
    
    public void agregar(Profesor p){
        profesores.add(p);
    }
    
    public float importeTotalNominaProfesorado(){
        float salariosAPagar = 0f;
        for(Profesor p: profesores){
            salariosAPagar += p.importeNomina();
        }
        return salariosAPagar;
    }
            
    public String imprimirListin(){
        StringBuilder informacion = new StringBuilder();
        for(Profesor p: profesores){
            informacion.append(p.toString()+"\n");
        }
        return informacion.toString();
    }
}
