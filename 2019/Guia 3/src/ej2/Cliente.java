/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Fede
 */
public class Cliente {
    private int id;
    private String nombre;
    private char genero;

    public Cliente(int id,String nombre, char genero) {
        this.id = id;
        setNombre(nombre);
        setGenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private char getGenero() {
        return genero;
    }

    private void setGenero(char genero) {
        this.genero = genero;
    }
    
    public int getId(){
        return id;
    }
    
    
    @Override
    public String toString(){
        return "Dueño: "+ getNombre()+"\nNº de Identificacion: "+ getId();
    }
}
