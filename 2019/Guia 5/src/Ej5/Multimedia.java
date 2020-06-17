/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

/**
 *
 * @author Fede
 */
public abstract class Multimedia implements Comparable{
    private String titulo;
    private String genero;
    private boolean entregado;
    
    public Multimedia(){
        this("","");        
    }
    
    public Multimedia(String nuevoTitulo,String nuevoGenero){
        super();
        setTitulo(nuevoTitulo);
        setGenero(nuevoGenero);
        entregado = false;
    }
    
    private void setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
    }
    
    private void setGenero(String nuevoGenero){
        genero = nuevoGenero;
    }        

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }
    
    public void entregar(){
        entregado = true;
    }
    public void devolver(){
        entregado = false;
    }
    
    public boolean isEntregado(){
        return entregado;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", genero=" + genero + ", entregado=" + entregado + '}';
    }
    
}
