package jsontest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) 
	{
		try
		{
			JSONObject jo = new JSONObject();
			jo.put("Nombre", "Varela");
			jo.put("Edad", 21);
			jo.put("Cafe", true);
			System.out.println(jo.toString());
			
			
			
			JSONObject telefono1 = new JSONObject();
			telefono1.put("Telefono", "4797509");
			
			JSONObject telefono2 = new JSONObject();
			telefono2.put("Telefono", "4976800");
			
			JSONArray telefonos = new JSONArray();
			telefonos.put(telefono1);
			telefonos.put(telefono2);
			
			jo.put("Telefonos", telefonos);
			
			JSONObject prueba = new JSONObject(jo.toString());
			System.out.println(prueba.getString("Nombre"));
			
			JSONArray arreglo = prueba.getJSONArray("Telefonos");
			for(int i = 0; i<arreglo.length(); i++)
			{
				JSONObject obj = arreglo.getJSONObject(i);
				System.out.println(obj.getString("Telefono"));
			}
			
			
			
		}
		catch(JSONException ex)
		{
			ex.printStackTrace();
		}

	}

}
