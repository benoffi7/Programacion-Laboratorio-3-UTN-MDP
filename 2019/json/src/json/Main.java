package json;

import java.io.StringWriter;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import clases.Direccion;
import clases.Persona;
import jdk.nashorn.internal.parser.JSONParser;

public class Main {

	public static void main(String[] args)
	{
		/*
		try
		{
			JSONArray arreglito= new JSONArray(JsonUtiles.leer());
			System.out.println(arreglito.length());
		
			for (int i = 0 ; i< arreglito.length();i++)
			{
				Persona persona = new Persona();
				
				JSONObject jsonObject = arreglito.getJSONObject(i);
				System.out.println(jsonObject.getString("picture"));
				JSONObject objName = jsonObject.getJSONObject("name");
				System.out.println(objName.getString("first"));
				persona.setNombre(objName.getString("first"));
				JSONArray tags = jsonObject.getJSONArray("tags");
				for (int j=0;j<tags.length();j++)
				{
					String tag = tags.getString(j);
					System.out.println(tag);
				}
				JSONArray amigos = jsonObject.getJSONArray("friends");
				for (int j=0;j<amigos.length();j++)
				{
					JSONObject amigo = amigos.getJSONObject(j);
					System.out.println(amigo.getString("name"));
				}
			}

		}
	*/
		try
		{
		
		ArrayList<Persona>personas = new ArrayList<>();
		
		Persona p1 = new Persona("gonzalo", 30);
		p1.addDireccion(new Direccion("salta", 123));
		p1.addDireccion(new Direccion("independencia", 1150));
		
		Persona p3 = new Persona("adrian", 30);
		p3.addDireccion(new Direccion("catamarca", 453));
		
		personas.add(p1);
		personas.add(p3);
		
		//---------------------------------------
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("cantidad", personas.size());
		jsonObject.put("pepe", "gonzalo");
		JSONArray jsonArray = new JSONArray();
		for (Persona persona : personas)
		{
			//JSONObject jsonObject = new JSONObject();
			//jsonObject.put("edad", persona.getEdad());
			jsonArray.put(persona.getFormatoJSON());
		}
		jsonObject.put("personas", jsonArray);
		String salida = jsonObject.toString();
		System.out.println(salida);
	}
		
		catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	
	static void levantarJSON() throws JSONException
	{
		String respuesta = ejemplo_arreglo_dos();
		//JSONObject jsonObject = new JSONObject(respuesta); NO FUNCIONA 
		
		JSONArray array = new JSONArray(respuesta);
		for (int i = 0;i<array.length();i++)
		{
			JSONObject jsonObject =array.getJSONObject(i);
			System.out.println(jsonObject.getInt("edad"));
			System.out.println(jsonObject.getDouble("altura"));
			System.out.println(jsonObject.getBoolean("trabaja"));
			System.out.println(jsonObject.getString("nombre"));
			
			JSONArray object_tel = jsonObject.getJSONArray("telefonos");
			for (int z = 0;z<object_tel.length();z++)
			{
				JSONObject jsonObject2 = object_tel.getJSONObject(z);
				System.out.println(jsonObject2.getString("numero"));
			}
			
			JSONObject object_direccion = jsonObject.getJSONObject("direccion");
			System.out.println(jsonObject.getString("calle"));
			System.out.println("---------------------------");
			
		}
		
	}
	
	static void ejemplo_json() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", "gonzalo");
		jsonObject.put("edad", 29);
		jsonObject.put("trabaja", true);
		jsonObject.put("altura", 1.88);
		System.out.println(jsonObject);
		//{"altura":1.88,"trabaja":true,"nombre":"gonzalo","edad":29}

	}
	
	static void ejemplo_obj_cuadrado() throws JSONException
	{
		JSONObject jsonObjectDireccion = new JSONObject();
		jsonObjectDireccion.put("calle", "calle falsa");
		jsonObjectDireccion.put("numero", "123");
		jsonObjectDireccion.put("ciudad", "MDP");
		
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", "gonzalo");
		jsonObject.put("edad", 29);
		jsonObject.put("trabaja", true);
		jsonObject.put("altura", 1.88);
		jsonObject.put("direccion", jsonObjectDireccion);
		System.out.println(jsonObject);
		
		//{"altura":1.88,"direccion":{"numero":"123","ciudad":"MDP","calle":"calle falsa"},"trabaja":true,"nombre":"gonzalo","edad":29}
	}
	
	static void ejemplo_obj_cubo() throws JSONException
	{
		JSONArray array = new JSONArray();
		array.put(true);
		array.put(1);
		array.put("pepe");
		
		JSONObject jsonObjectDireccion = new JSONObject();
		jsonObjectDireccion.put("calle", "calle falsa");
		jsonObjectDireccion.put("numero", "123");
		jsonObjectDireccion.put("ciudad", "MDP");
		
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", "gonzalo");
		jsonObject.put("edad", 29);
		jsonObject.put("trabaja", true);
		jsonObject.put("altura", 1.88);
		jsonObject.put("direccion", jsonObjectDireccion);
		jsonObject.put("arreglo", array);
		System.out.println(jsonObject);
		
		//{"altura":1.88,"direccion":{"numero":"123","ciudad":"MDP","calle":"calle falsa"},"trabaja":true,"arreglo":[true,1,"pepe"],"nombre":"gonzalo","edad":29}

	}
	
