/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 * tienen un salario mínimo que será constante para todos los empleados de este
 * tipo e igual a 750.00$, un número de clientes captados y un monto por cada
 * cliente captado. El salario se obtiene multiplicando los clientes captados
 * por el monto por cliente, si el salario por los clientes captados no llega al
 * salario mínimo, cobrará esta cantidad.
 *
 * @author Fede
 */
public class EComision extends Empleado {

    private final float salarioMinimo = 750f;
    private int cantClientesCaptados;
    private float montoPorCliente;

    private float salarioReal;

    public EComision() {
        super();
        setCantClientesCaptados(0);
        setMontoPorCliente(0);
        salarioReal = obtenerSalario();
    }

    public EComision(String dni, String nombre, String apellido, int anioIngreso, int cantClientesCaptados, float montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);

        setCantClientesCaptados(cantClientesCaptados);

        setMontoPorCliente(montoPorCliente);

        salarioReal = obtenerSalario();
    }

    public void setCantClientesCaptados(int cantClientesCaptados) {
        this.cantClientesCaptados = cantClientesCaptados;
    }

    public void setMontoPorCliente(float montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    private int getCantClientesCaptados() {
        return cantClientesCaptados;
    }

    private float getMontoPorCliente() {
        return montoPorCliente;
    }

    private float getSalarioMinimo() {
        return salarioMinimo;
    }

    @Override
    protected float getSalarioReal() {
        return salarioReal;
    }

    @Override
    protected float obtenerSalario() {
        float salarioFinal = getCantClientesCaptados() * getMontoPorCliente();
        if (salarioFinal < getSalarioMinimo()) {
            salarioFinal = salarioMinimo;
        }
        return salarioFinal;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\nSalario: $" + getSalarioReal();
    }

    @Override
    public String toString() {
        return super.toString() + "Salario Minimo: $" + getSalarioMinimo() + "\nCantidad de Clientes:"
                + getCantClientesCaptados() + "\nMonto cobrado por cliente: "
                + getMontoPorCliente() + "\nSalario Neto: $" + getSalarioReal()+"\n\n";
    }

    public void cargarDatos(String dni, String nombre, String apellido, int anio, int cant, float monto) {
        super.cargarDatos(dni, nombre, apellido, anio);
        setCantClientesCaptados(cant);
        setMontoPorCliente(monto);
        salarioReal = obtenerSalario();
    }
}
