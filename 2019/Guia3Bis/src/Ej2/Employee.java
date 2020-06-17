/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Fede
 */
public class Employee {

    private int dni;
    private String name;
    private String surname;
    private double salary;

    public Employee(int dni, String name, String surname, double salary) {
        setDni(dni);
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }

    private void setDni(int dni) {
        this.dni = dni;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public float annualSalary() {
        return (float) getSalary() * 12f;
    }

    public void increaseSalary(float percentage) {
        double nuevoSalario = getSalary() + ((getSalary() * percentage)/100);
        setSalary(nuevoSalario);
    }

    public String getDescription() {
        return "Descripcion del puesto del empleado " + getSurname() + " " + getName();
    }

    @Override
    public String toString() {
        return "Empleado[" + "dni=" + getDni() + ", nombre=" + getName()
                + ", apellido=" + getSurname() + ", salario=" + getSalary() + ']';
    }

}
