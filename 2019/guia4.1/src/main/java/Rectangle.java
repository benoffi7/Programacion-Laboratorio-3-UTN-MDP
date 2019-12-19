/**
 * Rectangle
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void setHeight(int height) {
        this.height = height;
    }
   
    public void setWidth(int width) {
        this.width = width;
    }


    public float calculateArea() {
        float res;

        res = this.height * this.width;

        return res;
    }

    public float calculatePerimeter() {
        float res;
        res = 2 * (height + width);
        return res;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\nWidth: " + width);
        buffer.append("\nHeight: " + height);
        return buffer.toString();
    }
}