package h8;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import h8.Opdracht1.Bountalinstener;

public class Opdracht2 extends Applet {
	Button man;
	Button vrouw;
	Button chicky;
	Button mooiboy;
	int mannen = 0;
	int vrouwen =0;
	int meisjes = 0;
	int jongens = 0;
	int totaal = 0;
	
	public void init(){
		man = new Button ("man");
		vrouw = new Button ("vrouw");
		chicky = new Button ("vrouwelijke leerling");
		mooiboy = new Button ("mannelijke leerling");
		add (man);
		add (vrouw);
		add (chicky);
		add (mooiboy);
		
		man.addActionListener(new Manlinstener());
		vrouw.addActionListener(new Vrouwlinstener());
		chicky.addActionListener(new Vrouwelijkelinstener());
		mooiboy.addActionListener(new Mannelijkelinstener());
		
		
	}

	public void paint (Graphics g){
	g.drawString("man"+mannen, 60, 60);
	g.drawString("vrouw"+vrouwen, 60, 80);
	g.drawString("mannelijke leerling"+jongens, 60, 120);
	g.drawString("vrouwelijke leerling"+meisjes, 60, 110);
	g.drawString("totaal"+ totaal, 60, 150);
	
	
	}

	class Manlinstener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			mannen++;
			totaal++;
		
			repaint();
		}
	}
	
	class Vrouwlinstener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			vrouwen++;
			totaal++;
			
			repaint();
		}
	}
	
	class Vrouwelijkelinstener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			meisjes++;
			vrouwen++;
			totaal++;
			
			repaint();
		}
	}
	
	class Mannelijkelinstener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			jongens++;
			mannen++;
			totaal++;
			
			repaint();
		}
	}










}

