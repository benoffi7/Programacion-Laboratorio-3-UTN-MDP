package app;

public class Main {

	public static void main(String[] args)
	{
		Musica help = new Musica("help", 120, "the beatles", true, "muy bueno!",12);
		System.out.println(		help.imprimir());
		//System.out.println(		help.getAutor());
		
		Pelicula helpDVD = new Pelicula("help", 90, "the beatles", true, "estaban fumados", "chester");
		System.out.println(		helpDVD.imprimir());
		//System.out.println(		helpDVD.getAutor());
		
		CatalogoV2 catalogoV2 = new CatalogoV2();
		catalogoV2.agregar(helpDVD);
		catalogoV2.agregar(help);
		
		CatalogoV1 catalogoV1 = new CatalogoV1();
		catalogoV1.agregar(help);
		catalogoV1.agregar(helpDVD);
		
		//catalogoV1.getElementos().add(helpDVD);
		
		System.out.println("*****************");
		catalogoV1.listarElementos();
		System.out.println("*****************");
		
		/*for (Elemento e : catalogoV1.getElementos())
		{
			System.out.println(e.imprimir());
		}*/


	}

}
