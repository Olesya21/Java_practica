package mirea.ru.zadanie4;

public class Dog
{
    private String name;
    private int age;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {this.age = age;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public String getName() {return name;}

    public void toHumanAge()
    {
        System.out.println("age = " + age*7);
    }

    public String toString()
    {
        return "Name:"+name+" Age:"+age;
    }
}
