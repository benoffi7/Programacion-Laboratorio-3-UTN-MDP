public class ControladoraUsuario
{
    public static void metodoA()  {
        try {
            throw new MiErrorExeption();

        }
        catch (MiErrorExeption ex)
        {

        }
    }

    public static void metodoB(boolean error) throws MiErrorExeption
    {
        if (error)
                throw new MiErrorExeption();

    }

}