	static JSONObject ejemplo_obj_4() throws JSONException
	{
		JSONArray array = new JSONArray();
		
		JSONObject telefono1 = new JSONObject();
		telefono1.put("numero", "123");
		
		JSONObject telefono2 = new JSONObject();
		telefono2.put("numero", "456");
		
		JSONObject telefono3 = new JSONObject();
		telefono3.put("numero", "789");
		
		array.put(telefono1);
		array.put(telefono2);
		array.put(telefono3);
		
		JSONObject jsonObjectDireccion = new JSONObject();
		jsonObjectDireccion.put("calle", "calle falsa");
		jsonObjectDireccion.put("numero", "123");
		jsonObjectDireccion.put("ciudad", "MDP");
		
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", "gonzalo");
		jsonObject.put("edad", 29);
		jsonObject.put("trabaja", true);
		jsonObject.put("altura", 1.88);
		jsonObject.put("direccion", jsonObjectDireccion);
		jsonObject.put("telefonos", array);
		//System.out.println(jsonObject);
		
		//{"altura":1.88,"direccion":{"numero":"123","ciudad":"MDP","calle":"calle falsa"},"trabaja":true,"telefonos":[{"numero":"123"},{"numero":"456"},{"numero":"789"}],"nombre":"gonzalo","edad":29}
		
		return jsonObject;

	}
	
	static void ejemplo_arreglo()
	{
		JSONArray array = new JSONArray();
		array.put(1);
		array.put(2);
		array.put(3);
		array.put(4);
		
		//System.out.println(array);
		
		//[1,2,3,4]

	}
	
	static String ejemplo_arreglo_dos() throws JSONException
	{
		JSONArray array = new JSONArray();
		for (int i =0 ;i<3;i++)
		{
			array.put(ejemplo_obj_4());
		}
		
		System.out.println(array);
		
		//[{"altura":1.88,"direccion":{"numero":"123","ciudad":"MDP","calle":"calle falsa"},"trabaja":true,"telefonos":[{"numero":"123"},{"numero":"456"},{"numero":"789"}],"nombre":"gonzalo","edad":29},{"altura":1.88,"direccion":{"numero":"123","ciudad":"MDP","calle":"calle falsa"},"trabaja":true,"telefonos":[{"numero":"123"},{"numero":"456"},{"numero":"789"}],"nombre":"gonzalo","edad":29},{"altura":1.88,"direccion":{"numero":"123","ciudad":"MDP","calle":"calle falsa"},"trabaja":true,"telefonos":[{"numero":"123"},{"numero":"456"},{"numero":"789"}],"nombre":"gonzalo","edad":29}]

		return array.toString();
	}
	
	static void levantar() throws JSONException
	{
		String respuesta = ejemplo_arreglo2();
		JSONObject jsonObject = new JSONObject(respuesta);
		System.out.println(jsonObject.getInt("cantidad"));
		//JSONObject jsonObject2 = jsonObject.getJSONObject("arreglo");
		JSONArray array = jsonObject.getJSONArray("arreglo");
		for (int i =0 ;i<array.length();i++)
		{
			JSONObject obj = array.getJSONObject(i);
			System.out.println(obj.getString("nombre"));
			System.out.println(obj.getString("sueldo"));
		}
	}
	
	static void ejemplo_arreglo1()
	{
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(true);
		jsonArray.put(false);
		jsonArray.put(1);
		System.out.println(jsonArray.toString());
	}
	
	static String ejemplo_arreglo2() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		for (int i =0;i<3;i++)
		{
				jsonArray.put(ejemplo_obj());
		}
		jsonObject.put("arreglo", jsonArray);
		jsonObject.put("cantidad", jsonArray.length());
		//System.out.println(jsonObject);
		return jsonObject.toString();
	}
	
	static void ejemplo_obj_obj() throws JSONException
	{
		JSONObject jsonObject_pais = new JSONObject();
		jsonObject_pais.put("nombre", "argentina");
		jsonObject_pais.put("codigo", "123");
		
		JSONObject jsonObject_direccion = new JSONObject();
		jsonObject_direccion.put("calle", "Calle falsa");
		jsonObject_direccion.put("numero", "123");
		jsonObject_direccion.put("ciudad", "xxx");
		jsonObject_direccion.put("pais", jsonObject_pais);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", "gonzalo");
		jsonObject.put("edad", 29);
		jsonObject.put("trabaja", true);
		jsonObject.put("altura", 1.88);
		jsonObject.put("direccion", jsonObject_direccion);
		System.out.println(jsonObject.toString());
	}
	
	static JSONObject ejemplo_obj() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", "gonzalo");
		jsonObject.put("edad", 29);
		jsonObject.put("trabaja", true);
		jsonObject.put("altura", 1.88);
		//System.out.println(jsonObject.toString());
		JSONObject jsonObject_pais = new JSONObject();
		jsonObject_pais.put("nombre", "argentina");
		jsonObject_pais.put("codigo", "123");
		
		JSONObject jsonObject_direccion = new JSONObject();
		jsonObject_direccion.put("calle", "Calle falsa");
		jsonObject_direccion.put("numero", "123");
		jsonObject_direccion.put("ciudad", "xxx");
		jsonObject_direccion.put("pais", jsonObject_pais);
		
		jsonObject.put("dir", jsonObject_direccion);
		return jsonObject;
		
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
