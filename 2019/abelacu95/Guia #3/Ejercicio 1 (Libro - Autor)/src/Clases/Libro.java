package Clases;

public class Libro {

    private String titulo;
    private float precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, float precio, int stock, Autor autor){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Autor getAutor(){
        return autor;
    }

    //Setter Precio y Stock
    public void modificarPrecio(float precio){
        this.precio = precio;
    }

    public void aumentarStock(int stock) {
        this.stock += stock;
    }

    public String mostrarLibro(){
        return "\t.:LIBRO:."+
                "\nTitulo: "+getTitulo()+
                "\nAutor: "+autor.getNombre()+" "+autor.getApellido()+
                "\nPrecio: "+getPrecio()+
                "\nStock: "+getStock()+"\n";
    }

    public String mostrarMensaje(){
        return "El libro, '"+getTitulo()+"' de '"+getAutor().getNombre()+" "+getAutor().getApellido()+
                "' . Se vende a "+getPrecio()+" pesos.";
    }
}
