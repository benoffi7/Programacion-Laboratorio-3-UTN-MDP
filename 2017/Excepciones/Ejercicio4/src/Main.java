
public class Main {
	public static void main(String[] args) {
		try {
			throw new MiExcepcion("mi propia Excepción");
		} catch (MiExcepcion e) {
			System.out.println("excepción: " + e.getMensaje());
		}
	}
}
