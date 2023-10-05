package com.ibrhalil._1primitive._11;

public class Primitive {
    public static void main(String[] args) {

        byte s1 = 127;
        short s2 = 1024;
        int s3 = 200_000;
        long s4 = 15;
        System.out.println("byte    : " + s1);
        System.out.println("short   : " + s2);
        System.out.println("int     : " + s3);
        System.out.println("long    : " + s4);
        System.out.println();

        float s5 = (float) 4.6;
        float s6 = 4.6f;
        double s7 = 9.01;
        System.out.println("float   : " + s5);
        System.out.println("float   : " + s6);
        System.out.println("double  : " + s7);
        System.out.println();

        char k = 'k';
        char c = 65;
        System.out.println("char    : " + k);
        System.out.println("char    : " + c);
        System.out.println();

        boolean d = true;
        System.out.println("boolean : " + d);
    }
}
