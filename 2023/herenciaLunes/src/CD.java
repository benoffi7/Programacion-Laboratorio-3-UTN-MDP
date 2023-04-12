public class CD extends Elemento
{
    private int listadoTemas;

    public CD(int listadoTemas,String nombre) {
        super(nombre);
        this.listadoTemas = listadoTemas;
        super.metodoPrivado();
    }

    public int getListadoTemas() {
        return listadoTemas;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String metodoPrivado() {
        return " - CD";
    }
}
