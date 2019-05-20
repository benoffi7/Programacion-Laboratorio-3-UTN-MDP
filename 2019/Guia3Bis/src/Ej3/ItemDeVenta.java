/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author Fede
 */
public class ItemDeVenta {

    private int identificador;
    private String descripción;
    private int cantidad;
    private float precioUnitario;

    public ItemDeVenta(int id, String descrip, int cant, float pUnitario) {
        setIdentificador(id);
        descripción = descrip;
        setCantidad(cant);
        setPrecioUnitario(pUnitario);
    }

    private void setIdentificador(int id) {
        identificador = id;
    }

    private void setCantidad(int cant) {
        cantidad = cant;
    }

    private void setPrecioUnitario(float pUnitario) {
        precioUnitario = pUnitario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripción() {
        return descripción;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public float calcularPrecioTotal() {
        return getCantidad() * getPrecioUnitario();
    }

    @Override
    public String toString() {
        return "ItemVenta[id=" + getIdentificador()
                + " descripción=" + getDescripción()
                + " cantidad=" + getCantidad()
                + " pUnitario=" + getPrecioUnitario()
                + " pTotal=" + calcularPrecioTotal();
    }

}
