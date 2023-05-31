import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personaje> personajeArrayList =  ControladoraJSON.leerArchivo();
        System.out.println("Áaaaaóoooo");
        ControladoraJSON.grabarEnJSON(personajeArrayList);
    }
}