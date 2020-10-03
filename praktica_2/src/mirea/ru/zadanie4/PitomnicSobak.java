package mirea.ru.zadanie4;

import java.util.Scanner;

public class PitomnicSobak {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Dog[] arr = new Dog[n];
        String name;
        int age;
        for (int i=0;i<n;i++)
        {
            name=scan.next();
            age= scan.nextInt();
            arr[i] = new Dog(name,age);
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
