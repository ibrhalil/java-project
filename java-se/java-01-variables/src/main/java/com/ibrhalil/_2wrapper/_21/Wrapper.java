package com.ibrhalil._2wrapper._21;

public class Wrapper {
    public static void main(String[] args) {

        Integer s1 = new Integer(15);
        Double s2 = new Double(11);
        Float s3 = new Float(63);
        Long s4 = new Long(256);

        String k1 = "Halil";
        String k2 = new String("Developer");
        Character k3 = new Character('b');


        System.out.println("Integer : " + s1);
        System.out.println("Double : " + s2);
        System.out.println("Float : " + s3);
        System.out.println("Long : " + s4);
        System.out.println();

        System.out.println("String : " + k1);
        System.out.println("String : " + k2);
        System.out.println("Character : " + k3);
        System.out.println();

        System.out.println("karakter1.charAt(4) : " + k1.charAt(4));
        System.out.println("karakter1.equals(\"test\") : " + k1.equals("test"));
        System.out.println();

        System.out.println("karakter1.hashCode() : " + k1.hashCode());
        System.out.println("karakter3.hashCode() : " + k3.hashCode());

    }
}
