package EmpresaXYZ;

public class Main {

	public static void main(String[] args) 
	{
		
		EmpleadoSalarioFijo e1 = new EmpleadoSalarioFijo("Pepe","Falopa","643874A", 2014, 1223);
		EmpleadoAComision e2 = new EmpleadoAComision("Jose", "Fulano", "656898B", 2012, 750, 100, 14);
		EmpleadoSalarioFijo e3 = new EmpleadoSalarioFijo("Pepe","Falopa","643874A", 2013, 1542);
		EmpleadoAComision e4 = new EmpleadoAComision("Jose", "Fulano", "656898B", 2010, 750, 112, 17);
		
		Gestor gestor = new Gestor();
		
		gestor.agregarEmpleado(e1);
		gestor.agregarEmpleado(e2);
		gestor.agregarEmpleado(e3);
		gestor.agregarEmpleado(e4);
		
		System.out.println(gestor.mostrarEmpleados());
		System.out.println(gestor.sueldoMayor());
		
	}

}
