public class DOME
{
    private Elemento misElementos[];

    public DOME()
    {
        misElementos = new Elemento[100];
    }

    public boolean agregarElemento(Elemento elemento)
    {
        misElementos[0] = elemento;
        return true;
    }

    public Elemento[] getMisElementos() {
        return misElementos;
    }
}
