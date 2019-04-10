package tp1;
public class ejercicio5 {
    public static boolean quinto(int dato){
        boolean flag = false;
        if(dato!=0 && dato!=1){
            int datoAnterior = dato - 1;
            while((dato % datoAnterior) != 0){
                datoAnterior--;
            }
            if(datoAnterior == 1)
                System.out.println("El numero ingresado es primo");
            else
                System.out.println("El numero ingresado no es primo");
        }else if(dato==1){
            System.out.println("El dato ingresado no es primo");
        }else{
            flag = true;
        }
        return flag;
    }
}
