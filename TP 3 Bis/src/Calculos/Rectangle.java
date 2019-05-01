package Calculos;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		width=1;
		height=1;
	}
	public Rectangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public float calculateArea() {		
		return width*height;
	}
	
	public float calculatePerimeter() {
		return (calculateArea()*2);
		
	}
	
	@Override
	public String toString() {
		return "Rectangle [ width=" + width + " height=" + height + "]";
	}
	
	
	
}
