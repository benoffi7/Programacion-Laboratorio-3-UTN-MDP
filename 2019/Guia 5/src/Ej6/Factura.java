/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fede
 */
public class Factura {

    private int numeroFactura;
    private String fecha;
    private String nombreCliente;
    private String domicilioCliente;
    private String CUIT;
    private float descuento;

    private List<Renglon> renglones;

    public Factura(int numeroFactura, String fecha, Cliente c) {
        setNumeroFactura(numeroFactura);
        setFecha(fecha);
        setNombreCliente(c.getNombre());
        setDomicilioCliente(c.getDomicilio());
        setCUIT(c.getCUIT());
        setDescuento(c.getDescuento());
        renglones = new ArrayList<>();
    }

    private void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    private void setDomicilioCliente(String domicilioCliente) {
        this.domicilioCliente = domicilioCliente;
    }

    private void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    private void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDomicilioCliente() {
        return domicilioCliente;
    }

    public String getCUIT() {
        return CUIT;
    }

    public float getDescuento() {
        return descuento;
    }

    public void agregarVenta(int cantidad,String item,float precioUnitario) {
        Renglon r = new Renglon(cantidad, item, precioUnitario);
        renglones.add(r);
    }

    private float calcularMontoTotal() {
        float monto = 0f;

        for (Renglon r : renglones) {
            monto += r.getPrecioTotal();
        }

        return monto;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append("Nº de factura: " + getNumeroFactura()
                + "\nFecha: " + getFecha()
                + "\nCliente: " + getNombreCliente()
                + "\nDomicilio: " + getDomicilioCliente()
                + "\nCUIT: " + getCUIT()
                + "\nCant\tDetalle\t\tPrecioU\t\tPrecioFinal"
                + "\n");

        for (Renglon r : renglones) {
            msg.append(r.generarLinea());
            msg.append("\n");
        }

        float monto = calcularMontoTotal();
        float montoConDescuento = monto * (1f - getDescuento());
        msg.append("\nTotal sin Desc: $" + monto + "\n");
        msg.append("Total con Desc: $" + montoConDescuento + "\n");
        
        return msg.toString();
    }
}
