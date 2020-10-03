package mirea.ru.zadanie1;

public class TesterShape {
    public static void main(String[] args){
        Shape obj = new Shape(1,2);
        obj.setArea(5);
        obj.setPerimeter(10);
        System.out.println(obj);
    }
}
