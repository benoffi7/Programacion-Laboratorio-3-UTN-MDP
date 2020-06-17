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
public class Renglon {
    private int cantidad;
    private String item;
    private float precioUnitario;
    private float precioTotal;
    
    
    public Renglon(int nuevaCant, String nuevoItem, float nuevoPU) {
        super();
        setCantidad(nuevaCant);
        setItem(nuevoItem);
        setPrecioUnitario(nuevoPU);
        calcularPrecioTotal();
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    private void setItem(String item) {
        this.item = item;
    }

    private void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    private int getCantidad(){
        return cantidad;
    }

    public String getItem() {
        return item;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }
    
    private float getPrecioUnitario(){
        return precioUnitario;
    }
    
    private void calcularPrecioTotal(){
        precioTotal= getCantidad() * getPrecioUnitario();
    }        
    
    public String generarLinea(){
        StringBuilder msg = new StringBuilder();
        msg.append(getCantidad() + "\t"+ getItem() + "\t"+ getPrecioUnitario() + "\t\t" + getPrecioTotal());
        return msg.toString();
    }
}
