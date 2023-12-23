package com.ibrhalil;

import java.util.Scanner;

public class TwoMatrixExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("m: ");
        int m = in.nextInt();

        System.out.print("n: ");
        int n = in.nextInt();

        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                System.out.print("Add first matrix: ");
                first[c][d] = in.nextInt();
            }
        }

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                System.out.print("Add second matrix: ");
                second[c][d] = in.nextInt();
            }
        }

        for (int c = 0; c < m; c++)
            for (int d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d];

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++)
                System.out.print(sum[c][d] + "\t");
            System.out.println();
        }
    }
}
