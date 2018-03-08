
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("Esto es una Excepción");
		} catch (Exception e) {
			System.out.println("Se produjo un excepción: " + e.getMessage());
		} finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}
	}

}
