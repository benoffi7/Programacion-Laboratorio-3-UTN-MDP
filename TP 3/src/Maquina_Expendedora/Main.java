package Maquina_Expendedora;

import java.util.Scanner;

/*Nuestras máquinas trabajan con clientes que introducen dinero en ella y
 *  luego le solicitan que imprima un boleto. La máquina mantiene un registro
 *  de la cantidad de dinero que ha recaudado durante todo su funcionamiento.
 * En la vida real, es frecuente que la máquina expendedora de boletos ofrezca
 * un conjunto de boletos de diferentes tipos y los clientes escogen entre ellos,
 * sólo el que desean.Nuestra máquina simplificada imprime sólo boletos de un único precio.
 * Resulta significativamente más complicado programar una clase que sea capaz de emitir 
 * boletos de diferentes valores que si tienen un único precio.
 * Por otra parte, con programación orientada a objetos es muy fácil crear varias 
 * instancias de la clase, cada una con su propio precio, para cumplir con la necesidad 
 * de diferentes tipos de boletos.
*/

public class Main {
		public static Scanner scaner ;
		
	public static void main(String[] args) {
		
		Boleto B = new Boleto(10, "Normal");
		MaquinaDeBoletos Sistema = new MaquinaDeBoletos(B,0,true);
		Recaudador recaudador = new Recaudador("Recaudador","123456");
		scaner = new Scanner(System.in);
		
		while(Sistema.Disponible()) {
			
			Cliente c1 = new Cliente();
			int opc = 0 ;
			
			System.out.println("Bienvenido");
			System.out.println("El PRECIO del BOLETO ES DE: "+Sistema.PrecioBoleto());
			System.out.println("Su SALDO ES DE: "+c1.getSaldo());
			System.out.println("Que Desea Hacer? ");
			System.out.println("1- Ingresar dinero");
			System.out.println("2- Comprar boleto");
			System.out.println("3- MODO RECAUDADOR");
			opc = scaner.nextInt();
			
			switch (opc) {
			
			case 1:
				
				System.out.println("Ingrese Dinero:");
				double dinero = scaner.nextDouble();
				c1.IngresarDinero(dinero);
		
				if(c1.getSaldo()<0){
					System.out.println("ERROR usted a ingresado un numero NEGATIVO");
					System.out.println("Porfavor ingrese DINERO nuevamente: ");
					dinero=0;
					c1.IngresarDinero(dinero);
				}
				
				int opc22 = 0;
				
				System.out.println("Desea COMPRAR un BOLETO? ");
				System.out.println("1- SI");
				System.out.println("2- NO");
				opc22 = scaner.nextInt();
				
				switch(opc22) {
				
				case 1:
					if(c1.getSaldo()>= Sistema.PrecioBoleto()) {
						
						double vuelto = Sistema.ImprimirBoleto(Sistema.getTipo(),c1); 
						System.out.println("SU VUELTO ES DE: "+vuelto);
						System.out.println("Gracias, Buen dia!");
						
					}else {
						
						System.out.println("Usted no dispone de saldo suficiente.");
						System.out.println("Porfavor ingrese mas dinero a continuacion: ");
						double dinero1 = 0;
						dinero1 = scaner.nextDouble();
						dinero = dinero + dinero1;
						c1.IngresarDinero(dinero);
						
						if(c1.getSaldo() >= Sistema.PrecioBoleto()) {
							
							double vuelto = Sistema.ImprimirBoleto(Sistema.getTipo(),c1); 
							System.out.println("SU VUELTO ES DE: "+vuelto);
							System.out.println("Gracias, Buen dia!");
							
						}
						
					}
					break;
				case 2:
					
					double vuelto = Sistema.DevolverVuelto(c1);
					System.out.println("vuelto : "+vuelto);
					System.out.println("Gracias, Buen dia!");
					break;
				}
				
			break;
			case 2:
				
				if(c1.getSaldo()== 0) {
					System.out.println("Usted no ah ingresado dinero porfavor ingrese y luego compre su boleto.");
					System.out.println("Ingrese Dinero:");
					double dinero1 = scaner.nextDouble();
					c1.IngresarDinero(dinero1);
			
					if(c1.getSaldo()<0){
						System.out.println("ERROR usted a ingresado un numero NEGATIVO");
						System.out.println("Porfavor ingrese DINERO nuevamente: ");
						dinero1=0;
						c1.IngresarDinero(dinero1);
					}
				}
				
				
				if(c1.getSaldo() >= Sistema.PrecioBoleto()) {
					
					double vuelto = Sistema.ImprimirBoleto(Sistema.getTipo(),c1); 
					System.out.println("SU VUELTO ES DE: "+vuelto);
					System.out.println("Gracias, Buen dia!");
					
				}
		
				break;		
			case 3:
				
				System.out.println("Bienvenido RECAUDADOR");
				
				String nombre;
				System.out.println("Por favor ingrese su NOMBRE: ");
				nombre = scaner.nextLine();
				
				String pass;
				System.out.println("Por favor ingrese su CONTRASENA: ");
				pass = scaner.nextLine();
				Recaudador r1 = new Recaudador(pass,nombre);
				
				if(recaudador.equals(r1)) {
					
					int opc11 = 0;
					
					System.out.println("Que desea hacer? ");
					System.out.println("1- VER recaudacion del dia.");
					System.out.println("2- EXTRAER recaudacion del dia.");
					opc11 = scaner.nextInt();
					
					switch(opc11) {
					case 1: 
						
						System.out.println("TOTAL : "+Sistema.ObtenerTotal());
						System.out.println("CANTIDAD DE BOLETOS: "+MaquinaDeBoletos.getCantidadBoletos());
						break;
						
					case 2:
						
						Sistema.Extraer();
						System.out.println("Usted EXTRAJO la recaudacion del dia con exito! ");
						System.out.println("TOTAL: "+Sistema.ObtenerTotal());
						System.out.println("CANTIDAD BOLETOS: "+MaquinaDeBoletos.getCantidadBoletos());
						System.out.println("Hasta Luego!");
						break;
					}
				}else {
					System.out.println("ERROR DE DATOS!");
				}
			}	
		}
		if(!Sistema.Disponible()) {
			
			System.out.println("Bienvenido RECAUDADOR");
	
			String nombre;
			System.out.println("Por favor ingrese su NOMBRE: ");
			nombre = scaner.nextLine();
			
			String pass;
			System.out.println("Por favor ingrese su CONTRASENA: ");
			pass = scaner.nextLine();
			
			Recaudador r1 = new Recaudador(nombre,pass);
			
			if(recaudador.equals(r1)) {
				
				int opc11 = 0;
				
				System.out.println("Que desea hacer? ");
				System.out.println("1- VER recaudacion del dia.");
				System.out.println("2- EXTRAER recaudacion del dia.");
				opc11 = scaner.nextInt();
				
				switch(opc11) {
				case 1: 
					
					System.out.println("TOTAL : "+Sistema.ObtenerTotal());
					System.out.println("CANTIDAD DE BOLETOS: "+MaquinaDeBoletos.getCantidadBoletos());
					break;
				case 2:
					
					/// falta metodo extraer
					
					Sistema.ObtenerTotal();
					System.out.println("Usted EXTRAJO la recaudacion del dia con exito! ");
					System.out.println("Hasta Luego!");
					break;
				}
			}
		}
		scaner.close();
	}
}
		
	

