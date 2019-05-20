/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.time.Year;

/**
 * un sueldo básico y un porcentaje adicional en función del número de años que
 * llevan: menos de dos años salario base, de 2 a 3 años: 5% más; de 4 a 7 años:
 * 10% más; de 8 a 15 años: 15% más y más de 15 años: 20% más.
 *
 * @author Fede
 */
public class EAsalariado extends Empleado {

    private float salarioBase;

    private float salarioReal;

    public static final float[] PORCENTAJES = {1.0f, 1.05f, 1.1f, 1.15f, 1.2f};

    public EAsalariado() {
        super();
        setSalarioBase(0f);
        salarioReal = salarioBase;
    }

    public EAsalariado(String dni, String nombre, String apellido, int anioIngreso, float salarioBase) {
        super(dni, nombre, apellido, anioIngreso);
        setSalarioBase(salarioBase);
        salarioReal = obtenerSalario();
    }

    private float getSalarioBase() {
        return salarioBase;
    }

    @Override
    protected float getSalarioReal() {
        return salarioReal;
    }

    private void setSalarioBase(float base) {
        salarioBase = base;
    }

    @Override
    protected float obtenerSalario() {
        int antiguedad = Year.now().getValue() - getAnioIngreso();

        float salarioReal = 0f;

        if (antiguedad == 0) {
            salarioReal = salarioBase * PORCENTAJES[0];
        } else {
            if (antiguedad >= 2 || antiguedad <= 3) {
                salarioReal = salarioBase * PORCENTAJES[1];
            } else {
                if (antiguedad >= 4 || antiguedad <= 7) {
                    salarioReal = salarioBase * PORCENTAJES[2];
                } else {
                    if (antiguedad >= 8 || antiguedad <= 15) {
                        salarioReal = salarioBase * PORCENTAJES[3];
                    } else {
                        salarioReal = salarioBase * PORCENTAJES[4];
                    }
                }
            }
        }
        return salarioReal;
    }

    public String imprimir() {
        return super.imprimir() + "\nSalario: $" + getSalarioReal();
    }

    private String mostrarPorcentajes() {
        StringBuilder informacion = new StringBuilder();
        informacion.append("{");
        for (int i = 0; i < PORCENTAJES.length; i++) {
            informacion.append(String.valueOf(PORCENTAJES[i]));
            informacion.append(" ");
        }
        informacion.append("}");
        return informacion.toString();
    }

    @Override
    public String toString() {
        return super.toString() + "Salario base: $" + getSalarioBase()
                + "\nSalario Neto: $" + getSalarioReal()
                + "\nPorcentajes de Antiguedad:" + mostrarPorcentajes() + "\n\n";
    }

    public void cargarDatos(String dni, String nombre, String apellido, int anio, float salarioBase) {
        super.cargarDatos(dni, nombre, apellido, anio);
        setSalarioBase(salarioBase);
        salarioReal = obtenerSalario();
    }
}
