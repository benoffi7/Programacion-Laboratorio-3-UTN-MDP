package genericos_com2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja caja = new Caja();
		caja.agregar(new Caramelo());
		caja.agregar(new Caramelo());
		caja.agregar(new Caramelo());
		
		caja.agregar(new Perro());
		caja.agregar(new Perro());
		caja.agregar(new Perro());
		
		caja.agregar(new String("hola"));
			
		
		CajaV3<Caramelo>cajaV3_1=new CajaV3<>();
		cajaV3_1.agregar(new Caramelo());
		//cajaV3_1.agregar(new Perro());
		
		CajaV3<Perro>cajaV3_2 = new CajaV3<>();
		cajaV3_2.agregar(new Perro());
		//cajaV3_2.agregar(new Caramelo());
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("gonzalo");
		//arrayList.add(true);
		
		ArrayList<Boolean>arrayList2 = new ArrayList<>();
		arrayList2.add(true);
		//arrayList2.add("gonzalo");
		
		
		Inventario<Integer> inventario = new Inventario<>();
		inventario.setOtroElemento(new Integer(10));
		Integer a = inventario.getOtroElemento();
		
		Mapa<String,Boolean,Caramelo,Perro>mapa=new Mapa<String, Boolean, Caramelo, Perro>(new String("gonzalo"), true, new Caramelo(), new Perro());
		
		//mapa.getUnaVariable()
		
		nombreMetodo("gonzalo");
		nombreMetodo(true);
		
		System.out.println(1);
		System.out.println("a");
		
		Comparador<Perro, Caramelo> comparador = new Comparador<Perro, Caramelo>();
		
		//ClaseGenerica<Caramelo> claseGenerica = new ClaseGenerica<>();
		ClaseGenerica<PerroSalchicha> claseGenerica2 = new ClaseGenerica<>();
		
		
		//sumar(2,3);
		//sumar(4,5);
	}
	
	public static <T,K,S,U> T nombreMetodo(T unaVarible)
	{
		S ese;
		return unaVarible;
	}
	
	public static <T extends Comparable> int compararUno(T uno, T dos)
	{
		return uno.compareTo(dos);
	}
	
	
	public static int compararDos(Comparable uno, Comparable dos)
	{
		return uno.compareTo(dos);
	}
	
	
	/*
	public static int sumar(int a, int b)
	{
		return a+b;
	}
	
	public static int sumar(CajaDeTomate a, CajaDeTomate b)
	{
		return a+b;
	}
	
	public static int sumar(??? a, ??? b)
	{
		return a+b;
	}
	
	


*/
}
