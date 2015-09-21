package hoofdstuk5en6;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Hoofdstuk5 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(100, 100, breedte, hoogte);
        g.setColor(Color.black);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.setColor(Color.magenta);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(Color.blue);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(Color.magenta);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(Color.black);
        g.drawOval (550, 225, hoogte, 100);
        g.setColor(Color.black);
        g.drawArc(550, 100, 100, 100, 360, 360);
        g.setColor(Color.MAGENTA);
        g.fillArc(550, 100, 100, 100, 360, 45);
        g.setColor(Color.black);
        g.drawLine(105, 50, 305, 50);
        g.drawString("lijn", 200, 70);
        g.drawString("rechthoek", 180, 215);
        g.drawString("afgeronde rechthoek", 150, 340);
        g.drawString("gevulde ovaal", 380, 340);
        g.drawString("gevulde rechthoek met ovaal", 340, 215);
        g.drawString("cirkel", 585, 340);
        g.drawString("taartpunt met ovaal eromheen", 520, 215);
    }
}