package DoMe;

import java.util.ArrayList;



public class Pelicula extends ElementoMultimedia{
	
	
	private String banda;
	private ArrayList<Reparto>ListaReparto;
	private ArrayList<Sub>ListaSub;
	private double costoProduccion;
	
	
	public Pelicula(float duracion,ArrayList<Premio> listaPremios, ArrayList<Idioma> listaIdiomas, ArrayList<Anio> listaAnios,
			ArrayList<Clasificacion> listaClasificacion, ArrayList<Genero> listaGenero, String calidad,
			String nombreTitulo, String pais, String formato, String studio, String productor, int calificacion,
			String review, int iD, boolean loTengo,String banda,ArrayList<Reparto>ListaReparto,ArrayList<Sub>ListaSub,double costoProduccion) {
		
		super(duracion, listaPremios, listaIdiomas, listaAnios, listaClasificacion, listaGenero,
			calidad, nombreTitulo, pais, formato, studio, productor, calificacion, review, iD, loTengo);
		
		this.banda=banda;
		this.costoProduccion=costoProduccion;
		this.ListaReparto=ListaReparto;
		this.ListaSub=ListaSub;
	}
	
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public ArrayList<Reparto> getListaReparto() {
		return ListaReparto;
	}
	public void setListaReparto(ArrayList<Reparto> listaReparto) {
		ListaReparto = listaReparto;
	}
	public ArrayList<Sub> getListaSub() {
		return ListaSub;
	}
	public void setListaSub(ArrayList<Sub> listaSub) {
		ListaSub = listaSub;
	}
	public double getCostoProduccion() {
		return costoProduccion;
	}
	public void setCostoProduccion(double costoProduccion) {
		this.costoProduccion = costoProduccion;
	}

	@Override
	public String toString() {
		return " banda=" + banda + " reparto=" + ListaReparto + " subs=" + ListaSub
				+ " costo produccion=" + costoProduccion +super.toString();
	}
	
	
	
	
}
