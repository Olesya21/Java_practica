import java.util.Scanner;

public class MovablePoints implements Movable
{
    private Point point1;
    private Point point2;
    Scanner scan=new Scanner(System.in);
    public MovablePoints(Point point1, Point point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    };

    public void setPoint1(Point point1) { this.point1 = point1; }
    public Point getPoint1() { return point1; }

    public void setPoint2(Point point2) { this.point2 = point2; }
    public Point getPoint2() { return point2; }

    public void moveUp()
    {
        point1.setY(point1.getY()-point1.getSpeedY());
        point2.setY(point2.getY()-point2.getSpeedY());
    };

    public void moveDown()
    {
        point1.setY(point1.getY()+point1.getSpeedY());
        point2.setY(point2.getY()+point2.getSpeedY());
    };

    public void moveLeft()
    {
        point1.setX(point1.getX()-point1.getSpeedX());
        point2.setX(point2.getX()-point2.getSpeedX());
    };

    public void moveRight()
    {
        point1.setX(point1.getX() + point1.getSpeedX());
        point2.setX(point2.getX() + point2.getSpeedX());
    };

    public void checkSpeed()
    {
        while(point1.getSpeedX()!=point2.getSpeedX())
        {
            System.out.println("Ошибка! Введите равные скорости по X:");
            point1.setSpeedX(scan.nextInt());
            point2.setSpeedX(scan.nextInt());
        }
        while(point1.getSpeedY()!=point2.getSpeedY()){
            System.out.println("Ошибка! Введите равные скорости по Y:");
            point1.setSpeedY(scan.nextInt());
            point2.setSpeedY(scan.nextInt());
        }
    }

}
