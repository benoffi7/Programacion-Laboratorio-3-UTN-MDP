package json;

import java.io.StringWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jdk.nashorn.internal.parser.JSONParser;

public class Main {

	public static void main(String[] args) 
	{
		try 
		{
			ejemplo1();
			System.out.println();
			ejemplo2();
			System.out.println();
			ejemplo3();
			System.out.println();
			ejemplo4();
		} 
		catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pruebas();
	
	}
	
	static void ejemplo1() throws JSONException
	{
		JSONObject obj = new JSONObject();

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.print(obj);
	}
	
	static void ejemplo2() throws JSONException
	{
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i<10; i++)
		{
	      jsonArray.put(new Integer(i));
     
		}
		 System.out.print(jsonArray);
	}
	
	static void ejemplo3() throws JSONException
	{
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i<10; i++)
		{
			JSONObject obj = new JSONObject();

		      obj.put("name", "foo");
		      obj.put("num", new Integer(100));
		      obj.put("balance", new Double(1000.21));
		      obj.put("is_vip", new Boolean(true));
	      jsonArray.put(obj);
     
		}
		 System.out.print(jsonArray);
	}
	
	
	
	static void ejemplo4()
	{
		try
		{
		
			JSONArray arreglo = new JSONArray();
			
			for (int i = 0; i<5;i++)
			{
				JSONObject objeto = new JSONObject();
				objeto.put("pos", "POS"+i);
				objeto.put("valor", i+1);	
					JSONObject objetoInterno = new JSONObject();
					objetoInterno.put("clave", i*2);
					objetoInterno.put("clave2", i*4);
					objeto.put("objetoInterno", objetoInterno);
				//System.out.println(objeto.toString());
				arreglo.put(objeto);
			}
			
			System.out.println(arreglo);

			
			
			
			for (int i = 0; i<arreglo.length();i++)
			{
				JSONObject jsonObject = arreglo.getJSONObject(i);
				System.out.println(jsonObject.toString());
				System.out.println();
				System.out.println(jsonObject.getInt("valor"));
			}
			
			
			//System.out.println(arreglo.toString());
			
			JsonUtiles.grabar(arreglo);
			JsonUtiles.leer();
			
		
			
			
			
		}
		catch (JSONException e) 
		{
			e.printStackTrace();
		}
	}

}
