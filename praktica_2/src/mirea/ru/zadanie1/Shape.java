package mirea.ru.zadanie1;

public class Shape {
    private int area=0;
    private int perimeter=0;
    public Shape(int area,int perimeter){
        this.area=area;
        this.perimeter=perimeter;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public String toString()
    {
        return "Area:"+area+" Perimeter:"+perimeter;
    }
}
