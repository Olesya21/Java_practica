package zadanie;

public class Circle extends Shape
{
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }
    public int getRadius() {
        return radius;
    }

    public double perimeter() { return  2 * 3.14 * radius;}
    public double square() { return (radius ^ 2) * 3.14;}
}
