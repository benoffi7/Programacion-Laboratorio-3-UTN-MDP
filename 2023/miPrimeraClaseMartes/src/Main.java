import modelo.Auto;
import modelo.Jugador;
import modelo.SeleccionFutbol;

public class Main {
    public static void main(String[] args)
    {
        SeleccionFutbol scaloneta = new SeleccionFutbol("scaloneta","afa","scaloni");
        scaloneta.agregarJugador("messi","el diez",10);
        //scaloneta.getJugadores()[0] = new Jugador("gonzalo","defensor",11);
        System.out.println(scaloneta.getInfoJugadores());


    }
}