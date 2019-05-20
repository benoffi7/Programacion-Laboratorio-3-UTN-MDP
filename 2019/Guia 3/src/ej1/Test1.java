/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 * a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”,
 * ’M’. 
 * b. Imprima por pantalla al autor previamente instanciado. 
 * c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450 pesos con
 * una cantidad de 150 copias. 
 * d. Imprima por pantalla el libro instanciado. 
 * e.  Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
 * cantidad en 50 copias. 
 * f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Effective Java”. 
 * g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el siguiente mensaje: “El
 * libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor.toString());
        
        System.out.println("");
        
        Libro libro = new Libro("Effective Java", 450f, 150, autor );
        
        System.out.println(libro.toString());
        
        System.out.println("");
        
        libro.cambiarPrecio(500f);
        libro.agregarStock(50);
        
        System.out.println(libro.getAutor().toString());
        
        System.out.println(libro.mensajeEspecial());
    }

}
