package tp1;

public class persona {
	private String nombre;
	private int edad;
	private int salario;
	
	persona(){
		this.nombre="";
		this.edad = 0;
		this.salario = -1;
	}
	
	
	persona(String nombre,int edad, int salario){
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public  String getNombre() {
	return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public  int calcularSalario () {
		int calculo = salario;
		if(edad < 16) {
			this.salario = -1;
		calculo = salario;
		}
		else
			if(edad>=19 && edad <=50) {
			calculo *=1.05;
			}
			else if(edad>=51 && edad <=60)
			{
				calculo *=1.10;
			}
			else 
				calculo *=1.15;
		
		return calculo;
	}
}
