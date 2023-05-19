import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConsumoAPI.getInfo());
        try
        {
            JSONObject jsonObject = new JSONObject(ConsumoAPI.getInfo());
            System.out.println(jsonObject.getJSONObject("info").getInt("count"));
        } catch (JSONException e) {
            System.out.println("JSON mal procesado o fuente incorrecta");
        }
    }
}