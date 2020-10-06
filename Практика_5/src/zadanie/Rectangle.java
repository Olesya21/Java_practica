package zadanie;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){};
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) { this.width = width; }
    public int getWidth() { return width; }

    public void setHeight(int height) { this.height = height; }
    public int getHeight() { return height; }

    public double perimeter() { return  2*width + 2*height;}
    public double square() { return width*height;}
}
