package ej2;

public class Test {

	public static void main(String[] args) {
		Matematicas m = new Matematicas();
		
		m.agregarNumero(8f);
		m.agregarNumero(10f);
		m.agregarNumero(5f);
		m.agregarNumero(99f);
		
		System.out.println(m.inicio());
		System.out.println(m.fin());
	}

}
