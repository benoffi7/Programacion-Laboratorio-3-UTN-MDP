import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) 
	{
		//ejemplo de constructores
		File miFichero = new File("C:\\LIBRO\\Almacen.dat");
		File otro = new File("COCINA", "Enseres.dat");
		//listar un directorio
		Directorio.listar("C:\\prueba");
		//pruebas
		
		FileOutputStream f = null;
				try
				{
					f = new FileOutputStream("pepe.dat");
					
				}
					
				catch (FileNotFoundException e1) 
				{
							// TODO Auto-generated catch block
							e1.printStackTrace();
				}
				finally 
				{
					try
					{
						f.close();
					} 
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
			
		
		//copiar
		CopiaArchivo.copiar();
		//---------------------------Data
		FileInputStream gs = null;
		try 
		{
			gs = new FileInputStream("nube.dat");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// -------------------------Data v2
		try 
		{
			DataInputStream ent = new DataInputStream(gs);
			DataInputStream entV2 = new DataInputStream(new FileInputStream("nube.dat"));
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//---------Temperaturas
		Temperatura.escribir();
		Temperatura.leer();
		//---guardar objetos
		FileOutputStream bn;
		FileInputStream fi;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try 
		{
			bn = new FileOutputStream("theBeatles.dat");
			oos= new ObjectOutputStream(bn);
			

			oos.writeObject(new Beatle("Paul"));
			oos.writeObject(new Beatle("John"));
			oos.writeObject(new Beatle("George"));
			oos.writeObject(new Beatle("Ringo"));
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try 
		{
			fi = new FileInputStream("theBeatles.dat");
			ois = new ObjectInputStream(fi);
			Beatle beatle;
			while ((beatle = (Beatle) ois.readObject())!=null)
			{
				System.out.println(beatle);
			}

		}
		catch (EOFException ex)
		{
			System.out.println("fin del archivo");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
