
public class Main {

    public static void main(String[] args) {

        int id = 1;
        String descripcion = new String("Manzana");
        int cantidad = 20;
        double precio = 13;

        ItemVenta item = new ItemVenta(id, descripcion, cantidad, precio);

        System.out.println(item.toString());
    }
}