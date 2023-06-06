import java.io.*;

public class ControladoraArchivosPrimitivos
{
    public static void grabarDatos()
    {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;

        try
        {
            fileOutputStream = new FileOutputStream("datosPrimitivos.dat");
            dataOutputStream = new DataOutputStream(fileOutputStream);

            for (int i=0;i<5;i++)
            {
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF("registro #"+(i+1));
                dataOutputStream.writeBoolean(true);
            }

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if (fileOutputStream!=null)
                                fileOutputStream.close();

                if (dataOutputStream!=null)
                                dataOutputStream.close();
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }

        }
    }



    public static void leerDatos()
    {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        try
        {
            fileInputStream = new FileInputStream("datosPrimitivos.dat");
            dataInputStream = new DataInputStream(fileInputStream);

            while (true)
            {

                int unEntero = dataInputStream.readInt();
                String unString = dataInputStream.readUTF();
                boolean unBool = dataInputStream.readBoolean();

                System.out.println(unEntero + " "+unString+ " "+unBool );

                System.out.println();

            }
        }
        catch (EOFException ex)
        {
            System.out.println("FIN del archivo");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if (fileInputStream!=null)
                    fileInputStream.close();

                if (dataInputStream!=null)
                    dataInputStream.close();
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
            }

        }
    }
}
