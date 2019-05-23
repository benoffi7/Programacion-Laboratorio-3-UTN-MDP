package packageNumber1;

public class Main {

	public static void main(String[] args) {
		
		//  A  //
		Rectangle rectangle = new Rectangle(1, 2);
		
		//  B  //
		rectangle.printTheMeasurements();
		
		//  C  //
		rectangle.printAreaAndPerimeter();
		
		//  D  //
		rectangle.modifyHeightAndWidth(2, 4);
		
		//  E  //
		rectangle.printAreaAndPerimeter();
		
		//  F  //
		Rectangle rectangleTwo = new Rectangle();
		rectangleTwo.printTheMeasurements();
		rectangleTwo.printAreaAndPerimeter();

	}

}
