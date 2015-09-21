package hoofdstuk5en6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
int a, b, c, uitkomst;


public void init (){
	a = 500000000;
	b = 500000000;
	c = 4;
	uitkomst = (a * b * c);
	

		}
public void paint (Graphics g){
g.drawString("DE UITKOMST IS:"+ uitkomst, 60, 60);	
}

}
