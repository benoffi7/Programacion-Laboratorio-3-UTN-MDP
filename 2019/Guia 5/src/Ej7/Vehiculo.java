/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author usuario
 */
public abstract class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private int anio;
    private float kilometraje;
    private float precioAlquilerDiario;
    private String estado;//disponible, en verificación técnica, en reparación, y alquilado.
    private List<String> historial;

    //"Disponible","Alquilado","Verificacion Tecnica","En Reparacion"
    public static final HashMap<String, String> ESTADOS = new HashMap<>();

    public Vehiculo(String patente, String marca, String modelo, int year, float precio) throws VariableErroneasException {
        if (verificarVariables(patente, marca, modelo, year, precio)){
            throw new VariableErroneasException("Valores invalidas");
        }
        if (ESTADOS.isEmpty()) {
            ESTADOS.put("Disponible", "Disponible");
            ESTADOS.put("Alquilado", "Alquilado");
            ESTADOS.put("Reparandose", "En reparacion");
            ESTADOS.put("Verificandose", "En verificacion tecnica");
        }
        historial = new ArrayList();
        setPatente(patente);
        setMarca(marca);
        setModelo(modelo);
        setAnio(year);
        setEstado(ESTADOS.get("Disponible"));
        setPrecioAlquilerDiario(precio);
    }

    private void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setPrecioAlquilerDiario(float precioAlquilerDiario) {
        this.precioAlquilerDiario = precioAlquilerDiario;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public float getPrecioAlquilerDiario() {
        return precioAlquilerDiario;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() + " " + getAnio()
                + "\nPatente: " + getPatente() + "\nEstado: " + getEstado()
                + "\nPrecio de alquiler por dia: $" + getPrecioAlquilerDiario();
    }

    private boolean verificarVariables(String patente, String marca, String modelo, int year, float precio){
        if ((patente == null || patente.equals("") ) 
                || (marca == null || marca.equals("") ) 
                || (modelo == null || modelo.equals("") ) 
                || (year == 0) || (precio ==0f)){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Agrega una entrada nueva al historial de alquilado
     * @param fecha
     * @param cliente 
     */
    public void registrarAlquilado(String fecha, String cliente) {
        historial.add("El cliente " + cliente + " ha retirado el vehiculo en la fecha " + fecha);
    }

    /**
     * 
     * @return El registro de cada persona que alquilo el vehiculo
     */
    public String retornarRegistroAlquilado() {
        StringBuilder registro = new StringBuilder();
        for (String s : historial) {
            registro.append(s);
            registro.append("\n");
        }
        return registro.toString();
    }
}
