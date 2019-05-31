package clases;

import org.json.JSONException;
import org.json.JSONObject;

public class Direccion {
	private String calle;
	private int numero;

	public Direccion(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}

	public String getDireccion() {
		return calle + numero;
	}

	public JSONObject getFormatoJSON() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("numero", numero);
		jsonObject.put("calle", calle);
		return jsonObject;
	}

}
