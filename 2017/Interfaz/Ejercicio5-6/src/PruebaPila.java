
public class PruebaPila {
	public static void rellenar(ColeccionInterfaz c) {
		for (int i = 0; i <= 10; i++) {
			c.add(i);
		}
	}

	public static void imprimirYVaciar(ColeccionInterfaz col) {
		while (!col.estaVacia()) {
			System.out.println(col.extraer());
		}
	}
}
