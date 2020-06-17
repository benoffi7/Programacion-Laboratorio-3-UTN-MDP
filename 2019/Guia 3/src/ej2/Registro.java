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
public class Registro {

    private String[] movimientos;
    private int indiceUltimoMovimiento;

    public Registro() {
        movimientos = new String[10];
        indiceUltimoMovimiento = 0;
    }

    public void registrarMovimiento(Cliente c, float monto) {
        if (indiceUltimoMovimiento < 10) {
            movimientos[indiceUltimoMovimiento] = "El " + c.getNombre() + ", ";
            if (monto > 0) {
                movimientos[indiceUltimoMovimiento] += " deposito $" + monto;
            } else {
                movimientos[indiceUltimoMovimiento] += " retiro $" + monto;
            }

            indiceUltimoMovimiento++;
        }

        if (indiceUltimoMovimiento == 10) {
            indiceUltimoMovimiento = 0;
        }
    }
}
