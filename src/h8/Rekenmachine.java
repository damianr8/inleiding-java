package h8;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {

	TextField text;
	TextField text2;
	Button	plus;
	Button	min;
	Button	delen;
	Button	keer;
	double uitkomst;
	public void init(){
		plus = new Button("+");
		min = new Button("-");
		delen = new Button("/");
		keer = new Button("*");
		text = new TextField("", 10);
		text2 = new TextField("", 10);
		add (plus);
		add (min);
		add (delen);
		add (keer);
		add (text);
		add (text2);
		plus.addActionListener(new Pluslistener());
		min.addActionListener(new Minlistener());
		delen.addActionListener(new Delenlistener());
		keer.addActionListener(new Keerlistener());
	
	}
	
	
	class Pluslistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			uitkomst = Double.parseDouble(text.getText()) + Double.parseDouble(text2.getText());
			text.setText(""+uitkomst);
			text2.setText("");
		}
	}
	class Minlistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			uitkomst = Double.parseDouble(text.getText()) - Double.parseDouble(text2.getText());
			text.setText(""+uitkomst);
			text2.setText("");
		}
	}
	class Delenlistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			uitkomst = Double.parseDouble(text.getText()) / Double.parseDouble(text2.getText());
			text.setText(""+uitkomst);
			text2.setText("");
		}
	}
	class Keerlistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			uitkomst = Double.parseDouble(text.getText()) * Double.parseDouble(text2.getText());
			text.setText(""+uitkomst);
			text2.setText("");
		}
	}
	
	
	
	
	
}
