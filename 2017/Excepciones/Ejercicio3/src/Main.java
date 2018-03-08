
public class Main {

	public static void main(String[] args) {
		ExcepcionEnArray ea = new ExcepcionEnArray();
		try {
			ea.getValor(6);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción: indice de array fuera de limites " + e.getMessage());
		}
	}

}
