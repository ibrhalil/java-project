package com.ibrhalil;

import java.util.Scanner;

public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        System.out.print("Celsius: ");
        double input = (new Scanner(System.in)).nextDouble();
        System.out.println(converting(input));
    }

    private static double converting(double num) {
        return num * 9 / 5 + 32;
    }
}
