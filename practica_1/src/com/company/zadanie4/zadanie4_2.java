package com.company.zadanie4;

import java.util.*;

public class zadanie4_2 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Random obj = new Random();
        int x = text.nextInt();
        int[] mas = new int[x];

        for(int i = 0; i < x; i++) {
            mas[i] = obj.nextInt(100);
        }

        for(int i = 0; i < x; i++) {
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        Arrays.sort(mas);
        for(int i = 0; i < x; i++) {
            System.out.print(mas[i]+" ");
        }
        System.out.println();
    }
}