public class Main {
    public static void main(String[] args)
    {
        /*
       CD miCD = new CD(10,"help");
        System.out.println(miCD.metodoPrivado()); //CD

        //principio de sustitucion
        //donde se espera un padre, lo reemplazo por un hijo o un nieto
        Elemento otroCD = new CD(10,"help");
        System.out.println(otroCD.metodoPrivado()); //CD

        Elemento otroOtroCd = new CD(10,"help");
        System.out.println(otroOtroCd.metodoPrivado2());

         */

        DOME dome = new DOME();

        CD miCD = new CD(10,"help");
        DVD miDVD = new DVD("harry potter");

        //dome.agregarElemento(miCD);
        dome.agregarElemento(miDVD);

        Elemento rta = null;

        if (dome.getMisElementos()[0] instanceof  CD)
        {
            CD miCD = (CD)dome.getMisElementos()[0];
            miCD.
            System.out.println(rta.metodoPrivado());    //CD
        }
        else if (dome.getMisElementos()[0] instanceof  DVD)
        {
            rta =  dome.getMisElementos()[0];
            System.out.println(rta.metodoPrivado()); // Elemento
        }


    }
}