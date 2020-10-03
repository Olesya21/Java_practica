package com.company.zadanie1;
import java.util.Scanner;

public class zadanie1_1 {

    public static void main(String[] args) {
        Scanner text=new Scanner(System.in);
        int x=text.nextInt();

        int sum=0;
        int[] mas = new int[x];

        for(int i=0;i<x;i++)
        {
            mas[i]=text.nextInt();
            sum+=mas[i];
        }
        System.out.println(sum);
    }
}
