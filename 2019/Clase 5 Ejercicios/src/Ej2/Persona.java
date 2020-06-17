/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Fede
 */
public class Persona {

    private int dni;
    private String nombre;

    public Persona(int dni, String nombre) {
        setDni(dni);
        setNombre(nombre);
    }

    private void setDni(int nuevoDni) {
        dni = nuevoDni;
    }

    private void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\nDni:  " + dni + "\n";
    }
}
