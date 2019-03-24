package Clases;

import java.util.Scanner;

public class Ejercicio24 {

	public Ejercicio24() {

    }

    Scanner scanf = new Scanner(System.in);


    public void consultar_salario(double salario,int edad,String nombre)
    {
        double total;


            if(edad>=19 && edad<=50)
            {
                total=salario+salario*0.05;
                System.out.println("El salario es: "+total);

            }
            else if(edad>=51 && edad<=60)
            {
                total=salario+salario*0.10;
                System.out.println("El salario es: "+total);
            }
            else if(edad>60)
            {
                total=salario+salario*0.15;
                System.out.println("El salario es: "+total);

            }
            else
            {
                System.out.println("El salario es: "+salario);
            }





        }

}
