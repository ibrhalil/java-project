package com.ibrhalil;

import java.util.Arrays;

public class TestMain {

    /*
    olay örgüsü
        Rekürsif örüntü bul
                    azaltarak min bul
                    artırarak max bul
                    azaltarak min bul
                    artıraral maz bul

     */

    public static String logicMet(int value) {
        char[] array = new char[value];
        Arrays.fill(array, '\n');
        return new String(array);
    }

    public static void main(String[] args) {
        int min = getMax();
        int max = min * 10;
        int fark = (int) Math.sqrt(max - min);
        try {
            for (; min < max; min += fark) {
                logicMet(min);
                fark += fark;
            }
        } catch (Throwable t) {
            System.out.println("min " + min);
            System.out.println("max " + max);
            System.out.println("fark " + fark);
        }
    }

    private static int getMax() {
        int min = 0;
        int max = Integer.MAX_VALUE - 1;
        int katSayi = 1;
        for (; max > min; max -= katSayi) {
            try {
                logicMet(max);
                return max;
            } catch (Throwable t) {
                katSayi *= 10;
            }
        }
        return min;
    }
}

