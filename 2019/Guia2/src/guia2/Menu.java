/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author negro
 */
public class Menu {
    
    private Cuenta cuenta;
    private float SaldoInicial;
    private float Monto;
    private int opcion;
    private String control;
    private Scanner scanner = new Scanner(System.in);
    
    public Menu(Cuenta cuenta)
    {
        
        
        do {    
            System.out.println("Ingrese una de las siguientes opciones\n");
            System.out.println("1- Crear cuenta vacia\n");
            System.out.println("2- Crear cuenta con saldo\n");
            System.out.println("3- Depositar\n");
            System.out.println("4- Extraer\n");
            System.out.println("5- Consultar saldo\n");
            System.out.println("6- Salir\n");
            
            opcion=scanner.nextInt();
            switch(opcion)
            {
                case 1:
                    if(cuenta==null)
                    {
                        cuenta = new Cuenta();
                    }
                     else
                    {
                        System.out.println("La cuenta ya existe\n");     
                    }
                    break;
                case 2:
                    if(cuenta==null)
                    {    
                        System.out.println("Ingrese monto inicial\n");
                        SaldoInicial = scanner.nextFloat();
                        cuenta = new Cuenta(SaldoInicial);
                    }
                    else
                    {
                        System.out.println("La cuenta ya existe\n");     
                    }
                    break;
                case 3:
                    System.out.println("Ingrese monto a depositar\n");
                    Monto = scanner.nextFloat();
                    cuenta.Ingresar(Monto);
                    break;
                case 4:
                    System.out.println("Ingrese monto a extraer\n");
                    Monto = scanner.nextFloat();
                    if(!cuenta.Extraer(Monto))
                        System.out.println("Saldo insuficiente, su saldo actual es "+cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println("El saldo de la cuenta es "+cuenta.getSaldo());
                    break;
                case 6:
                      
                    System.exit(0);
                    break;
            }
            System.out.println("Desea continuar s/n?");
            scanner.nextLine();
            control = scanner.nextLine();
            control = control.toUpperCase();
            
        } while ("S".equals(control));
    }
     
}
