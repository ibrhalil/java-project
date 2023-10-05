package com.ibrhalil;

import java.util.Scanner;

public class SayininBasamaklarinaAyirma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int sayi = oku.nextInt();
        int sayiC = sayi;
        int basamak = 0;
        while (sayiC >= 1) {
            sayiC /= 10;
            basamak++;
        }
        System.out.println("Basamak Sayisi : " + basamak);
        for (int i = 0; i < basamak; i++) {
            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
}
