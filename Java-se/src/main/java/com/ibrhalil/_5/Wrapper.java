package com.ibrhalil._5;

public class Wrapper {
    public static void main(String[] args) {

        Long d1 = new Long("101");
        Long d2 = new Long(102);
        Long d3 = null;

        Integer d4 = new Integer(103);
        Integer d5 = new Integer(Integer.MAX_VALUE);
        Long d6 = 500L;
        Float d7 = Float.MIN_VALUE;

        System.out.println("d1 : "+d1);
        System.out.println("d2 : "+d2);
        System.out.println("d3 : "+d3);
        System.out.println("d4 : "+d4);
        System.out.println("d5 : "+d5);
        System.out.println("d6 : "+d6);
        System.out.println("d7 : "+d7);
    }
}
