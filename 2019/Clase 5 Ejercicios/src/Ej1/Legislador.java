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
public abstract class Legislador extends Persona{
    protected String provinciaQueRepresenta;

    public Legislador(int dni, String nombre, String provincia) {
        super(dni,nombre);
        setProvinciaQueRepresenta(provincia);
    }
    
    private void setProvinciaQueRepresenta(String provincia){
        provinciaQueRepresenta = provincia;
    }
    
    public abstract String getCamaraEnQueTrabaja();
} 
