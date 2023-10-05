package com.ibrhalil;

import java.util.Scanner;

public class DaireAlanCevreHesaplama {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("yaricap (r):");
        double r = oku.nextDouble();

        System.out.println("cevresi: " + daireCevre(r));
        System.out.println("alani: " + daireAlan(r));
    }

    private static double daireAlan(double r) {
        return (PI * r * r);
    }

    private static double daireCevre(double r) {
        return (2 * PI * r);
    }
}
