package Tareas;

import java.awt.Graphics;

public class Figuras {    

    public void figura1(Graphics g){
        g.drawRect(50, 30, 300, 250);
        g.drawRect(100, 120, 200, 100);
        g.drawRect(140, 160, 40, 60);
        g.drawLine(100, 120, 200, 50);
        g.drawLine(300, 120, 200, 50);
        g.drawLine(140, 220, 120, 245);
        g.drawLine(180, 220, 160, 245);
        g.drawString("Dibujando lineas", 70, 265);
    }
    public void figura2(Graphics g){
        g.drawRect(400, 30, 300, 250);
        g.drawRect(640, 60, 30, 170);
        g.drawRect(590, 80, 30, 150);
        g.drawRect(540, 100, 30, 130);
        g.drawRect(490, 120, 30, 110);
        g.drawRect(440, 140, 30, 90);
        g.drawString("Dibujando rectangulos", 440, 265);
    }
    public void figura3(Graphics g){
        g.drawRect(750, 30, 300, 250);
        g.drawRoundRect(875, 50, 60, 180, 100, 400);
        g.drawRoundRect(805, 120, 200, 45, 100, 400);
        g.drawRoundRect(855, 85, 100, 50, 100, 400);
        g.drawString("Dibujando ovalos con rectangulos", 780, 265);
    }
    public void figura4(Graphics g){
        g.drawRect(50, 300, 300, 250);
        g.drawOval(100, 320, 200, 200);
        g.drawOval(150, 370, 30, 30);
        g.drawOval(220, 370, 30, 30);
        g.fillOval(162, 378, 10, 10);
        g.fillOval(232, 378, 10, 10);
        g.drawOval(170, 430, 60, 60);
        g.drawString("Dibujando circulos", 100, 540);
    }
    public void figura5(Graphics g){
        g.drawRect(400, 300, 300, 250);
        g.drawOval(520, 335, 60, 180);
        g.drawOval(450, 405, 200, 45);
        g.drawOval(500, 375, 100, 50);
        g.drawString("Dibujando ovalos con circulos", 440, 540);
    }
    public void figura6(Graphics g){
        g.drawRect(750, 300, 300, 250);
        g.drawLine(820, 470, 980, 470);
        g.drawLine(820, 470, 910, 410);
        g.drawLine(980, 470, 910, 410);
        g.drawLine(910, 410, 910, 380);
        g.drawLine(910, 410, 980, 410);
        g.drawLine(910, 380, 980, 410);
        g.drawLine(815, 420, 865, 420);
        g.drawLine(815, 420, 815, 360);
        g.drawLine(865, 420, 815, 360);
        g.drawString("Dibujando triangulos", 830, 540);
    }        
}
