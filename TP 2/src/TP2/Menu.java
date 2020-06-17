package TP2;

import java.util.Scanner;

public class Menu {

	Cuenta c=null;
	Scanner s = new Scanner(System.in);
	
	public Menu() {
	}
	
	
	public void ejecutarMenu() {
		
	
		int opc = 0;
		
		while(opc!=6) {	
		
			System.out.println("Bienvenido, ingrese una opcion: ");
			System.out.println("1- Crear cuenta Vacia");
			System.out.println("2- Crear cuenta saldo Inicial");
			System.out.println("3- Ingresar Dinero");
			System.out.println("4- Sacar dinero");
			System.out.println("5-Ver saldo");
			System.out.println("6-Salir");
		
		opc = s.nextInt();
		
			switch(opc) {
			case 1 :
				if(c == null) {
					c = new Cuenta("Ivan","Graciarena",001,0);
				}
				
				break;
			case 2 :
				if(c == null) {
					c = new Cuenta("Ivan","Graciarena",001,0);
					System.out.println("Ingrese cantidad: ");
					float cantidad = s.nextFloat();
					c.Ingresar(cantidad);
					System.out.println("Su saldo actual es: "+c.getSaldo());
				}
				break;
			case 3 :
				if(c!=null) {
					System.out.println("Ingrese cantidad: ");
					float cantidad1 = s.nextFloat();
					c.Ingresar(cantidad1);
					System.out.println("Su saldo actual es: "+c.getSaldo());
					
				}
				break;
			case 4 :
				if(c!=null){
					System.out.println("Ingrese monto a debitar: ");
					float monto = s.nextFloat();
					c.Extraer(monto);
					
					if(c.Extraer(monto)==false) {
						
						System.out.println("Su saldo es: "+c.getSaldo());
						if(c.getSaldo()==0) {
							System.out.println("Usted no dispone de saldo en la cuenta!!");
						}else {
							System.out.println("Por favor ingrese una cantidad menor o igual a: "+c.getSaldo());
							System.out.println("Ingrese monto a debitar: ");
							float montoaux=s.nextFloat();
							c.Extraer(montoaux);
							System.out.println("Su saldo es: "+c.getSaldo());
						}
						
						
					}
				}
				
				break;
			case 5 :
				if(c != null) {
					System.out.println("Saldo : "+c.getSaldo());
				}
				break;
			}
		if(opc==6) {
			System.out.println("Que tenga buen dia!");
			c = null;
		}
	}
		s.close();
		
	}
}
