package e1;

public class Main
{
	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("Width: " + rectangle.getWidth() + " | Height: " + rectangle.getHeight());
		System.out.println("Area: " + rectangle.calculateArea() + " | Perimeter: " + rectangle.calculatePerimeter());
		rectangle.setHeigth(20);
		rectangle.setWidth(30);
		System.out.println("Area: " + rectangle.calculateArea() + " | Perimeter: " + rectangle.calculatePerimeter());
		Rectangle rectangle2 = new Rectangle();
		System.out.println("Width: " + rectangle2.getWidth() + " | Height: " + rectangle2.getHeight());
		System.out.println("Area: " + rectangle2.calculateArea() + " | Perimeter: " + rectangle2.calculatePerimeter());
	}
}