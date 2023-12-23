package com.ibrhalil;

import java.util.ArrayList;
import java.util.Scanner;

class Harff {
    char harf;
    int adet = 1;

    public Harff(char harf, int adet) {
        this.harf = harf;
        this.adet = adet;
    }
}

public class KelimeIslem {
    public static void main(String[] args) {

        String cumle = getInputValue();

        int KelimeSayisi = 1;
        int BoslukSayisi = 0;
        ArrayList<Harff> liste = new ArrayList<Harff>();
        char bosluk = ' ';
        boolean degerVar = false;
        for (int i = 0; i < cumle.length(); i++) {
            degerVar = false;
            for (Harff harfler : liste) {
                if (harfler.harf == cumle.charAt(i)) {
                    harfler.adet++;
                    degerVar = true;
                }
            }
            if (!degerVar) {
                liste.add(new Harff(cumle.charAt(i), 1));
            }

            if (cumle.charAt(i) == bosluk) {
                BoslukSayisi++;
                if ((i + 1) < cumle.length()) {
                    if (cumle.charAt(i + 1) != bosluk) {
                        if (cumle.charAt(0) != bosluk) {
                            KelimeSayisi++;
                        }
                    }
                }
            }
            //System.out.println(CumleB.charAt(i));
        }
        System.out.println("C�mle Uzunlu�u : " + (cumle.length() - BoslukSayisi));
        System.out.println("Kelime Say�s� : " + KelimeSayisi);
        char enHarf = 0;
        String ENharf = null;
        int enHAarfSay = 0;
        boolean harflermi = false;
        for (Harff harff : liste) {
            //System.out.println(harff.harf+" = "+harff.adet);
            if (enHAarfSay < harff.adet && harff.harf != bosluk) {
                enHAarfSay = harff.adet;
                //enHarf=harff.harf;
                ENharf = String.valueOf(harff.harf);
                harflermi = false;
            } else if (enHAarfSay == harff.adet) {
                ENharf += " , ";
                ENharf += String.valueOf(harff.harf);
                harflermi = true;
            }
        }
        if (harflermi) {
            System.out.println("En �ok Kullan�lan Harfler : " + enHAarfSay + " kere '" + ENharf + "' harfleri kullan�lm��t�r");
        } else {
            System.out.println("En �ok Kullan�lan Harf : " + enHAarfSay + " kere '" + ENharf + "' harfi kullan�lm��t�r");
        }
    }

    private static String getInputValue() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Cumlenizi Giriniz :");
        String c = oku.nextLine();
        return c.toUpperCase();
    }

}
