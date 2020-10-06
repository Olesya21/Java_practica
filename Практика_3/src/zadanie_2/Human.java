package zadanie_2;
import java.util.Scanner;

public class Human {
    public static void main(String[] args)
    {

        Scanner text=new Scanner(System.in);
        System.out.print("Выберете часть тела человека hand, head, leg: ");
        String n=text.next();
        switch(n)
        {
            case "hand":
                Hand cl1=new Hand(2);
                cl1.right();
                cl1.left();
                break;

            case "head":
                Head cl2=new Head(2,1);
                cl2.eyes();
                cl2.mouth();
                break;

            case "leg":
                Leg cl3=new Leg(2);
                cl3.right();
                cl3.left();
                break;
        }

    }
}
