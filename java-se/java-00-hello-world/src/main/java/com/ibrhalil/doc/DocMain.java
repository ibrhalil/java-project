package com.ibrhalil.doc;

/**
 * @author halil
 */

public class DocMain {

    /**
     *{@code} main main(String[] args)
     * @param args
     * @exception ArrayIndexOutOfBoundsException
     * @return void
     * @see testM
     * @since 6.10.2023 08:05
     * @version 0.1
     */

    public static void main(String[] args) {
        int a, b, c;
        int[] d = new int[2];

        a = b = 10;
        c = a + b;

        d[0] = a;
        d[1] = b;
        // d[2] = c;


        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);


    }

    private static void testM(){
        System.out.println("test");
    }
}
