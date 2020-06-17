package Ej2;

import java.util.Scanner;

public class Test {

    public static String pesoIdeal(Persona p) {
        String mensaje = "";
        if (p.calcularIMC() < 0) {
            mensaje = "Esta por debajo de su peso ideal";
        } else {
            if (p.calcularIMC() == 0) {
                mensaje = "Esta en su peso ideal";
            } else {
                mensaje = "Esta por encima de su peso ideal";
            }
        }
        return mensaje;
    }

    public static String mayorEdad(Persona p) {
        String msg = "";
        if (p.esMayorDeEdad()) {
            msg = "Es mayor de edad";
        } else {
            msg = "No es mayor de edad";
        }
        return msg;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;

        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();

        System.out.println("Ingrese su sexo");
        sexo = (teclado.nextLine()).charAt(0);

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        System.out.println("Ingrese su peso");
        peso = teclado.nextFloat();

        System.out.println("Ingrese su altura");
        altura = teclado.nextFloat();
        teclado.nextLine();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        System.out.println(p1.toString());

        System.out.println(pesoIdeal(p1));
        
        System.out.println(mayorEdad(p1));
        // el segundo objeto obtendrá todos los anteriores menos el peso y la altura y 
        System.out.println("Ingrese su nombre");
        nombre = teclado.nextLine();

        System.out.println("Ingrese su sexo");
        sexo = (teclado.nextLine()).charAt(0);

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        Persona p2 = new Persona(nombre, edad, sexo);
        System.out.println(p2.toString());

        System.out.println(pesoIdeal(p2));
        
        System.out.println(mayorEdad(p2));
        //el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor
        Persona p3 = new Persona();
        p3.setNombre("EstabanQuito");
        p3.setEdad(30);
        p3.setAltura(2f);
        p3.setPeso(60f);
        p3.cargarSexo('Z');

        System.out.println(p3.toString());
        System.out.println(mayorEdad(p3));
        System.out.println(pesoIdeal(p3));
    }
}
