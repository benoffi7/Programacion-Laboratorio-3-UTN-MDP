package modelo;

import interfaces.ILanzadorFuego;

public class LanzaLlamas implements ILanzadorFuego {
    @Override
    public String lanzarFuego() {
        return "Soy un lanzallamas y prendo fuego todo!";
    }
}
