package com.ibrhalil;

import java.util.Scanner;

public class GirilenSayiyaKadarToplam {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int GirilenSayi = oku.nextInt();
        int ToplamTut = 0;

        for (int i = 0; i <= GirilenSayi; i++) {
            ToplamTut += i;
        }
        System.out.print("Girilen Sayiya Kadar olan Toplam : " + ToplamTut);
    }
}
