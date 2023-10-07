package com.ibrhalil;

import java.util.Scanner;

public class DenkleminKokleriniBulma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("a :");
        int a = oku.nextInt();
        System.out.print("b :");
        int b = oku.nextInt();
        System.out.print("c :");
        int c = oku.nextInt();
        double delta = delta(a, b, c);
        System.out.println();
        deklemiYaz(a, b, c, delta);
        if (delta > 0) {
            System.out.println("Denklemin iki kok vardir.");
            System.out.println("X1 : " + ((-b + (Math.sqrt(delta))) / (2 * a)));
            System.out.println("X2 : " + ((-b - (Math.sqrt(delta))) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("Denklemin tek koku vardir.");
            System.out.println("X1 ve X2 : " + ((-b) / (2 * a)));

        } else {
            System.out.println("Denklemin reel koku yoktur.");
        }
    }

    private static void deklemiYaz(int a, int b, int c, double delta) {
        System.out.print(a + "x^2 ");
        if (b > 0) {
            System.out.print("+ " + b + "x ");
        } else {
            System.out.print(b + "x ");
        }

        if (c > 0) {
            System.out.println("+ " + c);
        } else {
            System.out.println(c);
        }

        System.out.println("Delta :" + delta);
    }

    private static double delta(int a, int b, int c) {
        double delta = (b * b) - (4 * a * c);
        return delta;
    }
}
