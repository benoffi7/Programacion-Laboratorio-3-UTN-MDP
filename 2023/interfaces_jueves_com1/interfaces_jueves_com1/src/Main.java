import interfaces.ILanzardorFuego;
import modelo.DragonChino;
import modelo.Lanzallamas;

public class Main {
    public static void main(String[] args)
    {
        ILanzardorFuego lanzadoresFuego[] = new ILanzardorFuego[2];

        lanzadoresFuego[0] = new DragonChino();
        lanzadoresFuego[1] = new Lanzallamas();

        if (lanzadoresFuego[0] instanceof DragonChino)
        {
            DragonChino dragonChino = (DragonChino) lanzadoresFuego[0];
            dragonChino.metodoLCh();
        }

        for (ILanzardorFuego iLanzardorFuego : lanzadoresFuego)
        {
           // iLanzardorFuego.lanzarFuego();
        }

        lanzarFuego(new DragonChino());
        lanzarFuego(new Lanzallamas());

    }

    public static void lanzarFuego(ILanzardorFuego iLanzardorFuego)
    {
        iLanzardorFuego.lanzarFuego();
        iLanzardorFuego.lanzar();
    }
}