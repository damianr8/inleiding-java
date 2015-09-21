package hoofdstuk5en6;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht1 extends Applet {
	double a, c, uitkomst;
	
	public void init(){
		a=113;
		c=4;
		uitkomst=(a/c);
	}
public void paint (Graphics g){
	g.drawString("Jan"+uitkomst, 20, 50);
	g.drawString("Ali"+uitkomst, 20, 60);
	g.drawString("Jeanette"+uitkomst, 20, 70);
	g.drawString("Damian"+uitkomst, 20, 80);
	
		}
}

