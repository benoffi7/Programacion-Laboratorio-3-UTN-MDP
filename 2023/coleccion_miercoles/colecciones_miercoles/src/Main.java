import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Alumno> alumnoArrayList = new ArrayList<>();
        ArrayList<Alumno> alumnoArrayList2 = new ArrayList<>();

        alumnoArrayList.add(new Alumno("gonzalo",3));
        alumnoArrayList.add(new Alumno("gaston",1));
        alumnoArrayList.add(new Alumno("gaston",1));
        alumnoArrayList.add(new Alumno("juan",10));

        Alumno gonzalo = new Alumno("pepe",123);
        Perro miPerro = new Perro("salchicha");

        //gonzalo.compareTo(miPerro);

        for (Alumno miAlumno : alumnoArrayList)
        {
           // System.out.println(miAlumno);
        }

        //System.out.println(alumnoArrayList.size());

        Collections.sort(alumnoArrayList);

        for (Alumno miAlumno : alumnoArrayList)
        {
           // System.out.println(miAlumno);
        }


        Alumno peque = Collections.min(alumnoArrayList);
        Alumno mas_grande = Collections.max(alumnoArrayList);
        int cantidad = Collections.frequency(alumnoArrayList,new Alumno("",1));


        //System.out.println(cantidad);
        //System.out.println(mas_grande);
        //System.out.println(peque);

        HashSet<Alumno>miSet = new HashSet<>();
        System.out.println(miSet.add(new Alumno("gonzalo",3)));
        System.out.println(miSet.add(new Alumno("gaston",1)));
        System.out.println(miSet.add(new Alumno("gaston",1)));
        miSet.add(new Alumno("juan",10));
        miSet.add(new Alumno("juan",10));


        Iterator<Alumno> it = miSet.iterator();

        while (it.hasNext())
        {
            Alumno a = it.next();
            System.out.println(a);
        }

         */

        HashMap<Integer,Alumno> miMapa = new HashMap<>();

        HashMap<Alumno,String> otroMapa = new HashMap<>();

        HashMap<String,ArrayList<Alumno>> otroOtroMapa = new HashMap<>();

        Alumno miAlumno = new Alumno("gonzalo",1);
        Alumno miAlumno2 = new Alumno("gaston",2);

        //para agregar elementos
        miMapa.put(new Integer(miAlumno.getLegajo()),miAlumno);

        if (!miMapa.containsKey(new Integer(2)))

                miMapa.put(new Integer(miAlumno2.getLegajo()),miAlumno2);

        else
            System.out.println("Clave repetida");

        //recuperar un elemento, si no lo encuentra devuelve null

        Alumno encontrado = miMapa.get(new Integer(1));
        if (encontrado!=null)
        {
            // System.out.println(encontrado.getNombre());

        }
        else
            System.out.println("No encontrado");

        //System.out.println(miMapa.size());
        //miMapa.clear();

        Iterator<Map.Entry<Integer,Alumno>> it = miMapa.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry<Integer,Alumno> entradaDelMapa =  it.next();
            System.out.println("Legajo: "+entradaDelMapa.getKey());
            System.out.println("Alumno: "+entradaDelMapa.getValue().getNombre());
        }
    }
}