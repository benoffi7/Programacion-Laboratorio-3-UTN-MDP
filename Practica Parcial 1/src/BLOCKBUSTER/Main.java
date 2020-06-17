package BLOCKBUSTER;

public class Main {

	public static void main(String[] args) {
		
		Sucursal blockBuster = new Sucursal();
		Pelicula p1 = new Pelicula("IT","Terror",01,4,60,"Stephen Spielberg");
		Videojuego v1 = new Videojuego("Resident Evil","terror",344,1,10,"Konami");
		Videojuego v2 = new Videojuego("Farenheit","suspenso",388,7,10,"Kona");
		blockBuster.agregrar(v2);
		blockBuster.agregrar(v1);
		blockBuster.agregrar(p1);
		System.out.println(blockBuster.mostrarJuegos());
		System.out.println(blockBuster.mostrarPelis());
		
	
	}

}
