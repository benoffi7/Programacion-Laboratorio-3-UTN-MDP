package ej4;

public class Revista extends Obra {
	private int numero;
	
	public Revista(int codigo, String titulo, int anioPublicacion,int num) {
		super(codigo, titulo, anioPublicacion);
		setNumero(num);
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString()+"\nRevista nro: "+getNumero();

	}
}
