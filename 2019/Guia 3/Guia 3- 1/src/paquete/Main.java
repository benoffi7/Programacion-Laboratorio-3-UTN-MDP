package paquete;

public class Main {

	public static void main(String[] args) {
	
		//  A  //
		Autor JoshuaBloch = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
				
		//  B  //
		JoshuaBloch.toString();
		
		//  C  //
		Libro EffectiveJava = new Libro("Effective Java", 450, 150, JoshuaBloch);
		
		//  D  //
		EffectiveJava.toString();
				
		//  E  //
		EffectiveJava.modificarLibro(500, 200);
			
		//  F  //
		EffectiveJava.mostrarAutor();
		
		//  G  //
		EffectiveJava.imprimirMensaje();

	}

}
