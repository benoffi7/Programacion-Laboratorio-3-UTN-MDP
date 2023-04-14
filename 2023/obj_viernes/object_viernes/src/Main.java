import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("gonzalo");
        //System.out.println(persona);

        Persona otraPersona = new Persona("gonzalo");

        List<Persona> personas = new ArrayList<Persona>();

        personas.add(persona);
        personas.add(otraPersona);


        for (int i=0;i<personas.size();i++)
        {
            Persona p = personas.get(i);
            if (p.equals(persona))
            {

            }
        }

        System.out.println(personas.size());

        Perro perro = new Perro();

            System.out.println(persona.equals(perro));

            Empleado empleado = new Empleado("gonzalo",1234);
            Empleado empleado2 = new Empleado("gonzalo",123);

            System.out.println(empleado.equals(null));


    }
}