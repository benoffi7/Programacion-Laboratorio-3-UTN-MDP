/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //*--------------------------------------
        Rectangle rectangulo = new Rectangle(4, 2);
        System.out.println(rectangulo.toString());
        //*--------------------------------------
        System.out.println("Area: "+rectangulo.calculateArea());
        System.out.println("Perimeter: "+rectangulo.calculatePerimeter());
        //*--------------------------------------
        rectangulo.setHeight(10);
        rectangulo.setWidth(5);
        System.out.println("Area: "+rectangulo.calculateArea());
        System.out.println("Perimeter: "+rectangulo.calculatePerimeter());
        //*--------------------------------------
        Rectangle defaultRectangulo = new Rectangle();
        System.out.println(defaultRectangulo.toString());
    }
}