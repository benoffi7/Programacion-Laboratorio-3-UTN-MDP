import java.io.Serializable;

class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private float precio;
    private String nombre;
    private int stock;

    // --------------------------------------------

    public Producto(String nombre, float precio, int stock) {

        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;

    }

    public void setProductNombre(String name) {
        this.nombre = name;
    }

    public void setProductPrecio(float price) {
        this.precio = price;
    }

    public void setProductStock(int stock) {
        this.stock = stock;
    }

    // ------------------------------------------------

    public int getProductStock() {
        return stock;
    }

    public float getProductPrecio() {
        return precio;
    }

    public String getProductNombre() {
        return nombre;
    }

    public String getProduct() {
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("Nombre: ");
        buffer.append(nombre);
        buffer.append("\n");
        buffer.append("Precio: ");
        buffer.append(precio);
        buffer.append("\n");
        buffer.append("Stock: ");
        buffer.append(stock);
        buffer.append("\n");

        return buffer.toString();
    }

    // --------------------------------------------

}