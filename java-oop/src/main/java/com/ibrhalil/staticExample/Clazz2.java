package com.ibrhalil.staticExample;

public class Clazz2 extends Clazz1 {

    static {
        System.out.println("static Clazz2");
    }

    public Clazz2() {
        System.out.println("constructor Clazz2");
    }
}
