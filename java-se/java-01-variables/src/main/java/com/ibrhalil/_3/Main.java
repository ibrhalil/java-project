package com.ibrhalil._3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       metotInt();
       metotDouble();
       metotBoolean();
       metotString();
    }

    private static void metotString() {
        System.out.println("String");
        char[] deger = new char[5];
        deger[0] = 'd';
        deger[1] = 'e';
        deger[2] = 'g';
        deger[3] = 'e';
        deger[4] = 'r';
        String value = "deger";

        if(value.toCharArray() == deger){
            System.out.println("value.toCharArray() == deger");
        }

        if(value.toCharArray().equals(deger)){
            System.out.println("value.toCharArray().equals(deger)");
        }

        if(Arrays.equals(value.toCharArray(), deger)){
            System.out.println("Arrays.equals(value.toCharArray(), deger)");
        }

        if(value.equals(deger)) {
            System.out.println("value.equals(deger)");
        }
        System.out.println();
    }

    private static void metotBoolean() {
        System.out.println("Boolean");
        boolean deger = true;
        Boolean value = true;

        if(value == deger){
            System.out.println("value == deger");
        }

        if(value.equals(deger)) {
            System.out.println("value.equals(deger)");
        }
        System.out.println();
    }

    private static void metotDouble() {
        System.out.println("Double");
        double deger = 5;
        Double value = 5.0;

        if(value == deger){
            System.out.println("value == deger");
        }

        if(value.equals(deger)) {
            System.out.println("value.equals(deger)");
        }
        System.out.println();
    }

    private static void metotInt() {
        System.out.println("Integer");

        int deger = 5;
        Integer value = 5;

        if(value == deger){
            System.out.println("value == deger");
        }

        if(value.equals(deger)) {
            System.out.println("value.equals(deger)");
        }
        System.out.println();
    }
}
