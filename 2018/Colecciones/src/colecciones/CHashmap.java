package colecciones;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CHashmap 
{
	private HashMap<String,String> hashmap;
	
	public CHashmap() 
	{
		hashmap = new HashMap<String,String>();
	}
	
	public void agregar(String clave, String valor)
	{
		hashmap.put(clave, valor);
	}
	
	public String eliminar(String clave)
	{
		return hashmap.remove(clave);
	}
	
	public int cantidad()
	{
		return hashmap.size();
	}
	
	public void recorer()
	{
		Iterator iterator = hashmap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry entrada = (Map.Entry)iterator.next();
			System.out.println("clave: "+entrada.getValue()+" valor: "+entrada.getValue());
		}
	}
	
	public String obtenerValor(String clave)
	{
		return hashmap.get(clave);
	}
}
