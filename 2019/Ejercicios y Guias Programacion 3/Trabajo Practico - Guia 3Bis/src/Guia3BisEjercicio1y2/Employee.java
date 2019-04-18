package Guia3Bis;

public class Employee {
	private int dni;
	private String name;
	private String surname;
	private double salary;
	
	public Employee(int dni,String name ,String surname ,double salary)
	{
		setDni(dni);
		setName(name);
		setSurname(surname);
		setSalary(salary);
	}
	
	private void setDni(int dni)
	{
		this.dni=dni;
	}
	private void setName(String name)
	{
		this.name=name;
	}
	private void setSurname(String surname)
	{
		this.surname=surname;
	}
	private void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	private int getDni()
	{
		return dni;
	}
	private String getName()
	{
		return name;
	}
	private String getSurname()
	{
		return surname;
	}
	private double getSalary()
	{
		return salary;
	}
	
	public double annualSalary()
	{
		double annualSalary=getSalary()*12;
		return annualSalary;
	}
	
	public void increaseSalary(float percentage)
	{
		setSalary((getSalary())+(getSalary()*percentage)/100);
	}
	
	public String getDescription(Employee miEmpleado)
	{
		return "Empleado--[dni="+dni+" || nombre="+name+" || apellido="+surname+" || salario="+salary;
	}
	
}
