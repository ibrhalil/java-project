package com.ibrhalil;

import java.util.Scanner;

public class Fahrenheit2Celsius {
    public static void main(String[] args) {
        System.out.print("Fahrenheit: ");
        double input = (new Scanner(System.in)).nextDouble();
        System.out.println(converting(input));
    }

    private static double converting(double num) {
        return (num - 32) * 5 / 9;
    }
}
