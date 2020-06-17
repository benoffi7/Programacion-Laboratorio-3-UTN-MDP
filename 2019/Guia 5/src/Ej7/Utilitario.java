/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

/**
 *
 * @author usuario
 */
public class Utilitario extends Vehiculo{
    private float carga;

    public Utilitario(String patente, String marca, String modelo, int year, float precio,float nuevaCarga) {
        super(patente, marca, modelo, year, precio);
        setCarga(nuevaCarga);
    }

    public void setCarga(float nuevaCarga) {
        carga = nuevaCarga;
    }

    public float getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga: " + getCarga() + "kg";
    }
    
    
}
