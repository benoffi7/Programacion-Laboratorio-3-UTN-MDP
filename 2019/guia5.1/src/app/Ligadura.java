package app;

/**
 * Ligadura
 */
public class Ligadura {

    public static void main(String[] args) {

        A a;
        B b = new B();
        C c = new C();
        System.out.println("Metodos llamados con objeto b desde");
        System.out.println(" referencia de la clase A");
        a = b;
        a.dinamica();
        a.estatica();
        System.out.println("Metodos llamados con objecto c desde");
        System.out.println(" referencia de la clase A");
        a = c;
        a.dinamica();
        a.estatica();
    }
}