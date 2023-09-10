package com.ibrhalil._0;

import javax.swing.*;

public class MyTextField extends JPanel{

    public MyTextField() {
        super();
        JTextField jtf1 = new JTextField(10);
        add(jtf1);
        add(new JTextField(20));
    }

    public static void main(String[] args) {

        JFrame pen = new JFrame("JTextField Kullanim");
        pen.add(new MyTextField());
        pen.setSize(300,400);
        pen.setVisible(true);
        pen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
