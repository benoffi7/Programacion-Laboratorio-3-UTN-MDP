package app;

import java.util.Scanner;

public class menu {
	
	static Scanner scan;
	static Boleto boleto = new Boleto("COLECTIVO",10);
	static Maquina maquina=new Maquina(boleto);
	static Recaudador recaudador = new Recaudador(maquina);
	
	public static void menuUsuario()
	{
		System.out.print("\n1-Ingresar Dinero");
		System.out.print("\n2-Comprar Boleto");
		System.out.print("\n3-Ver Saldo");
		System.out.print("\n4-mostrar Recaudacion");
		System.out.print("\n5-Recaudador");
		System.out.print("\n6-Salir\n");
	}
	
	public static void menuRecaudador()
	{
	System.out.print("\n1-Mostrar Recaudacion");
	System.out.print("\n2-Abrir caja");
	System.out.print("\n3-Cerrar caja");
	System.out.print("\n4-Salir");
	}
	
	public static void iniciarUsuario() throws InterruptedException
	{
		scan = new Scanner(System.in);
		int opcion=0;
		while(opcion!=6)
		 {
		  menuUsuario();
		  System.out.print("\nIngrese una opcion: ");
		  opcion = scan.nextInt();
		  switch(opcion)
		   {
		   case 1: 
			    int dinero;
			    System.out.print("Ingresar Dinero: ");
			    dinero = scan.nextInt();
			    maquina.ingresarDinero(dinero);
			   break;
		   case 2:
			   if(maquina.verSaldo()>=maquina.devolverPrecio())
			    {
			     maquina.comprarBoleto();
			     System.out.print("\nBoleto de: "+maquina.devolverDescripcionBoleto());
			     System.out.print("\nPrecio: $"+maquina.devolverPrecio());
			     System.out.print("\ncantidad: 1");
			     System.out.print("\nVuelto: $"+maquina.getVuelto());
			     Thread.sleep(5000);
			    }else {
				 System.out.print("No dispone de saldo para comprar un boleto."); 
				 System.out.print("\nVuelto: $ "+maquina.devolverDinero());
				 Thread.sleep(5000);
			    }
			    break;
		   case 3:
			   System.out.print("Su saldo es de: $"+maquina.verSaldo());
			   Thread.sleep(5000);
			   break;
		   case 4:
			   System.out.print("Total recaudado: $ "+maquina.getRecaudacion());
			   Thread.sleep(5000);
		   	   break;
		   case 5:
			   iniciarRecaudador();
			   break;
		   case 6:
			   System.exit(0);
	       default:
	    	   System.out.print("\nOpcion incorrecta, ingrese una nueva opcion.\n");
	    	   break;
		   }
	     }
	}

	public static void iniciarRecaudador() throws InterruptedException
	{
		scan = new Scanner(System.in);
		int opcion=0;
		while(opcion!=4)
		 {
		  menuRecaudador();
		  System.out.print("\nIngrese una opcion: ");
		  opcion = scan.nextInt();
		  switch(opcion)
		   {
		   case 1: 
			   System.out.print("La maquina lleva recaudado: $"+recaudador.verRecaudacionMaquina());
			   Thread.sleep(5000);
			   break;
		   case 2:
			   if(recaudador.abrirCaja()) {
				   System.out.print("La caja fue abierta");
			       Thread.sleep(5000);
			   }else {
				   System.out.print("Debe cerrar la caja antes de volver a abrirla");
			       Thread.sleep(5000);
			   }
			   break;
		   case 3:
			   if(recaudador.verRecaudacionMaquina()==0)
			   {
			       System.out.print("No hay dinero disponible para recaudar");
			       Thread.sleep(5000);
			   }else {
				   System.out.print("Se ha recaudado: $"+recaudador.cerrarCaja());
				   Thread.sleep(5000);
			   }
			   break;
		   case 4:
			   iniciarUsuario();
			   break;
		   default:
			   System.out.print("opcion Incorrecta.");
		   }
		 }
	}
}
