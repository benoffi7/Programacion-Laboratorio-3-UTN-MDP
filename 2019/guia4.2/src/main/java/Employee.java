/**
 * Employee
 */
public class Employee {

    private int dni;
    private String name;
    private String surname;
    private double salary;

    public Employee() {
        dni = 0;
        name = new String("");
        surname = new String("");
        salary = 0;
    }

    public Employee(int dni, String name, String surname, double salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public float annualSalary() {
        float annualSalary = (float)salary * 12;
        return annualSalary;
    }

    public void increaseSalary(float percentage) {
        this.salary += ((this.salary*percentage)/100);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nEmpleado[");
        buffer.append("dni: " + dni);
        buffer.append(", Nombre: " + name);
        buffer.append(", Apellido: " + surname);
        buffer.append(", Salario: " + salary + "]");
        return buffer.toString();
    }

}