
package Cajero;

import static java.lang.System.exit;
import java.util.*;


public class Principal {
    public static void main(String[] args){

        Scanner elegir_opcion=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        String nombre;
        int opcion;
        int edad;
        float saldo;
        float dinero;
        int contador=0;
        char c;
        Cuenta usuario1;
        
        
        do{
        
            System.out.println("1.Crear cuenta vacia");
            System.out.println("2.Crear cuenta saldo inicial");
            System.out.println("3.Ingresar dinero");
            System.out.println("4.Sacar dinero");
            System.out.println("5.Ver saldo");
            System.out.println("6.Salir");
            System.out.print("Ingrese opcion: ");
            opcion= elegir_opcion.nextInt();
            System.out.println("\n\n\n\n");
            
            while((opcion==1 || opcion==2) && contador>0){
                
                System.out.print("Cuenta ya creada, ingrese otra opcion: ");
                opcion= elegir_opcion.nextInt();
                System.out.println("\n\n\n\n");
            }
            
            while((opcion==3 || opcion==4 || opcion==5) && contador==0){
                
                System.out.print("Primero cree una cuenta, ingrese opcion 1 o 2: ");
                opcion= elegir_opcion.nextInt();
                System.out.println("\n\n\n\n");
            }

        
            switch (opcion) {
                
                case 1:
                    
                    System.out.print("Ingrese su nombre: ");
                    nombre=scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.print("Ingrese su edad: ");
                    edad=scan.nextInt();
                    
                    usuario1=new Cuenta();
                    
                    System.out.println("\n");
                    System.out.println("Cuenta creada con éxito");
                    System.out.println("");
                    System.out.println("Presione una tecla para continuar...");
                    c=scan.next().charAt(0);
                    
                    
                    
                    break;
                    
                case 2:
                    
                    System.out.print("Ingrese su nombre: ");
                    nombre=scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.print("Ingrese su edad: ");
                    edad=scan.nextInt();
                    
                    System.out.println("");
                    
                    System.out.print("Ingrese saldo incial: ");
                    dinero=scan.nextFloat();
                    
                    usuario1=new Cuenta(dinero);
                    
                    System.out.println("\n");
                    System.out.println("Cuenta creada con éxito");
                    System.out.println("");
                    System.out.println("Presione una tecla para continuar...");
                    c=scan.next().charAt(0);
                    
                    break;
                    
                case 3:
                    
                    System.out.print("Ingrese monto a depositar: ");
                    dinero=scan.nextFloat();

                    Cuenta.ingresar(dinero);
                    
                    System.out.println("\n");
                    System.out.println("Monto depositado con éxito.");
                    System.out.println("");
                    System.out.println("Presione una tecla para continuar...");
                    c=scan.next().charAt(0);
                    
                    break;
                    
                case 4:
                    
                    System.out.print("Ingrese monto a extraer: ");
                    dinero=scan.nextFloat();
                    
                    saldo=Cuenta.getSaldo();
                    
                    if(dinero<saldo){
                        Cuenta.extraer(dinero);
                    }else{
                        
                        System.out.println("\n");
                        System.out.println("No posee esa cantidad de dinero en su cuenta.");
                        System.out.println("");
                        System.out.println("Presione una tecla para continuar...");
                        c=scan.next().charAt(0);
                    }
                    
                    break;
                    
                case 5:
                    
                    saldo=Cuenta.getSaldo();
                    
                    System.out.println("Su saldo es de $"+saldo);
                    
                    System.out.println("");
                    System.out.println("Presione una tecla para continuar...");
                    c=scan.next().charAt(0);

                    break;
                    
                case 6:
                    
                    System.out.println("Zeppelin > Beatles");
                    System.out.println("Gracias, hasta luego.");
                            
                    exit(0);
                    
                    break;
            } 
            
            contador+=1;
            
        }while(true);

        
    }
    
}