package pakej;

import java.util.HashMap;

/**
 * Lista
 */
public class Lista {
    private HashMap<Password, Boolean> lista;

    public Lista() {
        lista = new HashMap<Password, Boolean>();
    }

    public Lista(int cant) {
        lista = new HashMap<Password, Boolean>(cant);
    }

    public void addPswrd(Password contraseña) {

        boolean bulean = false;

        if (contraseña.esFuerte()) {
            bulean = true;
        }
        lista.put(contraseña, bulean);

    }

    public int size() {
        return lista.size();
    }

    public String mostrar() {
        StringBuffer buffer = new StringBuffer();

        for (Password pswrds : lista.keySet()) {
            buffer.append("\n"+pswrds.getContraseña());

            if(lista.get(pswrds) == true) {
                buffer.append(" - Es fuerte");
            }else{
                buffer.append(" - Es debil");
            }
        }
            

        return buffer.toString();
    }

}