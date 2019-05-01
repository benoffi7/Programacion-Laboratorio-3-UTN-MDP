package DoMe;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ElementoMultimedia DoMe = new ElementoMultimedia();
		
		
		ArrayList<Premio> p1 = new ArrayList<Premio>();
		Premio pre1 = new Premio("Inglaterra","Mejor Actor");
		p1.add(pre1);
		
		ArrayList<Anio>n1 = new ArrayList<Anio>(); 
		Anio an1 = new Anio("2019");
		n1.add(an1);
		
		ArrayList<Idioma>id1 = new ArrayList<Idioma>();
		Idioma idi1 = new Idioma("ingles");
		id1.add(idi1);
		
		ArrayList<Clasificacion> c1 = new ArrayList<Clasificacion>();
		Clasificacion cl1 = new Clasificacion("ATP");
		c1.add(cl1);
		
		ArrayList<Genero> g1 = new ArrayList<Genero>();
		Genero gen1 = new Genero("TERROR");
		g1.add(gen1);
		
		ArrayList<Reparto> rep1 = new ArrayList<Reparto>();
		Reparto rep2 = new Reparto("George Clooney","Actor");
		rep1.add(rep2);
		
		ArrayList<Sub> sub1 = new ArrayList<Sub>(); 
		Sub sub2 = new Sub("español");
		sub1.add(sub2);
		
		Musica m1 = new Musica(10.0f,p1,id1,n1,c1,g1,"muy buena","PinkFloyd","Estados Unidos","CD","nose","123",10,"muy buena",01,true, "King","kignking",22);
		Pelicula peli1 = new Pelicula(10.0f,p1,id1,n1,c1,g1, "buenisima","IT","Estados unidos","DVD","Warner", "warner",10,"muy buena",02,false, "king", rep1, sub1,100000000.00);
		
		DoMe.Agregar(peli1);
		DoMe.Agregar(m1);
		System.out.println(peli1.toString());
		System.out.println(m1.toString());
	
		String genero = "TERROR";
		DoMe.busquedaPorGenero(genero);
	}

}
