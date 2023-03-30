import modelo.Auto;

public class Main {
    public static void main(String[] args)
    {
        Auto fordka = new Auto("123",5000,"ka");

        Auto bmw = new Auto();

        bmw.setPrecio(6000);

        System.out.println(fordka.getPrecio());

        System.out.println(bmw.getPrecio());

        System.out.println(fordka.arrancar());

        System.out.println(bmw.apagar());
    }
}