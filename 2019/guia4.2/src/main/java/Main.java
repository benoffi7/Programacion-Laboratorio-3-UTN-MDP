/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        //*------------------------------------------

        int dni = 72555555;
        String name = new String("Carlos");
        String surname = new String("Gutierrez");
        double salary = 25000;

        Employee empleado = new Employee(dni, name, surname, salary);

        System.out.println(empleado.toString());

        //*------------------------------------------

        dni = 34234123;
        name = "Ana";
        surname = "Sanchez";
        salary = 27500;

        Employee empleada = new Employee(dni, name, surname, salary);

        System.out.println(empleada.toString());
        
        //*------------------------------------------

        empleado.increaseSalary(15);
        System.out.println("Salario anual Carlos: "+empleado.annualSalary());


    }
}