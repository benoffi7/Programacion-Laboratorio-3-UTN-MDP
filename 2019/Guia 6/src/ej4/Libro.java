package ej4;

public class Libro extends Obra implements IPrestable {	
	private boolean prestado;

	public Libro(int codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo, anioPublicacion);
		setPrestado(false);
	}
	
	private boolean getPrestado() {
		return prestado;
	}
	
	private void setPrestado(boolean b) {
		prestado = b;
	}

	@Override
	public String toString() {
		String msg=super.toString();
		if(getPrestado()) {
			msg+="\nPrestado";
		}
		else {
			msg+="\nDisponible";
		}
		return  msg;
	}

	@Override
	public void prestar() {
		setPrestado(true);		
	}

	@Override
	public void devolver() {
		setPrestado(false);
	}

	
}
