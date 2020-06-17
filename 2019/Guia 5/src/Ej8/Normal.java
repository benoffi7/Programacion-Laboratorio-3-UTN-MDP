/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

/**
 *
 * @author Fede
 */
public class Normal extends Socio{

    public Normal(String nombre, String id, float monto) {
        super(nombre, id, monto);
        setDebeCuota(true);
    }

    @Override
    public void pagar() {
        setDebeCuota(false);
    }
    
}
