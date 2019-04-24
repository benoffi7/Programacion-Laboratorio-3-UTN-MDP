package Clases;

public class Menu {

    public static void main(String[] args){

        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.

        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'm' );

        //b. Imprima por pantalla al autor previamente instanciado.

        System.out.println(autor1.mostrarAutor());

        /* c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        pesos con una cantidad de 150 copias. */

        Libro libro1 = new Libro("Effective Java", 450,150, autor1 );

        //d. Imprima por pantalla el libro instanciado.

        System.out.println(libro1.mostrarLibro());

        /*e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        cantidad en 50 copias.*/

        libro1.aumentarStock(50);
        libro1.modificarPrecio(500);

        /* f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        Libro “Effective Java”.*/

        System.out.println(libro1.getAutor().mostrarAutor());

        /* g.Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        siguiente mensaje: “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.” */

        System.out.println(libro1.mostrarMensaje());

    }

}
