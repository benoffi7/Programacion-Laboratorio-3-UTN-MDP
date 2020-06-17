package ej1;

public class Test {

	public static void main(String[] args) {
		ArrayReales a = new ArrayReales();
		
		a.agregarNumeroRandom();
		a.agregarNumeroRandom();
		a.agregarNumeroRandom();
		a.agregarNumeroRandom();
		
		System.out.println(a.minimo());
		System.out.println(a.maximo());
		System.out.println(a.sumatorio());
	}

}
