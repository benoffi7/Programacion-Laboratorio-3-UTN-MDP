package e2;

public class Employee
{
	private int dni;
	private String name;
	private String surname;
	private float salary;
	
	public Employee(int dni, String name, String surname, float salary)
	{
		setDni(dni);
		setName(name);
		setSurname(surname);
		setSalary(salary);
	}
	
	public void setDni(int dni)
	{
		this.dni = dni;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	public int getDni()
	{
		return dni;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public float getSalary()
	{
		return salary;
	}

	public float annualSalary()
	{
		float annualSalary = getSalary() * 12;
		return annualSalary;
	}
	
	public void increaseSalary(float percentage)
	{
		float increment = (getSalary() * percentage) / 100;
		setSalary(getSalary() + increment);
	}
	
	public String getDescription()
	{
		String description = "[Employee] DNI: " + getDni() + " | Name: " + getName() + " | Surname: " + getSurname() + " | Salary: " + getSalary();
		return description;
	}
}