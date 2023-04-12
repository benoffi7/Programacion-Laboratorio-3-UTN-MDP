public class DOME
{
    private Elemento[] misElementos;

    public DOME()
    {
        misElementos = new Elemento[100];
    }

    public void agregarCD(CD miCD)
    {

    }

    public void agregarDCD(DVD miDVD)
    {

    }

    public void agregarElemento(Elemento item)
    {
        misElementos[0] = item;
    }

    public Elemento[] getMisElementos() {
        return misElementos;
    }
}
