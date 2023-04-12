public class Main {
    public static void main(String[] args) {
        Elemento cd = new CD(1,"help");
       // System.out.println(cd.metodoPrivadoElemento()); //Elemento
       // System.out.println("Hello world!");


        DOME miDOME = new DOME();
Elemento miDVD = new DVD("harry potter");
       miDOME.agregarElemento(miDVD);

       if (miDOME.getMisElementos()[0] instanceof CD)
       {
           CD rta = (CD)miDOME.getMisElementos()[0];
           System.out.println(rta.metodoPrivadoElemento());

       }
       else
       {
           DVD rta2 = (DVD)miDOME.getMisElementos()[0];
           System.out.println(rta2.metodoPrivadoElemento());

       }



    }
}