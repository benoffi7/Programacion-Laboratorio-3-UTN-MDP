import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data {
	static void escribir() throws IOException {

		FileOutputStream fn = new FileOutputStream("nube.dat");
		DataOutputStream snb = new DataOutputStream(fn);

		String dia = "1 Septiembre 2001";

		snb.writeUTF(dia); // escribe registro inicial
		for (int hora = 0; hora < 24; hora++) {
			double presion, temp;
			presion = presHora();
			temp = tempHora();
			// escribe según la estructura de cada registro
			snb.writeInt(hora);
			snb.writeDouble(presion);
			snb.writeDouble(temp);
		}

		snb.close();

	}

	static void leer() {
		String dia;
		double mxt = -11.0; // valor mínimo para encontrar máximo
		FileInputStream f;
		DataInputStream obfl = null;
		try 
		{
			f = new FileInputStream("nube.dat");
			obfl = new DataInputStream(f);
		} 
		catch (IOException io) 
		{
			System.out.println("Anomalía al crear flujo de entrada, " + io.getMessage());
			return; // termina la ejecución
		}
		// proceso del flujo
		try 
		{
			int hora;
			boolean mas = true;
			double p, temp;
			dia = obfl.readUTF();
			System.out.println(dia);
			while (mas) 
			{
				hora = obfl.readInt();
				p = obfl.readDouble();
				temp = obfl.readDouble();
				System.out.println("Hora: " + hora + "\t Presión: " + p + "\t Temperatura: " + temp);
				mxt = Math.max(mxt, temp);
			}
		} 
		catch (EOFException eof) {
			System.out.println("Fin de lectura del archivo.\n");
		} 
		catch (IOException io) {
			System.out.println("Anomalía al leer flujo de entrada, " + io.getMessage());
			return; // termina la ejecución
		} 
		finally {
			try {
				obfl.close();
			} catch (IOException er) {
				er.printStackTrace();
			}
		}
		// termina el proceso, escribe la temperatura máxima
		System.out.println("\n La temperatura máxima: " + (float) mxt);
	}

	static private double presHora() {
		final double PREINF = 680.0;
		final double PRESUP = 790.0;
		return (Math.random() * (PRESUP - PREINF) + PREINF);
	}

	static private double tempHora() {
		final double TEMINF = 5.0;
		final double TEMSUP = 40.0;
		return (Math.random() * (TEMSUP - TEMINF) + TEMINF);
	}
}
