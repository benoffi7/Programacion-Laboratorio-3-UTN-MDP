package ej6;

import ej5.IColeccionInterfaz;
import ej5.Pila;

public class Test {

	public static void main(String[] args) {
		IColeccionInterfaz<Integer> p1 = new Pila();
		/*
		Pila p2 = new Pila();
		
		for(int i= 1;i<11;i++) {
			p2.agregar(i);
		}
		
		while(!p2.estaVacia()) {
			System.out.println(p2.extraer());
		}*/
		
		PruebaPila.rellenar(p1);
		System.out.println(PruebaPila.imprimirYVaciar(p1));
	}
}
