package guia2;

public class Cuenta {
	//primero
	private String nombre;
	private String apellido;
	private float saldo;
	private int identificador; 
	//segundo
	
	//tercero
	
	public Cuenta (){
		setNombre("");
		setApellido("");
		setSaldo (0);
		setIdentificador(0);
	}
	
	public Cuenta (float saldoInicial){
		setNombre("");
		setApellido("");
		setSaldo (saldoInicial);
		setIdentificador(0);
	}
	//cuarto
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre (String nombreRecivido){
		nombre = nombreRecivido;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public void setApellido (String apellidoRecivido){
		apellido = apellidoRecivido;
	}
	
	public float getSaldo(){
		return saldo;
	}
	
	private void setSaldo(float saldoRecivido){
		saldo = saldoRecivido;
	}
	
	private int getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador (int identificadorRecivido){
		identificador = identificadorRecivido;
	}	
	//quinto
	public void ingresar (float c){
		setSaldo(getSaldo()+c);
	}
	
	
	public void extaer (float c){
		setSaldo(getSaldo()-c);
	}
	
	public boolean VerificarExtraccion (float c){
		if (getSaldo() < c) return true;
		else return false;
	}
	
	
}
