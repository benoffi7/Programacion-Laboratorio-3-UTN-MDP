
public class Libro {
    private String titulo;
    private int stock;
    private double precio;
    private Persona Autor;

    public Libro() {
        titulo = new String("-");
        stock = 0;
        precio = 0;
        Autor = new Persona();
    }

    public Libro(String titulo, int stock, double precio, Persona Autor) {
        this.titulo = titulo;
        this.stock = stock;
        this.precio = precio;
        this.Autor = Autor;
    }

    /**
     * public void setStock(int stock) { this.stock = stock; }
     * 
     * public void setPrecio(double precio) { this.precio = precio; }
     */

    public boolean modificarPrecio(double precioNuevo) {
        boolean done = false;

        if (precioNuevo > 0) {
            this.precio = precioNuevo;
            done = true;
        }
        return done;
    }

    public boolean retirarStock(int retirados) {
        boolean done = false;

        if (!(retirados > this.stock)) {
            this.stock = this.stock - retirados;
            done = true;
        }

        return done;
    }

    public boolean agregarStock(int ingresados) {
        boolean done = false;

        if (ingresados > 0) {
            this.stock = this.stock + ingresados;
            done = true;
        }

        return done;
    }

    public String getAutor() {
        return Autor.toString();
    }

    public String printBook(){

        StringBuffer buffer = new StringBuffer();
        buffer.append("\nEl libro, "+titulo);
        buffer.append(" de "+Autor.getNombre()+" "+Autor.getApellido());
        buffer.append(". Se vende a "+precio+" pesos");

        return buffer.toString();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nTitulo: ");
        buffer.append(titulo);
        buffer.append("\nStock: " + stock + " unidades");
        buffer.append("\nPrecio: ");
        buffer.append(precio + " pesos");
        buffer.append("\nAutor: ");
        buffer.append(Autor.getNombre());
        buffer.append(" " + Autor.getApellido());

        return buffer.toString();
    }
}