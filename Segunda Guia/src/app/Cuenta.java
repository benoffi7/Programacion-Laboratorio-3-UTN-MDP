package app;

public class Cuenta {
	
	private float saldo;
	private String nombre;
	private String apellido;
	
	private void setNombre(String nombr) {
		
		nombre = nombr;		
	}
	
	public String getNombre() {
		
		return nombre;		
	}
	
	private void setApellido(String apelli) {
		
		apellido = apelli;		
	}
	
	public String getApellido() {
		
		return apellido;		
	}
	
	public void setSaldo(float saldito) {
		
		saldo = saldito;		
	}
	
	public float getSaldo() {
		return  saldo;		
	}
	
	public String getNyA() {
		
		return getNombre()+ " "+getApellido()+".";
	}
	
	/// hasta aca esta completos de los set y get de los atributos
	
	public void Ingresar(float carga) {
	
		saldo = saldo + carga;
	}
	
	public void extraer(float extraccion) {
		
		if(saldo > 0 && saldo >= extraccion)
		{
			saldo = saldo - extraccion;
		}
		else
		{
			System.out.print("\nSe produjo un error. La extraccion solicitada es mayor al saldo actual.");
			System.out.print("\nPuede hacer una extraccion hasta: $ "+getSaldo()+ " pesos.\n");
		}	
	}
	
	public Cuenta(){
		
		setNombre("");
		setApellido("");
		setSaldo(0);
	}
	
	public Cuenta(String nombr, String Ape, float cargar){
		
		setNombre(nombr);
		setApellido(Ape);
		setSaldo(cargar);
	}
}
