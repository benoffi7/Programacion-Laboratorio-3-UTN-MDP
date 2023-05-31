import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * @author gonzalobenoffi
 * @since 2023
 * @version 1.0
 */
public class ControladoraJSON
{
    /**
     * Este metodo leer el archivo rick.json y lo codifica a la clase Personaje
     * @return la lista de personajes del archivo
     * @since 2023
     */
    public static ArrayList<Personaje>  leerArchivo()
    {
        String json_response = JsonUtiles.leer("rick");

        ArrayList<Personaje> personajeArrayList = new ArrayList<>();
        try
        {
            JSONObject jsonObject = new JSONObject(json_response);
            JSONArray ja_results = jsonObject.getJSONArray("results");
            for (int i = 0; i<ja_results.length();i++)
            {
                JSONObject jsonObject_arreglo = ja_results.getJSONObject(i);
                Personaje personaje = new Personaje();
                personaje.setName(jsonObject_arreglo.getString("name"));
                personaje.setId(jsonObject_arreglo.getInt("id"));
                personajeArrayList.add(personaje);

            }
           // System.out.println(personajeArrayList);

        }
        catch (JSONException exception)
        {
            System.out.println("JSON mal formado "+exception.getMessage());
        }
        return personajeArrayList;
    }

    /**
     * Graba en un archivo JSON los personajes
     * @param personajeArrayList - una lista de personajes
     */
    public static void grabarEnJSON(ArrayList<Personaje> personajeArrayList)
    {
        try
        {
            JSONArray jsonArray = new JSONArray();
            for (Personaje p : personajeArrayList)
            {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", p.getName());
                jsonObject.put("id",p.getId());
                jsonArray.put(jsonObject);
            }
            System.out.println(jsonArray.toString());
            JsonUtiles.grabar(jsonArray,"miArchivo");
        }
        catch (JSONException ex)
        {
            System.out.println("Me estas mandando un null como clave");
        }
    }
}
