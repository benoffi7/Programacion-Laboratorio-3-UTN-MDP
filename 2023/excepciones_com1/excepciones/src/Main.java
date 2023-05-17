import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world!");
        Usuario u = null;
        try
        {
            //hago algo
            throw new MiErrorExeption();
        }
        catch (MiErrorExeption ex)
        {
           // System.out.println("Error - intentelo nuevamente "+ex.getMessage());
        }

        ControladoraUsuario.metodoA();


            ArrayList<Usuario>  stringArrayList = new ArrayList<>();

        Collections.sort(stringArrayList);


        Collections.sort(stringArrayList, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return 0;
            }
        });

        String palabra = "gonzalo";

        palabra.contains("1")||;

//aca
        Collections.sort(stringArrayList, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return 0;
            }
        });

        Collections.sort(stringArrayList, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return 0;
            }
        });
          //  stringArrayList.get(1000);

        ControladoraUsuario.metodoB(true);


        try
        {
            ControladoraUsuario.metodoB(true);
            System.out.println("Siguio");
        }
        catch (MiErrorExeption e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("FIN");
        }




    }
}