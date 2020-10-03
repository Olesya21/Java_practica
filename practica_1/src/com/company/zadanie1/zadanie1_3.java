package com.company.zadanie1;

import java.util.Scanner;

public class zadanie1_3 {
    public static void main(String[] args) {
        Scanner text=new Scanner(System.in);
        int x=text.nextInt();

        int sum = 0;
        int step=0;
        int[] m=new int[x];
        do
        {
            m[step]=text.nextInt();
            sum+=m[step];
            step++;
        }while(step<x);
        System.out.println(sum);
    }
}
