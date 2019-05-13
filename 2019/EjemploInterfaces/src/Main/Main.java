package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Edificio> lista = new ArrayList<Edificio>();
		Oficina of1 = new Oficina(4, 500);
		Oficina of2 = new Oficina(2, 300);
		Oficina of3 = new Oficina(6, 1000);
		Polideportivo pd1 = new Polideportivo(1, 1000, "Polideportivo Islas Malvinas");
		Polideportivo pd2 = new Polideportivo(1, 2000, "Polideportivo Libertad");
		lista.add(of1);
		lista.add(of2);
		lista.add(of3);
		lista.add(pd1);
		lista.add(pd2);
		Iterator<Edificio> it = lista.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next().mostrarAtributos());
		}

	}

}
