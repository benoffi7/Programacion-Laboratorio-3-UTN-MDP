package Clases;

public class Main {

    public static void main(String[] args){

        Hora reloj1 = new Hora(0,0,1);

        reloj1.retrocederSegundo();

        System.out.println(reloj1.mostrar());



    }

}
