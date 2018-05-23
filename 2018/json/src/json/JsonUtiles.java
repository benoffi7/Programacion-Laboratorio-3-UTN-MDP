package json;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;


public class JsonUtiles {
	public static void grabar(JSONArray array) {
		try {
			FileWriter file = new FileWriter("test1.json");
			file.write(array.toString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leer() 
	{
		try 
		{
			String contenido = new String(Files.readAllBytes(Paths.get("test.json")));
			JSONArray array = new JSONArray(contenido);
			
			System.out.println(array.getJSONObject(3).getJSONObject("name").getString("first"));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	
	}
}
