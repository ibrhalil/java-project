package com.ibrhalil._9._91;

import java.awt.*;
import java.util.Random;

public class Top {
    int konumX;
    int konumY;
    int genislik;
    int yukseklik;
    int hiz = 1;
    int renk;
    Random r;
    boolean yonX = true, yonY = true;

    public Top(int x, int y, int w, int h) {
        this.konumX = x;
        this.konumY = y;
        this.genislik = w;
        this.yukseklik = h;
        this.hiz = 7 - (genislik % 5);
        r = new Random();
        if (r.nextBoolean()) {
            yonX = false;
        }
        renk=r.nextInt(10);
    }

    public Color renk(int renk) {
        switch (renk) {
            case 0:
                return(Color.RED);

            case 1:
                return(Color.BLACK);

            case 2:
                return(Color.BLUE);

            case 3:
                return(Color.YELLOW);

            case 4:
                return(Color.GREEN);

            case 5:
                return(Color.CYAN);

            case 6:
                return(Color.MAGENTA);

            case 7:
                return(Color.ORANGE);

            case 8:
                return(Color.PINK);

            case 9:
                return(Color.WHITE);

        }
        return Color.DARK_GRAY;

    }

    public void ciz(Graphics g) {
        g.fillOval(konumX, konumY, genislik, yukseklik);
        g.setColor(renk(renk));
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
