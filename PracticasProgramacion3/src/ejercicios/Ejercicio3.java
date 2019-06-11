package ejercicios;

public class Ejercicio3 {
	//intento 1
	/*Este metodo no es perfecto, considero que podria perfecionarlo haciendolo de forma recursiva pero no estoy seguro del todo respecto a la consigna
	Este metodo dice 89 numeros primos correctos con solo 11 fallos en los 100 primeros numeros primos exigidos
	Dicho esto lo voy a dejar asi hasta proxima consulta con profesor
	PD: el margen de error presenta un incremento exponencial al tender a n->infinito n siendo numero natural, con este metodo
	*/
	public static void numerosPrimos () {
		int i,j=0;
		for (i=2; j<100;i++) {
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
	
	//intento 2 Nota: "Shit happend" en algun lado
	/*
	public static void numerosPrimos () {
		boolean flag=true;
		int i=0,cont=0,j,primo=0;
		while (cont<100){
			if (i>2) {
				for (j=0; flag=true;j++) {
					if ((i % j)==0) {
						flag=false;
					}
				}
			}else{
				if (i<2) {
					flag=false;
					i++;
				}
			}
			if (flag==true){
				System.out.println(i + "es primo");
				i++;
				primo=i;
				flag=true;
				cont++;
			}
		}
	}
	*/
}
