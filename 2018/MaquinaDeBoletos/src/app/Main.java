package app;

import clases.MaquinaExpendedora;

public class Main {

	public static void main(String[] args) 
	{
		MaquinaExpendedora expendedora = new MaquinaExpendedora(100);
		MaquinaExpendedora expendedora2 = new MaquinaExpendedora(100);
		
		System.out.println(expendedora.equals(expendedora2));
     
	}

}
