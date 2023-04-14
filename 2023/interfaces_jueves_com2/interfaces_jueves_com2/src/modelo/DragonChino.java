package modelo;

import interfaces.IVolar;

public class DragonChino extends Dragon implements IVolar {
    @Override
    public void volar() {

    }

    @Override
    public String lanzarFuego() {
        return "Soy un dragon chino y... "+super.lanzarFuego();
    }

    @Override
    public void montar()
    {
        System.out.println("Dragon chino");
    }
}
