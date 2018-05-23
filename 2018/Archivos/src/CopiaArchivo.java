import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaArchivo {
	public static void copiar() {
		
		File f1 = new File("jardines.txt");
		File f2 = new File("jardinOld.txt");
		FileInputStream origen = null;
		FileOutputStream destino = null;
		try {
			
			origen = new FileInputStream("jardines.txt");
			destino = new FileOutputStream(f2);
			int c;
			while ((c = origen.read()) != -1)
				destino.write((byte) c);
			//
		} catch (IOException er) {
			System.out.println("Excepción en los flujos " + er.getMessage());
		} finally {
			 
				try {
					origen.close();
					destino.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}
}
