import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		/*
		 * try { System.out.println(0/0); } finally { System.out.println("fin");
		 * } System.out.println("fin2");
		 */

		/*
		 * 
		 * int i = prueba(); System.out.println("retorno main "+i);
		 * 
		 */
		LibretaDeDirecciones libretaDeDirecciones = new LibretaDeDirecciones();
		libretaDeDirecciones.eliminarContacto("pepe");
		
		
		/*
		String nombreDeArchivo = "miNombreArchivo";
		int MAX_INTENTOS = 3;
		boolean exito = false;
		int intentos = 0;
		do {
			try {
				libretaDeDirecciones.grabarEnArchivo(nombreDeArchivo);
				exito = true;
			} catch (IOException e) {
				System.out.println("Imposible grabar en " + nombreDeArchivo);
				intentos++;
				if (intentos < MAX_INTENTOS) {
					nombreDeArchivo = "otro nombre";
				}
			}
		} while (!exito && intentos < MAX_INTENTOS);
		if (!exito) {
			// Informar el problema y rendirse.
		}
		*/
	}

	static int prueba() {
		try {
			System.out.println("retorno");
			return 1;
		} finally {
			System.out.println("finally prueba");
		}

	}

}
