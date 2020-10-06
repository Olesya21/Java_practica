package zadanie_1;

public class Circle {
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

    public void functions() {
        double S = (radius ^ 2) * 3.14;
        System.out.println("Диаметр окружности: " + radius * 2);
        System.out.println("Площадь окружности: " + S);
    }
}