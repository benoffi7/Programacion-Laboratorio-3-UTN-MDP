package packageNumber1;

public class Rectangle 
{
	private int width; //ancho
	private int height; //alto
	
	public Rectangle () {
		setWidth(1);
		setHeight(1);
	}
	
	public Rectangle (int widhtReceived, int HeightReceived) {
		setWidth(widhtReceived);
		setHeight(HeightReceived);
	}
	
	private int getWidth() {
		return width;
	}
	private void setWidth(int widhtReceived) {
		width = widhtReceived;
	}
	private int getHeight() {
		return height;
	}
	private void setHeight(int HeightReceived) {
		height = HeightReceived;
	}
	
	public String printTheMeasurements () {
		return "\nWidth: " +getWidth()+ "\nHeight: " +getHeight();
	}
	
	public float calculateArea() {
		float result = getWidth() * getHeight();
		return result;
	}
	
	public float calculatePerimeter() {
		float result = (getWidth() * 2 ) + (getHeight() * 2 );
		return result;
	}
	
	public String printAreaAndPerimeter () {
		return "\nArea: " +calculateArea()+ "\nPerimeter: " + calculatePerimeter();
	}
	
	public void modifyHeightAndWidth (int widhtReceived, int HeightReceived) {
		setWidth(widhtReceived);
		setHeight(HeightReceived);
	}
}
