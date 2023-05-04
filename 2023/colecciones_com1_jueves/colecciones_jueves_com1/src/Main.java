import java.util.*;

public class Main {
    public static void main(String[] args)
    {/*
        Comision comision = new Comision();

        ArrayList<Alumno> alumnoArrayList = new ArrayList<>();

        alumnoArrayList.add(new Alumno(10, "b"));
        alumnoArrayList.add(new Alumno(2,"a"));
        alumnoArrayList.add(new Alumno(1,"a"));
        alumnoArrayList.add(new Alumno(1,"z"));

        //System.out.println(alumnoArrayList.size());

      //  alumnoArrayList.clear();//limpiar toda la coleccion pero sin dejar que sea nula

       // alumnoArrayList = null; cuidado

        //System.out.println(alumnoArrayList.contains(new Alumno(1,"gonzalo")));

        Collections.sort(alumnoArrayList);

        for (Alumno a : alumnoArrayList)
        {
            //System.out.println(a);
        }

        Alumno peque = Collections.min(alumnoArrayList);
       // System.out.println(peque);

        Alumno mayor = Collections.max(alumnoArrayList);
        //System.out.println(mayor);

        //System.out.println(Collections.frequency(alumnoArrayList,new Alumno(1,"a")));


        HashSet<Alumno> alumnoHashSet = new HashSet<>();
        System.out.println(alumnoHashSet.add(new Alumno(1, "a")));
        System.out.println(alumnoHashSet.add(new Alumno(2,"b")));
        System.out.println(alumnoHashSet.add(new Alumno(3,"c")));
        System.out.println(alumnoHashSet.add(new Alumno(4,"d")));
        System.out.println(alumnoHashSet.add(new Alumno(4,"d")));

      //  alumnoHashSet.add(new String("aaa"));

        Iterator<Alunmo> it = alumnoHashSet.iterator();

        while (it.hasNext())
        {
            Alumno miAlumno = it.next();
            System.out.println(miAlumno);

        }

        */

        HashMap<Integer,Alumno> miMapa = new HashMap<>();

        Alumno alumnoG = new Alumno(1, "gonzalo");
        Alumno alumnoGa = new Alumno(1, "gaston");

        Integer l1 = new Integer(alumnoG.getLegajo());

        miMapa.put(l1,alumnoG);
        if (!miMapa.containsKey(new Integer(alumnoGa.getLegajo())))
        {
            miMapa.put(new Integer(alumnoGa.getLegajo()), alumnoGa);
        }
        else
        {
            System.out.println("Clave repetida");
        }

        //devuelve null si no lo encuentra
        Alumno encontrado = miMapa.get(new Integer(2));
        if (encontrado!=null)
           System.out.println(encontrado);
        else
            System.out.println("No encontrado");

        Iterator<Map.Entry<Integer,Alumno>> it = miMapa.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<Integer,Alumno> entrada = it.next();
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());

        }

    }
}