package app;

public class Perro implements Comparable<Perro>{

	int edad;
	@Override
	public int compareTo(Perro arg0) {
		if (getEdad()==arg0.getEdad())return 0;
		else if (getEdad()<arg0.getEdad())return -1;
		else if (getEdad()>arg0.getEdad())return 1;
		return 0;
		
	}
	
	public int getEdad() {
		return edad;
	}

}
