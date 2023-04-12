public class Main {
    public static void main(String[] args) {
        Figura f;//sin error
       // Figura f1 = new Figura(); //con error
        //f1.calcularArea();

        Figura circulo = new Circulo();
        System.out.println(circulo.calcularArea());
    }
}