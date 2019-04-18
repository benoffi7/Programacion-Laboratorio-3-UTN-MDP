package Guia3Bis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String control="s",control2="s",control3="s",Empleado,SegundoEmpleado;
		Scanner teclado=new Scanner(System.in);
		int opcion,op2,op3,alto=6,ancho=8,Area,Perimetro;
		Rectangle miRectangulo;
		Employee miEmpleado=new Employee(23456345,"Carlos","Gutierrez",(double)25000);
		Employee miSegundoEmpleado;
		double salarioAnual;
		while (control == "s")
		{
			menuPrincipal();
			opcion=teclado.nextInt();
			switch(opcion)
			{
			case 1:
				while (control2=="s")
				{
					menuRectangle();
					op2=teclado.nextInt();
					switch(op2)
					{
					case 1:
						miRectangulo=new Rectangle(ancho,alto);
						System.out.println("Alto: "+miRectangulo.retornarHeight()+" || "+"Ancho: "+miRectangulo.retornarWidth());
						break;
					case 2:
						miRectangulo=new Rectangle(ancho,alto);
						Area=miRectangulo.calculateArea(ancho,alto);
						Perimetro=miRectangulo.calculatePerimeter(ancho,alto);
						System.out.println("Area: "+Area+" || "+"Perimetro: "+Perimetro);
						break;
					case 3:
						miRectangulo=new Rectangle(ancho,alto);
						System.out.println("Ingrese el ancho del rectángulo: ");
						ancho=teclado.nextInt();
						System.out.println("Ingrese la altura del rectángulo: ");
						alto=teclado.nextInt();
						Area=miRectangulo.calculateArea(ancho, alto);
						Perimetro=miRectangulo.calculatePerimeter(ancho, alto);
						System.out.println("Area: "+Area+" || "+"Perimetro: "+Perimetro);
						break;
					case 4:
						miRectangulo=new Rectangle(1,0);
						Area=miRectangulo.calculateArea(1,0);
						Perimetro=miRectangulo.calculatePerimeter(1, 0);
						System.out.println("Area: "+Area+" || "+"Perimetro: "+Perimetro);
						break;
					case 5:
						control2="n";
						break;
					}
					presioneLaTeclaENTERParaContinuar();
				}
				break;
			case 2:
				while (control3=="s")
				{
					menuEmployee();
					op3=teclado.nextInt();
					switch(op3)
					{
					case 1:
						//dni/name/surname/salary
						miEmpleado=new Employee(23456345,"Carlos","Gutierrez",(double)25000);
						miSegundoEmpleado=new Employee(34234123,"Ana","Sánchez",(double)27500);
						Empleado=miEmpleado.getDescription(miEmpleado);
						SegundoEmpleado=miSegundoEmpleado.getDescription(miSegundoEmpleado);
						System.out.println(""+Empleado+"\n");
						System.out.println(""+SegundoEmpleado);
						break;
					case 2:
						miEmpleado.increaseSalary(15);
						salarioAnual=miEmpleado.annualSalary();
						System.out.println("Salario Anual: "+salarioAnual);
						break;
					case 3:
						control3="n";
						break;
					}
					presioneLaTeclaENTERParaContinuar();
				}
			case 3:
				control = "n";
				break;
			}
			presioneLaTeclaENTERParaContinuar();
		}
		teclado.close();
	}
	
	private static void presioneLaTeclaENTERParaContinuar ()
	{
		System.out.println("Presione la tecla ENTER para continuar...");
		try
		{
			System.in.read();
		}
		catch(Exception e)
		{}
	}
	
	private static void menuPrincipal()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Menu Rectangulo.");
		System.out.println("2 - Menu Empleado.");
		System.out.println("3 - Salir.");
	}
	
	private static void menuRectangle()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Inicializar e imprimir un rectángulo.");
		System.out.println("2 - Imprimir por pantalla el área y perímetro de un rectángulo.");
		System.out.println("3 - Modificar el alto y el ancho de un rectangulo e Imprimir el nuevo perímetro y área.");
		System.out.println("4 - Operaciones con un rectangulo con valores predeterminados.");
		System.out.println("5 Salir.");
	}
	
	private static void menuEmployee()
	{
		System.out.println("Ingrese una opción \n");
		System.out.println("1 - Inicializar empleados y imprimirlos por pantalla.");
		System.out.println("2 - Aumentar salario del empleado Carlos en un 15% y mostrar su salario anual.");
		System.out.println("3 - Salir.");
	}

}
