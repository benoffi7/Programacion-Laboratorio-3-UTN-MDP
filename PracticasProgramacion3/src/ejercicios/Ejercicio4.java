package ejercicios;

public class Ejercicio4 {
	public static void numerosPrimos (int numero) {
		//Mismo comentario que ejercicio anterior
		int i,j=0;
		for (i=2; j<numero;i++) {
			if ((i==2)||(i==3)||(i==5)||(i==7)||(i==11)){
				System.out.println( i + " es primo");
				j++;
			}else{
				if (((i%2)!=0)&&((i%3)!=0)&&((i%5)!=0)&&((i%7)!=0)&&((i%11)!=0)) {
					System.out.println( i + " es primo");
					j++;
				}
			}
		}
	}
}
