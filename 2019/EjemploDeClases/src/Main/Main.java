package Main;

public class Main {

	public static void main(String[] args) 
	{
		//System.out.println(Persona.MAYORIA_EDAD);
		
		Persona paz = new Persona();
		//Persona paz = null; NO y NO
		//paz.setEdad(16);
		///paz.setNombre("Paz");
		//paz.setApellido("Lennon");
		System.out.println(paz.getEdad());
		System.out.println(Persona.MAYORIA_EDAD);
		
		Persona gonzalo = new Persona();
		gonzalo.setEdad(30);
		gonzalo.setApellido("Benoffi");
		gonzalo.setNombre("Gonzalo");
		System.out.println(gonzalo.getEdad());
		System.out.println(Persona.MAYORIA_EDAD);
		
		Persona gaston = new Persona("gaston");
		
		System.out.println("OBJ 1 "+gonzalo.getNyA());
		System.out.println("OBJ 2 "+paz.getNyA());
		System.out.println("OBJ 3 "+gaston.getNyA());

		System.out.println("Gonzalo es mayor de edad? "+gonzalo.isMayorFormateado());
		System.out.println("Paz es mayor de edad? "+paz.isMayorFormateado());
		
		//System.out.println(Persona.MAYORIA_EDAD);

	}

}
