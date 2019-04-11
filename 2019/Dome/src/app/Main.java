package app;

public class Main 
{
	public static void main(String[] args) 
	{
		Musica m = new Musica("Help!", 30, "rock 60", "the beatles", "muy bueno", true, true, 300,10);
		m.aumentarCantidadReproducciones();
		//System.out.println(m.toString());
		
		Pelicula p = new Pelicula("Help!", 30, "rock 60", "the beatles", "muy bueno", true, true, 300,"chester");
		
		
		
		Catalogo catalogo = new Catalogo();
		catalogo.agregarElemento(m);
		catalogo.agregarElemento(p);
		
		//catalogo.listarCatalogo();
		
		System.out.println(catalogo.contarPeliculas());
		System.out.println(catalogo.contarDuracionMusica());
		
		
	}
}
