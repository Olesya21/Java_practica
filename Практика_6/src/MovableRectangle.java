
public class MovableRectangle extends Rectangle implements Movable
{
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public MovableRectangle(int x, int y, int speedX, int speedY)
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

    public void moveUp(){
        y -= speedY;
    }
    public void moveDown(){
        y += speedY;
    }
    public void moveLeft(){
        x -= speedX;
    }
    public void moveRight(){
        x += speedX;
    }
}