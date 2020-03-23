package guia1;

import java.util.Scanner;

 public class ejercicio3 {
	
	static Scanner scan;

    public static void numeroPrimo()
     {
	  for(int i=2;i<=100;i++)
	   {
	    if(esPrimo(i))
	    {
	    	System.out.println(i);
	    }
	   }
     }  


    public static boolean esPrimo(int i)
    {
    	int contador = 2;
    	boolean flag = true;
    	
    	 while((flag) && (contador!=i))
		  {
		    if(i % contador == 0)
		      {
			      flag=false;
			  }
		    contador++;
		  }
    	return flag; 
    }
 } 