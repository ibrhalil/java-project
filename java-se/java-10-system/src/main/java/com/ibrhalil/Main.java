package com.ibrhalil;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> envMap = System.getenv();

        envMap.forEach((k,v) -> System.out.println(k + " : " + v));

    }
}