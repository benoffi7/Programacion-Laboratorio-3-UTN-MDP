package clase_envoltorio;

import exepciones.ContactoNoExiste;
import exepciones.NombreVacio;
import modelo.Contacto;

import java.util.TreeMap;

public class Libreta
{
    private TreeMap<String, Contacto> contactoTreeMap;
    private int cantidadDeContactos;

    public Libreta()
    {
        contactoTreeMap = new TreeMap<>();
        cantidadDeContactos = 0;
    }

    public void agregar(Contacto contacto)
    {
        contactoTreeMap.put(contacto.getNombre(),contacto);
        contactoTreeMap.put(contacto.getTelefono(),contacto);

        cantidadDeContactos++;
    }

    public Contacto buscarContacto(String key) throws ContactoNoExiste, NombreVacio
    {
        if (key.isEmpty())
        {
            throw new NombreVacio("Ingresa un nombre rey/reina");
        }
        Contacto c ;
        if (contactoTreeMap.containsKey(key))
        {
            c = contactoTreeMap.get(key);
        }
        else
        {
            throw new ContactoNoExiste("Contacto no existe");
        }
        return c;
    }

    public int getCantidadDeContactos()
    {
        return cantidadDeContactos;
    }

    private TreeMap<String, Contacto> getContactoTreeMap() {
        return contactoTreeMap;
    }

    private void setContactoTreeMap(TreeMap<String, Contacto> contactoTreeMap) {
        this.contactoTreeMap = contactoTreeMap;
    }
}
