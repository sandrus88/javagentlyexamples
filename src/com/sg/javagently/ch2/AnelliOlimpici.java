package com.sg.javagently.ch2;

import java.awt.*;
import java.awt.event.*;

/*
 * Illustra un semplice output grafico con anelli colorati
 */

class AnelliOlimpici extends Frame {

	public AnelliOlimpici() {
		setTitle("Olympic Rings");
	}

	public static void main(String[] args) {

		Frame f = new AnelliOlimpici();

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setSize(300, 200);
		f.setVisible(true);
	}

	public void paint(Graphics g) {

		g.setColor(Color.red);
		g.drawOval(90, 80, 30, 30);
		g.setColor(Color.blue);
		g.drawOval(115, 80, 30, 30);
		g.setColor(Color.green);
		g.drawOval(140, 80, 30, 30);
		g.setColor(Color.yellow);
		g.drawOval(165, 80, 30, 30);
		g.setColor(Color.black);
		g.drawOval(190, 80, 30, 30);

		g.drawString("Olympic Rings", 120, 140);

	}
}
