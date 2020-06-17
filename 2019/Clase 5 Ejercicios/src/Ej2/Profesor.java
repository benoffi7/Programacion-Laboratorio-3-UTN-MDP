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
public abstract class Profesor extends Persona {
    private int numeroLicencia;
    public Profesor(int dni, String nombre, int licencia) {
        super(dni, nombre);
        numeroLicencia = licencia;
    }

    private int getNumeroLicencia(){
        return numeroLicencia;
    }

    @Override
    public String toString() {
        return super.toString()+ "Licencia: " + getNumeroLicencia() +"\n";
    }
    
    
    public abstract float importeNomina();
}
