
public class Main {

	public static void main(String[] args) 
	{
		ArrayReales x = new ArrayReales();
		 x.valor = new double[5];
		 x.asignar();
		 x.imprimir();
		 System.out.println("Minimo : " + x.minimo());
		 System.out.println("Maximo : " + x.maximo());
		 System.out.println("Sumatorio: " + x.sumatorio());
	}
}
