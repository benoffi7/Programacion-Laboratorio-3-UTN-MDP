import java.util.Scanner;

class ControladoraUsuario {
    //atributo
    public static Scanner sc = new Scanner(System.in);

    //métodos
    public static String ingreso_de_string(){
        return sc.next();
    }

    public static int ingreso_de_int(){
        return sc.nextInt();
    }

    public static float ingreso_de_float(){
        return sc.nextFloat();
    }

    public static void mostrar_por_pantalla(String mensaje){
        System.out.println(mensaje);
    }

    public static void cerrar_scanner(){
        sc.close();
    }

}