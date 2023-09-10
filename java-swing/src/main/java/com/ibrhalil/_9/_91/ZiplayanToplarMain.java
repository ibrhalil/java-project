package com.ibrhalil._9._91;

import javax.swing.*;

public class ZiplayanToplarMain {
    public static void main(String[] args) {

        JFrame pencere = new JFrame("Ziplayan Toplar");
        Ekran panel = new Ekran();

        pencere.add(panel);
        pencere.setSize(650,450);
        pencere.setVisible(true);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
