package com.ibrhalil;

public class BasamakToplamiBasamakSayisiniVerenSayi {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (basamakSayisiEsit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean basamakSayisiEsit(int num) {
        int top = 0;
        int basamak = 0;
        while (num > 0) {
            top += num % 10;
            num /= 10;
            basamak++;
        }
        return basamak == top;
    }
}
