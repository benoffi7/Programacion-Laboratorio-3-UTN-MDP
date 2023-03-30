package modelo;

public class SeleccionFutbol
{
    private String nombre;
    private String asociacion;

    private String tecnico;

    private Jugador jugadores[];

    private int validos;

    public SeleccionFutbol(String nombre, String asociacion,
                           String tecnico)
    {
        jugadores = new Jugador[23];
        validos = 0;
    }

    public SeleccionFutbol(String nombre, String asociacion)
    {
        jugadores = new Jugador[23];
        validos = 0;
    }


    public boolean agregarJugador(String nombre, String posicion, int dorsal)
    {
        Jugador unJugador = new Jugador(nombre,posicion,dorsal);
        jugadores[validos] = unJugador;
        validos++;
        return true;
    }



    public boolean agregarJugador(Jugador jugador)
    {
        jugadores[validos] = jugador;
        validos++;
        return true;
    }

    private Jugador[] getJugadores() {
        return jugadores;
    }

    public String getInfoJugadores()
    {
        String rta = "";
        for (int i=0;i<validos;i++)
        {
            rta += jugadores[i].getNombre() + " "+ jugadores[i].getDorsal() + "/n";
        }
        return rta;
    }
}
