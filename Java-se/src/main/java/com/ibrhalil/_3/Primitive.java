package com.ibrhalil._3;

public class Primitive {
    public static void main(String[] args) {

        long tlf = 555_555_55_55l;
        int f = 123_____123___234_5;
        int intMax = 2_147_483_647;
        System.out.println("tlf : " + tlf);
        System.out.println("f : " + f);
        System.out.println("intMax : " + intMax);
        System.out.println("intMax + 1 : " + (intMax + 1));
        System.out.println();

        char d1 = 0x0061;
        int d2 = 0x0061;
        short d3 = 0x0061;
        byte d4 = 0x0061;

        System.out.println("char  : " + d1);
        System.out.println("int   : " + d2);
        System.out.println("short : " + d3);
        System.out.println("byte  : " + d4);
        System.out.println("byte (char)  : " + (char) d4);
    }
}
