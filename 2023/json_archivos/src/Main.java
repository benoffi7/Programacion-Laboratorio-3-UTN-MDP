import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        /*
        String jsonResponse = JsonUtiles.leer("xboxgames");
        try
        {
            JSONArray jsonArray = new JSONArray(jsonResponse);
            for (int i=0;i<jsonArray.length();i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                System.out.println("ID "+ jsonObject.getInt("id"));
                System.out.println("NAME: "+jsonObject.getString("name"));
                JSONArray ja_genre = jsonObject.getJSONArray("genre");
                System.out.println("GENEROS: ");
                for (int j=0;j<ja_genre.length();j++ )
                {
                    String genero = ja_genre.getString(j);
                    System.out.println(genero);
                }

                JSONArray ja_developers = jsonObject.getJSONArray("developers");
                System.out.println("developers: ");
                for (int j=0;j<ja_developers.length();j++ )
                {
                    String developer = ja_developers.getString(j);
                    System.out.println(developer);
                }

                System.out.println("Fechas de lanzamiento");
                JSONObject jo_releaseDates = jsonObject.getJSONObject("releaseDates");
                System.out.println("Japan :"+jo_releaseDates.getString("Japan"));
                System.out.println("NorthAmerica: "+jo_releaseDates.getString("NorthAmerica"));
                System.out.println("Europe: "+jo_releaseDates.getString("Europe"));
                System.out.println("Australia: "+jo_releaseDates.getString("Australia"));

                System.out.println();
            }


        }catch (JSONException ex)
        {
            System.out.println("JSON mal formado");
        }

         */

        Persona persona = new Persona();
        persona.setNombre("Gonzalo");

        JSONArray jsonArray = new JSONArray();
        JSONObject jo_persona = new JSONObject();
        try
        {
            jo_persona.put("nombre",persona.getNombre());
            jsonArray.put(jo_persona);
           // System.out.println(jo_persona.toString());
            JsonUtiles.grabar(jo_persona,"persona");
            JsonUtiles.grabar(jsonArray,"personas");
        }
        catch (JSONException ex)
        {
            System.out.println("clave nula o valor infinito");
        }
    }
}