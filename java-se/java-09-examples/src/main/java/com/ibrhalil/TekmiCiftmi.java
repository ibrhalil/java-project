package com.ibrhalil;

import java.util.Scanner;

public class TekmiCiftmi {
    public static void main(String[] args) {
        System.out.print("Sayi Giriniz: ");
        int input = (new Scanner(System.in)).nextInt();

        if (input % 2 == 0)
            System.out.println("Cift");
        else
            System.out.println("Tek");
    }
}
