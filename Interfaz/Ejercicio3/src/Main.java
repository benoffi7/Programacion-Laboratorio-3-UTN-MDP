
public class Main {

	public static void main(String[] args) 
	{
		Numero n1 = new Numero(1);
		Numero n2 = new Numero(2);
		Numero n3 = new Numero(3);
		Numero n4 = new Numero(1);
		
		System.out.println(n1.esMayor(n2));
		System.out.println(n1.esMenor(n3));
		System.out.println(n1.esIgual(n4));

	}

}
