import interfaces.ILanzadorFuego;
import modelo.Dragon;
import modelo.DragonChino;
import modelo.LanzaLlamas;
import modelo.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //ILanzadorFuego iLanzadorFuego = new ILanzadorFuego() ;
        ILanzadorFuego iLanzadorFuego = new DragonChino();
       // System.out.println(iLanzadorFuego.lanzarFuego());

        ILanzadorFuego lanzadoresDeFuego[] = new ILanzadorFuego[2];
        lanzadoresDeFuego[0] = new DragonChino();
        lanzadoresDeFuego[1] = new LanzaLlamas();

        lanzarFuego(lanzadoresDeFuego[0]);
        lanzarFuego(lanzadoresDeFuego[1]);
        //lanzarFuego(new Perro());

        System.out.println(lanzadoresDeFuego[1].lanzarFuego());

        if (lanzadoresDeFuego[0] instanceof DragonChino) {
            DragonChino dragonChino = (DragonChino) lanzadoresDeFuego[0];
            //dragonChino.montar();
        }
    }

    public static void lanzarFuego(ILanzadorFuego iLanzadorFuego)
    {
        System.out.println(iLanzadorFuego.lanzarFuego());
    }
}