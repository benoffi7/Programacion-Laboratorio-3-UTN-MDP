public class MiExcepcion extends Exception 
{
       String mensaje;
        public MiExcepcion(String mensaje) 
        {
            this.mensaje = mensaje;
        }
        public String getMensaje() {
            return mensaje;
        }
    }