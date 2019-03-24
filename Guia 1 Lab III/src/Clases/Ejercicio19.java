package Clases;

import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio19 {
	
	public Ejercicio19() {

    }

    public void calcular_temperaturas()
    {
        int temperaturas=30;
        int tempmayor = 0;
        int tempmenor = 0;
        int sumadetemperaturas = 0;
        double promedio;


        for(int i=0;i<=temperaturas;i++)
        {

            //int  numero = (int) (Math.random() * 45) ;

            int numero=ThreadLocalRandom.current().nextInt(5, 50);


            sumadetemperaturas=sumadetemperaturas+numero;

            if(numero > tempmayor)
            {
                tempmayor=numero;
            }
            if(numero < tempmenor)
            {
                tempmenor=numero;
            }

        }

        System.out.print("La temperatura mayor es: " + tempmayor + "\n");
        System.out.print("La temperatura menor es: " + tempmenor + "\n");

        promedio=sumadetemperaturas/temperaturas;

        System.out.print("El promedio es: " + promedio);

    }
	
	
	
}
