package e1;

public class Main
{
	public static void main(String[] args)
	{
		Autor miAutor = new Autor("Joshua", "Bloch", "joshua@gmail.com", 'M'); //[EJERC. a]
		System.out.println("[EJERC. b] >Datos del autor< " + miAutor.retornarDatosAutor());
		Libro miLibro = new Libro("Effective Java", 450, 150, miAutor); //[EJERC. c]
		System.out.println("[EJERC. d] >Datos del libro< " + miLibro.retornarDatosLibro());
		miLibro.setPrecio(500); //[EJERC. e]
		miLibro.aumentarStock(50);  //[EJERC. e]
		System.out.println("[EJERC. e] Precio del libro: $" + miLibro.getPrecio() + " | Stock del libro: " + miLibro.getStock() + " unidades");
		System.out.println("[EJERC. f] >Datos del autor< " + miLibro.retornarDatosAutor());
		System.out.println("[EJERC. g] " + miLibro.retornarMensaje());
	}
}