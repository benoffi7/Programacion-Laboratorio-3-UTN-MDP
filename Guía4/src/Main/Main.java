package Main;
import Clases.Acomision;
import Clases.Fijo;
import Clases.Empresa;

public class Main 
{
	public static void main(String[] args) 
	{
		Empresa xyz = new Empresa("XYZ");
		
		System.out.println(xyz.toString());
		
		System.out.println("\nAgregando Empleados nuevos...\n");
		
		Fijo nuevo1 = new Fijo("569587A", "Javier", "Gómez", 2008, (float) 1225);
		xyz.agregarEmpleado(nuevo1);
		Fijo nuevo2 = new Fijo("896325D", "María", "Núñez", 2013, (float) 1155);
		xyz.agregarEmpleado(nuevo2);
		Acomision nuevo3 = new Acomision("695235B", "Eva", "Nieto", 2010, (float) 750,  179,(float) 8.10);
		xyz.agregarEmpleado(nuevo3);
		Acomision nuevo4 = new Acomision("741258C", "José", "Ruiz", 2012, (float) 750,  81,(float) 7.90);
		xyz.agregarEmpleado(nuevo4);
		
		System.out.println("\n\n\nMostrando Empleados: \n" + xyz.listarEmpleados());
		
		System.out.println("\n\n\nMostrando Empleados FIJOS: \n" + xyz.listarEmpleadosFijos());
		
		System.out.println("\n\n\nMostrando Empleados A comision: \n " + xyz.listarEmpleadosAcomision());
		
		System.out.println("\n\n\nCalculando el sueldo de los empleados... \n ");
		
		xyz.actualizarSueldos();
		
		System.out.println("\n\n\nMostrando Empleados: \n" + xyz.listarEmpleados());
		
		System.out.println("\n\n\nEmpleado con el sueldo mas alto: \n" + xyz.EmpleadoConSueldoMayor());
		
		
	}

}
