package Clases;

public class Ejercicio22 {
	
	public Ejercicio22() {

    }

    public void positivo(int numero)
    {
        int digitos=0;


        while(numero !=0)
         {
           numero = numero/10;
           digitos++;
         }

        System.out.println("El numero tiene la siguiente cantidad de cifras: "+digitos);


    }
}
