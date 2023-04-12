public class DVD extends Elemento
{
    public DVD(String nombre) {
        super(nombre);
    }

    public String imprimirInfo()
    {
        return super.getNombre();
    }
}
