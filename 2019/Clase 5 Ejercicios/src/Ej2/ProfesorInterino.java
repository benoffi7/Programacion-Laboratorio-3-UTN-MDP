/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Fede
 */
public class ProfesorInterino extends Profesor {

    private int cantMateriasAyudante;

    public ProfesorInterino(int dni, String nombre, int licencia, int cantMaterias) {
        super(dni, nombre, licencia);
        setCantMateriasAyudante(cantMaterias);
    }

    public int getCantMateriasAyudante() {
        return cantMateriasAyudante;
    }

    public void setCantMateriasAyudante(int cantMaterias) {
        cantMateriasAyudante = cantMaterias;
    }

    @Override
    public String toString() {
        return super.toString() + "Cantidad de materias ayudante=" + getCantMateriasAyudante()
                + "\n Renumeracion: $" + importeNomina()+"\n";
    }

    @Override
    public float importeNomina() {
        return (float) cantMateriasAyudante * 50f;
    }

}
