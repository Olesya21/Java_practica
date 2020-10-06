package zadanie_3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args)
    {
        Scanner text=new Scanner(System.in);
        Book cl=new Book("А.С. Пушкин", "Евгений Онегин",1830);
        System.out.println(cl.getAuthor());
        System.out.println(cl.getName());
        System.out.println(cl.getYear());
    }
}
