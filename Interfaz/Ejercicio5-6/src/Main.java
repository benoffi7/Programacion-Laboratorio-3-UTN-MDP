
public class Main {
	public static void main(String[] args) {

		Pila p = new Pila(20);
		PruebaPila.rellenar(p);
		System.out.println("La pila: " + p);
		PruebaPila.imprimirYVaciar(p);
		System.out.println("Ahora la pila es: " + p);

	}
}
