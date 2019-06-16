package ej3;

public class Test {

	public static void main(String[] args) {
		Numero a;
		Numero b;
		Numero c;
		a= new Numero(5);
		b= new Numero(8);
		c= new Numero(5);
		
		System.out.println(a.esMenor(b));
		System.out.println(b.esMayor(c));
		System.out.println(a.esIgual(c));
	}

}
