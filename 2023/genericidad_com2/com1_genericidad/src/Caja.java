import java.util.ArrayList;

public class Caja<T extends Barco,P extends String>
{
    T unaVariable;

    P otraVariable;

    int tope;

    ArrayList<T> arrayList;
    ArrayList<P> arrayList2;

    public Caja()
    {
        arrayList = new ArrayList<>();
       // unaVariable = new Gonzalo();

    }

    public T getUnaVariable() {
        return unaVariable;
    }

    public P getOtraVariable() {
        return otraVariable;
    }

    public int getTope() {
        return tope;

    }

    public boolean buscar(T aBuscar)
    {
        return arrayList.contains(aBuscar);
    }

    public void agregar(T elemento)
    {
        arrayList.add(elemento);
    }
}
