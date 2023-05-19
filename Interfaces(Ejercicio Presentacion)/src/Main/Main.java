package Main;
import Clases.EdificioDeOficinas;
import Clases.Polideportivo;

public class Main {

	public static void main(String[] args) 
	{
		Polideportivo nuevo = new Polideportivo(1, "Guillermina", 200);
		EdificioDeOficinas nuevo1 = new EdificioDeOficinas(300,30,"Manglar");
		
		System.out.println(nuevo.toString());
		
		System.out.println(nuevo1.toString());

	}

}
