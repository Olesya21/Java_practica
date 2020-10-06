package zadanie_1;

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner text=new Scanner(System.in);
        System.out.println("Радиус окружности: ");
        int r=text.nextInt();
        Circle obj = new Circle(r);
        obj.functions();
    }
}
