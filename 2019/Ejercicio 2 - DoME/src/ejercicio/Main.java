package ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

/*
- Debe permitirnos ingresar información sobre los CD y los DVD.
- Debe almacenar esta información de manera permanente, de tal modo que pueda ser usada más adelante.
- Debe brindar una función de búsqueda que nos permita por ejemplo, encontrar todos los CD de un cierto
  intérprete que hay en la base, o todos los DVD de determinado director.
- Debe permitirnos imprimir listados como por ejemplo: listado de todos los DVD que hay en la base o un
  listado de todos los CD de música.
- Debe permitirnos eliminar información.
*/

public class Main
{
	public static void main(String[] args)
	{
		//CARGA PREVIA (opcional)
		AlbumMusica ACDCAlbum = new AlbumMusica("Highway to Hell", 1979, 41, "s", "Genial", "AC/DC", 10);
		AlbumMusica BonJoviAlbum = new AlbumMusica("Have a Nice Day", 2005, 49, "s", "Magnifico", "Bon Jovi", 13);
		AlbumMusica QueenAlbum = new AlbumMusica("A Night at the Opera", 1975, 43, "s", "EEEEEOOOOOO", "Queen", 10);
		Pelicula Titanic = new Pelicula("Titanic", 1997, 194, "s", "Safable", "James Cameron");
		Pelicula ElLoboDeWallStreet = new Pelicula("El lobo de Wall Street", 2013, 180, "s", "Divertida", "Martin Scorsese");
		Pelicula Troya = new Pelicula("Troya", 2004, 196, "s", "Decente", "Wolfgang Petersen");
		Catalogo miCatalogo = new Catalogo();
		miCatalogo.agregarElementoACatalogo(ACDCAlbum);
		miCatalogo.agregarElementoACatalogo(BonJoviAlbum);
		miCatalogo.agregarElementoACatalogo(QueenAlbum);
		miCatalogo.agregarElementoACatalogo(Titanic);
		miCatalogo.agregarElementoACatalogo(ElLoboDeWallStreet);
		miCatalogo.agregarElementoACatalogo(Troya);
		//FIN CARGA PREVIA
		
		ArrayList<AlbumMusica> albumesMusica = new ArrayList<>();;
		ArrayList<Pelicula> peliculas =  new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		char control = 's';
		int opcion;
		while (control == 's')
		{
			menu();
			opcion = teclado.nextInt();
			System.out.println();
			switch (opcion)
			{
			case 1:
				cargarAlbumMusicaEnCatalogo(miCatalogo);
				break;
			case 2:
				albumesMusica = miCatalogo.retornarAlbumesMusica();
				listarAlbumesMusica(albumesMusica);
				break;
			case 3:
				buscarAlbumMusica(miCatalogo);
				break;
			case 4:
				modificarAlbumMusica(miCatalogo);
				break;
			case 5:
				eliminarAlbumMusica(miCatalogo);
				break;
			case 6:
				cargarPeliculaEnCatalogo(miCatalogo);
				break;
			case 7:
				peliculas = miCatalogo.retornarPeliculas();
				listarPeliculas(peliculas);
				break;
			case 8:
				buscarPelicula(miCatalogo);
				break;
			case 9:
				modificarPelicula(miCatalogo);
				break;
			case 10:
				eliminarPelicula(miCatalogo);
				break;
			case 0:
				control = 'n';
				break;
			}
			presioneLaTeclaENTERParaContinuar();
		}
		teclado.close();
	}
	
	public static void menu()
	{
		System.out.println(" ________________________________________________");
		System.out.println("|                                                |");
		System.out.println("|   DoME - Database of Multimedia Entertainment  |");
		System.out.println("|                                                |");
		System.out.println("|                Album de musica                 |");
		System.out.println("|1.  Agregar                                     |");
		System.out.println("|2.  Imprimir listado                            |");
		System.out.println("|3.  Buscar                                      |");
		System.out.println("|4.  Modificar                                   |");
		System.out.println("|5.  Eliminar                                    |");
		System.out.println("|                   Pelicula                     |");
		System.out.println("|6.  Agregar                                     |");
		System.out.println("|7.  Imprimir listado                            |");
		System.out.println("|8.  Buscar                                      |");
		System.out.println("|9.  Modificar                                   |");
		System.out.println("|10. Eliminar                                    |");
		System.out.println("|                                                |");
		System.out.println("|0. Salir                                        |");
		System.out.println("|________________________________________________|\n");
		System.out.print("Ingrese opcion [0-10] ");
	}
	
	private static void presioneLaTeclaENTERParaContinuar()
	{
		System.out.print("Presione la tecla ENTER para continuar... ");
		try
		{
			System.in.read();
		}
		catch(Exception e)
		{}
	}
	
	private static void cargarPeliculaEnCatalogo(Catalogo miCatalogo)
	{
		Scanner teclado = new Scanner(System.in);
		String titulo, comentario, loTengo, director;
		int año, duracion;
		System.out.println("Ingrese el titulo");
		titulo = teclado.nextLine();
		System.out.println("Ingrese el año");
		año = teclado.nextInt();
		System.out.println("Ingrese la duracion (en min.)");
		duracion = teclado.nextInt();
		teclado.nextLine(); //Consume newline left-over
		System.out.println("¿Lo tenes? (s/n)");
		loTengo = teclado.nextLine();
		System.out.println("Ingrese un comentario");
		comentario = teclado.nextLine();
		System.out.println("Ingrese el director");
		director = teclado.nextLine();
		Pelicula miPelicula = new Pelicula(titulo, año, duracion, loTengo, comentario, director);
		miCatalogo.agregarElementoACatalogo(miPelicula);
	}
	
