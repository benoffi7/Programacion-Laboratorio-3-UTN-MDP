/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Agencia {

    private Hashtable<String, Vehiculo> vehiculos;

    public Agencia() {
        vehiculos = new Hashtable<>();
    }

    /**
     * Doy de alta un vehiculos
     *
     * @param v Vehiculo a dar de alta
     */
    public void agregarVehiculo(String patente, Vehiculo v) {
        vehiculos.put(patente, v);
    }

    /**
     * Retorna el vehiculo asociado a esa patente
     *
     * @param patente
     * @return un vehiculo
     */
    public Vehiculo buscarVehiculo(String patente) {
        return vehiculos.get(patente);
    }

    public void alquilarVehiculo(String patente, String fecha, String cliente) {
        Vehiculo v = buscarVehiculo(patente);
        v.registrarAlquilado(fecha, cliente);
        v.setEstado(v.ESTADOS.get("Alquilado"));
    }

    public void devolverVehiculo(Vehiculo v, float kilometrosRecorridos) {
        verificarVehiculo(v, kilometrosRecorridos);
    }

    private void verificarVehiculo(Vehiculo v, float kilometrosRecorridos) {
        float limiteSeguro = 3000f;
        if (kilometrosRecorridos > limiteSeguro) {
            v.setEstado(v.ESTADOS.get("Reparandose"));
        } else {
            v.setEstado(v.ESTADOS.get("Disponible"));
        }
    }

    public String listarEstadoVehiculos() {
        StringBuilder informacion = new StringBuilder();
        Iterator i = vehiculos.entrySet().iterator();

        while (i.hasNext()) {
            Map.Entry<String, Vehiculo> me = (Map.Entry) i.next();
            Vehiculo v = me.getValue();

            informacion.append("El vehiculo " + v.getMarca() + " " + v.getModelo() + " " + v.getPatente() + " se encuentra ");
            informacion.append(v.getEstado());
            informacion.append("\n");
        }
        return informacion.toString();
    }
}
