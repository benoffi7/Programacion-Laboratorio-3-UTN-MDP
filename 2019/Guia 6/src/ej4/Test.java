package ej4;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Obra o1 = new Libro(1,"El Principito",1943);
		
		System.out.println(o1.toString());
		
		((Libro)o1).prestar();
		
		System.out.println(o1.toString());
	}

}
