import java.io.IOException;

public class Main {

	public static void main(String[] args) 
	{
		CopiaArchivos.copiaArchivos();
		
		try 
		{
			Data.escribir();
			Data.leer();
			DataObjectos.escribir();
			Casa oCasa = DataObjectos.leer();
			System.out.println(oCasa.direccion);
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
