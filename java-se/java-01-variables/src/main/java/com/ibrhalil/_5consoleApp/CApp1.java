package com.ibrhalil._5consoleApp;

import java.util.Scanner;

public class CApp1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. Sayi :");
        int sayi1 = oku.nextInt();
        System.out.print("2. Sayi :");
        int sayi2 = oku.nextInt();

        int topla = sayi1 + sayi2;
        int cikar = sayi1 - sayi2;
        double bol = (double) sayi1 / sayi2;
        int carp = sayi1 * sayi2;
        int mod = sayi1 % sayi2;

        System.out.println("girilen sayi1: " + sayi1);
        System.out.println("girilen sayi2: " + sayi2);

        System.out.println("topla: " + topla);
        System.out.println("cikar: " + cikar);
        System.out.println("bolme: " + bol);
        System.out.println("carpma: " + carp);
        System.out.println("mod: " + mod);

    }
}
