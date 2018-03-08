
public class Main {
	public static void main(String[] args) {
		// Para emplear los metodos de la clase Math3 es necesario
		// crear una instancia de la clase Math3
		Math3 aux = new Math3();
		int[] n = new int[12];
		double[] d = new double[12];
		
		for (int i = 0; i < n.length; i++) 
		{
			n[i] = (int) (100 * Math.random() + 1);
			System.out.println("n[" + i + "] = " + n[i]);
		}
		
		for (int i = 0; i < d.length; i++) 
		{
			d[i] = (double) (100 * Math.random() + 1);
			System.out.println("d[" + i + "] = " + d[i]);
		}
		
		System.out.println("Minimo : " + aux.min(n));
		System.out.println("Maximo : " + aux.max(n));
		
		System.out.println("Minimo : " + aux.min(d));
		System.out.println("Maximo : " + aux.max(d));
	}
}
