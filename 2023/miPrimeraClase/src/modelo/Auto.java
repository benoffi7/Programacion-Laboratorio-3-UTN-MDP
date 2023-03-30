package modelo;

public class Auto
{
    //atributos/caracteristicas de una clase

    private String patente;

    private int precio;

    private String modelo;

    //constructores

    //vacio
    public Auto()
    {
        patente = "";
        precio = 0;
        modelo = "";
    }

    //completo

    public Auto(String patente, int precio, String _modelo)
    {
        this.patente = patente;
        this.precio = precio;
        modelo = _modelo;
    }

    //get -> get+NombreAtributo, devuelve el atributo



    //set -> set+NombreAtributo, es void y tiene un solo parametro con el mismo tipo de variable


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String arrancar()
    {
        return "encendido";
    }

    public String apagar()
    {
        return "apagado";
    }


}
