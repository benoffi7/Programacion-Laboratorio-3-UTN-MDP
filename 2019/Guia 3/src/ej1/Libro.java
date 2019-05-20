/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author usuario
 */
public class Libro {
    
    private String titulo;
    private float precio;
    private int stock;
    private Autor autor;

    public Libro(String tituloNuevo, float precio, int stock, Autor autorNuevo) {
        titulo= tituloNuevo;
        setPrecio(precio);
        setStock(stock);
        autor = autorNuevo;        
    }

    

    private void setPrecio(float precio) {
        this.precio = precio;
    }

    
    public void cambiarPrecio(float precio){
        setPrecio(precio);
    }
    
    private void setStock(int stock) {
        this.stock = stock;
    }

    public void agregarStock(int nuevoLibros){
        int stock = getStock();
        
        int nuevaCantidad= stock + nuevoLibros;
        
        setStock(nuevaCantidad);
    }
    
    
    private String getTitulo() {
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
    @Override
    public String toString() {
        return "Titulo: "+ getTitulo() + "\nPrecio: $"+ getPrecio() + "\nCant disponible: "+ getStock() +"\n"+ autor.toString();
    }
    
    public String mensajeEspecial(){
        return "El libro, "+ getTitulo()+" de "+ getAutor().getNyA() +". Se vende a "+getPrecio()+" pesos";
    }
        
}
