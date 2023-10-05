package com.ibrhalil;

import java.util.Scanner;

public class SayilarinAritmetikOrtalamasi {
    public static void main(String[] args) {
        System.out.println("cikmak icin sayi olmayan bir deger giriniz");
        Scanner oku = new Scanner(System.in);
        double toplam = 0;
        double aO = 0;
        int sayac = 1;
        while (true) {
            System.out.print(sayac + ". Sayi Giriniz :");
            if (oku.hasNextDouble()) {
                toplam += oku.nextDouble();
                sayac++;
            } else {
                sayac--;
                break;
            }
        }
        aO = toplam / sayac;
        System.out.print(sayac + " Sayinin Ortalamasi : " + aO);
    }
}
