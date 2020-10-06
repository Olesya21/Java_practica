package zadanie;

public abstract class Shape {
    private int x;
    private int y;

    Shape(){};

    public void setX(int x) { this.x = x; }
    public int getX() { return x; }

    public void setY(int y) { this.y = y; }
    public int getY() { return y; }

    abstract double perimeter();
    abstract double square();
}


