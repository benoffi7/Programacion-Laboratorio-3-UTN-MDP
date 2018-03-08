import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataObjectos 
{
	static void escribir() throws IOException 
	{
		FileOutputStream bn = new FileOutputStream("datosRac.dat");
		ObjectOutputStream fobj = new ObjectOutputStream(bn);
		Casa oCasa = new Casa(4,"Calle Falsa 123");
		fobj.writeObject(oCasa);
		fobj.close();
	}
	
	static Casa leer() throws IOException, ClassNotFoundException 
	{
		FileInputStream bn = new FileInputStream("datosRac.dat");
		ObjectInputStream fobj = new ObjectInputStream (bn);
		Casa oCasa = (Casa) fobj.readObject();	
		fobj.close();
		return oCasa;
	}
}
