
public class Main {

    public static void main(String[] args) {

        Persona autor = generateJoshua();
        System.out.println(autor.toString());

        separate();

        Libro libro = generateBook(autor);
        System.out.println(libro.toString());

        separate();

        isDone(libro.modificarPrecio(500));
        isDone(libro.agregarStock(50));

        System.out.println(libro.toString());

        separate();

        System.out.println("\nInformacion del autor: \n" + libro.getAutor());

        separate();

        System.out.println(libro.printBook());

        separate();

        
    }

    public static void separate(){
        System.out.println("\n---------------------------");
    }

    public static void isDone(boolean couldBe){
        if(couldBe == false){
            System.out.println("\nEl valor ingresado es invalido");
        }
    }

    public static Persona generateJoshua() {
        String nombre = new String("Joshua");
        String apellido = new String("Bloch");
        String email = new String("joshua@email.com");
        char genero = 'M';

        Persona autor = new Persona(nombre, apellido, email, genero);

        return autor;
    }

    public static Libro generateBook(Persona autor) {

        String titulo = new String("Effective Java");
        int stock = 150;
        double precio = 450;

        Libro libro = new Libro(titulo, stock, precio, autor);
        return libro;
    }

}