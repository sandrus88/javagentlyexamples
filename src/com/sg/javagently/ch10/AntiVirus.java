package com.sg.javagently.ch10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AntiVirus extends Frame {

	static private final int line = 15;
	static private final int letter = 5;

	public AntiVirus() {
		setBackground(Color.cyan);
		setForeground(Color.black);
	}

	public void paint(Graphics g) {
		g.drawRect(2 * letter, 2 * line, 30 * letter, 6 * line);
		g.drawString("ATTENZIONE", 10 * letter, 4 * line);
		g.drawString("Possibile virus", 4 * letter, 5 * line);
		g.drawString("Riavviare ed eseguire", 5 * letter, 6 * line);
		g.drawString("un anti-virus", 10 * letter, 7 * line);
	}

	public static void main(String[] args) {
		Frame f = new AntiVirus();
		f.setTitle("Allarme Virus");
		f.setSize(36 * letter, 10 * line);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
