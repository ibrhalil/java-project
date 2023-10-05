package com.ibrhalil;

import java.util.Arrays;

public class MainSplit {
    public static void main(String[] args) {
        String metin = "deger,test ,developer ,  web";
        String[] dizi1 = metin.split("\\s*,\\s*");
        String[] dizi2 = metin.split(",");

        //System.out.println(dizi1);
        //System.out.println(dizi2);

        System.out.println(Arrays.equals(dizi1,dizi2));
        for (int i = 0; i < (dizi1.length >= dizi2.length ? dizi1.length : dizi2.length); i++) {
            System.out.println("'"+dizi1[i] +"' -- '" + dizi2[i] +"' : " +(dizi1[i].equals(dizi2[i])) );
        }
    }
}
