package tp1;

import java.util.Scanner;

public class Ej4 {
    	public static void menu(Scanner scan) {
    		int prime = 0;
    		System.out.println("Ejercicio nº3: Mostrar los primeros 100 números primos."+"\r\n");
    		boolean check = false;
    		System.out.println("Ingrese la cantidad de numeros primos");
    		int max = Integer.parseInt(scan.next());
    		System.out.println("Numero Primos: ");
    		for(int i=2; prime <max; i++) {
    			check = checkPrime(i);
    			if(check){
    				System.out.println(i);
    				prime++;
    			}
    		}
    		System.out.println("\r\n");
    	}
    	public static boolean checkPrime(int number) {
    		int flag =1;
    		boolean result = false;
    		int max = number/2;
    		if(number == 0 || number == 1) {
    			flag = 0;
    		}else {
    			for(int i =2 ; i<=max;i++) {
    				if(number%i == 0) {
    					flag = 0;
    					break;
    				}
    			}
    		}
    		if (flag == 1) 
    			result = true;
    		return result;
    	}
    }
