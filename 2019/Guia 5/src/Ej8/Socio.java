/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import java.util.Objects;

/**
 *
 * @author Fede
 */
public abstract class Socio {

    private String nombre;
    private String id;
    private float montoCuota;
    private boolean debeCuota;

    public Socio(String nombre, String id, float monto) {
        super();
        this.nombre = nombre;
        this.id = id;
        this.montoCuota = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String estadoDeuda() {
        String msg = "";
        if (debeCuota) {
            msg = "Debe pagar la cuota ";
        } else {
            msg = "Ya pago la cuota";
        }
        return msg;
    }

    protected void setDebeCuota(boolean b) {
        debeCuota = b;
    }

    public abstract void pagar();   

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj != null && obj instanceof Socio){
            Socio s = (Socio) obj;
            if(getId().equals(s.getId())){
                rta =true;
            }
        }
        
        return rta;
    }

    @Override
    public String toString() {
        return  "\nnombre=" + nombre + ", id=" + id + ", montoCuota=" + montoCuota;
    }
    
    
}
