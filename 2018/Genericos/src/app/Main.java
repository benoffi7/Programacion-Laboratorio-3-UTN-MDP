package app;

public class Main {

	public static void main(String[] args) {
		////////// BOLSA V1 ///////////////
		BolsaV1 bolsa = new BolsaV1(5);

		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("arcor");
		Chocolatina c2 = new Chocolatina("ferrero");

		Persona g1 = new Persona("gonzalo");
		Persona g2 = new Persona("emmanuel");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g1);
		bolsa.add(g2);

		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());

			} else {
				Persona p = (Persona) o;
				System.out.println(p.getNombre());
			}
		}

		//////////////////// BOLSA V2/////////////////

		BolsaV2<Chocolatina> bolsaV2 = new BolsaV2<Chocolatina>(5);
		Chocolatina c3 = new Chocolatina("milka");
		Chocolatina c4 = new Chocolatina("milka");
		Chocolatina c5 = new Chocolatina("ferrero");
		
		BolsaV2<Persona> bolsaV21 = new BolsaV2<Persona>(5);
		Persona g3 = new Persona("gonzalo");
		Persona g4 = new Persona("emmanuel");
		
		bolsaV21.add(g3);
		bolsaV21.add(g4);

		
		bolsa.add(c3);
		bolsa.add(c4);
		bolsa.add(c5);

		for (Chocolatina chocolatina : bolsaV2) {
			System.out.println(chocolatina.getMarca());
		}
		
		for (Persona p : bolsaV21) {
			System.out.println(p.getNombre());
		}

		//////////// PILA /////////////////////

		Pila<Integer> pilaEnt = new Pila<Integer>();
		Pila<String> pilaCad = new Pila<String>();

		pilaEnt.insertar(new Integer(2));
		pilaEnt.insertar(new Integer(4));
		System.out.println(pilaEnt.quitar());
		pilaCad.insertar("Jueves");
		pilaCad.insertar("Viernes");

		// MINIMOS

		int ea = 1, eb = 5;
		System.out.println("(int):" + minimo(ea, eb));
		long la = 10000L, lb = 4000L;
		System.out.println("(long):" + minimo(la, lb));
		char ca = 'a', cb = 'z';
		System.out.println("(char):" + minimo(ca, cb));
		double da = 423.654, db = 789.10;
		System.out.println("(double):" + minimo(da, db));

		// METODOS GENERICOS

		System.out.println("Ejemplo de metodo generico");
		String r;
		r = MetodoGenerico.aCadena(new Integer(8), new Integer(-11));
		System.out.println(" r = " + r);
		System.out.println(" con tipo double = " + MetodoGenerico.aCadena(new Double(1.38), new Double(-15e3)));
		// los argumentos no son objetos; hay que tener en cuenta que a partir
		// de Java 5 hay una conversión automática del tipo primitivo
		System.out.println(" con tipo char = " + MetodoGenerico.aCadena('a', 'z'));

	}

	
	public static <G,Z> G minimo(G a, G b, Z c) {
		if (a == null || b == null)
			return null;
		//Al ser A super generico no se sabe si tiene el metodo compareTo
		if (a.compareTo(b) < 0)
			return a;
		else
			return b;
	}

	public static <T extends Persona & Comparable & Cloneable, Z> T minimoV2(T a, T b, Z c, Z d) {
		if (a == null || b == null)
			return null;
		if (a.compareTo(b) < 0)
			return a;
		else
			return b;
	}

	static int minimo(int a, int b) {
		if (a <= b)
			return a;
		return b;
	}

	static long minimo(long a, long b) {
		if (a <= b)
			return a;
		return b;
	}

	static char minimo(char a, char b) {
		if (a <= b)
			return a;
		return b;
	}

	static double minimo(double a, double b) {
		if (a <= b)
			return a;
		return b;
	}
}
