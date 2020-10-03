package mirea.ru.zadanie3;

public class Book
{
    private String name ;
    private String color;
    public Book(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    public String toString()
    {
        return "Name:"+name+" Color:"+color;
    }
}
