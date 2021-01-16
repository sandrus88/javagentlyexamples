package com.sg.javagently.ch10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Semafori extends Frame implements ActionListener {
	private LightsCanvas lights;
	private Button close;
	private Button walk;

	public Semafori() {
		Panel title = new Panel();
		title.add(new Label("Simulazione semaforica"));
		add("North", title);
		lights = new LightsCanvas();
		add("Center", lights);

		Panel buttons = new Panel();
		walk = new Button("Avanti");
		buttons.add(walk);
		close = new Button("Esci");
		close.addActionListener(this);
		buttons.add(close);
		add("South", buttons);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		dispose();
		System.exit(0);
	}

	public static void main(String[] args) {
		Frame f = new Semafori();
		f.setTitle("Semaforo versione 0");
		f.setSize(300, 210);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
