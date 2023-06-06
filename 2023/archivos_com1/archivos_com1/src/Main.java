import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        //ControladoraArchivosPrimitivos.grabarDatos();
       // ControladoraArchivosPrimitivos.leerDatos();

        Persona persona = new Persona("gonzalo");
        Persona persona2 = new Persona("juan");

        ArrayList<Persona> personaArrayList = new ArrayList<>();

        personaArrayList.add(persona);
        personaArrayList.add(persona2);

        ControladoraArchivosObjetos.grabar(personaArrayList);

        ArrayList<Persona> arrayList = new ArrayList<>();
        arrayList = ControladoraArchivosObjetos.leer();

        System.out.println(arrayList);
    }
}