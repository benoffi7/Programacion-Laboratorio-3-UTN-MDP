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
public abstract class Cliente {

    private String nombre;
    private String domicilio;
    private String CUIT;
    protected float descuento;

    public Cliente(String nombre, String domicilio, String CUIT) {
        super();
        setNombre(nombre);
        setDomicilio(domicilio);
        setCUIT(CUIT);        
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCUIT() {
        return CUIT;
    }

    public float getDescuento() {
        return descuento;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    private void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    protected abstract void setDescuento(float descuento);

    @Override
    public String toString() {
        return "Cliente: " + getNombre()+ "\nDomicilio: " + getDomicilio() + "\nCUIT: " + getCUIT() + "\nDescuento:" + getDescuento()*100+"%";
    }
    
    
}
