package Clases;


public class Cliente {

    private int id;
    private String nombre;
    private char genero;


    public Cliente(String nombre, char genero){
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }




}
