package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import clases.BaseDeDatosV2;
import clases.CD;
import clases.DVD;
import clases.Elemento;

public class Main {

	public static void main(String[] args) 
	{
		CD cd1 = new CD("new", "macca", 12, 200);
		CD cd2 = new CD("help","the beatles",12,200);
		CD cd3 = new CD("aaa", "bbbb", 15, 300);
		
		CD cd4 = new CD("aaa", "bbbb", 15, 300);
		
		DVD dvd1 = new DVD("el señor de los anillos", "peter jackson", 300);
		DVD dvd2 = new DVD("jp","sp", 90);
		
	
		
		BaseDeDatosV2 baseDeDatosV2 = new BaseDeDatosV2();
		baseDeDatosV2.agregarElemento(cd1);
		baseDeDatosV2.agregarElemento(cd2);
		baseDeDatosV2.agregarElemento(cd3);
		
		System.out.println(baseDeDatosV2.frecuencia(cd4));
		
		//baseDeDatosV2.listar();
		
		String nombre = "gonzalo";
		
		nombre = nombre + "pepe";
		
		StringBuilder builder = new StringBuilder();
		builder.append("gonzalo");
		builder.append("pepe");
		
		

	}

}
