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
public class Senador extends Legislador{

    public Senador(int dni, String nombre,String provincia) {
        super(dni, nombre,provincia);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Trabajo en la camara de senadores de la provincia de "+ provinciaQueRepresenta+"\n";
    }
    
}
