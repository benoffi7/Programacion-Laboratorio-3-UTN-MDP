
public class ItemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double precio;

    public ItemVenta() {
    }

    public ItemVenta(int id, String descripcion, int cantidad, double precio) {
        this.id = id;
        this.descripcion = new String(descripcion);
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcTotal(){
        
        double res = this.cantidad*this.precio;
        
        return res;
    }

    @Override
    public String toString() {
        return "{" + " id='" + id + "'" + ", descripcion='" + descripcion + "'" + ", cantidad='" + cantidad + "'"
                + ", precio unitario='" + precio + "'" + " precio total="+calcTotal() +"}";
    }

}
