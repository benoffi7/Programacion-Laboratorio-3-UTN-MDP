package Main;

public class Main {

	public static void main(String[] args) 
	{
		Persona paul = new Persona("paul","macca",10);
		paul.setEdad(30);
		System.out.println("el nombre y apellido es "+paul.getNyA());
		System.out.println("paul es...una leyenda y "+paul.isMayorFormateado()+" es mayor");
		System.out.println(paul.getMayorEdad()); //18
		paul.setMayorEdad(20);
		Persona.setMayorEdad(30);
		System.out.println(paul.getMayorEdad()); //20
		System.out.println(Persona.getMayorEdad()); //20
		
		Persona john = new Persona();
		john.setMayorEdad(30);
		//System.out.println(Persona.getMayorEdad());
		
		System.out.println(paul.getMayorEdad()); //30
		System.out.println(john.getMayorEdad()); //30
		System.out.println(Persona.getMayorEdad()); //30
		
		Math.pow(12, 3);
		
		Persona ejemplo = new Persona();
		
		

	}

}
