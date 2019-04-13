package e1;

public class Rectangle
{
	private int width = 1;
	private int height = 1; 
	
	public Rectangle()
	{}
	
	public Rectangle(int width, int height)
	{
		setWidth(width);
		setHeigth(height);
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeigth(int height)
	{
		this.height = height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public float calculateArea()
	{
		float area = getWidth() * getHeight();
		return area;
	}
	
	public float calculatePerimeter()
	{
		float perimeter = (getWidth() + getHeight()) * 2;
		return perimeter;
	}
}