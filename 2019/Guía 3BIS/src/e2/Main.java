package e2;

public class Main
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
		Employee employee2 = new Employee(34234123, "Ana", "Sanchez", 27500);
		System.out.println(employee1.getDescription());
		System.out.println(employee2.getDescription());
		employee1.increaseSalary(15);
		System.out.println(employee1.getName() + " - Annual Salary: " + employee1.annualSalary());
	}
}