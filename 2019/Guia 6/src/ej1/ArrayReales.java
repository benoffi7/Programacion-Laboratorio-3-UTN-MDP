package ej1;

import java.util.ArrayList;
import java.util.List;

public class ArrayReales implements IEstadisticas{
	private List<Float> numeros;
	
	public ArrayReales() { 
		super();
		numeros = new ArrayList();
	}
	
	public void agregarNumero(float f) {
		numeros.add(f);
	}
	
	public void agregarNumeroRandom() {
		float e = (float) (Math.random()*100);
		numeros.add(e);
	}
	
	@Override
	public double minimo() {
		float min= numeros.get(0);
		for(Float f: numeros) {
			if(f < min) {
				min = f;
			}
		}
		
		return min;
	}

	@Override
	public double maximo() {
		float max= numeros.get(0);
		for(Float f: numeros) {
			if(f > max) {
				max = f;
			}
		}		
		return max;		
	}

	@Override
	public double sumatorio() {
		float suma=0f;
		for(Float f: numeros) {
			suma+= f;
		}
		return suma;
	}
	
	
	
}
