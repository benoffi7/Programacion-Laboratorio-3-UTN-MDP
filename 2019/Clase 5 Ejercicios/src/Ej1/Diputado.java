/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author Fede
 */
public class Diputado extends Legislador{

    public Diputado(int dni, String nombre,String provincia) {
        super(dni, nombre,provincia);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Trabajo en la camara de diputados de la provincia de "+ provinciaQueRepresenta+"\n";
    }
    
}
