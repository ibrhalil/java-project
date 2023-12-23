package com.ibrhalil;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(getSystemInfo());
    }

    public static String getSystemInfo() {
        return "\nVersion: " + System.getProperty("java.version")
                + "\nOS: " + System.getProperty("os.name")
                + "\nUser: " + System.getProperty("user.name");
    }
}
