package Clases;

public class Ejercicio3 {

	
	
	public Ejercicio3() {
		
	}

	 public  void mostrar_n_primos (int n_numero)
	    {
	        int numeros = 2;
	        int cuenta_contador = 1;
	        int cantidad_divisibles = 0;
	        int numero_primo_encontrado = 0;

	        while(numero_primo_encontrado <n_numero )
	        {
	            while(numeros>cuenta_contador && cantidad_divisibles <=3) {
	                if (numeros % cuenta_contador == 0) {
	                    cantidad_divisibles++;
	                }
	                cuenta_contador++;

	            }
	            if (cantidad_divisibles <= 2) {
	                numero_primo_encontrado++;
	                System.out.println("Numero "+ numero_primo_encontrado + " primo " + numeros);
	            }

	            numeros++;
	            cuenta_contador=1;
	            cantidad_divisibles=0;

	        }

	    }
	
}
