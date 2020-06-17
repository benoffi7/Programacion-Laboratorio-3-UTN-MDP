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
public abstract class Empleado implements Comparable {

    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado() {
        this("", "", "", 0);
    }

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setAnioIngreso(anioIngreso);
    }

    private void setDni(String dni) {
        this.dni = dni;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    private String getNombre() {
        return nombre;
    }

    private String getApellido() {
        return apellido;
    }

    private String getDni() {
        return dni;
    }

    protected int getAnioIngreso() {
        return anioIngreso;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", " + getApellido() + "\nDni: " + getDni() + "\nDesde " + getAnioIngreso()+"\n";
    }

    public String imprimir() {
        return getNombre() + ", " + getApellido();
    }

    protected abstract float getSalarioReal();

    protected abstract float obtenerSalario();

    @Override
    public int compareTo(Object t) {
        int rta;
        if (t != null && t instanceof Empleado) {

            Empleado e = ((Empleado) t);
            if (getSalarioReal() < e.getSalarioReal()) {
                rta = -1;
            } else {
                if (getSalarioReal() == e.getSalarioReal()) {
                    rta = 0;
                } else {
                    rta = 1;
                }
            }
        } else {
            rta = 0;
        }
        return rta;
    }

    
    public boolean verificarEmpleado(){
        boolean rta=false;
        if( getDni().equals("") && getNombre().equals("") && getApellido().equals("") && getAnioIngreso() == 0){
            rta= true;
        }
        return rta;
    }

    public void cargarDatos(String  dni,String nombre,String apellido, int anio){
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setAnioIngreso(anio);
    }
}
