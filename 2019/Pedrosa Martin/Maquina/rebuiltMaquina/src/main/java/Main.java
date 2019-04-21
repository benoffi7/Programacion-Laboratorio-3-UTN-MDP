import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

// ----------------------------------------------------------------------------
public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static Expendedora maquina = new Expendedora();

    public static void main(String[] args) {

        maquina.setTotalMaquina(0);

        cargarMaquinaFromFile();
        productos = fromFile();
        menu();

        scan.close();

    }

    // ----------------------------------------------------------------------------

    public static void menu() {

        ArrayList<Producto> objectsList = new ArrayList<Producto>();
        int opcion = 0;
        char repeat = 's';
        while (repeat == 's') {

            visualMenu();
            if (scanInt() == true) {

                opcion = scan.nextInt();
                switch (opcion) {

                case 1:
                    System.out.print("\nSu saldo es de: " + maquina.getSaldoCliente());

                    if (objectsList.size() != 0) {
                        System.out.print(". Con su compra le quedarian: "
                                + (maquina.getSaldoCliente() - sumaCarrito(objectsList)));
                    }
                    System.out.println("\n");
                    pressAnyKeyToContinue();
                    break;

                case 2:
                    System.out.print("Ingrese su saldo: ");

                    if (scanFloat() == true) {

                        float saldo = scan.nextFloat();
                        maquina.setSaldoCliente(saldo);
                        System.out.println("Su saldo es de: " + maquina.getSaldoCliente());
                        pressAnyKeyToContinue();

                    } else {

                        scan.next();

                    }

                    break;
                case 3:

                    char repetir = 's';
                    while (repetir == 's') {

                        productos = fromFile();

                        for (int i = 0; i < productos.size(); i++) {
                            showList(productos, i);
                        }
                        boolean flag = addCart(objectsList);

                        if (flag == false) {
                            System.out.println("Desea ingresar otro producto?: (S/N) ");
                            repetir = scan.next().charAt(0);
                        } else {
                            System.out.print("\n\nDesea ingresar un numero correcto? (S/N): ");
                            repetir = scan.next().charAt(0);
                        }

                    }
                    break;
                case 4:

                    ArrayList<Producto> clientList = new ArrayList<Producto>();
                    char sino = 's';
                    while (sino == 's' && objectsList.size() > 0) {
                        boolean flag = false;

                        for (int i = 0; i < objectsList.size(); i++) {

                            if (objectsList.get(i).getProductStock() != 0) {

                                clientList.add(newObj(objectsList.get(i)));

                            }

                        }

                        objectsList.clear();

                        for (int i = 0; i < clientList.size(); i++) {
                            showList(clientList, i);
                            System.out.println("Costo: "
                                    + clientList.get(i).getProductPrecio() * clientList.get(i).getProductStock()
                                    + "\n");
                        }

                        System.out.print("Ingrese la ID del producto al que quiere editar: ");
                        if (scanInt() == true) {

                            int id = scan.nextInt();

                            if (clientList.size() > (id - 1) && (id - 1) > -1) {
                                System.out.println("\n\n" + clientList.get((id - 1)).getProductStock() + " "
                                        + clientList.get((id - 1)).getProductNombre());

                                System.out.println(
                                        "Ingrese la nueva cantidad que quiere llevar de este producto, Ingrese 0 para eliminarlo de la lista: ");
                                if (scan.hasNextInt() == true) {

                                    clientList.get((id - 1)).setProductStock(scan.nextInt());

                                } else {

                                    scan.next();

                                }

                            } else {
                                flag = true;
                            }

                        } else {

                            flag = true;
                            scan.next();

                        }

                        for (int i = 0; i < clientList.size(); i++) {

                            if (clientList.get(i).getProductStock() != 0) {

                                objectsList.add(clientList.get(i));

                            }

                        }
                        clientList.clear();
                        if (flag == false) {
                            System.out.println("Quiere editar otro producto?: (S/N)");
                            sino = scan.next().charAt(0);
                        } else {
                            System.out.print("\n\nDesea ingresar un numero correcto? (S/N): ");
                            sino = scan.next().charAt(0);

                        }

                    }
                    if (objectsList.size() == 0) {

                        System.out.println("No ha realizado ninguna compra... ");
                        pressAnyKeyToContinue();

                    }
                    break;
                case 5:
                    mostrarBoleto(objectsList);
                    // System.out.println(sumaCarrito(objectsList));

                    for (int i = 0; i < objectsList.size(); i++) {

                        for (int j = 0; j < productos.size(); j++) {

                            if (objectsList.get(i).getProductNombre()
                                    .equals(productos.get(j).getProductNombre()) == true) {
                                // System.out.println("Compré: " + objectsList.get(i).getProductStock());
                                // System.out.println("Había: " + productos.get(j).getProductStock());
                                productos.get(j).setProductStock(
                                        productos.get(j).getProductStock() - objectsList.get(i).getProductStock());
                                // System.out.println("Quedan: " + productos.get(j).getProductStock());

                            }

                        }

                    }

                    // System.out.println(maquina.getTotalMaquina());
                    maquina.agregarTotalMaquina(maquina.getSaldoCliente());

                    // System.out.println(maquina.getTotalMaquina());
                    // System.out.println(sumaCarrito(objectsList));

                    maquina.setSaldoCliente((maquina.getSaldoCliente() - sumaCarrito(objectsList)));

                    maquina.restarTotalMaquina(maquina.getSaldoCliente());

                    toFile();
                    objectsList.clear();
                    cargarFileMaquina();

                    break;

                case 0:
                    repeat = 'n';
                    break;

                case 999:

                    // Funciones especiales-------------------------------------------

                    int choice = 0;
                    System.out.println(
                            "\n\t1. Agregar Producto\t\t\t2. Ver productos\n\n\t3. Editar productos\t\t\t4. Modificar Saldo de Maquina\n\n\t5. Retirar Dinero de Maquina\t\t0. Salir\n\n\t");
                    if (scanInt() == true) {

                        choice = scan.nextInt();
                        secondSwitch(choice);

                    } else {

                        scan.next();

                    }
                    break;
                default:
                    System.out.println("Ingrese un numero de la lista...");
                    break;

                }
            } else {

                scan.next();

            }

        }

    }
    // ----------------------------------------------------------------------------

    public static void secondSwitch(int choice) {
        switch (choice) {

        case 1:

            boolean again = true;
            while (again == true) {

                System.out.print("Ingrese el nombre del producto: ");
                String nombre = scan.next();

                boolean is = isProductNew(nombre);

                if (is == true) {

                    System.out.print("Ingrese el precio del producto: ");
                    if (scanFloat() == true) {

                        float precio = scan.nextFloat();

                        System.out.print("Ingrese cuantas unidades de este producto hay en stock: ");
                        if (scanInt() == true) {

                            int stock = scan.nextInt();

                            productos.add(new Producto(nombre, precio, stock));

                        } else {

                            scan.next();

                        }

                    } else {

                        scan.next();

                    }

                } else {

                    System.out.println("\nEl producto ya existe...");

                }

                System.out.println("Desea agregar otro producto? (S/N): ");
                char sino = scan.next().charAt(0);
                if (sino != 's') {

                    again = false;

                }

            }
            toFile();

            break;

        case 2:

            for (int i = 0; i < fromFile().size(); i++) {
                showList(fromFile(), i);
            }

            pressAnyKeyToContinue();
            break;
        case 3:
            editFile();
            break;
        case 4:
            System.out.println("El saldo actual en la maquina es de: " + maquina.getTotalMaquina());
            System.out.println("Ingrese cuanto sumarle o restarle a la maquina: ");
            if (scanInt() == true) {

                float nuevo = scan.nextFloat();
                modificarSaldoMaquina(nuevo);
                cargarFileMaquina();

            } else {

                scan.next();

            }

            break;
        case 5:
            maquina.setTotalMaquina(0);
            System.out.println("Maquina vaciada...");
            break;

        case 0:
            break;

        default:
            System.out.println("Opcion no disponible ");
            pressAnyKeyToContinue();
            break;

        }
    }

    // ----------------------------------------------------------------------------

    public static void visualMenu() {

        System.out.println(
                "\n\t1. Ver saldo\t\t2. Ingresar saldo \n\n\t3. Comprar \t\t4. Editar Compra \n\n\t5. Retirar\t\t0. Salir\t\t\n\n\t999. Developer tools");

    }
    // ----------------------------------------------------------------------------

    public static void toFile() {

        try {

            FileOutputStream f = new FileOutputStream("myProducts.txt", false);
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (int i = 0; i < productos.size(); i++) {

                if (productos.get(i).getProductNombre().equalsIgnoreCase("deletedObject") == false) {

                    o.writeObject(productos.get(i));

                }

            }
            o.close();
            f.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        } catch (IOException e) {

            System.out.println("Error initializing stream");

        }

    }

    // ----------------------------------------------------------------------------

    public static ArrayList<Producto> fromFile() {

        ArrayList<Producto> objectsList = new ArrayList<Producto>();

        Producto obj = null;
        boolean stop = false;

        try {

            FileInputStream fi = new FileInputStream(("myProducts.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            try {

                obj = (Producto) oi.readObject();
                objectsList.add(obj);

                while (stop == false) {

                    if ((obj) == null) {

                        stop = true;

                    }

                    obj = (Producto) oi.readObject();

                    objectsList.add(obj);

                }
            } catch (IOException ex) {

                // System.out.println("\nIOException\n");

            }

            // System.out.println("borp");

            oi.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
            stop = true;

        } catch (IOException e) {

            System.out.println("Error initializing stream");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

        return objectsList;

    }

    // ----------------------------------------------------------------------------

    public static void editFile() {

        ArrayList<Producto> objectsList = fromFile();

        Producto obj;

        for (int i = 0; i < objectsList.size(); i++) {
            showList(objectsList, i);
        }

        char sino = 's';

        while (sino == 's') {

            System.out.print("Ingrese la ID del producto al que quiere editar: ");
            if (scanInt() == true) {

                int id = scan.nextInt();

                obj = objectsList.get((id - 1));
                System.out.println("Editar: 1. Nombre\n\t2. Precio\n\t3. Stock\n\t4. Borrar");
                if (scanInt() == true) {

                    int opcion = scan.nextInt();
                    switch (opcion) {

                    case 1:
                        System.out.print("Ingrese el nuevo nombre: ");
                        String name = scan.next();
                        boolean is = isProductNew(name);
                        if (is == true) {

                            obj.setProductNombre(name);

                        }

                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo precio: ");
                        if (scanInt() == true) {

                            float precio = scan.nextInt();
                            obj.setProductPrecio(precio);

                        } else {

                            scan.next();

                        }

                        break;
                    case 3:
                        System.out.print("Ingrese el nuevo stock: ");
                        if (scanInt() == true) {

                            int stock = scan.nextInt();
                            obj.setProductStock(stock);

                        } else {

                            scan.next();

                        }

                        break;
                    case 4:
                        obj.setProductNombre("deletedObject");
                        System.out.println("Sera borrado una vez termine de editar...\n");
                        break;

                    }
                    System.out.print("Desea hacer otra edicion? (S/N): ");
                    sino = scan.next().charAt(0);

                } else {

                    scan.next();

                }

            } else {

                scan.next();

            }

        }

        productos.clear();
        for (int i = 0; i < objectsList.size(); i++) {

            obj = objectsList.get(i);
            productos.add(obj);

        }

        toFile();

    }

    // ----------------------------------------------------------------------------

    public static void showList(ArrayList<Producto> objectsList, int i) {

        Producto obj;

        obj = objectsList.get(i);
        System.out.println("\nID: " + (i + 1));
        System.out.println("---------------");
        System.out.println(obj.getProduct());

    }

    // ----------------------------------------------------------------------------

    public static boolean isProductNew(String name) {

        boolean nuevo = true;

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getProductNombre().equals(name) == false) {

                nuevo = true;

            } else {

                nuevo = false;
                i = productos.size();

            }

        }

        return nuevo;

    }

    // ----------------------------------------------------------------------------

    public static boolean addCart(ArrayList<Producto> objectsList) {

        boolean flag = false;

        if (maquina.getSaldoCliente() > 0) {

            System.out.println("Ingrese la ID del producto a agregar al carrito: ");
            if (scanInt() == true) {

                int id = scan.nextInt();
                if (productos.size() > (id - 1) && (id - 1) > 0) {

                    Producto pp = newObj(productos.get(id - 1));

                    if (pp.getProductStock() > 0) {

                        System.out.print("\nIngrese cuantos se quiere llevar: ");
                        if (scanInt() == true) {

                            pp.setProductStock(scan.nextInt());
                            if (pp.getProductStock() <= productos.get(id - 1).getProductStock()) {

                                objectsList.add(pp);

                                System.out.println("\nEl costo es de: " + (pp.getProductPrecio() * pp.getProductStock())
                                        + " total de: " + sumaCarrito(objectsList));

                                if (maquina.getSaldoCliente() >= sumaCarrito(objectsList)) {

                                    System.out.println("\nProducto agregado al carrito...");

                                } else {

                                    System.out.println("\nEl saldo es insuficiente para la compra. Su saldo es de: "
                                            + maquina.getSaldoCliente());
                                    int i = 0;
                                    while (i < objectsList.size()) {

                                        if (i == (objectsList.size() - 1)) {

                                            objectsList.get(i).setProductStock(0);

                                        }

                                        i++;

                                    }

                                }

                            } else {

                                System.out.println(
                                        "\nNo hay suficientes " + pp.getProductNombre() + " para el pedido...");

                            }

                        } else {

                            scan.next();

                        }

                    } else {

                        System.out.println("\nProducto sin stock...");

                    }
                } else {
                    flag = true;
                }

            } else {

                flag = true;
                scan.next();

            }

        } else {

            System.out.println("\nIngrese dinero y luego intente comprar...");

        }

        return flag;
    }

    // ----------------------------------------------------------------------------

    public static float sumaCarrito(ArrayList<Producto> objectsList) {

        float total = 0;
        for (int i = 0; i < objectsList.size(); i++) {

            total = total + (objectsList.get(i).getProductPrecio() * objectsList.get(i).getProductStock());

        }

        return total;

    }

    // ----------------------------------------------------------------------------
    public static void cargarMaquinaFromFile() {

        try {

            FileInputStream fi = new FileInputStream("MaquinaTotal.txt");
            DataInputStream oi = new DataInputStream(fi);

            maquina.setTotalMaquina(oi.readFloat());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        } catch (IOException e) {

            System.out.println("Error initializing stream");

        }

    }

    // ----------------------------------------------------------------------------

    public static void cargarFileMaquina() {

        try {

            FileOutputStream f = new FileOutputStream("MaquinaTotal.txt", false);
            DataOutputStream o = new DataOutputStream(f);

            float valor = maquina.getTotalMaquina();

            o.writeFloat(valor);

            o.close();
            f.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        } catch (IOException e) {

            System.out.println("Error initializing stream");

        }

    }

    // ----------------------------------------------------------------------------

    public static void modificarSaldoMaquina(float nuevo) {

        maquina.agregarTotalMaquina(nuevo);

    }
    // ----------------------------------------------------------------------------

    public static void pressAnyKeyToContinue() {

        System.out.println("Presiona Enter para continuar...");
        try {

            System.in.read();

        } catch (Exception e) {

            System.out.println("Error...");

        }

    }

    // ----------------------------------------------------------------------------

    public static boolean scanInt() {

        boolean bulean;
        if (scan.hasNextInt() == true) {

            bulean = true;

        } else {

            bulean = false;
            System.out.println("Error: Ingrese un numero...");

        }
        return bulean;

    }

    // ----------------------------------------------------------------------------

    public static boolean scanFloat() {

        boolean bulean;
        if (scan.hasNextFloat() == true) {

            bulean = true;

        } else {

            bulean = false;
            System.out.println("Error: Ingrese un numero...");

        }
        return bulean;

    }

    // ----------------------------------------------------------------------------

    public static Producto newObj(Producto obj) {
        Producto pp = new Producto(obj.getProductNombre(), obj.getProductPrecio(), obj.getProductStock());

        return pp;
    }

    // ----------------------------------------------------------------------------

    public static void mostrarBoleto(ArrayList<Producto> objectsList) {

        if (objectsList.size() > 0) {

            System.out.print("\nComprado: ");
            for (int i = 0; i < objectsList.size(); i++) {

                System.out.print("\n\t" + objectsList.get(i).getProductStock() + " "
                        + objectsList.get(i).getProductNombre() + " = "
                        + (objectsList.get(i).getProductPrecio() * objectsList.get(i).getProductStock()) + "$\n");

            }
            System.out.println("Total: " + sumaCarrito(objectsList) + "$");
            pressAnyKeyToContinue();

        } else {

            System.out.println("No efectuo ninguna compra...\n");
            pressAnyKeyToContinue();

        }

    }
}