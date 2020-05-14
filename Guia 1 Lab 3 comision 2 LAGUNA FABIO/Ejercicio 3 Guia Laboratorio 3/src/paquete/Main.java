package paquete;

public class Main {

	public static void main(String[] args) {
		
		comprobarPrimos ();
		
	}
	
	public static void comprobarPrimos () {
		
		int i, j, res;
		
		for (i=2 ; i<=100 ; i++) {
			j=2;
			res=1;
			while ((j<i)&&(res!=0)) {
				res = i%j;
				j++;
			}
			if (res==1) {
				mostrarNumero (i);
			}
		}
	}
	
	public static void mostrarNumero (int numero) {
		
		System.out.println(numero);
	}

}
