import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");
        Perro p = null;
        try
        {
            p.toString();
        }
        catch (NullPointerException e)
        {
            System.err.println("Ocurrio un NPE");
        }
        catch (Exception e)
        {

        }

        try {
            Controladora.metodoA(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Controladora.metodoB(true);

         */

        Controladora.metodoC(false);

        Controladora.metodoB(true);

        ArrayList<String>stringArrayList = new ArrayList<>();
        try
        {
            stringArrayList.get(1000);
        }
        catch (Exception ex)
        {

        }


        System.out.println("FIN");
    }
}