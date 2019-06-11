package ejercicios;

public class Ejercicio5 {
	public static void elNumeroEsPrimo (int numero) {
		boolean flag=true;
		int i;
		if (numero>2) {
			for (i=2; ((i<numero) && (flag==true));i++){
				if ((numero % i)==0) {
					flag=false;
				}
			}
		}else{
			if (numero<2) {
				flag=false;
			}
		}
		if (flag==true){
			System.out.println("El numero es primo");
		}else{
			System.out.println("El numero no es primo");
		}
	}
}
