import java.util.ArrayList;

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


            ArrayList<String>  stringArrayList = new ArrayList<>();
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