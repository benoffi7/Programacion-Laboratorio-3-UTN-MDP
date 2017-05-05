
public class Main {

	public static void main(String[] args) 
	{
		Libro libro = new Libro("1","El libro de las especies",1900);
		libro.prestar();
		
		System.out.println(libro.prestado());
		
		libro.devolver();
		
		System.out.println(libro.prestado());
		
		Revista revista = new Revista("2", "Muy interesante", 1, 2);
		System.out.println(revista.getTitulo());
	}

}
