package CORRALON;

import java.util.ArrayList;

public class Empresa extends Cliente{
	
	
	private String cuit;
	private static double descuento=0.1;
	private ArrayList<IVA>listaIVA;

	public Empresa(int id, String nombre, String apellido, String fechaNac, String tel, String dni, String cuit) {
		super(id, nombre, apellido, fechaNac, tel, dni);
		this.cuit = cuit;
	}
	
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public static double getDescuento() {
		return descuento;
	}
	public static void setDescuento(double descuento) {
		Empresa.descuento = descuento;
	}
	
	public ArrayList<IVA> getListaIVA() {
		return listaIVA;
	}

	public void setListaIVA(ArrayList<IVA> listaIVA) {
		this.listaIVA = listaIVA;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+ " Empresa [cuit=" + cuit + ", listaIVA=" + listaIVA + "]";
	}
	
	
}
