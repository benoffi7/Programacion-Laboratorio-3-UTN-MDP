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
public class Vitalicio extends Socio{
    
    public Vitalicio(String nombre, String id) {
        super(nombre, id, 0);
        setDebeCuota(false);
    }         

    
    
    @Override
    public String estadoDeuda() {
        return "No tiene que pagar cuotas";
    }
    
    @Override
    public void pagar() {        
    }
}
