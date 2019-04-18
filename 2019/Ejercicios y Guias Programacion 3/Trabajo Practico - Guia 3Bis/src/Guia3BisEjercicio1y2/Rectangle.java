package Guia3Bis;

public class Rectangle {
	
	private int width=1;//Ancho
	private int height=0;//Altura
	//Area=Height*width
	
	private void setWidth(int width)
	{
		this.width=width;
	}
	
	private void setHeight(int height)
	{
		this.height=height;
	}
	
	private int getWidth()
	{
		return width;
	}
	
	private int getHeight()
	{
		return height;
	}
	
	public int retornarWidth()
	{
		return getWidth();
	}
	
	public int retornarHeight()
	{
		return getHeight();
	}
	
	public Rectangle(int width,int height)
	{
		setWidth(width);
		setHeight(height);
	}

	public int calculateArea(int width, int height)
	{
		int area;
		area=height*width;
		return area;
	}
	
	public int calculatePerimeter(int width, int height)
	{
		int perimeter;
		perimeter=2*(height+width);
		return perimeter;
	}
	

}
