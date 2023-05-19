import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("aaaa");



        ArrayList<Boolean> booleanArrayList = new ArrayList<>();
       // booleanArrayList.add("aaaaa");


//        Caja<String,Boolean> miCaja = new Caja<>();
        //miCaja.agregar("hola");

       // miCaja.agregar(true);

      //  Caja<Boolean,String> miOtraCaja = new Caja<>();
     //   miOtraCaja.agregar(true);
        //miOtraCaja.get
        //miOtraCaja.agregar("hola");

        otroMetodo("hola","juan");
        otroMetodoComparacion("hola","juan");
        otroMetodo(new Corbeta(), new Corbeta());

    }

    public static <T extends Comparable> int otroMetodo(T unaVarible, T otraVarible)
    {
        return  unaVarible.compareTo(otraVarible);
    }

    public static int otroMetodoComparacion(Comparable unaVariable, Comparable otraVarible)
    {
        return unaVariable.compareTo(otraVarible);
    }





}