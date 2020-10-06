package zadanie;

public class Square extends Rectangle {
    private int side;

    public Square(int side) { this.side = side; }

    public void setSide(int side) { this.side = side; }
    public int getSide() { return side; }

    public double perimeter() { return  4*side;}
    public double square() { return side*side;}
}
