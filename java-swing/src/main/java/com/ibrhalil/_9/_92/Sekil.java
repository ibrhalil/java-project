package com.ibrhalil._9._92;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class Sekil {
	int konumX;
	int konumY;
	int genislik;
	int yukseklik;
	int hiz = 1;
	Random r;
	Rectangle cisim;
	boolean yonX = true, yonY = true;

	public Sekil(int konumX, int konumY, int genislik, int yukseklik) {
		super();
		cisim = new Rectangle(konumX, konumY, genislik, yukseklik);
		this.konumX = konumX;
		this.konumY = konumY;
		this.genislik = genislik;
		this.yukseklik = yukseklik;
		
		r = new Random();
		hiz=r.nextInt(2)+1;
		yonX = (boolean) r.nextBoolean();
	}

	public void ciz(Graphics g) {

		//g.drawRect(konumX, konumY, genislik, yukseklik);
		g.fillRect(konumX, konumY, genislik, yukseklik);
		//g.fillOval(konumX, konumY, genislik, yukseklik);
	}

	public void carpisma(ArrayList<Sekil> s, Sekil kendi) {
		cisim = new Rectangle(konumX, konumY, genislik, yukseklik);
		for (Sekil sekil : s) {
			Rectangle tmpSekil = new Rectangle(sekil.konumX, sekil.konumY, sekil.genislik, sekil.yukseklik);
			if (cisim.intersects(tmpSekil) && sekil != kendi) 
			{
				if (kendi.yonX && !sekil.yonX) 
				{
					kendi.yonX=false;
					sekil.yonX=true;
				}
				else if(!kendi.yonX && sekil.yonX)
				{
					kendi.yonX=true;
					sekil.yonX=false;
				}
				else if(kendi.yonX && sekil.yonX)
				{
					kendi.yonX=false;
				}
				else if(!kendi.yonX && !sekil.yonX)
				{
					kendi.yonX=true;
				}
				
				if (kendi.yonY && !sekil.yonY) 
				{
					kendi.yonY=false;
					sekil.yonY=true;
				}
				else if(!kendi.yonY && sekil.yonY)
				{
					kendi.yonY=true;
					sekil.yonY=false;
				}
				else if(kendi.yonY && sekil.yonY)
				{
					kendi.yonY=false;
				}
				else if(!kendi.yonY && !sekil.yonY)
				{
					kendi.yonY=true;
				}
				
				/*
				if (kendi.yonX && kendi.yonY) 
				{
					if (!sekil.yonX && !sekil.yonY) 
					{
						kendi.yonX=kendi.yonY=false;
						sekil.yonX=sekil.yonY=true;
					}
					else if(!sekil.yonX && sekil.yonY)
					{
						kendi.yonX=false;
						sekil.yonX=true;
					}
					else if(sekil.yonX && !sekil.yonY)
					{
						kendi.yonY=false;
						sekil.yonY=true;
					}
				} 
				else if (kendi.yonX && !kendi.yonY) 
				{
					if (sekil.yonX && sekil.yonY) 
					{
						
					}
					else if (!sekil.yonX && !sekil.yonY) 
					{
						kendi.yonX=kendi.yonY=false;
						sekil.yonX=sekil.yonY=true;
					}
					else if(!sekil.yonX && sekil.yonY)
					{
						kendi.yonX=false;
						sekil.yonX=true;
					}
					else if(sekil.yonX && !sekil.yonY)
					{
						kendi.yonY=false;
						sekil.yonY=true;
					}
				} 
*/
			}
		}
	}

	public void hareket(int ekranG, int ekranY) {
		if (yonX) {
			this.konumX += hiz;
		} else {
			this.konumX -= hiz;
		}

		if (yonY) {
			this.konumY += hiz;
		} else {
			this.konumY -= hiz;
		}

		if (this.konumX + this.genislik >= ekranG) {
			yonX = false;
		}
		if (this.konumX <= 0) {
			yonX = true;
		}
		if (this.konumY + this.yukseklik >= ekranY) {
			yonY = false;
		}
		if (this.konumY <= 0) {
			yonY = true;
		}
	}

}
