package packageNumber3;

public class Main {

	public static void main(String[] args) {
		
		//  A  //
		ItemDeVenta impresoras = new ItemDeVenta(123, "blancas", 500, 1000);
		ItemDeVenta monitores = new ItemDeVenta(456, "negros", 300, 900);
		ItemDeVenta parlantes = new ItemDeVenta(789, "tamaño mediano", 500, 300);
		ItemDeVenta gabinetes = new ItemDeVenta(698, "Marca: nzxt", 2000, 15000);
		
		//  B  //
		impresoras.toString();
		monitores.toString();
		parlantes.toString();
		gabinetes.toString();

	}

}
