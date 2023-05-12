public class Controladora
{
    //elevo el error
    public static int metodoA(boolean error) throws Exception {
        if (error)
        {
            throw new Exception("Hola, soy un error");
        }
        return 1;
    }

    //capturo al mismo tiempo que la lanzo
    public static void metodoB(boolean error)
    {
        if (error)
        {
            try
            {
                throw new MiErrorException("Hola!");
            }
            catch (Exception e)
            {
                System.out.println("Ups! "+e.getMessage());
            }
        }
    }

    public static void metodoC(boolean error)
    {
        if (error)
        {
            throw new RuntimeException("Upsi!");
        }
    }


}
