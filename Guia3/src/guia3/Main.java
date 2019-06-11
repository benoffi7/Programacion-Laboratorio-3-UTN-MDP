package guia3;



public class Main {
	public static void main(String[] args) {
		Libro miLibro = new Libro ("Efective Java", 250, 50,"Joshua","Bloch","joshua@email.com","M");
		
		
		System.out.println(miLibro.toString());
		miLibro.cambiarPrecio(300);
		System.out.println("\n\n");
		System.out.println(miLibro.mostrarAutor());
		System.out.println("\n\n");
		System.out.println(miLibro.toString());
		
	}

}
