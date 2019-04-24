package app;

import clases.Auto;
import clases.MaquinaExpendedora;

public class Main {

	public static void main(String[] args) 
	{
		MaquinaExpendedora expendedora = new MaquinaExpendedora(100);
		MaquinaExpendedora expendedora2 = new MaquinaExpendedora(100);
		
		Auto auto = new Auto();
		
		MaquinaExpendedora expendedora3 = null;
		
		//System.out.println(expendedora.equals(expendedora2));
     
		System.out.println(expendedora);
		
		
	}

}
