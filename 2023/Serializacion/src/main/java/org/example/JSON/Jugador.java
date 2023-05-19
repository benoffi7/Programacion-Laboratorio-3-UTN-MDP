package org.example.JSON;

public class Jugador 
{
    private Demarcacion puesto;
    private String nombre;

    public Demarcacion getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(Demarcacion puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Soy "+getNombre()+" y juego de "+getPuesto();
    }
    
}
