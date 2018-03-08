import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaArchivos {

	static void copiaArchivos()
	{
		FileInputStream origen = null;
		FileOutputStream destino = null;
		File f1 = new File("jardines.txt");
		File f2 = new File("jardinNew.txt");
		try {
			origen = new FileInputStream(f1);
			destino = new FileOutputStream(f2);
			int c;
			while ((c = origen.read()) != -1)
				destino.write((byte) c);
		} catch (IOException er) {
			System.out.println("Excepción en los flujos " + er.getMessage());
		} finally {
			try {
				origen.close();
				destino.close();
			} catch (IOException er) {
				er.printStackTrace();
			}

		}
	}
}
