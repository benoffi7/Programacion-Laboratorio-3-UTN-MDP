package clases;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Persona 
{
	private String nombre;
	private int edad;
	ArrayList<Direccion>direccions;
	/*
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	*/
	
	public void addDireccion(Direccion direccion)
	{
		direccions.add(direccion);
	}
	
	public int getEdad() {
		return edad;
	}
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		direccions = new ArrayList<>();
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public JSONObject getFormatoJSON() throws JSONException
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("edad", getEdad());
		jsonObject.put("nombre",getNombre());
		JSONArray jsonArray_direcciones = new JSONArray();
		for (Direccion direccion : direccions)
		{
			/* MAAAAAAAAAAAAAL
			JSONObject object = new JSONObject();
			object.put("calle", direccion.getCalle());
			object.put("numero", direccion.getNumero());
			jsonArray_direcciones.put(object);
			*/
			jsonArray_direcciones.put(direccion.getFormatoJSON());
		}
		jsonObject.put("direcciones", jsonArray_direcciones);
		return jsonObject;
	}
	
}
