/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

/**
 *
 * @author Fede
 */
public class ClienteMinorista extends Cliente {

    public ClienteMinorista(String nombre, String domicilio, String CUIT, float descuento) {
        super(nombre, domicilio, CUIT);
        setDescuento(descuento);
    }

    @Override
    protected void setDescuento(float nuevoDescuento) {
        descuento = nuevoDescuento;
    }
    
}
