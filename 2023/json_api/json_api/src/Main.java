import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {


        System.out.println(ConsumoAPI.getInfo());

       // origin":{"name":"Earth (C-137)","url":"https://rickandmortyapi.com/api/location/1"}

        ArrayList<Personaje> personajeArrayList2 = new ArrayList<>();
        try
        {

            JSONObject jsonObject = new JSONObject(ConsumoAPI.getInfo());

            //int count = jsonObject.getJSONObject("info").getInt("count");

            JSONObject object_info = jsonObject.getJSONObject("info");
            //int count = object_info.getInt("count");
            JSONArray jsonArray_results = jsonObject.getJSONArray("results");
            for (int i=0;i<jsonArray_results.length();i++)
            {
                JSONObject object_elemento = jsonArray_results.getJSONObject(i);
                JSONArray jsonArray_episode = object_elemento.getJSONArray("episode");
                for (int j = 0;j<jsonArray_episode.length();j++)
                {
                    String s = jsonArray_episode.getString(j);
                   // System.out.println(s+"\n");
                }

                JSONObject object_origin = object_elemento.getJSONObject("origin");

                Origin origin = new Origin();
                origin.setName(object_origin.getString("name"));
                origin.setUrl(object_origin.getString("url"));

                Personaje personaje = new Personaje();
                personaje.setOrigin(origin);
                personaje.fromJSON(object_elemento);
                personajeArrayList2.add(personaje);
            }
            //System.out.println(count);
            System.out.println(personajeArrayList2);

        }
        catch (JSONException e)
        {
            System.out.println("JSON mal procesado o fuente incorrecta "+e.getMessage());
        }



        Origin origin = new Origin();
        origin.setUrl("url");
        origin.setName("name_origin");

        Personaje personaje = new Personaje(1,"gonzalo");
        personaje.setOrigin(origin);
        Personaje personaje2 = new Personaje(2,"gaston");
        personaje2.setOrigin(origin);

        ArrayList<Personaje> personajeArrayList = new ArrayList<>();
        personajeArrayList.add(personaje);
        personajeArrayList.add(personaje2);


        try
        {
            JSONArray jsonArray = new JSONArray();
            for (Personaje p : personajeArrayList)
            {
                jsonArray.put(p.toJSON());
            }
            System.out.println(jsonArray.toString());
        }
        catch (JSONException exception)
        {
            System.out.println(exception.getMessage());
        }

    }
}