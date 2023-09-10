package com.ibrhalil._9._92;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Ekran extends JPanel implements ActionListener,MouseListener{
	
	Timer zaman ;
	ArrayList<Sekil> s = new ArrayList<>();
	
	public Ekran() {
		addMouseListener(this);
		zaman = new Timer(12, this);
		zaman.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Sekil sekil : s) {
			sekil.ciz(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (Sekil sekil : s) {
			sekil.hareket(getWidth(), getHeight());
			sekil.carpisma(s,sekil);
			repaint();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Random r = new Random();
		int h;
		int w=h=r.nextInt(50)+20;
		int y=r.nextInt(getHeight()-h);
		int x=r.nextInt(getWidth()-w);
		s.add(new Sekil(x,y,w,h));
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
