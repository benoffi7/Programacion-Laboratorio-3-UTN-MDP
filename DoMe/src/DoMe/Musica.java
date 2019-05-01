package DoMe;

import java.util.ArrayList;

public class Musica extends ElementoMultimedia{
	
	
	private String autor;
	private String sello;
	private int numTemas;
	
	public Musica(float duracion, ArrayList<Premio> listaPremios, ArrayList<Idioma> listaIdiomas,
			ArrayList<Anio> listaAnios, ArrayList<Clasificacion> listaClasificacion, ArrayList<Genero> listaGenero,
			String calidad, String nombreTitulo, String pais, String formato, String studio, String productor,
			int calificacion, String review, int iD, boolean loTengo, String autor, String sello, int numTemas) {
		
		super(duracion, listaPremios, listaIdiomas, listaAnios, listaClasificacion, listaGenero, calidad, 
			nombreTitulo, pais,formato, studio, productor, calificacion, review, iD, loTengo);
		
		this.autor=autor;
		this.sello=sello;
		this.numTemas=numTemas;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getSello() {
		return sello;
	}
	public void setSello(String sello) {
		this.sello = sello;
	}
	public int getNumTemas() {
		return numTemas;
	}
	public void setNumTemas(int numTemas) {
		this.numTemas = numTemas;
	}

	@Override
	public String toString() {
		return " autor=" + autor + " sello=" + sello + " numTemas=" + numTemas +super.toString();
	}
	
}
