package com.ibrhalil._1._13;

public class Primitive {
    public static void main(String[] args) {
        System.out.println("byte (MIN): " + Byte.MIN_VALUE);
        System.out.println("byte (MAX): " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("short (MIN): : " + Short.MIN_VALUE);
        System.out.println("short (MAX): " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("int (MIN): " + Integer.MIN_VALUE);
        System.out.println("int (MAX): " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("long (MIN): " + Long.MIN_VALUE);
        System.out.println("long (MAX): " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("float (MIN): " + Float.MIN_VALUE);
        System.out.println("float (MAX): " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("double (MIN): " + Double.MIN_VALUE);
        System.out.println("double (MAX): " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("int > byte     : "+ (Integer.MAX_VALUE > Byte.MAX_VALUE));
        System.out.println("long > int     : "+ (Long.MAX_VALUE > Integer.MAX_VALUE));
        System.out.println("float > long   : "+ (Float.MAX_VALUE > Long.MAX_VALUE));
        System.out.println("double > float : "+ (Double.MAX_VALUE > Float.MAX_VALUE));
    }
}
