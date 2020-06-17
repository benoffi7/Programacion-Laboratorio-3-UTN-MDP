package Calculos;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 20);
		System.out.println(r1.toString());
		float aux = r1.calculateArea();
		float aux2 = r1.calculatePerimeter();
		System.out.println("Area : "+aux);
		System.out.println("Perimetro : "+aux2);
		r1.setHeight(30);
		r1.setWidth(20);
		float aux1 = r1.calculateArea();
		float aux21 = r1.calculatePerimeter();
		System.out.println("Area : "+aux1);
		System.out.println("Perimetro : "+aux21);
		
		Employee CG = new Employee(23456345,"Carlos","Gutierrez",25000);
		Employee AS = new Employee(34234123,"Ana","Sanchez",27500);
		CG.increaseSalary(20);
		System.out.println(CG.getDescription());
		System.out.println(AS.getDescription());
		
		ItemDeVenta item = new ItemDeVenta(1,"alfajorHavanna",100,50);
		double rta = item.calcularPrecioTotal();
		System.out.println(item.toString()+rta);
		
		Hora h1 = new Hora();
		h1.setHora(4);
		h1.setMinuto(04);
		h1.setSegundo(35);
		System.out.println(h1.muestraTiempo());
		
		
	}

}
