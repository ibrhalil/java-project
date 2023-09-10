package com.ibrhalil._9._92;

import javax.swing.JFrame;

public class Menu {

	public static void main(String[] args) {
		JFrame pencere = new JFrame();
		Ekran panel = new Ekran();
		pencere.add(panel);
		pencere.setSize(700, 400);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
