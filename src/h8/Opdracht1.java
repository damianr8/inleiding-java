package h8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht1 extends Applet {
Button knop;
TextField barka; 
String text = "";
Button mitchelendaniel;
public void init() { 
	barka = new TextField("", 6);
	add(barka);
	knop = new Button ("OK");
	add(knop);
	knop.addActionListener(new Bountalinstener());
	barka.addActionListener(new Bountalinstener());
	
	mitchelendaniel = new Button("resest");add(mitchelendaniel);
	mitchelendaniel.addActionListener(new Barkalistener());
}

public void paint (Graphics g){
	g.drawString(""+ text, 78, 75);
}

class Bountalinstener implements ActionListener {
	public void actionPerformed(ActionEvent e){
		text = barka.getText();
		repaint();
		
	}
}


class Barkalistener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		text ="";
		barka.setText("");
		repaint();
	}
}



}
