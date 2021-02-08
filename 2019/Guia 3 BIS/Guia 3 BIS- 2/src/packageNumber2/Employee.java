package packageNumber2;

public class Employee 
{
	private int dni;
	private String name;
	private String surname;
	private double salary;
	
	public Employee (int dniReceived, String nameReceived, String surnameReceived, double salaryReceived) {
		setDni(dniReceived);
		setName(nameReceived);
		setSurname(surnameReceived);
		setSalary(salaryReceived);
	}
	
	private int getDni() {
		return dni;
	}
	private void setDni(int dniReceived) {
		dni = dniReceived;
	}
	private String getName() {
		return name;
	}
	private void setName(String nameReceived) {
		name = nameReceived;
	}
	private String getSurname() {
		return surname;
	}
	private void setSurname(String surnameReceived) {
		surname = surnameReceived;
	}
	private double getSalary() {
		return salary;
	}
	private void setSalary(double salaryReceived) {
		salary = salaryReceived;
	}
	
	//user methods//
	public float annualSalary() {
		float annualSalary = (float)getSalary() * 12;
		return annualSalary;
	}
	
	public void increaseSalary(float percentage) {
		float result = ((float)getSalary() * percentage) / 100;
		salary += result;
	}
	
	public String getDescription() {
		return "\nEmployee [ DNI= " +getDni()+ " Name= " +getName()+ " Surname= " +getSurname()+ " Salary= " +getSalary()+ " ]";
	}
	
}
