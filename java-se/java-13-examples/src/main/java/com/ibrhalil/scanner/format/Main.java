package com.ibrhalil.scanner.format;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String met1 = scanner.next();

        int say1 = scanner.nextInt();
        scanner.nextLine();

        String met2 = scanner.next();

        int say2 = scanner.nextInt();
        scanner.nextLine();

        String met3 = scanner.next();

        int say3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("================================");
        System.out.printf("%-15s%03d%n", met1, say1);
        System.out.printf("%-15s%03d%n", met2, say2);
        System.out.printf("%-15s%03d%n", met3, say3);
        System.out.println("================================");

        scanner.close();
    }
}
