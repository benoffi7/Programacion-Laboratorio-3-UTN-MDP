package ej2;

import java.util.LinkedList;

public class Matematicas implements IExtremos{

	private LinkedList<Float> numeros;
	
	
	public Matematicas() {
		numeros = new LinkedList<Float>();
	}
	
	public void agregarNumero(float f) {
		numeros.add(f);
	}
	
	public void agregarNumeroRandom() {
		float e = (float) (Math.random()*100);
		numeros.add(e);
	}
	
	@Override
	public double inicio() {
		return numeros.getFirst();		
	}

	@Override
	public double fin() {		
		return numeros.getLast();
	}

}
