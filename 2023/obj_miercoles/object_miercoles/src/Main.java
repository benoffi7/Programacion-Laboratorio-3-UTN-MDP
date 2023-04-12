public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Perro figuralis = new Perro();

        Persona persona = new Persona("gonzalo");
        persona.setDNI(1);
        Persona otraPersona = new Persona("gonzalo");
        otraPersona.setDNI(2);


        Empleado e1 = new Empleado("gonzalo",12);
        e1.setDNI(1);
        Empleado e2 = new Empleado("gonzalo",12);
        e2.setDNI(1);

        System.out.println(e1.equals(e2));

    }



}