package modelo;

import interfaces.ILanzadorFuego;
import interfaces.IVolar;

public  abstract class  Dragon implements ILanzadorFuego {

    @Override
    public String lanzarFuego()
    {
        return "Soy un dragon y estoy lanzando fuego";
    }
}
