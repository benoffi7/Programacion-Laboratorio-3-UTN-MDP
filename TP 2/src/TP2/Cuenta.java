package TP2;

public class Cuenta {
	
	private String nombre;
	private String apellido;
	private int numC;
	private float saldo;
	
	
	public Cuenta() {
		nombre="";
		apellido="";
		numC=0;
		saldo=0;
	}

	
	public Cuenta(String nombre, String apellido, int numC, float saldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numC = numC;
		this.saldo = saldo;
	}

	
	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	private void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNumC() {
		return numC;
	}


	private void setNumC(int numC) {
		this.numC = numC;
	}


	public float getSaldo() {
		return saldo;
	}


	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public void Ingresar(float cantidad) {
		
		setSaldo(getSaldo()+cantidad);
	}
	
	
	public boolean Extraer(float cantidad) {
		
		if(getSaldo() >= 0 && getSaldo() >= cantidad) {
			setSaldo((getSaldo()-cantidad));
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
