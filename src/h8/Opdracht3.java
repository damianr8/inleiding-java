package h8;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
	TextField text;
	Button knopje;
	double daniel = 0;
	public void init (){
		text = new TextField("", 5);
		knopje = new Button ("Enter");
		
		add (text);
		add	(knopje);
		knopje.addActionListener(new Daniel());
		text.addActionListener(new Daniel());
	}
	public void paint (Graphics g){
		
		g.drawString("BTW"+daniel, 80, 80);
		
		
	}
	class Daniel implements ActionListener {
		public void actionPerformed (ActionEvent e){
			daniel = (Double.parseDouble(text.getText())*1.21);
			repaint();
			
			
			
			
			
			
		}
	}
}
