import clase_envoltorio.Libreta;
import exepciones.ContactoNoExiste;
import exepciones.NombreVacio;
import modelo.Contacto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Libreta libreta = new Libreta();
        libreta.agregar(new Contacto("gaston","123"));

        ArrayList<String>stringArrayList = new ArrayList<>();
       // stringArrayList.get(1000);

        try
        {
            Contacto c = libreta'09,buscarContacto("gonzalo");
            System.out.println(c.toString());
        }

        catch (ContactoNoExiste e)
        {
            System.out.println(e.getMessage());
        }
        catch (NombreVacio e)
        {
            e.sendToServer();
        }
        catch (Exception exception)
        {
            System.out.println("Reinicia");
        }
        finally
        {
            System.out.println("FIN");
        }
    }
}