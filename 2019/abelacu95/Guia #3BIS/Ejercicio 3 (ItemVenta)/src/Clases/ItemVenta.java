package Clases;

import java.text.DecimalFormat;

public class ItemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemVenta(int _id, String _descripcion, int _cantidad, double _precioUnitario) {
        id = _id;
        descripcion = _descripcion;
        cantidad = _cantidad;
        precioUnitario = _precioUnitario;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double precioTotal(double pUnitario, int cant){
        return (pUnitario * cant);
    }

    public String mostrar(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        return "\n\t.:ItemVenta:." +
                "\nId: "+id+
                "\nDescripcion: "+descripcion+
                "\nCantidad: "+cantidad+
                "\nPrecio Unitario: "+formato1.format(precioUnitario)+
                "\nPrecio Total: "+formato1.format(precioTotal(precioUnitario,cantidad));
    }
}