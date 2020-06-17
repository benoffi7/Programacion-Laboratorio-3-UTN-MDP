package ej5;

import java.util.ArrayList;

public class Pila implements IColeccionInterfaz<Integer> {

	private ArrayList<Integer> elementos;

	public Pila() {
		elementos = new ArrayList<Integer>();
	}

	@Override
	public boolean estaVacia() {
		boolean rta = true;

		if (!elementos.isEmpty()) {
			rta = false;
		}
		return rta;
	}

	@Override
	public Integer extraer() {
		int i = elementos.get(0).intValue();
		elementos.remove(0);
		return i;
	}

	@Override
	public Integer primero() {
		return elementos.get(0).intValue();
	}

	@Override
	public boolean agregar(Integer elemento) {
		if (elemento != null) {
			elementos.add(0, elemento);
			return true;
		} else {
			return false;
		}
	}

}
