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
public class Television extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    private final int RESOLUCION_DEFAULT = 20;
    private final boolean TDT_DEFAULT = false;

    public Television() {
        super();
        setResolucion(RESOLUCION_DEFAULT);
        setTDT(TDT_DEFAULT);
    }

    public Television(float precio, float peso) {
        super(precio, peso);
        setResolucion(RESOLUCION_DEFAULT);
        setTDT(TDT_DEFAULT);
    }

    public Television(int nuevaResolucion, boolean nuevoTDT, float nuevoPrecio, float nuevoPeso, String nuevoColor, char consumoElec) {
        super(nuevoPrecio, nuevoPeso, nuevoColor, consumoElec);
        setResolucion(nuevaResolucion);
        setTDT(nuevoTDT);
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean getTDT() {
        return TDT;
    }

    private void setResolucion(int nuevaResolucion) {
        resolucion = nuevaResolucion;
    }

    private void setTDT(boolean valor) {
        TDT = valor;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if (getResolucion() >= 40) {
            precioFinal *= 1.30;
        }
        if (getTDT()) {
            precioFinal += 50f;
        }
        return precioFinal;
    }

}
