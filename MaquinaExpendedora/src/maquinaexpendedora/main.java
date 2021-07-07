
package maquinaexpendedora;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        Double money;
        Scanner scan = new Scanner(System.in);
        
        
        do {            
            
            do {                
                System.out.println("\nIngrese el dinero -> ");
                money = scan.nextDouble();
            } while (money <= 0);
            
            maquina.ingresarDinero(money);
            
            if (maquina.isCorrecto()) {
                System.out.println("Ha adquirido el boleto " + maquina.getBoleto());
                System.out.println("Su vuelto es " + maquina.darVuelto());
                maquina.terminarOperacion();
            } else {
                System.out.println("El monto ingresado es insuficiente");
            }
            
            System.out.println("Saldo de la maquina " + maquina.getSaldo() + ", cantidad de boletos " + maquina.getCantBoletos());
        } while (true);
        
    }
    
}
