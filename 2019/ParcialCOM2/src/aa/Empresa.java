package aa;

import java.util.ArrayList;

public class Empresa 
{
	private ArrayList<Producto> productos;
	
	public Empresa() 
	{
		super();
		productos = new ArrayList<>();
	}
	
	/*

	 NO DEBERIAN IR
	 
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	* 
	 */
	
	/**
	 * 
	 * @param producto cualquier cosa que herede de la clase Producto
	 * @return
	 */
	public boolean agregarProducto(Producto producto)
	{
		boolean rta = false;
		//verificar codigo interno
		if (verificacionDeCodigo(producto))
		{
			productos.add(producto);
			rta = true;
		}
		return rta;
	}
	
	/**
	 * 
	 * @param producto
	 * @return falso si el producto ESTA en el arreglo
	 */
	public boolean verificacionDeCodigo(Producto producto)
	{
		if (productos.contains(producto)) return false;
		else return true;
	}
	
	/**
	 * 
	 * @param tipoElegido 1-para los frescos 2-para los congelados 3-refrigerados
	 * @return una cantidad
	 */
	public int contarCantidadPorTipo(int tipoElegido)
	{
		int contador = 0;
		for (Producto producto : productos)
		{
			if ((tipoElegido == 1) && ( producto instanceof ProductoFresco))
			{
				contador ++;	
			//contador = contador = 1;
			}
			else
			if ((tipoElegido == 2) && (producto instanceof ProductoCongelado))
			{
				contador ++;
			}
			else
			if ((tipoElegido == 3) && (producto instanceof ProductoRefrigerado))
			{
				contador++;
			}
		}
		return contador;
	}
	
	public int contarCongelados()
	{
		int contador = 0;
		for (Producto producto : productos)
		{
			if (producto instanceof ProductoCongelado)
			{
				contador++;
			}
		}
		return contador;
	}
	
	public int contarFrescos()
	{
		int contador = 0;
		for (Producto producto : productos)
		{
			if (producto instanceof ProductoFresco)
			{
				contador++;
			}
		}
		return contador;
	}
	
	public int contarRefrigerados()
	{
		int contador = 0;
		for (Producto producto : productos)
		{
			if (producto instanceof ProductoRefrigerado)
			{
				contador++;
			}
		}
		return contador;
	}
	
	public String mostrarTodo()
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (Producto producto : productos)
		{
			stringBuilder.append(producto.toString());
		}
		return stringBuilder.toString();
	}
	
	public String mostrarTodo2()
	{
		String choclo = "";
		for (Producto producto : productos)
		{
			//choclo += producto.toString();
			choclo.concat(producto.toString());
		}
		return choclo;
	}
	
	public String mostrarPorTipo(int tipo)
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (Producto producto : productos)
		{
			if ((tipo == 1) &&  (producto instanceof ProductoFresco))
			{
				stringBuilder.append(producto.toString());	
			}	
			else
			if ((tipo == 2) &&  (producto instanceof ProductoRefrigerado))
			{
				stringBuilder.append(producto.toString());	
			}	
			else
			if ((tipo == 3) &&  (producto instanceof ProductoCongelado))
			{
				stringBuilder.append(producto.toString());	
			}	
		}
		return stringBuilder.toString();
	}
	
	public String mostrarFrescos()
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (Producto producto : productos)
		{
			if (producto instanceof ProductoFresco)
			{
				stringBuilder.append(producto.toString());	
			}		
		}
		return stringBuilder.toString();
	}
	
	public String mostrarCongelados()
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (Producto producto : productos)
		{
			if (producto instanceof ProductoCongelado)
			{
				stringBuilder.append(producto.toString());	
			}		
		}
		return stringBuilder.toString();
	}
	
	public String mostrarRefrigerado()
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (Producto producto : productos)
		{
			if (producto instanceof ProductoRefrigerado)
			{
				stringBuilder.append(producto.toString());	
			}		
		}
		return stringBuilder.toString();
	}
	
	
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return mostrarPorTipo(1) + mostrarPorTipo(2) + mostrarPorTipo(3);
		//return mostrarFrescos() + mostrarCongelados() + mostrarRefrigerado();
	}
}
