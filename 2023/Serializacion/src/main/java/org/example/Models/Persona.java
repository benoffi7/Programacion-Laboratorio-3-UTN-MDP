package org.example.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<String> mascotas = new ArrayList<String>();

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {}

    //region Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<String> getMascotas() {
        return mascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    //endregion

    @Override
    public String toString() {
        return "Models.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", personas=" + mascotas +
                '}';
    }
}
