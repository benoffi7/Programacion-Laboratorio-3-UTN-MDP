package Ej1;

public class Main 
{
	public static void main(String[] args) 
	{
		
			Diputado d1 = new Diputado("Jorge", "Fulano", 23, "Buenos Aires");
			Senador s1 = new Senador("Eduardo", "Ramirez", 36, "Buenos Aires");
			Diputado d2 = new Diputado("Gonzalo", "Tejedo", 46, "Santa Fe");
			Senador s2 = new Senador("Matias", "Echevarria", 57, "Santa Fe");
			Diputado d3 = new Diputado("Gaston", "Vega", 38, "Mendoza");
			Senador s3 = new Senador("Luis", "Lopez", 41, "Mendoza");
			
			Congreso congreso = new Congreso();
			
			congreso.agregarLegislador(d1);
			congreso.agregarLegislador(s1);
			congreso.agregarLegislador(d2);
			congreso.agregarLegislador(s2);
			congreso.agregarLegislador(d3);
			congreso.agregarLegislador(s3);
			
			System.out.println(congreso.mostrarLegisladores());
			
	}
}
