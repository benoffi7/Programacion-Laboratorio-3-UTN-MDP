import java.io.*;
import java.util.ArrayList;

public class ControladoraArchivosObjetos
{
    public static void grabar(ArrayList<Persona>personaArrayList)
    {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try
        {
            fileOutputStream = new FileOutputStream("personas.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Persona persona : personaArrayList)
            {
                objectOutputStream.writeObject(persona);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();

                if (objectOutputStream != null)
                    objectOutputStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    public static ArrayList<Persona> leer()
    {
        ArrayList<Persona>personaArrayList = new ArrayList<>();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try
        {
            fileInputStream = new FileInputStream("personas.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true)
            {
                Persona aux = (Persona) objectInputStream.readObject();
                personaArrayList.add(aux);
            }
        }
        catch (EOFException ex)
        {
            System.out.println("FIN de ARCHIVO");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if (fileInputStream!=null)
                    fileInputStream.close();

                if (objectInputStream!=null)
                    objectInputStream.close();
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }

        }

        return personaArrayList;
    }
}
