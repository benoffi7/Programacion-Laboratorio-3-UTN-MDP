package modelo;

public class Auto
{
    private String marca;
    private String modelo;

    //constructor vacio
    public Auto()
    {
        this.modelo = "";
        this.marca = "";
    }

    public Auto(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    /*
    public Auto(String marca, String modelo, int precio)
    {

    }
     */

    public String getMarca()
    {
        return marca.toLowerCase();
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String devolverInfoCompleta()
    {
        return marca + " " + modelo;
    }

}
