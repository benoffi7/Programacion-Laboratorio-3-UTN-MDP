package DoMe;

import java.util.ArrayList;

public class ElementoMultimedia {
	
	private float duracion;
	
	private ArrayList<Pelicula>ListaPelis;
	private ArrayList<Musica>ListaMusica;
	
	private ArrayList<Premio>ListaPremios;
	private ArrayList<Idioma>ListaIdiomas;
	private ArrayList<Anio>ListaAnios;
	private ArrayList<Clasificacion>ListaClasificacion;
	private ArrayList<Genero>ListaGenero;
	
	private String calidad;
	private String nombreTitulo;
	private String pais;
	private String formato;
	private String studio;
	private String productor;
	private String review;
	
	private int calificacion;
	protected static int cantidadRepro;
	private int ID;
	private boolean loTengo;
	
	
	public ElementoMultimedia() {
		
		ListaMusica = new ArrayList<Musica>();
		ListaPelis = new ArrayList<Pelicula>();
		
	}
	
	
	public ElementoMultimedia(float duracion, ArrayList<Premio> listaPremios, ArrayList<Idioma> listaIdiomas,
			ArrayList<Anio> listaAnios, ArrayList<Clasificacion> listaClasificacion, ArrayList<Genero> listaGenero,
			String calidad, String nombreTitulo, String pais, String formato, String studio, String productor,
			int calificacion, String review, int iD, boolean loTengo) {
		
		this.duracion = duracion;
		ListaPremios = listaPremios;
		ListaIdiomas = listaIdiomas;
		ListaAnios = listaAnios;
		ListaClasificacion = listaClasificacion;
		ListaGenero = listaGenero;
		this.calidad = calidad;
		this.nombreTitulo = nombreTitulo;
		this.pais = pais;
		this.formato = formato;
		this.studio = studio;
		this.productor = productor;
		this.calificacion = calificacion;
		this.review = review;
		ID = iD;
		this.loTengo = loTengo;
	}

	
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public ArrayList<Premio> getListaPremios() {
		return ListaPremios;
	}
	public void setListaPremios(ArrayList<Premio> listaPremios) {
		ListaPremios = listaPremios;
	}
	public ArrayList<Idioma> getListaIdiomas() {
		return ListaIdiomas;
	}
	public void setListaIdiomas(ArrayList<Idioma> listaIdiomas) {
		ListaIdiomas = listaIdiomas;
	}
	public ArrayList<Anio> getListaAnios() {
		return ListaAnios;
	}
	public void setListaAnios(ArrayList<Anio> listaAnios) {
		ListaAnios = listaAnios;
	}
	public ArrayList<Clasificacion> getListaClasificacion() {
		return ListaClasificacion;
	}
	public void setListaClasificacion(ArrayList<Clasificacion> listaClasificacion) {
		ListaClasificacion = listaClasificacion;
	}
	public ArrayList<Genero> getListaGenero() {
		return ListaGenero;
	}
	public void setListaGenero(ArrayList<Genero> listaGenero) {
		ListaGenero = listaGenero;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	public String getNombreTitulo() {
		return nombreTitulo;
	}
	public void setNombreTitulo(String nombreTitulo) {
		this.nombreTitulo = nombreTitulo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public static int getCantidadRepro() {
		return cantidadRepro;
	}
	public static void setCantidadRepro(int cantidadRepro) {
		Pelicula.cantidadRepro = cantidadRepro;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public boolean isLoTengo() {
		return loTengo;
	}
	public void setLoTengo(boolean loTengo) {
		this.loTengo = loTengo;
	}
	
	

	public void AgregarMusica(ElementoMultimedia e) {
		if(ListaMusica != null) {
			ListaMusica.add((Musica) e);
		}
	}
	
	public void AgregarPeli(ElementoMultimedia e) {
		if(ListaPelis != null) {
			ListaPelis.add((Pelicula) e);
		}
	}
	
	public void Agregar(ElementoMultimedia e) {
		if(e instanceof Musica) {
			AgregarMusica(e);
		}else if(e instanceof Pelicula) {
			AgregarPeli(e);
		}
	}
	
	public ArrayList<Genero> busquedaPorGenero(String genero) {
		
		for(Genero e : ListaGenero) {
			if(e.getTipoGenero().equals(genero)) {
				return getListaGenero();
			}
		}
		return null;
		
	}
	
	@Override
	public String toString() {
		return " duracion=" + duracion + " premios=" + ListaPremios + " idiomas=" + ListaIdiomas + " años="
				+ ListaAnios + " clasificacion=" + ListaClasificacion + " genero=" + ListaGenero
				+ " calidad=" + calidad + " nombreTitulo=" + nombreTitulo + " pais=" + pais + " formato=" + formato
				+ " studio=" + studio + " productor=" + productor + " calificacion=" + calificacion + " review="
				+ review + " ID=" + ID + " loTengo=" + loTengo;
	}
	
	
	
}
