import java.util.NoSuchElementException;

public class Pila implements ColeccionInterfaz {

	private int[] array;
	private int contador;

	public Pila(int tamanioMaximo) {
		array = new int[tamanioMaximo];
		contador = 0;
	}

	@Override
	public boolean estaVacia() {

		return contador == 0;
	}

	@Override
	public boolean add(int objeto) {
		if (contador == array.length) {
			return false;
		} else {
			array[contador] = objeto;
			contador++;
			return true;
		}
	}

	@Override
	public int primero() {
		if (estaVacia()) {
			throw new NoSuchElementException();
		} else {
			return array[contador - 1];
		}
	}

	@Override
	public int extraer() {
		if (estaVacia()) {
			throw new NoSuchElementException();
		} else {
			contador--;
			return array[contador];
		}
	}

	public String toString() {
		String s = "[";
		for (int i = contador - 1; i >= 0; i = i - 1) {
			s += array[i] + ", ";
		}
		if (!estaVacia()) 
		{
			int fin = s.length();
			s = s.substring(0, fin - 2);
		} 
		
		return s + "]";
		

	}

}
