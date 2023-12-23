package com.ibrhalil;

import java.util.Scanner;

public class TekmiCiftmiModsuz {
    public static void main(String[] args) {
        System.out.print("Sayi Giriniz: ");
        int input = (new Scanner(System.in)).nextInt();

        if ((input / 2) * 2  == input)
            System.out.println("Cift");
        else
            System.out.println("Tek");
    }
}
