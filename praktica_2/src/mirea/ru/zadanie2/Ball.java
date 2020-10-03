package mirea.ru.zadanie2;

public class Ball
{
    private int size;
    private String color;
    public Ball(int size,String color)
    {
        this.size=size;
        this.color=color;
    }
    public String toString()
    {
        return "Size:"+size+" Color:"+color;
    }

}
