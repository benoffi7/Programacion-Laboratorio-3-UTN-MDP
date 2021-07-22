package app;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Hora reloj = new Hora(13, 4, 22);

        
        System.out.println(reloj.toString());

        reloj.oneSecForward();

        System.out.println(reloj.toString());

        reloj.oneSecBackwards();

        System.out.println(reloj.toString());

    }
}