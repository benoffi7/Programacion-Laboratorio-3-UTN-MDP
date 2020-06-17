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
public class Cuenta {

    private int id;
    private float balanace;
    private Cliente propietario;
    private Registro depositos;    
    private Registro extracciones;
    
    public Cuenta(int id, Cliente c) {
        this.id = id;
        setBalanace(0);
        propietario = c;
        depositos = new Registro();
        extracciones = new Registro();
    }

    public Cuenta(int id, float nuevoSaldo, Cliente c) {
        this.id = id;
        setBalanace(nuevoSaldo);
        propietario = c;
        depositos = new Registro();
        extracciones = new Registro();
    }

    /**
     *
     * @param c monto a ingresar en la cuenta
     */
    public void ingresar(float c) {
        setBalanace(getBalanace() + c);
        depositos.registrarMovimiento(propietario, c);
    }

    /**
     *
     * @param c monto a extraer de la cuenta
     */
    public boolean extraer(float c) {
        boolean rta = true;
        if (getBalanace() - c < 0) {
            rta = false;
        } else {
            setBalanace(getBalanace() - c);
            //Convierto al monto en un numero negativo asi se registra correctamente el movimiento
            c = -c;
            extracciones.registrarMovimiento(propietario, c);
        }
        return rta;
    }
    

    public float getBalanace() {
        return balanace;
    }

    protected void setBalanace(float nuevoSaldo) {
        balanace = nuevoSaldo;
    }

}
