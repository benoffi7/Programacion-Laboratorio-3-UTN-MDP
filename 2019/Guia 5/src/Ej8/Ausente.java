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
public class Ausente extends Socio {
    private boolean yaPago;

    public Ausente(String nombre, String id, float monto) {
        super(nombre,id,monto);
        setDebeCuota(true);
        setYaPago(false);
    }
    
    private void setYaPago(boolean b){
        yaPago = b;
    }
    
    @Override
    public void pagar(){
        if(yaPago){
            setDebeCuota(false);
        }
        else{
            setDebeCuota(false);
            setYaPago(true);
        }
    }
    
}
