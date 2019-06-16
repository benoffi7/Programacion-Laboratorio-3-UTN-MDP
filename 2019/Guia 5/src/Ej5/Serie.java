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
public class Serie extends Multimedia {

    int numTemporadas;
    String creador;

    public Serie() {
        super();
        setNumTemporadas(0);
        setCreador("");
    }

    public Serie(int nuevaCantTemporadas, String nuevoCreador){
        super();
        setNumTemporadas(nuevaCantTemporadas);
        setCreador(nuevoCreador);
    }
    
    public Serie(int nuevaCantTemporadas, String nuevoCreador, String nuevoTitulo, String nuevoGenero) {
        super(nuevoTitulo, nuevoGenero);
        setNumTemporadas(nuevaCantTemporadas);
        setCreador(nuevoCreador);
    }
    
    private void setNumTemporadas(int cant){
        numTemporadas = cant;
    }
    
    private void setCreador(String nuevoCreador){
        creador = nuevoCreador;
    }
    
    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    @Override
    public int compareTo(Object o) {
        int rta = 0;
        if (o instanceof Serie) {
            Serie s = (Serie) o;
            if (getNumTemporadas() < s.getNumTemporadas()) {
                rta = -1;
            } else {
                if (getNumTemporadas() == s.getNumTemporadas()) {
                    rta = 0;
                } else {
                    rta = 1;
                }
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nnumTemporadas=" + numTemporadas + ", creador=" + creador;
    }
    
    
}
