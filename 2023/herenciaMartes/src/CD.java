public class CD extends Elemento
{
    private int listadoTemas;

    public CD(int listadoTemas,String nombre)
    {
        super(nombre);
        this.listadoTemas = listadoTemas;
    }

    @Override
    public String metodoPrivadoElemento() {
        return  " CD";
    }

    public void metodoCD()
    {
        metodoPrivadoElemento();

    }


}
