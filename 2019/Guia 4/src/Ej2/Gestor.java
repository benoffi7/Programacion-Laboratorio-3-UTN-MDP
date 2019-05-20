/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fede
 */
public class Gestor {
/*
    metodo cargarInformacion recibe la info las clases hijas de empleado le extienden la funcionalidad
    */
    private ArrayList<Empleado> empleados;

    public Gestor() {
        empleados = new ArrayList<>();
    }

    public void agregar(Empleado e) {
        empleados.add(e);
    }

    public String sueldoMayor() {
        Empleado e = (Empleado) Collections.max(empleados);
        return e.imprimir();
    }

    public String mostrarTodos() {
        StringBuilder informacion = new StringBuilder();
        for (Empleado e : empleados) {
            informacion.append(e.toString());
        }
        return informacion.toString();
    }
}
