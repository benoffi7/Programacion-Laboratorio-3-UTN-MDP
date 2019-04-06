/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

public class Boleto {
    private Double precio;
    private String nombre;
    
    public Boleto(Double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public Double getPrecio(){
        return precio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPrecio(Double precio){
        this.precio = precio;
    }
}
