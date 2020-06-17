package BLOCKBUSTER;

import java.util.ArrayList;

public class Sucursal {
	
	private ArrayList<Pelicula>ListaPelis;
	private ArrayList<Videojuego>ListaVideojuegos;
	
	
	public Sucursal() {
		
		ListaPelis = new ArrayList<Pelicula>();
		ListaVideojuegos = new ArrayList<Videojuego>();
	}
	
	public ArrayList<Pelicula> getListaPelis() {
		return ListaPelis;
	}
	public void setListaPelis(ArrayList<Pelicula> listaPelis) {
		ListaPelis = listaPelis;
	}
	public ArrayList<Videojuego> getListaVideojuegos() {
		return ListaVideojuegos;
	}
	public void setListaVideojuegos(ArrayList<Videojuego> listaVideojuegos) {
		ListaVideojuegos = listaVideojuegos;
	}
	
	private void agregarPeliToLista(ElementoMultimedia e) {
		if( e != null) {
			ListaPelis.add((Pelicula)(e));
		}
	}
	private void agregarJuegoToLista(ElementoMultimedia e) {
		if( e != null) {
			ListaVideojuegos.add((Videojuego)(e));
		}
	}
	public void agregrar(ElementoMultimedia e) {
		if(e instanceof Pelicula) {
			agregarPeliToLista(e);
		}else if ( e instanceof Videojuego) {
			agregarJuegoToLista(e);
		}
	}
	
	public String mostrarPelis() {
		String rta = "";
		if(ListaPelis != null) {
			for(ElementoMultimedia e : ListaPelis) {
				rta = rta + " "+ e.toString();
			}
		}
		return rta;
	}
	public String mostrarJuegos(){
		String rta= "";
		
		if(ListaVideojuegos != null) {
			for(ElementoMultimedia e : ListaVideojuegos) {
				rta = rta + " "+ e.toString();
			}
			
		}
		return rta;
	}
}
