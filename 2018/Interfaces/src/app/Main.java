package app;

import clases.ActorDeComedia;
import clases.ActorDeDrama;
import clases.Bolsa1;
import clases.Bolsa2;
import interfaces.IActor;
import interfaces.IBolsa;

public class Main {

	public static void main(String[] args) 
	{
		// declaro una variable del tipo Interfaz. NO UN OBJECTO, la instancia siempre es de una clase
		// que implemente dicha INTERFAZ
		IActor actor1 = new ActorDeComedia();
		IActor actor2 = new ActorDeDrama();
		
		//invoco al metodo que espera una variable del TIPO Interfaz
		metodoPoliformico(actor1);
		metodoPoliformico(actor2);
		
		//declaro una variable del tipo INTERFAZ
		IBolsa q;
		//
		q = new Bolsa1(); //le asigno en espacio de memoria una BOLSA1 
		q.insertar("Manzana"); //invoco al metodo que tiene la interfaz pero se ejecuta el de BOLSA1, la manzana va a la lista
		
		q = new Bolsa2(); //le asigno en espacio de memoria una BOLSA2
		q.insertar(new Integer(5));//invoco al metodo que tiene la interfaz pero se ejecuta el de BOLSA2, el 5 va a la lista

	}
	
	public static void metodoPoliformico(IActor variable)
	{
		//Si bien el metodo es compartido, gracias al camino de migas y a la ligadura dinamica
		//lo que REALMENTE se ejecuta es lo que tiene esa variable adentro (NEW) 
		//provacando dos salidas por pantalla de acuerdo a la clase correspondiente

		variable.actuar();
	}

}
