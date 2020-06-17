package CuentaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(01,"Ivan","Graciarena","M");
		CuentaBancaria cb1 = new CuentaBancaria(01,0,c1,-20000);
		
		cb1.Depositar(10000);
		
		System.out.println(cb1);
		Scanner s = new Scanner(System.in);
		int opc=1;
		
		
		
		while(opc!=0) {
			if(cb1.getBalance()==cb1.getSaldoDeudor()) {
				System.out.println("usted esta en deuda de 20mil pesos!!");
				break;
			}
			else {
				cb1.Extraer(5000);
			}
			System.out.println(cb1);
			System.out.println("desea continuar?");
			opc=s.nextInt();
		}
		
		s.close();
		
	}

}