	private static void cargarAlbumMusicaEnCatalogo(Catalogo miCatalogo)
	{
		Scanner teclado = new Scanner(System.in);
		String titulo, comentario, loTengo, banda;
		int año, duracion, numeroDeCanciones;
		System.out.print("Ingrese el titulo ");
		titulo = teclado.nextLine();
		System.out.print("Ingrese el año ");
		año = teclado.nextInt();
		System.out.print("Ingrese la duracion (en min.) ");
		duracion = teclado.nextInt();
		teclado.nextLine(); //Consume newline left-over
		System.out.print("¿Lo tenes? (s/n) ");
		loTengo = teclado.nextLine();
		System.out.print("Ingrese un comentario ");
		comentario = teclado.nextLine();
		System.out.print("Ingrese la banda ");
		banda = teclado.nextLine();
		System.out.print("Ingrese el numero de canciones ");
		numeroDeCanciones = teclado.nextInt();
		System.out.println("");
		AlbumMusica miAlbumMusica = new AlbumMusica(titulo, año, duracion, loTengo, comentario, banda, numeroDeCanciones);
		miCatalogo.agregarElementoACatalogo(miAlbumMusica);
	}
	
	public static void listarAlbumesMusica(ArrayList<AlbumMusica> albumesMusica)
	{
		for (AlbumMusica e : albumesMusica)
		{
			System.out.println(e.imprimir());
		}
	}
	
	public static void listarPeliculas(ArrayList<Pelicula> peliculas)
	{
		for (Pelicula e : peliculas)
		{
			System.out.println(e.imprimir());
		}
	}
	
	public static void buscarAlbumMusica(Catalogo miCatalogo)
	{
		AlbumMusica miAlbumMusicaBuscado = miCatalogo.buscarAlbumMusicaEnCatalogo(ingresarTituloABuscar());
		if (miAlbumMusicaBuscado != null)
			System.out.println("\n" + miAlbumMusicaBuscado.imprimir());
		else
			System.out.println("\nNo se encontro el album de musica buscado\n");
	}
	
	public static void buscarPelicula(Catalogo miCatalogo)
	{
		Pelicula miPeliculaBuscada = miCatalogo.buscarPeliculaEnCatalogo(ingresarTituloABuscar());
		if (miPeliculaBuscada != null)
			System.out.println("\n" + miPeliculaBuscada.imprimir());
		else
			System.out.println("\nNo se encontro la pelicula buscada\n");
	}
	
	public static String ingresarTituloABuscar()
	{
		Scanner teclado = new Scanner(System.in);
		String tituloABuscar;
		System.out.print("Ingrese el titulo a buscar ");
		tituloABuscar = teclado.nextLine();
		return tituloABuscar;
	}
	
	public static void modificarAlbumMusica(Catalogo miCatalogo)
	{
		int idAModificar = ingresarId();
		int opcion = ingresarOpcionAModificar();
		String modificacion = ingresarModificacion();
		if (miCatalogo.modificarLoTengoOComentarioAlbumMusica(idAModificar, opcion, modificacion))
			System.out.println("\nAlbum de musica modificado exitosamente\n");
		else
			System.out.println("\nNo se encontro el album de musica buscado\n");
	}
	
	public static void modificarPelicula(Catalogo miCatalogo)
	{
		int idAModificar = ingresarId();
		int opcion = ingresarOpcionAModificar();
		String modificacion = ingresarModificacion();
		if (miCatalogo.modificarLoTengoOComentarioPelicula(idAModificar, opcion, modificacion))
			System.out.println("\nPelicula modificada exitosamente\n");
		else
			System.out.println("\nNo se encontro la pelicula buscada\n");
	}
	
	public static int ingresarId()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("ID del elemento ");
		int id = teclado.nextInt();
		return id;	
	}
	
	public static int ingresarOpcionAModificar()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nModificar:");
		System.out.println("1.  ¿Lo tenes?");
		System.out.println("2.  Comentario");
		System.out.print("Opcion [1-2] ");
		int opcion = teclado.nextInt();
		return opcion;
	}
	
	public static String ingresarModificacion()
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nuevo valor ");
		String modificacion = teclado.nextLine();
		return modificacion;
	}
	
	public static void eliminarAlbumMusica(Catalogo miCatalogo)
	{
		int idAEliminar = ingresarId();
		if (miCatalogo.eliminarAlbumMusica(idAEliminar))
			System.out.println("\nAlbum de musica eliminado exitosamente\n");
		else
			System.out.println("\nNo se encontro el album de musica buscado\n");
	}
	
	public static void eliminarPelicula(Catalogo miCatalogo)
	{
		int idAEliminar = ingresarId();
		if (miCatalogo.eliminarPelicula(idAEliminar))
			System.out.println("\nPelicula eliminada exitosamente\n");
		else
			System.out.println("\nNo se encontro la pelicula buscada\n");
	}
}