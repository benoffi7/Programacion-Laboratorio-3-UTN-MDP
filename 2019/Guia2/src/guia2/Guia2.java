package guia2;
import java.util.Scanner;
public class Guia2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int flag,flag2;
        Cuenta nuevaCuenta = null;
        do{
            do{
                System.out.println("Bienvenido al cajero, por favor ingrese una opcion: ");
                System.out.println("1. Crear cuenta vacia");
                System.out.println("2. Crear cuenta saldo inicial");
                System.out.println("3. Ingresar dinero");
                System.out.println("4. Sacar dinero");
                System.out.println("5. Ver saldo");
                System.out.println("6. Salir");
                flag=sc.nextInt();
            }while(flag<1 || flag>5);
            switch(flag){
                case 1:
                    if(nuevaCuenta == null){
                        sc.nextLine(); //tengo que hacer esto pq sino se salta una linea
                        nuevaCuenta = new Cuenta(sc.nextLine());                        
                    }else
                        System.out.println("Usted ya posee una cuenta");
                    break;
                case 2:
                    if(nuevaCuenta == null){
                        sc.nextLine();
                        nuevaCuenta = new Cuenta(sc.nextLine(),sc.nextDouble());
                    }else
                        System.out.println("Usted ya posee una cuenta");
                    break;
                case 3:
                    if(nuevaCuenta == null)
                        System.out.println("Primero debe crear una cuenta.");
                    else{
                        System.out.println(nuevaCuenta.getNombre()+", ingrese el monto que desea depositar: ");
                        double dinero = sc.nextDouble();
                        System.out.println("Ahora posee: $"+nuevaCuenta.ingresaDinero(dinero));
                    }
                    break;
                case 4:
                    if(nuevaCuenta == null)
                        System.out.println("Primero debe crear una cuenta.");
                    else{
                        System.out.println(nuevaCuenta.getNombre()+", usted posee $"+nuevaCuenta.getSaldo()+", cuanto desea retirar?");
                        double retira = sc.nextDouble();
                        if(retira <= nuevaCuenta.getSaldo()){ // hacemos la comprobacion para que no quede saldo en negativo
                            nuevaCuenta.retiraDinero(retira);
                            System.out.println(nuevaCuenta.getNombre()+", ahora posee $"+nuevaCuenta.getSaldo());
                        }else
                            System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 5:
                    if(nuevaCuenta == null)
                        System.out.println("Primero debe crear una cuenta.");
                    else
                        System.out.println(nuevaCuenta.getNombre()+", su saldo es de: $"+nuevaCuenta.getSaldo());
                    break;
                default:
                    break;
            }
            System.out.println("Desea realizar otra operacion? SI=1 NO=0");
            flag2=sc.nextInt();
        }while(flag2==1);

    }
}
