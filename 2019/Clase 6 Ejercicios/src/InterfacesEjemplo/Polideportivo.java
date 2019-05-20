/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesEjemplo;

/**
 *
 * @author Fede
 */
public class Polideportivo implements IInstalacionDeportiva, IEdificio {

    private int tipoDeInstalacion;
    private double superficie;
    private String nombre;

    public Polideportivo(int tipo, double nuevaSuperficie, String nuevoNombre) {
        setTipoDeInstalacion(tipo);
        setSuperficie(nuevaSuperficie);
        setNombre(nuevoNombre);
    }

    private void setTipoDeInstalacion(int tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    private void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    @Override
    public String toString() {
        return "El Polideportivo " + getNombre() + " de tipo " + getTipoDeInstalacion()
                + ", posee una superficie de " + getSuperficieEdificio() + " metros cuadrados";
    }

}
