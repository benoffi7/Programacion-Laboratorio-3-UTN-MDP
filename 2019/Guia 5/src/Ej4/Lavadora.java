/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Fede
 */
public class Lavadora extends Electrodomestico {

    private float carga;
    private final float CARGA_DEFAULT = 5f;

    public Lavadora() {
        super();
        setCarga(CARGA_DEFAULT);
    }

    public Lavadora(float precio, float peso) {
        super(precio, peso);
        setCarga(CARGA_DEFAULT);
    }

    public Lavadora(float carga, float nuevoPrecio, float nuevoPeso, String nuevoColor, char consumoElec) {
        super(nuevoPrecio, nuevoPeso, nuevoColor, consumoElec);
        setCarga(carga);
    }

    private void setCarga(float nuevaCarga) {
        carga = nuevaCarga;
    }

    public float getCarga() {
        return carga;
    }
    
    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if (getCarga() >= 30f) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
