package com.ibrhalil._0;

import javax.swing.*;

public class MyLabel extends JFrame{

    public MyLabel(JLabel label) {
        super();
        add(label);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        JLabel label1 = new JLabel("ilk JLabel");
        new MyLabel(label1);
    }
}
