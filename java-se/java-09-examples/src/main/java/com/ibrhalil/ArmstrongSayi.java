package com.ibrhalil;

public class ArmstrongSayi {
    //Bir sayının basamaklarındaki tüm rakamların ayrı ayrı küplerinin toplamı kendisine eşitse bu sayıya Armstrong sayı denir
    public static void main(String[] args) {

        System.out.println("Armstrong Sayilar");
        for (int i = 1; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean armstrong(int num) {
        int total = 0;
        int temNum = num;
        while (num >= 1) {
            int kup = (num % 10) * (num % 10) * (num % 10);
            total += kup;
            num /= 10;
        }
        return total == temNum;
    }
}