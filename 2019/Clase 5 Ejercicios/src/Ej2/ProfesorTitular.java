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
public class ProfesorTitular extends Profesor {

    private int cantHoras;

    public ProfesorTitular(int dni, String nombre, int licencia, int horas) {
        super(dni, nombre, licencia);
        setCantHoras(horas);
    }

    private int getCantHoras() {
        return cantHoras;
    }

    private void setCantHoras(int horas) {
        cantHoras = horas;
    }

    @Override
    public String toString() {
        return super.toString() + "Cantidad de horas trabajadas"
                + getCantHoras() + "\n" + "Salario: $" + importeNomina() + "\n";
    }

    @Override
    public float importeNomina() {
        return (float) cantHoras * 300f;
    }

}
