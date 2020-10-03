package com.company.zadanie5;

public class zadanie5 {
    public int m;
    public void fact (int m)
    {
        int i = 1;
        int f=1;
        while (i<=m)
        {
            f *= i;
            i++;
        }
        System.out.println(f);
    }

    public static void main(String[] args)
    {
        zadanie5 obj = new zadanie5();
        obj.fact(5);
    }
}