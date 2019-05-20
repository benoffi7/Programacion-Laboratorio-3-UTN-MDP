package Main;

import java.util.Scanner;

public class Main {
    public static Cuenta cuenta_Personal=null;
    public static void main(String[] args) {
        boolean condicion=true;
        int eleccion=0;
        float saldo=0;
        String usuario, contrasenia;
        Scanner scan=new Scanner(System.in);
        System.out.println("Que tipo de cuenta desea crear: ");
        System.out.println("1_Cuenta vacia.");
        System.out.println("2_Cuenta cargada.");
        eleccion=scan.nextInt();

        System.out.println("Ingrese el usuario: ");
        usuario=scan.next();
        System.out.println("Ingrese la contraseña");
        contrasenia=scan.next();

        switch(eleccion){
            case 1:
                cuenta_Personal=new Cuenta(usuario,contrasenia);
                break;
            case 2:
                System.out.println("Ingrese el saldo: ");
                saldo=scan.nextFloat();
                cuenta_Personal=new Cuenta(usuario,contrasenia,saldo);
                break;
        }
        while(condicion){
            System.out.println("Que desea hacer:");
            System.out.println("1_Ingresar saldo.");
            System.out.println("2_Extraer saldo.");
            System.out.println("3_Consultar saldo.");
            System.out.println("4_Salir");
            eleccion=scan.nextInt();
            switch(eleccion){
                case 1:
                    System.out.println("Dinero a ingresar: ");
                    saldo=scan.nextFloat();
                    if(saldo>0){
                        cuenta_Personal.Ingresar(saldo);
                    }
                    else{
                        System.out.println("Monto no valido");
                    }
                    break;
                case 2:
                    System.out.println("Dinero a extraer: ");
                    saldo=scan.nextFloat();
                    if(saldo<=cuenta_Personal.getSaldo()){
                        cuenta_Personal.Extraer(saldo);
                    }
                    else{
                        System.out.println("No hay saldo suficiente");
                    }
                    break;
                case 3:
                    System.out.println("El saldo es: "+cuenta_Personal.getSaldo());
                    break;
                case 4:
                    condicion=false;
                    break;
                default:
                    break;
            }
            pressAnyKeyToContinue();
        }
        scan.close();
    }

    private static void pressAnyKeyToContinue() {
        System.out.println("Pulse Enter para continuar...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}

