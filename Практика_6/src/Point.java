public class Point {
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public Point(int x, int y, int speedX, int speedY)
    {
        this.x = x;
        this.y = y;
        this.speedX=speedX;
        this.speedY=speedY;
    };

    public void setX(int x) { this.x = x; }
    public int getX() { return x; }

    public void setY(int y) { this.y = y; }
    public int getY() { return y; }

    public void setSpeedX(int speedX) { this.speedX = speedX; }
    public int getSpeedX() { return speedX; }

    public void setSpeedY(int speedY) { this.speedY = speedY; }
    public int getSpeedY() { return speedY; }
}
