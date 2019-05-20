package app;

import colecciones.CHashmap;

public class Main {

	public static void main(String[] args) 
	{
		CHashmap cHashmap = new CHashmap();
		cHashmap.agregar("clave1", "valor1");
		System.out.println(cHashmap.cantidad());
		cHashmap.recorer();
		cHashmap.eliminar("clave1");
		System.out.println(cHashmap.cantidad());
		
		cHashmap.agregar("clave1", "valor1"); //sin efecto
		String encontrado = cHashmap.obtenerValor("clave1");
		System.out.println(encontrado);
		
		encontrado = cHashmap.obtenerValor("clave3");
		System.out.println(encontrado); //null
		
		
	}

}
