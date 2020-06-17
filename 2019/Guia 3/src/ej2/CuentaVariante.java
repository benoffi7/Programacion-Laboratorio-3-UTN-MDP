/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Fede
 */
public class CuentaVariante extends Cuenta{
    private final float MAXIMO_BALANCE_NEGATIVO = 2000f;

    public CuentaVariante(int id, float nuevoSaldo, Cliente c) {
        super(id, nuevoSaldo, c);
    }
    
    public boolean extraer(float c){
         boolean rta = true;
        if (getBalanace() - c < MAXIMO_BALANCE_NEGATIVO) {
            rta = false;
        } else {
            super.setBalanace(getBalanace() - c);
            
        }
        return rta;
    }
}
