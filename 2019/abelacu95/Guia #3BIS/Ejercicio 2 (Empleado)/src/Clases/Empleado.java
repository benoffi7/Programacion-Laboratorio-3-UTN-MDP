package Clases;

import java.text.DecimalFormat;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private double salario;


    public Empleado(String _dni, String _nombre, String _apellido, double _salario) {
        dni = _dni;
        nombre = _nombre;
        apellido = _apellido;
        salario = _salario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public double salarioAnual(){
        return salario * 12;
    }

    public void aumentarSalario(float porcentaje){
        this.salario += (salario * (porcentaje / 100)) ;
    }

    public String getDescripcion(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        return "\n\t.:EMPLEADO:."+
                            "\nDni : "+dni+
                            "\nNombre: "+nombre+
                            "\nApellido: "+apellido+
                            "\nSalario: "+formato1.format(salario);
    }

    public String mostrarSalarioAnual(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        return"Salario Anual: "+formato1.format(salarioAnual());
    }

}
