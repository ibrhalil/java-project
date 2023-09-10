package com.ibrhalil._4._41;

public class Operator {
    public static void main(String[] args) {
        int num1 =  49;
        int num2 =  7;

        System.out.println("toplama num1 + num2 : " + (num1 + num2));
        System.out.println("cıkarma num1 - num2 : " + (num1 - num2));
        System.out.println("carpma  num1 * num2 : " + (num1 * num2));
        System.out.println("bolme   num1 / num2 : " + (num1 / num2));
        System.out.println("mod     num1 % num2 : " + (num1 % num2));
        System.out.println();

        System.out.println("num1 + num2 / num1 : " + (num1 + num2 / num2));
        System.out.println("(num1 + num2) / num1 : " + ((num1 + num2) / num2));
    }
}
