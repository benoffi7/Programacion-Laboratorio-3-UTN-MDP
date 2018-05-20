import java.io.File;

public class Directorio {
	public static void listar(String ruta) {
		File dir;

		String[] cd;
		// para la ejecución es necesario especificar el directorio
		if (ruta.length() > 0) {
			dir = new File(ruta);
			// debe ser un directorio
			if (dir.exists() && dir.isDirectory())
			{
				// se obtiene la lista de elementos
				cd = dir.list();
				System.out.println("Elementos del directorio " + ruta);
				for (int i = 0; i < cd.length; i++)
					System.out.println(cd[i]);
			} else
				System.out.println("Directorio vacío");
		} else
			System.out.println("No se ha especificado directorio ");
	}

}
