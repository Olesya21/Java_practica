public class MovableTest {
    public static void main(String[] args) {
        Point p1=new Point(1,2,2,5);
        Point p2=new Point(2,5,1,6);
        MovablePoints mp=new MovablePoints(p1,p2);
        mp.checkSpeed();
    }
}
