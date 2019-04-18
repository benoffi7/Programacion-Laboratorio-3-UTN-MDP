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
		Catalogo miCatalogo = new Catalogo();
		ArrayList<Musica> albumesMusica = new ArrayList<>();
		ArrayList<Pelicula> peliculas =  new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		char control = 's';
		int opcion;
		String nombreDisco;
		while (control == 's')
		{
			menu();
			opcion = teclado.nextInt();
			switch (opcion)
			{
			case 1:
				cargarDiscoMusicaEnCatalogo(miCatalogo);
				break;
			case 2:
				buscarAlbumMusicaEnCatalogo(miCatalogo);
				break;
			case 3:
				modificarAlbumDeMusicaEnCatalogo(miCatalogo);
				break;
			case 4:
				eliminarAlbumDeMusicaEnCatalogo(miCatalogo);
				break;
			case 5:
				albumesMusica=miCatalogo.retornarAlbumesMusica();
				listarAlbumesMusica(albumesMusica);
				break;
			case 6:
				cargarPeliculaEnCatalogo(miCatalogo);
				break;
			case 7:
				buscarYRetornarPeliculaEnCatalogo(miCatalogo);
				break;
			case 8:
				modificarPeliculaEnCatalogo(miCatalogo);
				break;
			case 9:
				eliminarPeliculaEnCatalogo(miCatalogo);
				break;
			case 10:
				peliculas=miCatalogo.retornarPeliculas();
				listarPeliculas(peliculas);
				break;
			case 0:
				control = 'n';
				break;
			}
			presioneLaTeclaENTERParaContinuar();
		}
	}
	
	public static void menu()
	{
		System.out.println("_________________________________________________");
		System.out.println("		    DoME\n");
		System.out.println("  ALBUM DE MUSICA");
		System.out.println("1. Agregar disco");
		System.out.println("2. Buscar disco");
		System.out.println("3. Modificar disco");
		System.out.println("4. Elminar disco");
		System.out.println("5. Imprimir listado\n");
		System.out.println("  PELICULA");
		System.out.println("6. Agregar pelicula");
		System.out.println("7. Buscar pelicula");
		System.out.println("8. Modificar pelicula");
		System.out.println("9. Eliminar pelicula");
		System.out.println("10. Imprimir listado\n");
		System.out.println("0. Salir");
		System.out.println("_________________________________________________\n");
		System.out.println("Ingrese opcion: ");
	}
	
	private static void presioneLaTeclaENTERParaContinuar()
	{
		System.out.println("Presione la tecla ENTER para continuar...");
		try
		{
			System.in.read();
		}
		catch(Exception e)
		{}
	}
	
	public static String ingresarTituloABuscar()
	{
		Scanner teclado = new Scanner(System.in);
		String tituloABuscar;
		System.out.print("Ingrese el titulo a buscar \n");
		tituloABuscar = teclado.nextLine();
		return tituloABuscar;
	}

	
	//Funciones Musica
	
	public static Musica cargarAlbumMusica()
	{
		Scanner teclado = new Scanner(System.in);
		String titulo, comentario, banda;
		char loTengo;
		int año, duracion, numeroDeCanciones;
		System.out.println("Ingrese el titulo: ");
		titulo = teclado.nextLine();
		System.out.println("Ingrese el año: ");
		año = teclado.nextInt();
		System.out.println("Ingrese la duracion: ");
		duracion = teclado.nextInt();
		System.out.println("¿Lo tenes? ");
		loTengo = teclado.next().charAt(0);
		teclado.nextLine();
		System.out.println("Ingrese un comentario: ");
		comentario = teclado.nextLine();
		System.out.println("Ingrese la banda: ");
		banda = teclado.nextLine();
		System.out.println("Ingrese el numero de canciones: ");
		numeroDeCanciones = teclado.nextInt();
		Musica miAlbumMusica = new Musica(titulo, año, duracion, loTengo, comentario, banda, numeroDeCanciones);
		return miAlbumMusica;
	}
	
	private static void cargarDiscoMusicaEnCatalogo(Catalogo miCatalogo) //String titulo, int año, int duracion, char loTengo, String comentario, String banda, int numeroDeCanciones
	{
		Scanner teclado = new Scanner(System.in);
		String titulo, comentario, banda;
		char loTengo;
		int año, duracion, numeroDeCanciones;
		System.out.println("Ingrese el titulo: ");
		titulo = teclado.nextLine();
		System.out.println("Ingrese el año: ");
		año = teclado.nextInt();
		System.out.println("Ingrese la duracion: ");
		duracion = teclado.nextInt();
		System.out.println("¿Lo tenes? ");
		loTengo = teclado.next().charAt(0);
		teclado.nextLine();
		System.out.println("Ingrese un comentario: ");
		comentario = teclado.nextLine();
		System.out.println("Ingrese la banda: ");
		banda = teclado.nextLine();
		System.out.println("Ingrese el numero de canciones: ");
		numeroDeCanciones = teclado.nextInt();
		Musica miDiscoMusica = new Musica(titulo, año, duracion, loTengo, comentario, banda, numeroDeCanciones);
		miCatalogo.agregarElemento(miDiscoMusica);
	}
	
	public static void buscarAlbumMusicaEnCatalogo(Catalogo miCatalogo)
	{
		Musica miAlbumMusicaBuscado = miCatalogo.buscarYRetornarAlbumMusica(ingresarTituloABuscar());
		if (miAlbumMusicaBuscado != null)
			System.out.println("\n" + miAlbumMusicaBuscado.imprimir());
		else
			System.out.println("\nNo se encontro el album de musica buscado\n");
	}
	
	public static void modificarAlbumDeMusicaEnCatalogo(Catalogo miCatalogo)
	{
		
		String tituloABuscar=ingresarTituloABuscar();
		System.out.println("\nIngrese los nuevos datos del album\n");
		Musica miAlbumMusica=cargarAlbumMusica();
		if (miCatalogo.modificarAlbumMusica(tituloABuscar,miAlbumMusica))
			System.out.println("Modificación exitosa");
		else
			System.out.println("No se encontró el album solicitado");
			
	}
	
	public static void eliminarAlbumDeMusicaEnCatalogo(Catalogo miCatalogo)
	{
		if (miCatalogo.eliminarAlbumDeMusica(ingresarTituloABuscar()))
			System.out.println("Eliminación exitosa");
		else
			System.out.println("No se encontró el album solicitado");		
	}
	
	public static void listarAlbumesMusica(ArrayList<Musica> albumesMusica)
	{
		for (Musica e : albumesMusica)
		{
			System.out.println(e.imprimir());
		}
	}
	
	//Funciones Pelicula
	
	public static Pelicula cargarPelicula()
	{
		Scanner teclado = new Scanner(System.in);
		String titulo, comentario, director;
		char loTengo;
		int año, duracion;
		System.out.println("Ingrese el titulo: ");
		titulo = teclado.nextLine();
		System.out.println("Ingrese el año: ");
		año = teclado.nextInt();
		System.out.println("Ingrese la duracion: ");
		duracion = teclado.nextInt();
		System.out.println("¿Lo tenes? ");
		loTengo = teclado.next().charAt(0);
		teclado.nextLine();
		System.out.println("Ingrese un comentario: ");
		comentario = teclado.nextLine();
		System.out.println("Ingrese el director: ");
		director = teclado.nextLine();
		Pelicula miPelicula = new Pelicula (titulo, año, duracion, loTengo, comentario, director);
		return miPelicula;
	}
	
	private static void cargarPeliculaEnCatalogo(Catalogo miCatalogo) //String titulo, int año, int duracion, char loTengo, String comentario, String director
	{
		Scanner teclado = new Scanner(System.in);
		String titulo, comentario, director;
		char loTengo;
		int año, duracion;
		System.out.println("Ingrese el titulo: ");
		titulo = teclado.nextLine();
		System.out.println("Ingrese el año: ");
		año = teclado.nextInt();
		System.out.println("Ingrese la duracion: ");
		duracion = teclado.nextInt();
		teclado.nextLine();
		System.out.println("¿Lo tenes? ");
		loTengo = teclado.next().charAt(0);
		teclado.nextLine();
		System.out.println("Ingrese un comentario: ");
		comentario = teclado.nextLine();
		System.out.println("Ingrese el director: ");
		director = teclado.nextLine();
		Pelicula miPelicula = new Pelicula(titulo, año, duracion, loTengo, comentario, director);
		miCatalogo.agregarElemento(miPelicula);
	}
	
	public static void buscarYRetornarPeliculaEnCatalogo(Catalogo miCatalogo)
	{
		Pelicula miPeliculaBuscada = miCatalogo.buscarYRetornarPelicula(ingresarTituloABuscar());
		if (miPeliculaBuscada != null)
			System.out.println("\n" + miPeliculaBuscada.imprimir());
		else
			System.out.println("\nNo se encontro la pelicula buscada\n");
	}

	public static void modificarPeliculaEnCatalogo(Catalogo miCatalogo)
	{
		
		String tituloABuscar=ingresarTituloABuscar();
		System.out.println("\nIngrese los nuevos datos de la pelicula\n");
		Pelicula miPelicula=cargarPelicula();
		if (miCatalogo.modificarPelicula(tituloABuscar,miPelicula))
			System.out.println("Modificación exitosa");
		else
			System.out.println("No se encontró la pelicula solicitada");
			
	}
	
	public static void eliminarPeliculaEnCatalogo(Catalogo miCatalogo)
	{
		if (miCatalogo.eliminarPelicula(ingresarTituloABuscar()))
			System.out.println("Eliminación exitosa");
		else
			System.out.println("No se encontró la pelicula solicitada");		
	}
	
	public static void listarPeliculas(ArrayList<Pelicula> peliculas)
	{
		for (Pelicula e : peliculas)
		{
			System.out.println(e.imprimir());
		}
	}
	
}