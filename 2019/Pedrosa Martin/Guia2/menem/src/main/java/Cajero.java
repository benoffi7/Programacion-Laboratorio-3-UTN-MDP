import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public static void main(String[] args) {

        // Cuenta cuenta;

        menu();
    }

    public static void menu() {

        int opcion = 0;
        String usuario;
        float saldo;

        char repeat = 's';
        while (repeat == 's') {
            visualMenu();
            opcion = scan.nextInt();
            switch (opcion) {
            case 1:

                System.out.print("Ingrese su nombre de usuario: ");
                usuario = scan.next();
                cuentas.add(new Cuenta(usuario, 0));

                // usuario = cuentas.forEach(usuario);
                // int validos = cuentas.size();
                // foreach comparar usuario
                // cuentas.get(index).elemento

                break;
            case 2:

                System.out.print("Ingrese su nombre de usuario: ");
                usuario = scan.next();
                System.out.print("Ingrese el saldo total de su cuenta: ");
                saldo = scan.nextFloat();

                cuentas.add(new Cuenta(usuario, saldo));

                break;
            case 3:
                System.out.print("\nIngrese su nombre de usuario: ");
                usuario = scan.next();
                saldo = 0;

                for (int i = 0; i < cuentas.size(); ++i) {
                    if (usuario.equals(cuentas.get(i).getUsuario())) {
                        System.out.print("cuanto desea ingresar: ");
                        saldo = scan.nextFloat();
                        cuentas.get(i).ingresar(saldo);
                        System.out.printf("La cuenta tiene %.0f", cuentas.get(i).getSaldo());
                    } else {
                        System.out.println("El usuario no existe");
                    }
                }
                if (cuentas.size() == 0) {
                    System.out.println("No ha ingresado ninguna cuenta\n");
                }

                break;
            case 4:
                System.out.print("\nIngrese su nombre de usuario: ");
                usuario = scan.next();
                saldo = 0;

                for (int i = 0; i < cuentas.size(); ++i) {
                    if (usuario.equals(cuentas.get(i).getUsuario())) {
                        System.out.print("cuanto desea retirar: ");
                        saldo = scan.nextFloat();
                        cuentas.get(i).extraer(saldo);
                        System.out.printf("La cuenta tiene %.0f", cuentas.get(i).getSaldo());
                    } else {
                        System.out.println("El usuario no existe");
                    }
                }
                if (cuentas.size() == 0) {
                    System.out.println("No ha ingresado ninguna cuenta\n");
                }

                break;
            case 5:
                System.out.print("\nIngrese su nombre de usuario: ");
                usuario = scan.next();
                for (int i = 0; i < cuentas.size(); ++i) {
                    if (usuario.equals(cuentas.get(i).getUsuario())) {
                        System.out.printf("La cuenta tiene %.0f.\t", cuentas.get(i).getSaldo());
                    } else {
                        System.out.println("El usuario no existe");
                    }

                    if (cuentas.size() == 0) {
                        System.out.println("No ha ingresado ninguna cuenta\n");
                    }
                }
                break;
            case 6:
                break;

                default:
                    System.out.println("Ingrese una opcion correcta "); 
                break;

            }
            if (opcion == 6) {
                System.out.println("\nSaliendo...\n\n");
                repeat = 'n';
            } else {
                System.out.println(" Desea realizar otra operacion?: (S/N)");
                repeat = scan.next().charAt(0);
            }

        }
    }

    public static void visualMenu() {
        System.out.println(
                "\n\t1. Crear nueva cuenta vacia\t\t2. Crear nueva cuenta con saldo\n\n\t3. Ingresar dinero\t\t\t4. Retirar dinero\n\n\t5. Ver saldo\t\t\t\t6. Salir\n\n");
    }

}