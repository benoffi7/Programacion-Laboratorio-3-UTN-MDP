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
public class VideoJuego extends Multimedia {

    int cantHoras;
    String compania;

    public VideoJuego() {
        super();
        setCantHoras(0);
        setCompania("");
    }

    public VideoJuego(int nuevaCantHoras,String nuevaCompania){
        super();
        setCantHoras(nuevaCantHoras);
        setCompania(nuevaCompania);
    }
    
    public VideoJuego(int nuevaCantHoras, String nuevaCompania, String nuevoTitulo, String nuevoGenero) {
        super(nuevoTitulo, nuevoGenero);
        setCantHoras(nuevaCantHoras);
        setCompania(nuevaCompania);
    }
    
    private void setCantHoras(int nuevaCant) {
        cantHoras = nuevaCant;
    }

    private void setCompania(String nuevaCompania) {
        compania = nuevaCompania;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public String getCompania() {
        return compania;
    }

    @Override
    public int compareTo(Object o) {
        int rta = 0;
        if (o instanceof VideoJuego) {
            VideoJuego v = (VideoJuego) o;
            if (getCantHoras() < v.getCantHoras()) {
                rta = -1;
            } else {
                if (getCantHoras() == v.getCantHoras()) {
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
        return super.toString()+ "\ncantHoras=" + cantHoras + ", compania=" + compania ;
    }
    
}
